package com.microsoft.powerbi.api;

import com.microsoft.powerbi.ApiException;
import com.microsoft.powerbi.models.BindToGatewayRequest;
import com.microsoft.powerbi.models.ConnectionDetails;
import com.microsoft.powerbi.models.Dataset;
import com.microsoft.powerbi.models.EmbedToken;
import com.microsoft.powerbi.models.GenerateTokenRequest;
import com.microsoft.powerbi.models.ODataResponseListDataset;
import com.microsoft.powerbi.models.ODataResponseListDatasource;
import com.microsoft.powerbi.models.ODataResponseListGatewayDatasource;
import com.microsoft.powerbi.models.ODataResponseListRefresh;
import com.microsoft.powerbi.models.ODataResponseListTable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatasetsApi
 */
@Ignore
public class DatasetsApiTest {

    private final DatasetsApi api = new DatasetsApi();

    
    /**
     * Bind dataset to gateway
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsBindToGatewayTest() throws ApiException {
        String datasetKey = null;
        BindToGatewayRequest bindToGatewayRequest = null;
        Object response = api.datasetsBindToGateway(datasetKey, bindToGatewayRequest);

        // TODO: test validations
    }
    
    /**
     * Bind dataset to gateway
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsBindToGatewayInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        BindToGatewayRequest bindToGatewayRequest = null;
        Object response = api.datasetsBindToGatewayInGroup(groupId, datasetKey, bindToGatewayRequest);

        // TODO: test validations
    }
    
    /**
     * Deletes the dataset with the specified id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsDeleteDatasetByIdTest() throws ApiException {
        String datasetKey = null;
        Object response = api.datasetsDeleteDatasetById(datasetKey);

        // TODO: test validations
    }
    
    /**
     * Deletes the dataset with the specified id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsDeleteDatasetByIdInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        Object response = api.datasetsDeleteDatasetByIdInGroup(groupId, datasetKey);

        // TODO: test validations
    }
    
    /**
     * Deletes all rows from the specified table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsDeleteRowsTest() throws ApiException {
        String datasetKey = null;
        String tableName = null;
        Object response = api.datasetsDeleteRows(datasetKey, tableName);

        // TODO: test validations
    }
    
    /**
     * Deletes all rows from the specified table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsDeleteRowsInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        String tableName = null;
        Object response = api.datasetsDeleteRowsInGroup(groupId, datasetKey, tableName);

        // TODO: test validations
    }
    
    /**
     * Generate token to view the specified dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGenerateTokenInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.datasetsGenerateTokenInGroup(groupId, datasetKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Gets the dataset metadata for the specifeid dataset id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetDatasetByIdTest() throws ApiException {
        String datasetKey = null;
        Dataset response = api.datasetsGetDatasetById(datasetKey);

        // TODO: test validations
    }
    
    /**
     * Gets the dataset metadata for the specifeid dataset id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetDatasetByIdInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        Dataset response = api.datasetsGetDatasetByIdInGroup(groupId, datasetKey);

        // TODO: test validations
    }
    
    /**
     * Returns the datasets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetDatasetsTest() throws ApiException {
        ODataResponseListDataset response = api.datasetsGetDatasets();

        // TODO: test validations
    }
    
    /**
     * Returns the datasets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetDatasetsInGroupTest() throws ApiException {
        String groupId = null;
        ODataResponseListDataset response = api.datasetsGetDatasetsInGroup(groupId);

        // TODO: test validations
    }
    
    /**
     * Gets a list of datasource for the specified dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetDatasourcesTest() throws ApiException {
        String datasetKey = null;
        ODataResponseListDatasource response = api.datasetsGetDatasources(datasetKey);

        // TODO: test validations
    }
    
    /**
     * Gets a list of datasource for the specified dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetDatasourcesInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        ODataResponseListDatasource response = api.datasetsGetDatasourcesInGroup(groupId, datasetKey);

        // TODO: test validations
    }
    
    /**
     * Gets a list of bound gateway datasources for the specified dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetGatewayDatasourcesTest() throws ApiException {
        String datasetKey = null;
        ODataResponseListGatewayDatasource response = api.datasetsGetGatewayDatasources(datasetKey);

        // TODO: test validations
    }
    
    /**
     * Gets a list of bound gateway datasources for the specified dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetGatewayDatasourcesInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        ODataResponseListGatewayDatasource response = api.datasetsGetGatewayDatasourcesInGroup(groupId, datasetKey);

        // TODO: test validations
    }
    
    /**
     * Gets the dataset refresh history
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetRefreshHistoryTest() throws ApiException {
        String datasetKey = null;
        Integer top = null;
        ODataResponseListRefresh response = api.datasetsGetRefreshHistory(datasetKey, top);

        // TODO: test validations
    }
    
    /**
     * Gets the dataset refresh history
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetRefreshHistoryInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        Integer top = null;
        ODataResponseListRefresh response = api.datasetsGetRefreshHistoryInGroup(groupId, datasetKey, top);

        // TODO: test validations
    }
    
    /**
     * Gets all tables within the specified dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetTablesTest() throws ApiException {
        String datasetKey = null;
        ODataResponseListTable response = api.datasetsGetTables(datasetKey);

        // TODO: test validations
    }
    
    /**
     * Gets all tables within the specified dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsGetTablesInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        ODataResponseListTable response = api.datasetsGetTablesInGroup(groupId, datasetKey);

        // TODO: test validations
    }
    
    /**
     * Post a new entity to datasets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsPostDatasetTest() throws ApiException {
        Dataset dataset = null;
        Dataset response = api.datasetsPostDataset(dataset);

        // TODO: test validations
    }
    
    /**
     * Post a new entity to datasets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsPostDatasetInGroupTest() throws ApiException {
        String groupId = null;
        Dataset dataset = null;
        Dataset response = api.datasetsPostDatasetInGroup(groupId, dataset);

        // TODO: test validations
    }
    
    /**
     * Posts new data rows into the specified table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsPostRowsTest() throws ApiException {
        String datasetKey = null;
        String tableName = null;
        Object requestMessage = null;
        Object response = api.datasetsPostRows(datasetKey, tableName, requestMessage);

        // TODO: test validations
    }
    
    /**
     * Posts new data rows into the specified table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsPostRowsInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        String tableName = null;
        Object requestMessage = null;
        Object response = api.datasetsPostRowsInGroup(groupId, datasetKey, tableName, requestMessage);

        // TODO: test validations
    }
    
    /**
     * Updates a schema and metadata for the specified table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsPutTableTest() throws ApiException {
        String datasetKey = null;
        String tableName = null;
        Object requestMessage = null;
        Object response = api.datasetsPutTable(datasetKey, tableName, requestMessage);

        // TODO: test validations
    }
    
    /**
     * Updates a schema and metadata for the specified table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsPutTableInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        String tableName = null;
        Object requestMessage = null;
        Object response = api.datasetsPutTableInGroup(groupId, datasetKey, tableName, requestMessage);

        // TODO: test validations
    }
    
    /**
     * Start a dataset refresh
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsRefreshDatasetTest() throws ApiException {
        String datasetKey = null;
        Object response = api.datasetsRefreshDataset(datasetKey);

        // TODO: test validations
    }
    
    /**
     * Start a dataset refresh
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsRefreshDatasetInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        Object response = api.datasetsRefreshDatasetInGroup(groupId, datasetKey);

        // TODO: test validations
    }
    
    /**
     * Sets all connections for the specified dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsSetAllDatasetConnectionsTest() throws ApiException {
        String datasetKey = null;
        ConnectionDetails parameters = null;
        Object response = api.datasetsSetAllDatasetConnections(datasetKey, parameters);

        // TODO: test validations
    }
    
    /**
     * Sets all connections for the specified dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsSetAllDatasetConnectionsInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        ConnectionDetails parameters = null;
        Object response = api.datasetsSetAllDatasetConnectionsInGroup(groupId, datasetKey, parameters);

        // TODO: test validations
    }
    
    /**
     * Take Over a dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void datasetsTakeOverInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        Object response = api.datasetsTakeOverInGroup(groupId, datasetKey);

        // TODO: test validations
    }
    
}
