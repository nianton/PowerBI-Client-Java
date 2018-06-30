package com.microsoft.powerbi.api;

import com.microsoft.powerbi.ApiException;
import com.microsoft.powerbi.models.GatewayDatasource;
import com.microsoft.powerbi.models.ODataResponseListGatewayDatasource;
import com.microsoft.powerbi.models.ODataResponseListUserAccessRight;
import com.microsoft.powerbi.models.PublishDatasourceToGatewayRequest;
import com.microsoft.powerbi.models.UpdateDatasourceRequest;
import com.microsoft.powerbi.models.UserAccessRight;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatasourcesApi
 */
@Ignore
public class DatasourcesApiTest {

    private final DatasourcesApi api = new DatasourcesApi();

    
    /**
     * Get a datasource user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gatewaysAddDatasourceUserTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        UserAccessRight addUserToDatasourceRequest = null;
        Object response = api.gatewaysAddDatasourceUser(gatewayId, datasourceId, addUserToDatasourceRequest);

        // TODO: test validations
    }
    
    /**
     * Create a datasource
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gatewaysCreateDatasourceTest() throws ApiException {
        String gatewayId = null;
        PublishDatasourceToGatewayRequest datasourceToGatewayRequest = null;
        GatewayDatasource response = api.gatewaysCreateDatasource(gatewayId, datasourceToGatewayRequest);

        // TODO: test validations
    }
    
    /**
     * Delete a datasource
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gatewaysDeleteDatasourceTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        Object response = api.gatewaysDeleteDatasource(gatewayId, datasourceId);

        // TODO: test validations
    }
    
    /**
     * Delete a datasource user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gatewaysDeleteDatasourceUserTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        String emailAdress = null;
        Object response = api.gatewaysDeleteDatasourceUser(gatewayId, datasourceId, emailAdress);

        // TODO: test validations
    }
    
    /**
     * Get a datasource by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gatewaysGetDatasourceByIdTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        GatewayDatasource response = api.gatewaysGetDatasourceById(gatewayId, datasourceId);

        // TODO: test validations
    }
    
    /**
     * Get a datasource status by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gatewaysGetDatasourceStatusByIdTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        Object response = api.gatewaysGetDatasourceStatusById(gatewayId, datasourceId);

        // TODO: test validations
    }
    
    /**
     * Get a datasource users list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gatewaysGetDatasourceUsersTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        ODataResponseListUserAccessRight response = api.gatewaysGetDatasourceUsers(gatewayId, datasourceId);

        // TODO: test validations
    }
    
    /**
     * Get all datasources of specific gateway
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gatewaysGetDatasourcesTest() throws ApiException {
        String gatewayId = null;
        ODataResponseListGatewayDatasource response = api.gatewaysGetDatasources(gatewayId);

        // TODO: test validations
    }
    
    /**
     * Update a datasource credentials
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gatewaysUpdateDatasourceTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        UpdateDatasourceRequest updateDatasourceRequest = null;
        Object response = api.gatewaysUpdateDatasource(gatewayId, datasourceId, updateDatasourceRequest);

        // TODO: test validations
    }
    
}
