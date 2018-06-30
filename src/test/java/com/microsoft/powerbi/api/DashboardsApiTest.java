package com.microsoft.powerbi.api;

import com.microsoft.powerbi.ApiException;
import com.microsoft.powerbi.models.AddDashboardRequest;
import com.microsoft.powerbi.models.Dashboard;
import com.microsoft.powerbi.models.EmbedToken;
import com.microsoft.powerbi.models.GenerateTokenRequest;
import com.microsoft.powerbi.models.ODataResponseListDashboard;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DashboardsApi
 */
@Ignore
public class DashboardsApiTest {

    private final DashboardsApi api = new DashboardsApi();

    
    /**
     * Add a new empty dashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dashboardsAddDashboardTest() throws ApiException {
        AddDashboardRequest requestParameters = null;
        Dashboard response = api.dashboardsAddDashboard(requestParameters);

        // TODO: test validations
    }
    
    /**
     * Add a new empty dashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dashboardsAddDashboardInGroupTest() throws ApiException {
        String groupId = null;
        AddDashboardRequest requestParameters = null;
        Dashboard response = api.dashboardsAddDashboardInGroup(groupId, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Generate token to view the specified dashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dashboardsGenerateTokenTest() throws ApiException {
        String dashboardKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.dashboardsGenerateToken(dashboardKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Generate token to view the specified dashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dashboardsGenerateTokenInGroupTest() throws ApiException {
        String groupId = null;
        String dashboardKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.dashboardsGenerateTokenInGroup(groupId, dashboardKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Gets a list of dashboards
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dashboardsGetDashboardsTest() throws ApiException {
        ODataResponseListDashboard response = api.dashboardsGetDashboards();

        // TODO: test validations
    }
    
    /**
     * Gets a list of dashboards in a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dashboardsGetDashboardsInGroupTest() throws ApiException {
        String groupId = null;
        ODataResponseListDashboard response = api.dashboardsGetDashboardsInGroup(groupId);

        // TODO: test validations
    }
    
}
