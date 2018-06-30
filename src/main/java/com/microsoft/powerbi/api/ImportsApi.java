

package com.microsoft.powerbi.api;

import com.microsoft.powerbi.ApiCallback;
import com.microsoft.powerbi.ApiClient;
import com.microsoft.powerbi.ApiException;
import com.microsoft.powerbi.ApiResponse;
import com.microsoft.powerbi.Configuration;
import com.microsoft.powerbi.Pair;
import com.microsoft.powerbi.ProgressRequestBody;
import com.microsoft.powerbi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.microsoft.powerbi.models.ImportInfo;
import com.microsoft.powerbi.models.ModelImport;
import com.microsoft.powerbi.models.ODataResponseListImport;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImportsApi {
    private ApiClient apiClient;

    public ImportsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImportsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getImportById
     * @param importId The import id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImportByIdCall(String importId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/imports/{importId}"
            .replaceAll("\\{" + "importId" + "\\}", apiClient.escapeString(importId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImportByIdValidateBeforeCall(String importId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'importId' is set
        if (importId == null) {
            throw new ApiException("Missing the required parameter 'importId' when calling getImportById(Async)");
        }
        

        com.squareup.okhttp.Call call = getImportByIdCall(importId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the import metadata for the specifed import id
     * 
     * @param importId The import id (required)
     * @return ModelImport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelImport getImportById(String importId) throws ApiException {
        ApiResponse<ModelImport> resp = getImportByIdWithHttpInfo(importId);
        return resp.getData();
    }

    /**
     * Gets the import metadata for the specifed import id
     * 
     * @param importId The import id (required)
     * @return ApiResponse&lt;ModelImport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelImport> getImportByIdWithHttpInfo(String importId) throws ApiException {
        com.squareup.okhttp.Call call = getImportByIdValidateBeforeCall(importId, null, null);
        Type localVarReturnType = new TypeToken<ModelImport>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the import metadata for the specifed import id (asynchronously)
     * 
     * @param importId The import id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImportByIdAsync(String importId, final ApiCallback<ModelImport> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImportByIdValidateBeforeCall(importId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelImport>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getImportByIdInGroup
     * @param groupId The group id (required)
     * @param importId The import id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImportByIdInGroupCall(String groupId, String importId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/imports/{importId}"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "importId" + "\\}", apiClient.escapeString(importId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImportByIdInGroupValidateBeforeCall(String groupId, String importId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getImportByIdInGroup(Async)");
        }
        
        // verify the required parameter 'importId' is set
        if (importId == null) {
            throw new ApiException("Missing the required parameter 'importId' when calling getImportByIdInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getImportByIdInGroupCall(groupId, importId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the import metadata for the specifed import id
     * 
     * @param groupId The group id (required)
     * @param importId The import id (required)
     * @return ModelImport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelImport getImportByIdInGroup(String groupId, String importId) throws ApiException {
        ApiResponse<ModelImport> resp = getImportByIdInGroupWithHttpInfo(groupId, importId);
        return resp.getData();
    }

    /**
     * Gets the import metadata for the specifed import id
     * 
     * @param groupId The group id (required)
     * @param importId The import id (required)
     * @return ApiResponse&lt;ModelImport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelImport> getImportByIdInGroupWithHttpInfo(String groupId, String importId) throws ApiException {
        com.squareup.okhttp.Call call = getImportByIdInGroupValidateBeforeCall(groupId, importId, null, null);
        Type localVarReturnType = new TypeToken<ModelImport>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the import metadata for the specifed import id (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param importId The import id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImportByIdInGroupAsync(String groupId, String importId, final ApiCallback<ModelImport> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImportByIdInGroupValidateBeforeCall(groupId, importId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelImport>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getImports
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImportsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/imports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImportsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getImportsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a list of imports
     * 
     * @return ODataResponseListImport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListImport getImports() throws ApiException {
        ApiResponse<ODataResponseListImport> resp = getImportsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Returns a list of imports
     * 
     * @return ApiResponse&lt;ODataResponseListImport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListImport> getImportsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getImportsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListImport>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of imports (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImportsAsync(final ApiCallback<ODataResponseListImport> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImportsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListImport>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getImportsInGroup
     * @param groupId The group id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImportsInGroupCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/imports"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImportsInGroupValidateBeforeCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getImportsInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getImportsInGroupCall(groupId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a list of imports for the specified group
     * 
     * @param groupId The group id (required)
     * @return ODataResponseListImport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListImport getImportsInGroup(String groupId) throws ApiException {
        ApiResponse<ODataResponseListImport> resp = getImportsInGroupWithHttpInfo(groupId);
        return resp.getData();
    }

    /**
     * Returns a list of imports for the specified group
     * 
     * @param groupId The group id (required)
     * @return ApiResponse&lt;ODataResponseListImport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListImport> getImportsInGroupWithHttpInfo(String groupId) throws ApiException {
        com.squareup.okhttp.Call call = getImportsInGroupValidateBeforeCall(groupId, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListImport>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of imports for the specified group (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImportsInGroupAsync(String groupId, final ApiCallback<ODataResponseListImport> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImportsInGroupValidateBeforeCall(groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListImport>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postImport
     * @param datasetDisplayName The display name of the dataset (required)
     * @param importInfo The import to post (required)
     * @param nameConflict Determines what to do if a dataset with the same name already exists (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postImportCall(String datasetDisplayName, ImportInfo importInfo, String nameConflict, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = importInfo;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/imports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasetDisplayName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasetDisplayName", datasetDisplayName));
        if (nameConflict != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("nameConflict", nameConflict));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postImportValidateBeforeCall(String datasetDisplayName, ImportInfo importInfo, String nameConflict, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetDisplayName' is set
        if (datasetDisplayName == null) {
            throw new ApiException("Missing the required parameter 'datasetDisplayName' when calling postImport(Async)");
        }
        
        // verify the required parameter 'importInfo' is set
        if (importInfo == null) {
            throw new ApiException("Missing the required parameter 'importInfo' when calling postImport(Async)");
        }
        

        com.squareup.okhttp.Call call = postImportCall(datasetDisplayName, importInfo, nameConflict, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new import using the specified import info
     * 
     * @param datasetDisplayName The display name of the dataset (required)
     * @param importInfo The import to post (required)
     * @param nameConflict Determines what to do if a dataset with the same name already exists (optional)
     * @return ModelImport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelImport postImport(String datasetDisplayName, ImportInfo importInfo, String nameConflict) throws ApiException {
        ApiResponse<ModelImport> resp = postImportWithHttpInfo(datasetDisplayName, importInfo, nameConflict);
        return resp.getData();
    }

    /**
     * Creates a new import using the specified import info
     * 
     * @param datasetDisplayName The display name of the dataset (required)
     * @param importInfo The import to post (required)
     * @param nameConflict Determines what to do if a dataset with the same name already exists (optional)
     * @return ApiResponse&lt;ModelImport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelImport> postImportWithHttpInfo(String datasetDisplayName, ImportInfo importInfo, String nameConflict) throws ApiException {
        com.squareup.okhttp.Call call = postImportValidateBeforeCall(datasetDisplayName, importInfo, nameConflict, null, null);
        Type localVarReturnType = new TypeToken<ModelImport>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new import using the specified import info (asynchronously)
     * 
     * @param datasetDisplayName The display name of the dataset (required)
     * @param importInfo The import to post (required)
     * @param nameConflict Determines what to do if a dataset with the same name already exists (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postImportAsync(String datasetDisplayName, ImportInfo importInfo, String nameConflict, final ApiCallback<ModelImport> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postImportValidateBeforeCall(datasetDisplayName, importInfo, nameConflict, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelImport>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postImportInGroup
     * @param groupId The group id (required)
     * @param datasetDisplayName The display name of the dataset (required)
     * @param importInfo The import to post (required)
     * @param nameConflict Determines what to do if a dataset with the same name already exists (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postImportInGroupCall(String groupId, String datasetDisplayName, ImportInfo importInfo, String nameConflict, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = importInfo;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/imports"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasetDisplayName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasetDisplayName", datasetDisplayName));
        if (nameConflict != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("nameConflict", nameConflict));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postImportInGroupValidateBeforeCall(String groupId, String datasetDisplayName, ImportInfo importInfo, String nameConflict, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling postImportInGroup(Async)");
        }
        
        // verify the required parameter 'datasetDisplayName' is set
        if (datasetDisplayName == null) {
            throw new ApiException("Missing the required parameter 'datasetDisplayName' when calling postImportInGroup(Async)");
        }
        
        // verify the required parameter 'importInfo' is set
        if (importInfo == null) {
            throw new ApiException("Missing the required parameter 'importInfo' when calling postImportInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = postImportInGroupCall(groupId, datasetDisplayName, importInfo, nameConflict, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new import using the specified import info
     * 
     * @param groupId The group id (required)
     * @param datasetDisplayName The display name of the dataset (required)
     * @param importInfo The import to post (required)
     * @param nameConflict Determines what to do if a dataset with the same name already exists (optional)
     * @return ModelImport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelImport postImportInGroup(String groupId, String datasetDisplayName, ImportInfo importInfo, String nameConflict) throws ApiException {
        ApiResponse<ModelImport> resp = postImportInGroupWithHttpInfo(groupId, datasetDisplayName, importInfo, nameConflict);
        return resp.getData();
    }

    /**
     * Creates a new import using the specified import info
     * 
     * @param groupId The group id (required)
     * @param datasetDisplayName The display name of the dataset (required)
     * @param importInfo The import to post (required)
     * @param nameConflict Determines what to do if a dataset with the same name already exists (optional)
     * @return ApiResponse&lt;ModelImport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelImport> postImportInGroupWithHttpInfo(String groupId, String datasetDisplayName, ImportInfo importInfo, String nameConflict) throws ApiException {
        com.squareup.okhttp.Call call = postImportInGroupValidateBeforeCall(groupId, datasetDisplayName, importInfo, nameConflict, null, null);
        Type localVarReturnType = new TypeToken<ModelImport>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new import using the specified import info (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetDisplayName The display name of the dataset (required)
     * @param importInfo The import to post (required)
     * @param nameConflict Determines what to do if a dataset with the same name already exists (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postImportInGroupAsync(String groupId, String datasetDisplayName, ImportInfo importInfo, String nameConflict, final ApiCallback<ModelImport> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postImportInGroupValidateBeforeCall(groupId, datasetDisplayName, importInfo, nameConflict, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelImport>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
