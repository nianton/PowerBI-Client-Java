

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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatasetsApi {
    private ApiClient apiClient;

    public DatasetsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DatasetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for bindToGateway
     * @param datasetKey The dataset id (required)
     * @param bindToGatewayRequest The bind to gateway request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call bindToGatewayCall(String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = bindToGatewayRequest;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}/Default.BindToGateway"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call bindToGatewayValidateBeforeCall(String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling bindToGateway(Async)");
        }
        
        // verify the required parameter 'bindToGatewayRequest' is set
        if (bindToGatewayRequest == null) {
            throw new ApiException("Missing the required parameter 'bindToGatewayRequest' when calling bindToGateway(Async)");
        }
        

        com.squareup.okhttp.Call call = bindToGatewayCall(datasetKey, bindToGatewayRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Bind dataset to gateway
     * 
     * @param datasetKey The dataset id (required)
     * @param bindToGatewayRequest The bind to gateway request (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object bindToGateway(String datasetKey, BindToGatewayRequest bindToGatewayRequest) throws ApiException {
        ApiResponse<Object> resp = bindToGatewayWithHttpInfo(datasetKey, bindToGatewayRequest);
        return resp.getData();
    }

    /**
     * Bind dataset to gateway
     * 
     * @param datasetKey The dataset id (required)
     * @param bindToGatewayRequest The bind to gateway request (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> bindToGatewayWithHttpInfo(String datasetKey, BindToGatewayRequest bindToGatewayRequest) throws ApiException {
        com.squareup.okhttp.Call call = bindToGatewayValidateBeforeCall(datasetKey, bindToGatewayRequest, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Bind dataset to gateway (asynchronously)
     * 
     * @param datasetKey The dataset id (required)
     * @param bindToGatewayRequest The bind to gateway request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call bindToGatewayAsync(String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = bindToGatewayValidateBeforeCall(datasetKey, bindToGatewayRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for bindToGatewayInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param bindToGatewayRequest The bind to gateway request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call bindToGatewayInGroupCall(String groupId, String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = bindToGatewayRequest;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.BindToGateway"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call bindToGatewayInGroupValidateBeforeCall(String groupId, String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling bindToGatewayInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling bindToGatewayInGroup(Async)");
        }
        
        // verify the required parameter 'bindToGatewayRequest' is set
        if (bindToGatewayRequest == null) {
            throw new ApiException("Missing the required parameter 'bindToGatewayRequest' when calling bindToGatewayInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = bindToGatewayInGroupCall(groupId, datasetKey, bindToGatewayRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Bind dataset to gateway
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param bindToGatewayRequest The bind to gateway request (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object bindToGatewayInGroup(String groupId, String datasetKey, BindToGatewayRequest bindToGatewayRequest) throws ApiException {
        ApiResponse<Object> resp = bindToGatewayInGroupWithHttpInfo(groupId, datasetKey, bindToGatewayRequest);
        return resp.getData();
    }

    /**
     * Bind dataset to gateway
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param bindToGatewayRequest The bind to gateway request (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> bindToGatewayInGroupWithHttpInfo(String groupId, String datasetKey, BindToGatewayRequest bindToGatewayRequest) throws ApiException {
        com.squareup.okhttp.Call call = bindToGatewayInGroupValidateBeforeCall(groupId, datasetKey, bindToGatewayRequest, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Bind dataset to gateway (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param bindToGatewayRequest The bind to gateway request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call bindToGatewayInGroupAsync(String groupId, String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = bindToGatewayInGroupValidateBeforeCall(groupId, datasetKey, bindToGatewayRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDatasetById
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDatasetByIdCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDatasetByIdValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling deleteDatasetById(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteDatasetByIdCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes the dataset with the specified id
     * 
     * @param datasetKey The dataset id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object deleteDatasetById(String datasetKey) throws ApiException {
        ApiResponse<Object> resp = deleteDatasetByIdWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Deletes the dataset with the specified id
     * 
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deleteDatasetByIdWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = deleteDatasetByIdValidateBeforeCall(datasetKey, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes the dataset with the specified id (asynchronously)
     * 
     * @param datasetKey The dataset id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDatasetByIdAsync(String datasetKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteDatasetByIdValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDatasetByIdInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDatasetByIdInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDatasetByIdInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling deleteDatasetByIdInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling deleteDatasetByIdInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteDatasetByIdInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes the dataset with the specified id
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object deleteDatasetByIdInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<Object> resp = deleteDatasetByIdInGroupWithHttpInfo(groupId, datasetKey);
        return resp.getData();
    }

    /**
     * Deletes the dataset with the specified id
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deleteDatasetByIdInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = deleteDatasetByIdInGroupValidateBeforeCall(groupId, datasetKey, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes the dataset with the specified id (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDatasetByIdInGroupAsync(String groupId, String datasetKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteDatasetByIdInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteRows
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteRowsCall(String datasetKey, String tableName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}/tables/{tableName}/rows"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()))
            .replaceAll("\\{" + "tableName" + "\\}", apiClient.escapeString(tableName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRowsValidateBeforeCall(String datasetKey, String tableName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling deleteRows(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling deleteRows(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteRowsCall(datasetKey, tableName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes all rows from the specified table
     * 
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object deleteRows(String datasetKey, String tableName) throws ApiException {
        ApiResponse<Object> resp = deleteRowsWithHttpInfo(datasetKey, tableName);
        return resp.getData();
    }

    /**
     * Deletes all rows from the specified table
     * 
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deleteRowsWithHttpInfo(String datasetKey, String tableName) throws ApiException {
        com.squareup.okhttp.Call call = deleteRowsValidateBeforeCall(datasetKey, tableName, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes all rows from the specified table (asynchronously)
     * 
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteRowsAsync(String datasetKey, String tableName, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteRowsValidateBeforeCall(datasetKey, tableName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteRowsInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteRowsInGroupCall(String groupId, String datasetKey, String tableName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName}/rows"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()))
            .replaceAll("\\{" + "tableName" + "\\}", apiClient.escapeString(tableName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRowsInGroupValidateBeforeCall(String groupId, String datasetKey, String tableName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling deleteRowsInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling deleteRowsInGroup(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling deleteRowsInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteRowsInGroupCall(groupId, datasetKey, tableName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes all rows from the specified table
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object deleteRowsInGroup(String groupId, String datasetKey, String tableName) throws ApiException {
        ApiResponse<Object> resp = deleteRowsInGroupWithHttpInfo(groupId, datasetKey, tableName);
        return resp.getData();
    }

    /**
     * Deletes all rows from the specified table
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deleteRowsInGroupWithHttpInfo(String groupId, String datasetKey, String tableName) throws ApiException {
        com.squareup.okhttp.Call call = deleteRowsInGroupValidateBeforeCall(groupId, datasetKey, tableName, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes all rows from the specified table (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteRowsInGroupAsync(String groupId, String datasetKey, String tableName, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteRowsInGroupValidateBeforeCall(groupId, datasetKey, tableName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for generateTokenInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param requestParameters Generate token parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generateTokenInGroupCall(String groupId, String datasetKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/GenerateToken"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

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
    private com.squareup.okhttp.Call generateTokenInGroupValidateBeforeCall(String groupId, String datasetKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling generateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling generateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling generateTokenInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = generateTokenInGroupCall(groupId, datasetKey, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generate token to view the specified dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param requestParameters Generate token parameters (required)
     * @return EmbedToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmbedToken generateTokenInGroup(String groupId, String datasetKey, GenerateTokenRequest requestParameters) throws ApiException {
        ApiResponse<EmbedToken> resp = generateTokenInGroupWithHttpInfo(groupId, datasetKey, requestParameters);
        return resp.getData();
    }

    /**
     * Generate token to view the specified dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param requestParameters Generate token parameters (required)
     * @return ApiResponse&lt;EmbedToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmbedToken> generateTokenInGroupWithHttpInfo(String groupId, String datasetKey, GenerateTokenRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = generateTokenInGroupValidateBeforeCall(groupId, datasetKey, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate token to view the specified dataset (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param requestParameters Generate token parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generateTokenInGroupAsync(String groupId, String datasetKey, GenerateTokenRequest requestParameters, final ApiCallback<EmbedToken> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = generateTokenInGroupValidateBeforeCall(groupId, datasetKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasetById
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasetByIdCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

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
    private com.squareup.okhttp.Call getDatasetByIdValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling getDatasetById(Async)");
        }
        

        com.squareup.okhttp.Call call = getDatasetByIdCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the dataset metadata for the specifeid dataset id
     * 
     * @param datasetKey The dataset id (required)
     * @return Dataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dataset getDatasetById(String datasetKey) throws ApiException {
        ApiResponse<Dataset> resp = getDatasetByIdWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Gets the dataset metadata for the specifeid dataset id
     * 
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;Dataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dataset> getDatasetByIdWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = getDatasetByIdValidateBeforeCall(datasetKey, null, null);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the dataset metadata for the specifeid dataset id (asynchronously)
     * 
     * @param datasetKey The dataset id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasetByIdAsync(String datasetKey, final ApiCallback<Dataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDatasetByIdValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasetByIdInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasetByIdInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

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
    private com.squareup.okhttp.Call getDatasetByIdInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getDatasetByIdInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling getDatasetByIdInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getDatasetByIdInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the dataset metadata for the specifeid dataset id
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return Dataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dataset getDatasetByIdInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<Dataset> resp = getDatasetByIdInGroupWithHttpInfo(groupId, datasetKey);
        return resp.getData();
    }

    /**
     * Gets the dataset metadata for the specifeid dataset id
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;Dataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dataset> getDatasetByIdInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = getDatasetByIdInGroupValidateBeforeCall(groupId, datasetKey, null, null);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the dataset metadata for the specifeid dataset id (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasetByIdInGroupAsync(String groupId, String datasetKey, final ApiCallback<Dataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDatasetByIdInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasets
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasetsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets";

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
    private com.squareup.okhttp.Call getDatasetsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getDatasetsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns the datasets
     * 
     * @return ODataResponseListDataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListDataset getDatasets() throws ApiException {
        ApiResponse<ODataResponseListDataset> resp = getDatasetsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Returns the datasets
     * 
     * @return ApiResponse&lt;ODataResponseListDataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListDataset> getDatasetsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getDatasetsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListDataset>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns the datasets (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasetsAsync(final ApiCallback<ODataResponseListDataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDatasetsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListDataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasetsInGroup
     * @param groupId The group id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasetsInGroupCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets"
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
    private com.squareup.okhttp.Call getDatasetsInGroupValidateBeforeCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getDatasetsInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getDatasetsInGroupCall(groupId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns the datasets
     * 
     * @param groupId The group id (required)
     * @return ODataResponseListDataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListDataset getDatasetsInGroup(String groupId) throws ApiException {
        ApiResponse<ODataResponseListDataset> resp = getDatasetsInGroupWithHttpInfo(groupId);
        return resp.getData();
    }

    /**
     * Returns the datasets
     * 
     * @param groupId The group id (required)
     * @return ApiResponse&lt;ODataResponseListDataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListDataset> getDatasetsInGroupWithHttpInfo(String groupId) throws ApiException {
        com.squareup.okhttp.Call call = getDatasetsInGroupValidateBeforeCall(groupId, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListDataset>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns the datasets (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasetsInGroupAsync(String groupId, final ApiCallback<ODataResponseListDataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDatasetsInGroupValidateBeforeCall(groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListDataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasources
     * @param datasetKey  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasourcesCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}/datasources"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

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
    private com.squareup.okhttp.Call getDatasourcesValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling getDatasources(Async)");
        }
        

        com.squareup.okhttp.Call call = getDatasourcesCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of datasource for the specified dataset
     * 
     * @param datasetKey  (required)
     * @return ODataResponseListDatasource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListDatasource getDatasources(String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListDatasource> resp = getDatasourcesWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Gets a list of datasource for the specified dataset
     * 
     * @param datasetKey  (required)
     * @return ApiResponse&lt;ODataResponseListDatasource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListDatasource> getDatasourcesWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = getDatasourcesValidateBeforeCall(datasetKey, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListDatasource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of datasource for the specified dataset (asynchronously)
     * 
     * @param datasetKey  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasourcesAsync(String datasetKey, final ApiCallback<ODataResponseListDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDatasourcesValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasourcesInGroup
     * @param groupId The group id (required)
     * @param datasetKey  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasourcesInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/datasources"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

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
    private com.squareup.okhttp.Call getDatasourcesInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getDatasourcesInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling getDatasourcesInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getDatasourcesInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of datasource for the specified dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey  (required)
     * @return ODataResponseListDatasource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListDatasource getDatasourcesInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListDatasource> resp = getDatasourcesInGroupWithHttpInfo(groupId, datasetKey);
        return resp.getData();
    }

    /**
     * Gets a list of datasource for the specified dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey  (required)
     * @return ApiResponse&lt;ODataResponseListDatasource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListDatasource> getDatasourcesInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = getDatasourcesInGroupValidateBeforeCall(groupId, datasetKey, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListDatasource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of datasource for the specified dataset (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasourcesInGroupAsync(String groupId, String datasetKey, final ApiCallback<ODataResponseListDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDatasourcesInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGatewayDatasources
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGatewayDatasourcesCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}/Default.GetBoundGatewayDatasources"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

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
    private com.squareup.okhttp.Call getGatewayDatasourcesValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling getGatewayDatasources(Async)");
        }
        

        com.squareup.okhttp.Call call = getGatewayDatasourcesCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of bound gateway datasources for the specified dataset
     * 
     * @param datasetKey The dataset id (required)
     * @return ODataResponseListGatewayDatasource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListGatewayDatasource getGatewayDatasources(String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListGatewayDatasource> resp = getGatewayDatasourcesWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Gets a list of bound gateway datasources for the specified dataset
     * 
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;ODataResponseListGatewayDatasource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListGatewayDatasource> getGatewayDatasourcesWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = getGatewayDatasourcesValidateBeforeCall(datasetKey, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListGatewayDatasource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of bound gateway datasources for the specified dataset (asynchronously)
     * 
     * @param datasetKey The dataset id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGatewayDatasourcesAsync(String datasetKey, final ApiCallback<ODataResponseListGatewayDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGatewayDatasourcesValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListGatewayDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGatewayDatasourcesInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGatewayDatasourcesInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.GetBoundGatewayDatasources"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

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
    private com.squareup.okhttp.Call getGatewayDatasourcesInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getGatewayDatasourcesInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling getGatewayDatasourcesInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getGatewayDatasourcesInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of bound gateway datasources for the specified dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return ODataResponseListGatewayDatasource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListGatewayDatasource getGatewayDatasourcesInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListGatewayDatasource> resp = getGatewayDatasourcesInGroupWithHttpInfo(groupId, datasetKey);
        return resp.getData();
    }

    /**
     * Gets a list of bound gateway datasources for the specified dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;ODataResponseListGatewayDatasource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListGatewayDatasource> getGatewayDatasourcesInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = getGatewayDatasourcesInGroupValidateBeforeCall(groupId, datasetKey, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListGatewayDatasource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of bound gateway datasources for the specified dataset (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGatewayDatasourcesInGroupAsync(String groupId, String datasetKey, final ApiCallback<ODataResponseListGatewayDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGatewayDatasourcesInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListGatewayDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRefreshHistory
     * @param datasetKey The dataset id (required)
     * @param top The requested number of entries in the refresh history, if not supported the default is all available entries (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRefreshHistoryCall(String datasetKey, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}/refreshes"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("$top", top));

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
    private com.squareup.okhttp.Call getRefreshHistoryValidateBeforeCall(String datasetKey, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling getRefreshHistory(Async)");
        }
        

        com.squareup.okhttp.Call call = getRefreshHistoryCall(datasetKey, top, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the dataset refresh history
     * 
     * @param datasetKey The dataset id (required)
     * @param top The requested number of entries in the refresh history, if not supported the default is all available entries (optional)
     * @return ODataResponseListRefresh
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListRefresh getRefreshHistory(String datasetKey, Integer top) throws ApiException {
        ApiResponse<ODataResponseListRefresh> resp = getRefreshHistoryWithHttpInfo(datasetKey, top);
        return resp.getData();
    }

    /**
     * Gets the dataset refresh history
     * 
     * @param datasetKey The dataset id (required)
     * @param top The requested number of entries in the refresh history, if not supported the default is all available entries (optional)
     * @return ApiResponse&lt;ODataResponseListRefresh&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListRefresh> getRefreshHistoryWithHttpInfo(String datasetKey, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getRefreshHistoryValidateBeforeCall(datasetKey, top, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListRefresh>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the dataset refresh history (asynchronously)
     * 
     * @param datasetKey The dataset id (required)
     * @param top The requested number of entries in the refresh history, if not supported the default is all available entries (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRefreshHistoryAsync(String datasetKey, Integer top, final ApiCallback<ODataResponseListRefresh> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRefreshHistoryValidateBeforeCall(datasetKey, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListRefresh>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRefreshHistoryInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param top The requested number of entries in the refresh history, if not supported the default is all available entries (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRefreshHistoryInGroupCall(String groupId, String datasetKey, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/refreshes"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("$top", top));

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
    private com.squareup.okhttp.Call getRefreshHistoryInGroupValidateBeforeCall(String groupId, String datasetKey, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getRefreshHistoryInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling getRefreshHistoryInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getRefreshHistoryInGroupCall(groupId, datasetKey, top, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the dataset refresh history
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param top The requested number of entries in the refresh history, if not supported the default is all available entries (optional)
     * @return ODataResponseListRefresh
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListRefresh getRefreshHistoryInGroup(String groupId, String datasetKey, Integer top) throws ApiException {
        ApiResponse<ODataResponseListRefresh> resp = getRefreshHistoryInGroupWithHttpInfo(groupId, datasetKey, top);
        return resp.getData();
    }

    /**
     * Gets the dataset refresh history
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param top The requested number of entries in the refresh history, if not supported the default is all available entries (optional)
     * @return ApiResponse&lt;ODataResponseListRefresh&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListRefresh> getRefreshHistoryInGroupWithHttpInfo(String groupId, String datasetKey, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getRefreshHistoryInGroupValidateBeforeCall(groupId, datasetKey, top, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListRefresh>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the dataset refresh history (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param top The requested number of entries in the refresh history, if not supported the default is all available entries (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRefreshHistoryInGroupAsync(String groupId, String datasetKey, Integer top, final ApiCallback<ODataResponseListRefresh> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRefreshHistoryInGroupValidateBeforeCall(groupId, datasetKey, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListRefresh>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTables
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTablesCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}/tables"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

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
    private com.squareup.okhttp.Call getTablesValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling getTables(Async)");
        }
        

        com.squareup.okhttp.Call call = getTablesCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets all tables within the specified dataset
     * 
     * @param datasetKey The dataset id (required)
     * @return ODataResponseListTable
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListTable getTables(String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListTable> resp = getTablesWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Gets all tables within the specified dataset
     * 
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;ODataResponseListTable&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListTable> getTablesWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = getTablesValidateBeforeCall(datasetKey, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListTable>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets all tables within the specified dataset (asynchronously)
     * 
     * @param datasetKey The dataset id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTablesAsync(String datasetKey, final ApiCallback<ODataResponseListTable> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTablesValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListTable>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTablesInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTablesInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

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
    private com.squareup.okhttp.Call getTablesInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getTablesInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling getTablesInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getTablesInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets all tables within the specified dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return ODataResponseListTable
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListTable getTablesInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListTable> resp = getTablesInGroupWithHttpInfo(groupId, datasetKey);
        return resp.getData();
    }

    /**
     * Gets all tables within the specified dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;ODataResponseListTable&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListTable> getTablesInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = getTablesInGroupValidateBeforeCall(groupId, datasetKey, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListTable>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets all tables within the specified dataset (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTablesInGroupAsync(String groupId, String datasetKey, final ApiCallback<ODataResponseListTable> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTablesInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListTable>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDataset
     * @param dataset Create dataset parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postDatasetCall(Dataset dataset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = dataset;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets";

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
    private com.squareup.okhttp.Call postDatasetValidateBeforeCall(Dataset dataset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dataset' is set
        if (dataset == null) {
            throw new ApiException("Missing the required parameter 'dataset' when calling postDataset(Async)");
        }
        

        com.squareup.okhttp.Call call = postDatasetCall(dataset, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Post a new entity to datasets
     * 
     * @param dataset Create dataset parameters (required)
     * @return Dataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dataset postDataset(Dataset dataset) throws ApiException {
        ApiResponse<Dataset> resp = postDatasetWithHttpInfo(dataset);
        return resp.getData();
    }

    /**
     * Post a new entity to datasets
     * 
     * @param dataset Create dataset parameters (required)
     * @return ApiResponse&lt;Dataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dataset> postDatasetWithHttpInfo(Dataset dataset) throws ApiException {
        com.squareup.okhttp.Call call = postDatasetValidateBeforeCall(dataset, null, null);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Post a new entity to datasets (asynchronously)
     * 
     * @param dataset Create dataset parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDatasetAsync(Dataset dataset, final ApiCallback<Dataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDatasetValidateBeforeCall(dataset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDatasetInGroup
     * @param groupId The group id (required)
     * @param dataset Create dataset parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postDatasetInGroupCall(String groupId, Dataset dataset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = dataset;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets"
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
    private com.squareup.okhttp.Call postDatasetInGroupValidateBeforeCall(String groupId, Dataset dataset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling postDatasetInGroup(Async)");
        }
        
        // verify the required parameter 'dataset' is set
        if (dataset == null) {
            throw new ApiException("Missing the required parameter 'dataset' when calling postDatasetInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = postDatasetInGroupCall(groupId, dataset, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Post a new entity to datasets
     * 
     * @param groupId The group id (required)
     * @param dataset Create dataset parameters (required)
     * @return Dataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dataset postDatasetInGroup(String groupId, Dataset dataset) throws ApiException {
        ApiResponse<Dataset> resp = postDatasetInGroupWithHttpInfo(groupId, dataset);
        return resp.getData();
    }

    /**
     * Post a new entity to datasets
     * 
     * @param groupId The group id (required)
     * @param dataset Create dataset parameters (required)
     * @return ApiResponse&lt;Dataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dataset> postDatasetInGroupWithHttpInfo(String groupId, Dataset dataset) throws ApiException {
        com.squareup.okhttp.Call call = postDatasetInGroupValidateBeforeCall(groupId, dataset, null, null);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Post a new entity to datasets (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param dataset Create dataset parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDatasetInGroupAsync(String groupId, Dataset dataset, final ApiCallback<Dataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDatasetInGroupValidateBeforeCall(groupId, dataset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postRows
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postRowsCall(String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestMessage;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}/tables/{tableName}/rows"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()))
            .replaceAll("\\{" + "tableName" + "\\}", apiClient.escapeString(tableName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postRowsValidateBeforeCall(String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling postRows(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling postRows(Async)");
        }
        
        // verify the required parameter 'requestMessage' is set
        if (requestMessage == null) {
            throw new ApiException("Missing the required parameter 'requestMessage' when calling postRows(Async)");
        }
        

        com.squareup.okhttp.Call call = postRowsCall(datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Posts new data rows into the specified table
     * 
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object postRows(String datasetKey, String tableName, Object requestMessage) throws ApiException {
        ApiResponse<Object> resp = postRowsWithHttpInfo(datasetKey, tableName, requestMessage);
        return resp.getData();
    }

    /**
     * Posts new data rows into the specified table
     * 
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> postRowsWithHttpInfo(String datasetKey, String tableName, Object requestMessage) throws ApiException {
        com.squareup.okhttp.Call call = postRowsValidateBeforeCall(datasetKey, tableName, requestMessage, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Posts new data rows into the specified table (asynchronously)
     * 
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postRowsAsync(String datasetKey, String tableName, Object requestMessage, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postRowsValidateBeforeCall(datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postRowsInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postRowsInGroupCall(String groupId, String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestMessage;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName}/rows"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()))
            .replaceAll("\\{" + "tableName" + "\\}", apiClient.escapeString(tableName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postRowsInGroupValidateBeforeCall(String groupId, String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling postRowsInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling postRowsInGroup(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling postRowsInGroup(Async)");
        }
        
        // verify the required parameter 'requestMessage' is set
        if (requestMessage == null) {
            throw new ApiException("Missing the required parameter 'requestMessage' when calling postRowsInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = postRowsInGroupCall(groupId, datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Posts new data rows into the specified table
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object postRowsInGroup(String groupId, String datasetKey, String tableName, Object requestMessage) throws ApiException {
        ApiResponse<Object> resp = postRowsInGroupWithHttpInfo(groupId, datasetKey, tableName, requestMessage);
        return resp.getData();
    }

    /**
     * Posts new data rows into the specified table
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> postRowsInGroupWithHttpInfo(String groupId, String datasetKey, String tableName, Object requestMessage) throws ApiException {
        com.squareup.okhttp.Call call = postRowsInGroupValidateBeforeCall(groupId, datasetKey, tableName, requestMessage, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Posts new data rows into the specified table (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postRowsInGroupAsync(String groupId, String datasetKey, String tableName, Object requestMessage, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postRowsInGroupValidateBeforeCall(groupId, datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putTable
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putTableCall(String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestMessage;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}/tables/{tableName}"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()))
            .replaceAll("\\{" + "tableName" + "\\}", apiClient.escapeString(tableName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putTableValidateBeforeCall(String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling putTable(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling putTable(Async)");
        }
        
        // verify the required parameter 'requestMessage' is set
        if (requestMessage == null) {
            throw new ApiException("Missing the required parameter 'requestMessage' when calling putTable(Async)");
        }
        

        com.squareup.okhttp.Call call = putTableCall(datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates a schema and metadata for the specified table
     * 
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object putTable(String datasetKey, String tableName, Object requestMessage) throws ApiException {
        ApiResponse<Object> resp = putTableWithHttpInfo(datasetKey, tableName, requestMessage);
        return resp.getData();
    }

    /**
     * Updates a schema and metadata for the specified table
     * 
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> putTableWithHttpInfo(String datasetKey, String tableName, Object requestMessage) throws ApiException {
        com.squareup.okhttp.Call call = putTableValidateBeforeCall(datasetKey, tableName, requestMessage, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a schema and metadata for the specified table (asynchronously)
     * 
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putTableAsync(String datasetKey, String tableName, Object requestMessage, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putTableValidateBeforeCall(datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putTableInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putTableInGroupCall(String groupId, String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestMessage;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName}"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()))
            .replaceAll("\\{" + "tableName" + "\\}", apiClient.escapeString(tableName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putTableInGroupValidateBeforeCall(String groupId, String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling putTableInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling putTableInGroup(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling putTableInGroup(Async)");
        }
        
        // verify the required parameter 'requestMessage' is set
        if (requestMessage == null) {
            throw new ApiException("Missing the required parameter 'requestMessage' when calling putTableInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = putTableInGroupCall(groupId, datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates a schema and metadata for the specified table
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object putTableInGroup(String groupId, String datasetKey, String tableName, Object requestMessage) throws ApiException {
        ApiResponse<Object> resp = putTableInGroupWithHttpInfo(groupId, datasetKey, tableName, requestMessage);
        return resp.getData();
    }

    /**
     * Updates a schema and metadata for the specified table
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> putTableInGroupWithHttpInfo(String groupId, String datasetKey, String tableName, Object requestMessage) throws ApiException {
        com.squareup.okhttp.Call call = putTableInGroupValidateBeforeCall(groupId, datasetKey, tableName, requestMessage, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a schema and metadata for the specified table (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putTableInGroupAsync(String groupId, String datasetKey, String tableName, Object requestMessage, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putTableInGroupValidateBeforeCall(groupId, datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for refreshDataset
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call refreshDatasetCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}/refreshes"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call refreshDatasetValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling refreshDataset(Async)");
        }
        

        com.squareup.okhttp.Call call = refreshDatasetCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Start a dataset refresh
     * 
     * @param datasetKey The dataset id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object refreshDataset(String datasetKey) throws ApiException {
        ApiResponse<Object> resp = refreshDatasetWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Start a dataset refresh
     * 
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> refreshDatasetWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = refreshDatasetValidateBeforeCall(datasetKey, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Start a dataset refresh (asynchronously)
     * 
     * @param datasetKey The dataset id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call refreshDatasetAsync(String datasetKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = refreshDatasetValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for refreshDatasetInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call refreshDatasetInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/refreshes"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call refreshDatasetInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling refreshDatasetInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling refreshDatasetInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = refreshDatasetInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Start a dataset refresh
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object refreshDatasetInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<Object> resp = refreshDatasetInGroupWithHttpInfo(groupId, datasetKey);
        return resp.getData();
    }

    /**
     * Start a dataset refresh
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> refreshDatasetInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = refreshDatasetInGroupValidateBeforeCall(groupId, datasetKey, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Start a dataset refresh (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call refreshDatasetInGroupAsync(String groupId, String datasetKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = refreshDatasetInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for setAllDatasetConnections
     * @param datasetKey The dataset id (required)
     * @param parameters The body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setAllDatasetConnectionsCall(String datasetKey, ConnectionDetails parameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = parameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/datasets/{datasetKey}/Default.SetAllConnections"
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call setAllDatasetConnectionsValidateBeforeCall(String datasetKey, ConnectionDetails parameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling setAllDatasetConnections(Async)");
        }
        
        // verify the required parameter 'parameters' is set
        if (parameters == null) {
            throw new ApiException("Missing the required parameter 'parameters' when calling setAllDatasetConnections(Async)");
        }
        

        com.squareup.okhttp.Call call = setAllDatasetConnectionsCall(datasetKey, parameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Sets all connections for the specified dataset
     * 
     * @param datasetKey The dataset id (required)
     * @param parameters The body (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object setAllDatasetConnections(String datasetKey, ConnectionDetails parameters) throws ApiException {
        ApiResponse<Object> resp = setAllDatasetConnectionsWithHttpInfo(datasetKey, parameters);
        return resp.getData();
    }

    /**
     * Sets all connections for the specified dataset
     * 
     * @param datasetKey The dataset id (required)
     * @param parameters The body (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> setAllDatasetConnectionsWithHttpInfo(String datasetKey, ConnectionDetails parameters) throws ApiException {
        com.squareup.okhttp.Call call = setAllDatasetConnectionsValidateBeforeCall(datasetKey, parameters, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Sets all connections for the specified dataset (asynchronously)
     * 
     * @param datasetKey The dataset id (required)
     * @param parameters The body (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setAllDatasetConnectionsAsync(String datasetKey, ConnectionDetails parameters, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = setAllDatasetConnectionsValidateBeforeCall(datasetKey, parameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for setAllDatasetConnectionsInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param parameters The body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setAllDatasetConnectionsInGroupCall(String groupId, String datasetKey, ConnectionDetails parameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = parameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.SetAllConnections"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call setAllDatasetConnectionsInGroupValidateBeforeCall(String groupId, String datasetKey, ConnectionDetails parameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling setAllDatasetConnectionsInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling setAllDatasetConnectionsInGroup(Async)");
        }
        
        // verify the required parameter 'parameters' is set
        if (parameters == null) {
            throw new ApiException("Missing the required parameter 'parameters' when calling setAllDatasetConnectionsInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = setAllDatasetConnectionsInGroupCall(groupId, datasetKey, parameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Sets all connections for the specified dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param parameters The body (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object setAllDatasetConnectionsInGroup(String groupId, String datasetKey, ConnectionDetails parameters) throws ApiException {
        ApiResponse<Object> resp = setAllDatasetConnectionsInGroupWithHttpInfo(groupId, datasetKey, parameters);
        return resp.getData();
    }

    /**
     * Sets all connections for the specified dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param parameters The body (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> setAllDatasetConnectionsInGroupWithHttpInfo(String groupId, String datasetKey, ConnectionDetails parameters) throws ApiException {
        com.squareup.okhttp.Call call = setAllDatasetConnectionsInGroupValidateBeforeCall(groupId, datasetKey, parameters, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Sets all connections for the specified dataset (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param parameters The body (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setAllDatasetConnectionsInGroupAsync(String groupId, String datasetKey, ConnectionDetails parameters, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = setAllDatasetConnectionsInGroupValidateBeforeCall(groupId, datasetKey, parameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for takeOverInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call takeOverInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.TakeOver"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "datasetKey" + "\\}", apiClient.escapeString(datasetKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call takeOverInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling takeOverInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling takeOverInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = takeOverInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Take Over a dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object takeOverInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<Object> resp = takeOverInGroupWithHttpInfo(groupId, datasetKey);
        return resp.getData();
    }

    /**
     * Take Over a dataset
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> takeOverInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = takeOverInGroupValidateBeforeCall(groupId, datasetKey, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Take Over a dataset (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call takeOverInGroupAsync(String groupId, String datasetKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = takeOverInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
