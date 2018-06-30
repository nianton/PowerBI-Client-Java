package com.microsoft.powerbi.auth;

public class AuthenticationFailureException extends Exception {
    private static final long serialVersionUID = -2256286805666953208L;

	public AuthenticationFailureException() {
        super();
    }

    public AuthenticationFailureException(String message) {
        super(message);
    }

    public AuthenticationFailureException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthenticationFailureException(Throwable cause) {
        super(cause);
    }

    protected AuthenticationFailureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}