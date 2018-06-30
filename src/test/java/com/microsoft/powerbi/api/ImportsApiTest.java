package com.microsoft.powerbi.api;

import com.microsoft.powerbi.ApiException;
import com.microsoft.powerbi.models.ImportInfo;
import com.microsoft.powerbi.models.ModelImport;
import com.microsoft.powerbi.models.ODataResponseListImport;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImportsApi
 */
@Ignore
public class ImportsApiTest {

    private final ImportsApi api = new ImportsApi();

    
    /**
     * Gets the import metadata for the specifed import id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImportByIdTest() throws ApiException {
        String importId = null;
        ModelImport response = api.getImportById(importId);

        // TODO: test validations
    }
    
    /**
     * Gets the import metadata for the specifed import id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImportByIdInGroupTest() throws ApiException {
        String groupId = null;
        String importId = null;
        ModelImport response = api.getImportByIdInGroup(groupId, importId);

        // TODO: test validations
    }
    
    /**
     * Returns a list of imports
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImportsTest() throws ApiException {
        ODataResponseListImport response = api.getImports();

        // TODO: test validations
    }
    
    /**
     * Returns a list of imports for the specified group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImportsInGroupTest() throws ApiException {
        String groupId = null;
        ODataResponseListImport response = api.getImportsInGroup(groupId);

        // TODO: test validations
    }
    
    /**
     * Creates a new import using the specified import info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postImportTest() throws ApiException {
        String datasetDisplayName = null;
        ImportInfo importInfo = null;
        String nameConflict = null;
        ModelImport response = api.postImport(datasetDisplayName, importInfo, nameConflict);

        // TODO: test validations
    }
    
    /**
     * Creates a new import using the specified import info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postImportInGroupTest() throws ApiException {
        String groupId = null;
        String datasetDisplayName = null;
        ImportInfo importInfo = null;
        String nameConflict = null;
        ModelImport response = api.postImportInGroup(groupId, datasetDisplayName, importInfo, nameConflict);

        // TODO: test validations
    }
    
}
