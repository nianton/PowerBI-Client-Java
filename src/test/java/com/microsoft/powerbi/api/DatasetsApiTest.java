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
    public void bindToGatewayTest() throws ApiException {
        String datasetKey = null;
        BindToGatewayRequest bindToGatewayRequest = null;
        Object response = api.bindToGateway(datasetKey, bindToGatewayRequest);

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
    public void bindToGatewayInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        BindToGatewayRequest bindToGatewayRequest = null;
        Object response = api.bindToGatewayInGroup(groupId, datasetKey, bindToGatewayRequest);

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
    public void deleteDatasetByIdTest() throws ApiException {
        String datasetKey = null;
        Object response = api.deleteDatasetById(datasetKey);

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
    public void deleteDatasetByIdInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        Object response = api.deleteDatasetByIdInGroup(groupId, datasetKey);

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
    public void deleteRowsTest() throws ApiException {
        String datasetKey = null;
        String tableName = null;
        Object response = api.deleteRows(datasetKey, tableName);

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
    public void deleteRowsInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        String tableName = null;
        Object response = api.deleteRowsInGroup(groupId, datasetKey, tableName);

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
    public void generateTokenInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.generateTokenInGroup(groupId, datasetKey, requestParameters);

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
    public void getDatasetByIdTest() throws ApiException {
        String datasetKey = null;
        Dataset response = api.getDatasetById(datasetKey);

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
    public void getDatasetByIdInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        Dataset response = api.getDatasetByIdInGroup(groupId, datasetKey);

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
    public void getDatasetsTest() throws ApiException {
        ODataResponseListDataset response = api.getDatasets();

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
    public void getDatasetsInGroupTest() throws ApiException {
        String groupId = null;
        ODataResponseListDataset response = api.getDatasetsInGroup(groupId);

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
    public void getDatasourcesTest() throws ApiException {
        String datasetKey = null;
        ODataResponseListDatasource response = api.getDatasources(datasetKey);

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
    public void getDatasourcesInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        ODataResponseListDatasource response = api.getDatasourcesInGroup(groupId, datasetKey);

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
    public void getGatewayDatasourcesTest() throws ApiException {
        String datasetKey = null;
        ODataResponseListGatewayDatasource response = api.getGatewayDatasources(datasetKey);

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
    public void getGatewayDatasourcesInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        ODataResponseListGatewayDatasource response = api.getGatewayDatasourcesInGroup(groupId, datasetKey);

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
    public void getRefreshHistoryTest() throws ApiException {
        String datasetKey = null;
        Integer top = null;
        ODataResponseListRefresh response = api.getRefreshHistory(datasetKey, top);

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
    public void getRefreshHistoryInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        Integer top = null;
        ODataResponseListRefresh response = api.getRefreshHistoryInGroup(groupId, datasetKey, top);

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
    public void getTablesTest() throws ApiException {
        String datasetKey = null;
        ODataResponseListTable response = api.getTables(datasetKey);

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
    public void getTablesInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        ODataResponseListTable response = api.getTablesInGroup(groupId, datasetKey);

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
    public void postDatasetTest() throws ApiException {
        Dataset dataset = null;
        Dataset response = api.postDataset(dataset);

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
    public void postDatasetInGroupTest() throws ApiException {
        String groupId = null;
        Dataset dataset = null;
        Dataset response = api.postDatasetInGroup(groupId, dataset);

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
    public void postRowsTest() throws ApiException {
        String datasetKey = null;
        String tableName = null;
        Object requestMessage = null;
        Object response = api.postRows(datasetKey, tableName, requestMessage);

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
    public void postRowsInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        String tableName = null;
        Object requestMessage = null;
        Object response = api.postRowsInGroup(groupId, datasetKey, tableName, requestMessage);

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
    public void putTableTest() throws ApiException {
        String datasetKey = null;
        String tableName = null;
        Object requestMessage = null;
        Object response = api.putTable(datasetKey, tableName, requestMessage);

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
    public void putTableInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        String tableName = null;
        Object requestMessage = null;
        Object response = api.putTableInGroup(groupId, datasetKey, tableName, requestMessage);

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
    public void refreshDatasetTest() throws ApiException {
        String datasetKey = null;
        Object response = api.refreshDataset(datasetKey);

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
    public void refreshDatasetInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        Object response = api.refreshDatasetInGroup(groupId, datasetKey);

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
    public void setAllDatasetConnectionsTest() throws ApiException {
        String datasetKey = null;
        ConnectionDetails parameters = null;
        Object response = api.setAllDatasetConnections(datasetKey, parameters);

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
    public void setAllDatasetConnectionsInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        ConnectionDetails parameters = null;
        Object response = api.setAllDatasetConnectionsInGroup(groupId, datasetKey, parameters);

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
    public void takeOverInGroupTest() throws ApiException {
        String groupId = null;
        String datasetKey = null;
        Object response = api.takeOverInGroup(groupId, datasetKey);

        // TODO: test validations
    }
    
}
