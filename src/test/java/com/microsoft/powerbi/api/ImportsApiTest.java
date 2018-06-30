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
    public void importsGetImportByIdTest() throws ApiException {
        String importId = null;
        ModelImport response = api.importsGetImportById(importId);

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
    public void importsGetImportByIdInGroupTest() throws ApiException {
        String groupId = null;
        String importId = null;
        ModelImport response = api.importsGetImportByIdInGroup(groupId, importId);

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
    public void importsGetImportsTest() throws ApiException {
        ODataResponseListImport response = api.importsGetImports();

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
    public void importsGetImportsInGroupTest() throws ApiException {
        String groupId = null;
        ODataResponseListImport response = api.importsGetImportsInGroup(groupId);

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
    public void importsPostImportTest() throws ApiException {
        String datasetDisplayName = null;
        ImportInfo importInfo = null;
        String nameConflict = null;
        ModelImport response = api.importsPostImport(datasetDisplayName, importInfo, nameConflict);

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
    public void importsPostImportInGroupTest() throws ApiException {
        String groupId = null;
        String datasetDisplayName = null;
        ImportInfo importInfo = null;
        String nameConflict = null;
        ModelImport response = api.importsPostImportInGroup(groupId, datasetDisplayName, importInfo, nameConflict);

        // TODO: test validations
    }
    
}
