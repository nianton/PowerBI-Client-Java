package com.microsoft.powerbi.auth;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * https://msdn.microsoft.com/en-US/library/dn877545.aspx
 *
 */
public abstract class Authenticator {
    protected static final String DEFAULT_POWER_BI_RESOURCE_ID = "https://analysis.windows.net/powerbi/api";
    protected static final boolean DEFAULT_VALIDATE_AUTHORITY = false;

    protected String powerBiResourceId = DEFAULT_POWER_BI_RESOURCE_ID;
    protected boolean validateAuthority = DEFAULT_VALIDATE_AUTHORITY;
    protected String authority;
    protected String clientId;
    
    /**
     * Constructor for base authenticator.
     */
    protected Authenticator() {
    }

    public Authenticator setAuthority(String authority) {
        this.authority = checkNotNull(authority);
        return this;
    }

    public Authenticator setPowerBiResourceId(String powerBiResourceId) {
        this.powerBiResourceId = checkNotNull(powerBiResourceId);
        return this;
    }

    public Authenticator setValidateAuthority(boolean validateAuthority) {
        this.validateAuthority = validateAuthority;
        return this;
    }

    private ReadWriteLock tokenLock = new ReentrantReadWriteLock();
    private String cachedToken;

    /**
     * Performs the authentication.
     *
     * Thread-safe implementation that will cache the bearer token for multiple calls to ensure that we don't make
     * repeated, unnecessary calls to the authentication service.
     *
     * @return the bearer token to use for authenticating service requests.
     * @throws AuthenticationFailureException if Azure Active Directory authentication fails
     */
    public String authenticate() throws AuthenticationFailureException {
        try {
            tokenLock.readLock().lock();

            if (cachedToken == null) {
                try {
                    // release the read lock and acquire the write lock to call the implementation
                    tokenLock.readLock().unlock();
                    tokenLock.writeLock().lock();

                    // check again, it may have been set in the time it took us to acquire the write lock
                    if (cachedToken == null) {
                        cachedToken = this.doAuthenticate();
                    }

                    // Downgrade by acquiring read lock before releasing write lock
                    tokenLock.readLock().lock();
                } finally {
                    tokenLock.writeLock().unlock();
                }
            }
        } finally {
            // TODO: in theory, if there has been an exception in the authenticate method then this unlock method
            // TODO: should fail as the downgrade of the lock was never performed. Haven't seen this issue in practice yet
            // TODO: however it looks theoretically possible.
            try {
                tokenLock.readLock().unlock();
            } catch (IllegalMonitorStateException ex) {
                // ignore - see TODO above for reasoning....
                ex.printStackTrace();
            }
        }

        return cachedToken;
    }
    
    public void reset() {
        try {
            tokenLock.writeLock().lock();
            cachedToken = null;
        }
        finally {
            tokenLock.writeLock().unlock();
        }
    }

    protected abstract String doAuthenticate() throws AuthenticationFailureException;
    
    protected static String checkNotNull(String input) {
        if (input == null){
            throw new NullPointerException();
        }

        return input;
    }
}
