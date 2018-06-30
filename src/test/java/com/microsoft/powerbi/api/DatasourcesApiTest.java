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
    public void addDatasourceUserTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        UserAccessRight addUserToDatasourceRequest = null;
        Object response = api.addDatasourceUser(gatewayId, datasourceId, addUserToDatasourceRequest);

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
    public void createDatasourceTest() throws ApiException {
        String gatewayId = null;
        PublishDatasourceToGatewayRequest datasourceToGatewayRequest = null;
        GatewayDatasource response = api.createDatasource(gatewayId, datasourceToGatewayRequest);

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
    public void deleteDatasourceTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        Object response = api.deleteDatasource(gatewayId, datasourceId);

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
    public void deleteDatasourceUserTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        String emailAdress = null;
        Object response = api.deleteDatasourceUser(gatewayId, datasourceId, emailAdress);

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
    public void getDatasourceByIdTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        GatewayDatasource response = api.getDatasourceById(gatewayId, datasourceId);

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
    public void getDatasourceStatusByIdTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        Object response = api.getDatasourceStatusById(gatewayId, datasourceId);

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
    public void getDatasourceUsersTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        ODataResponseListUserAccessRight response = api.getDatasourceUsers(gatewayId, datasourceId);

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
    public void getDatasourcesTest() throws ApiException {
        String gatewayId = null;
        ODataResponseListGatewayDatasource response = api.getDatasources(gatewayId);

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
    public void updateDatasourceTest() throws ApiException {
        String gatewayId = null;
        String datasourceId = null;
        UpdateDatasourceRequest updateDatasourceRequest = null;
        Object response = api.updateDatasource(gatewayId, datasourceId, updateDatasourceRequest);

        // TODO: test validations
    }
    
}
