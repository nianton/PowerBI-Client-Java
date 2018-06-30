package com.microsoft.powerbi.api;

import com.microsoft.powerbi.ApiException;
import com.microsoft.powerbi.models.Group;
import com.microsoft.powerbi.models.GroupCreationRequest;
import com.microsoft.powerbi.models.GroupUserAccessRight;
import com.microsoft.powerbi.models.ODataResponseListGroup;
import com.microsoft.powerbi.models.ODataResponseListGroupUserAccessRight;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Ignore
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    
    /**
     * Add a group user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsAddGroupUserTest() throws ApiException {
        String groupId = null;
        GroupUserAccessRight userDetails = null;
        Object response = api.groupsAddGroupUser(groupId, userDetails);

        // TODO: test validations
    }
    
    /**
     * Create new group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsCreateGroupTest() throws ApiException {
        GroupCreationRequest requestParameters = null;
        Group response = api.groupsCreateGroup(requestParameters);

        // TODO: test validations
    }
    
    /**
     * Deletes the specified group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsDeleteGroupTest() throws ApiException {
        String groupId = null;
        Object response = api.groupsDeleteGroup(groupId);

        // TODO: test validations
    }
    
    /**
     * Deletes the specified group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsDeleteUserInGroupTest() throws ApiException {
        String groupId = null;
        String user = null;
        Object response = api.groupsDeleteUserInGroup(groupId, user);

        // TODO: test validations
    }
    
    /**
     * Get a group users list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsGetGroupUsersTest() throws ApiException {
        String groupId = null;
        ODataResponseListGroupUserAccessRight response = api.groupsGetGroupUsers(groupId);

        // TODO: test validations
    }
    
    /**
     * Returns a list of groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsGetGroupsTest() throws ApiException {
        ODataResponseListGroup response = api.groupsGetGroups();

        // TODO: test validations
    }
    
}
