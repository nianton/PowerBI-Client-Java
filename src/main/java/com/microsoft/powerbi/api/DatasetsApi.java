

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
     * Build call for datasetsBindToGateway
     * @param datasetKey The dataset id (required)
     * @param bindToGatewayRequest The bind to gateway request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsBindToGatewayCall(String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsBindToGatewayValidateBeforeCall(String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsBindToGateway(Async)");
        }
        
        // verify the required parameter 'bindToGatewayRequest' is set
        if (bindToGatewayRequest == null) {
            throw new ApiException("Missing the required parameter 'bindToGatewayRequest' when calling datasetsBindToGateway(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsBindToGatewayCall(datasetKey, bindToGatewayRequest, progressListener, progressRequestListener);
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
    public Object datasetsBindToGateway(String datasetKey, BindToGatewayRequest bindToGatewayRequest) throws ApiException {
        ApiResponse<Object> resp = datasetsBindToGatewayWithHttpInfo(datasetKey, bindToGatewayRequest);
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
    public ApiResponse<Object> datasetsBindToGatewayWithHttpInfo(String datasetKey, BindToGatewayRequest bindToGatewayRequest) throws ApiException {
        com.squareup.okhttp.Call call = datasetsBindToGatewayValidateBeforeCall(datasetKey, bindToGatewayRequest, null, null);
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
    public com.squareup.okhttp.Call datasetsBindToGatewayAsync(String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsBindToGatewayValidateBeforeCall(datasetKey, bindToGatewayRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsBindToGatewayInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param bindToGatewayRequest The bind to gateway request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsBindToGatewayInGroupCall(String groupId, String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsBindToGatewayInGroupValidateBeforeCall(String groupId, String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsBindToGatewayInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsBindToGatewayInGroup(Async)");
        }
        
        // verify the required parameter 'bindToGatewayRequest' is set
        if (bindToGatewayRequest == null) {
            throw new ApiException("Missing the required parameter 'bindToGatewayRequest' when calling datasetsBindToGatewayInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsBindToGatewayInGroupCall(groupId, datasetKey, bindToGatewayRequest, progressListener, progressRequestListener);
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
    public Object datasetsBindToGatewayInGroup(String groupId, String datasetKey, BindToGatewayRequest bindToGatewayRequest) throws ApiException {
        ApiResponse<Object> resp = datasetsBindToGatewayInGroupWithHttpInfo(groupId, datasetKey, bindToGatewayRequest);
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
    public ApiResponse<Object> datasetsBindToGatewayInGroupWithHttpInfo(String groupId, String datasetKey, BindToGatewayRequest bindToGatewayRequest) throws ApiException {
        com.squareup.okhttp.Call call = datasetsBindToGatewayInGroupValidateBeforeCall(groupId, datasetKey, bindToGatewayRequest, null, null);
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
    public com.squareup.okhttp.Call datasetsBindToGatewayInGroupAsync(String groupId, String datasetKey, BindToGatewayRequest bindToGatewayRequest, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsBindToGatewayInGroupValidateBeforeCall(groupId, datasetKey, bindToGatewayRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsDeleteDatasetById
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsDeleteDatasetByIdCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsDeleteDatasetByIdValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsDeleteDatasetById(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsDeleteDatasetByIdCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes the dataset with the specified id
     * 
     * @param datasetKey The dataset id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object datasetsDeleteDatasetById(String datasetKey) throws ApiException {
        ApiResponse<Object> resp = datasetsDeleteDatasetByIdWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Deletes the dataset with the specified id
     * 
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> datasetsDeleteDatasetByIdWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsDeleteDatasetByIdValidateBeforeCall(datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsDeleteDatasetByIdAsync(String datasetKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsDeleteDatasetByIdValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsDeleteDatasetByIdInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsDeleteDatasetByIdInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsDeleteDatasetByIdInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsDeleteDatasetByIdInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsDeleteDatasetByIdInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsDeleteDatasetByIdInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
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
    public Object datasetsDeleteDatasetByIdInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<Object> resp = datasetsDeleteDatasetByIdInGroupWithHttpInfo(groupId, datasetKey);
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
    public ApiResponse<Object> datasetsDeleteDatasetByIdInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsDeleteDatasetByIdInGroupValidateBeforeCall(groupId, datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsDeleteDatasetByIdInGroupAsync(String groupId, String datasetKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsDeleteDatasetByIdInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsDeleteRows
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsDeleteRowsCall(String datasetKey, String tableName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsDeleteRowsValidateBeforeCall(String datasetKey, String tableName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsDeleteRows(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling datasetsDeleteRows(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsDeleteRowsCall(datasetKey, tableName, progressListener, progressRequestListener);
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
    public Object datasetsDeleteRows(String datasetKey, String tableName) throws ApiException {
        ApiResponse<Object> resp = datasetsDeleteRowsWithHttpInfo(datasetKey, tableName);
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
    public ApiResponse<Object> datasetsDeleteRowsWithHttpInfo(String datasetKey, String tableName) throws ApiException {
        com.squareup.okhttp.Call call = datasetsDeleteRowsValidateBeforeCall(datasetKey, tableName, null, null);
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
    public com.squareup.okhttp.Call datasetsDeleteRowsAsync(String datasetKey, String tableName, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsDeleteRowsValidateBeforeCall(datasetKey, tableName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsDeleteRowsInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsDeleteRowsInGroupCall(String groupId, String datasetKey, String tableName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsDeleteRowsInGroupValidateBeforeCall(String groupId, String datasetKey, String tableName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsDeleteRowsInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsDeleteRowsInGroup(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling datasetsDeleteRowsInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsDeleteRowsInGroupCall(groupId, datasetKey, tableName, progressListener, progressRequestListener);
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
    public Object datasetsDeleteRowsInGroup(String groupId, String datasetKey, String tableName) throws ApiException {
        ApiResponse<Object> resp = datasetsDeleteRowsInGroupWithHttpInfo(groupId, datasetKey, tableName);
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
    public ApiResponse<Object> datasetsDeleteRowsInGroupWithHttpInfo(String groupId, String datasetKey, String tableName) throws ApiException {
        com.squareup.okhttp.Call call = datasetsDeleteRowsInGroupValidateBeforeCall(groupId, datasetKey, tableName, null, null);
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
    public com.squareup.okhttp.Call datasetsDeleteRowsInGroupAsync(String groupId, String datasetKey, String tableName, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsDeleteRowsInGroupValidateBeforeCall(groupId, datasetKey, tableName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGenerateTokenInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param requestParameters Generate token parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGenerateTokenInGroupCall(String groupId, String datasetKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGenerateTokenInGroupValidateBeforeCall(String groupId, String datasetKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsGenerateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsGenerateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling datasetsGenerateTokenInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGenerateTokenInGroupCall(groupId, datasetKey, requestParameters, progressListener, progressRequestListener);
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
    public EmbedToken datasetsGenerateTokenInGroup(String groupId, String datasetKey, GenerateTokenRequest requestParameters) throws ApiException {
        ApiResponse<EmbedToken> resp = datasetsGenerateTokenInGroupWithHttpInfo(groupId, datasetKey, requestParameters);
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
    public ApiResponse<EmbedToken> datasetsGenerateTokenInGroupWithHttpInfo(String groupId, String datasetKey, GenerateTokenRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGenerateTokenInGroupValidateBeforeCall(groupId, datasetKey, requestParameters, null, null);
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
    public com.squareup.okhttp.Call datasetsGenerateTokenInGroupAsync(String groupId, String datasetKey, GenerateTokenRequest requestParameters, final ApiCallback<EmbedToken> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGenerateTokenInGroupValidateBeforeCall(groupId, datasetKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetDatasetById
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetDatasetByIdCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetDatasetByIdValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsGetDatasetById(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGetDatasetByIdCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the dataset metadata for the specifeid dataset id
     * 
     * @param datasetKey The dataset id (required)
     * @return Dataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dataset datasetsGetDatasetById(String datasetKey) throws ApiException {
        ApiResponse<Dataset> resp = datasetsGetDatasetByIdWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Gets the dataset metadata for the specifeid dataset id
     * 
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;Dataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dataset> datasetsGetDatasetByIdWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetDatasetByIdValidateBeforeCall(datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsGetDatasetByIdAsync(String datasetKey, final ApiCallback<Dataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetDatasetByIdValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetDatasetByIdInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetDatasetByIdInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetDatasetByIdInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsGetDatasetByIdInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsGetDatasetByIdInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGetDatasetByIdInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
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
    public Dataset datasetsGetDatasetByIdInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<Dataset> resp = datasetsGetDatasetByIdInGroupWithHttpInfo(groupId, datasetKey);
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
    public ApiResponse<Dataset> datasetsGetDatasetByIdInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetDatasetByIdInGroupValidateBeforeCall(groupId, datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsGetDatasetByIdInGroupAsync(String groupId, String datasetKey, final ApiCallback<Dataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetDatasetByIdInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetDatasets
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetDatasetsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetDatasetsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = datasetsGetDatasetsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns the datasets
     * 
     * @return ODataResponseListDataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListDataset datasetsGetDatasets() throws ApiException {
        ApiResponse<ODataResponseListDataset> resp = datasetsGetDatasetsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Returns the datasets
     * 
     * @return ApiResponse&lt;ODataResponseListDataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListDataset> datasetsGetDatasetsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetDatasetsValidateBeforeCall(null, null);
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
    public com.squareup.okhttp.Call datasetsGetDatasetsAsync(final ApiCallback<ODataResponseListDataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetDatasetsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListDataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetDatasetsInGroup
     * @param groupId The group id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetDatasetsInGroupCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetDatasetsInGroupValidateBeforeCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsGetDatasetsInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGetDatasetsInGroupCall(groupId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns the datasets
     * 
     * @param groupId The group id (required)
     * @return ODataResponseListDataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListDataset datasetsGetDatasetsInGroup(String groupId) throws ApiException {
        ApiResponse<ODataResponseListDataset> resp = datasetsGetDatasetsInGroupWithHttpInfo(groupId);
        return resp.getData();
    }

    /**
     * Returns the datasets
     * 
     * @param groupId The group id (required)
     * @return ApiResponse&lt;ODataResponseListDataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListDataset> datasetsGetDatasetsInGroupWithHttpInfo(String groupId) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetDatasetsInGroupValidateBeforeCall(groupId, null, null);
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
    public com.squareup.okhttp.Call datasetsGetDatasetsInGroupAsync(String groupId, final ApiCallback<ODataResponseListDataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetDatasetsInGroupValidateBeforeCall(groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListDataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetDatasources
     * @param datasetKey  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetDatasourcesCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetDatasourcesValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsGetDatasources(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGetDatasourcesCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of datasource for the specified dataset
     * 
     * @param datasetKey  (required)
     * @return ODataResponseListDatasource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListDatasource datasetsGetDatasources(String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListDatasource> resp = datasetsGetDatasourcesWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Gets a list of datasource for the specified dataset
     * 
     * @param datasetKey  (required)
     * @return ApiResponse&lt;ODataResponseListDatasource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListDatasource> datasetsGetDatasourcesWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetDatasourcesValidateBeforeCall(datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsGetDatasourcesAsync(String datasetKey, final ApiCallback<ODataResponseListDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetDatasourcesValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetDatasourcesInGroup
     * @param groupId The group id (required)
     * @param datasetKey  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetDatasourcesInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetDatasourcesInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsGetDatasourcesInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsGetDatasourcesInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGetDatasourcesInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
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
    public ODataResponseListDatasource datasetsGetDatasourcesInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListDatasource> resp = datasetsGetDatasourcesInGroupWithHttpInfo(groupId, datasetKey);
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
    public ApiResponse<ODataResponseListDatasource> datasetsGetDatasourcesInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetDatasourcesInGroupValidateBeforeCall(groupId, datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsGetDatasourcesInGroupAsync(String groupId, String datasetKey, final ApiCallback<ODataResponseListDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetDatasourcesInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetGatewayDatasources
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetGatewayDatasourcesCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetGatewayDatasourcesValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsGetGatewayDatasources(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGetGatewayDatasourcesCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of bound gateway datasources for the specified dataset
     * 
     * @param datasetKey The dataset id (required)
     * @return ODataResponseListGatewayDatasource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListGatewayDatasource datasetsGetGatewayDatasources(String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListGatewayDatasource> resp = datasetsGetGatewayDatasourcesWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Gets a list of bound gateway datasources for the specified dataset
     * 
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;ODataResponseListGatewayDatasource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListGatewayDatasource> datasetsGetGatewayDatasourcesWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetGatewayDatasourcesValidateBeforeCall(datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsGetGatewayDatasourcesAsync(String datasetKey, final ApiCallback<ODataResponseListGatewayDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetGatewayDatasourcesValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListGatewayDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetGatewayDatasourcesInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetGatewayDatasourcesInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetGatewayDatasourcesInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsGetGatewayDatasourcesInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsGetGatewayDatasourcesInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGetGatewayDatasourcesInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
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
    public ODataResponseListGatewayDatasource datasetsGetGatewayDatasourcesInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListGatewayDatasource> resp = datasetsGetGatewayDatasourcesInGroupWithHttpInfo(groupId, datasetKey);
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
    public ApiResponse<ODataResponseListGatewayDatasource> datasetsGetGatewayDatasourcesInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetGatewayDatasourcesInGroupValidateBeforeCall(groupId, datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsGetGatewayDatasourcesInGroupAsync(String groupId, String datasetKey, final ApiCallback<ODataResponseListGatewayDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetGatewayDatasourcesInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListGatewayDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetRefreshHistory
     * @param datasetKey The dataset id (required)
     * @param top The requested number of entries in the refresh history, if not supported the default is all available entries (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetRefreshHistoryCall(String datasetKey, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetRefreshHistoryValidateBeforeCall(String datasetKey, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsGetRefreshHistory(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGetRefreshHistoryCall(datasetKey, top, progressListener, progressRequestListener);
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
    public ODataResponseListRefresh datasetsGetRefreshHistory(String datasetKey, Integer top) throws ApiException {
        ApiResponse<ODataResponseListRefresh> resp = datasetsGetRefreshHistoryWithHttpInfo(datasetKey, top);
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
    public ApiResponse<ODataResponseListRefresh> datasetsGetRefreshHistoryWithHttpInfo(String datasetKey, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetRefreshHistoryValidateBeforeCall(datasetKey, top, null, null);
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
    public com.squareup.okhttp.Call datasetsGetRefreshHistoryAsync(String datasetKey, Integer top, final ApiCallback<ODataResponseListRefresh> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetRefreshHistoryValidateBeforeCall(datasetKey, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListRefresh>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetRefreshHistoryInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param top The requested number of entries in the refresh history, if not supported the default is all available entries (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetRefreshHistoryInGroupCall(String groupId, String datasetKey, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetRefreshHistoryInGroupValidateBeforeCall(String groupId, String datasetKey, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsGetRefreshHistoryInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsGetRefreshHistoryInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGetRefreshHistoryInGroupCall(groupId, datasetKey, top, progressListener, progressRequestListener);
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
    public ODataResponseListRefresh datasetsGetRefreshHistoryInGroup(String groupId, String datasetKey, Integer top) throws ApiException {
        ApiResponse<ODataResponseListRefresh> resp = datasetsGetRefreshHistoryInGroupWithHttpInfo(groupId, datasetKey, top);
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
    public ApiResponse<ODataResponseListRefresh> datasetsGetRefreshHistoryInGroupWithHttpInfo(String groupId, String datasetKey, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetRefreshHistoryInGroupValidateBeforeCall(groupId, datasetKey, top, null, null);
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
    public com.squareup.okhttp.Call datasetsGetRefreshHistoryInGroupAsync(String groupId, String datasetKey, Integer top, final ApiCallback<ODataResponseListRefresh> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetRefreshHistoryInGroupValidateBeforeCall(groupId, datasetKey, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListRefresh>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetTables
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetTablesCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetTablesValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsGetTables(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGetTablesCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets all tables within the specified dataset
     * 
     * @param datasetKey The dataset id (required)
     * @return ODataResponseListTable
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListTable datasetsGetTables(String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListTable> resp = datasetsGetTablesWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Gets all tables within the specified dataset
     * 
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;ODataResponseListTable&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListTable> datasetsGetTablesWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetTablesValidateBeforeCall(datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsGetTablesAsync(String datasetKey, final ApiCallback<ODataResponseListTable> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetTablesValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListTable>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsGetTablesInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsGetTablesInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsGetTablesInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsGetTablesInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsGetTablesInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsGetTablesInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
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
    public ODataResponseListTable datasetsGetTablesInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<ODataResponseListTable> resp = datasetsGetTablesInGroupWithHttpInfo(groupId, datasetKey);
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
    public ApiResponse<ODataResponseListTable> datasetsGetTablesInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsGetTablesInGroupValidateBeforeCall(groupId, datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsGetTablesInGroupAsync(String groupId, String datasetKey, final ApiCallback<ODataResponseListTable> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsGetTablesInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListTable>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsPostDataset
     * @param dataset Create dataset parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsPostDatasetCall(Dataset dataset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsPostDatasetValidateBeforeCall(Dataset dataset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dataset' is set
        if (dataset == null) {
            throw new ApiException("Missing the required parameter 'dataset' when calling datasetsPostDataset(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsPostDatasetCall(dataset, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Post a new entity to datasets
     * 
     * @param dataset Create dataset parameters (required)
     * @return Dataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dataset datasetsPostDataset(Dataset dataset) throws ApiException {
        ApiResponse<Dataset> resp = datasetsPostDatasetWithHttpInfo(dataset);
        return resp.getData();
    }

    /**
     * Post a new entity to datasets
     * 
     * @param dataset Create dataset parameters (required)
     * @return ApiResponse&lt;Dataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dataset> datasetsPostDatasetWithHttpInfo(Dataset dataset) throws ApiException {
        com.squareup.okhttp.Call call = datasetsPostDatasetValidateBeforeCall(dataset, null, null);
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
    public com.squareup.okhttp.Call datasetsPostDatasetAsync(Dataset dataset, final ApiCallback<Dataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsPostDatasetValidateBeforeCall(dataset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsPostDatasetInGroup
     * @param groupId The group id (required)
     * @param dataset Create dataset parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsPostDatasetInGroupCall(String groupId, Dataset dataset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsPostDatasetInGroupValidateBeforeCall(String groupId, Dataset dataset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsPostDatasetInGroup(Async)");
        }
        
        // verify the required parameter 'dataset' is set
        if (dataset == null) {
            throw new ApiException("Missing the required parameter 'dataset' when calling datasetsPostDatasetInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsPostDatasetInGroupCall(groupId, dataset, progressListener, progressRequestListener);
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
    public Dataset datasetsPostDatasetInGroup(String groupId, Dataset dataset) throws ApiException {
        ApiResponse<Dataset> resp = datasetsPostDatasetInGroupWithHttpInfo(groupId, dataset);
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
    public ApiResponse<Dataset> datasetsPostDatasetInGroupWithHttpInfo(String groupId, Dataset dataset) throws ApiException {
        com.squareup.okhttp.Call call = datasetsPostDatasetInGroupValidateBeforeCall(groupId, dataset, null, null);
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
    public com.squareup.okhttp.Call datasetsPostDatasetInGroupAsync(String groupId, Dataset dataset, final ApiCallback<Dataset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsPostDatasetInGroupValidateBeforeCall(groupId, dataset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsPostRows
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsPostRowsCall(String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsPostRowsValidateBeforeCall(String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsPostRows(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling datasetsPostRows(Async)");
        }
        
        // verify the required parameter 'requestMessage' is set
        if (requestMessage == null) {
            throw new ApiException("Missing the required parameter 'requestMessage' when calling datasetsPostRows(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsPostRowsCall(datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
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
    public Object datasetsPostRows(String datasetKey, String tableName, Object requestMessage) throws ApiException {
        ApiResponse<Object> resp = datasetsPostRowsWithHttpInfo(datasetKey, tableName, requestMessage);
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
    public ApiResponse<Object> datasetsPostRowsWithHttpInfo(String datasetKey, String tableName, Object requestMessage) throws ApiException {
        com.squareup.okhttp.Call call = datasetsPostRowsValidateBeforeCall(datasetKey, tableName, requestMessage, null, null);
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
    public com.squareup.okhttp.Call datasetsPostRowsAsync(String datasetKey, String tableName, Object requestMessage, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsPostRowsValidateBeforeCall(datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsPostRowsInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsPostRowsInGroupCall(String groupId, String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsPostRowsInGroupValidateBeforeCall(String groupId, String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsPostRowsInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsPostRowsInGroup(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling datasetsPostRowsInGroup(Async)");
        }
        
        // verify the required parameter 'requestMessage' is set
        if (requestMessage == null) {
            throw new ApiException("Missing the required parameter 'requestMessage' when calling datasetsPostRowsInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsPostRowsInGroupCall(groupId, datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
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
    public Object datasetsPostRowsInGroup(String groupId, String datasetKey, String tableName, Object requestMessage) throws ApiException {
        ApiResponse<Object> resp = datasetsPostRowsInGroupWithHttpInfo(groupId, datasetKey, tableName, requestMessage);
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
    public ApiResponse<Object> datasetsPostRowsInGroupWithHttpInfo(String groupId, String datasetKey, String tableName, Object requestMessage) throws ApiException {
        com.squareup.okhttp.Call call = datasetsPostRowsInGroupValidateBeforeCall(groupId, datasetKey, tableName, requestMessage, null, null);
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
    public com.squareup.okhttp.Call datasetsPostRowsInGroupAsync(String groupId, String datasetKey, String tableName, Object requestMessage, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsPostRowsInGroupValidateBeforeCall(groupId, datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsPutTable
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsPutTableCall(String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsPutTableValidateBeforeCall(String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsPutTable(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling datasetsPutTable(Async)");
        }
        
        // verify the required parameter 'requestMessage' is set
        if (requestMessage == null) {
            throw new ApiException("Missing the required parameter 'requestMessage' when calling datasetsPutTable(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsPutTableCall(datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
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
    public Object datasetsPutTable(String datasetKey, String tableName, Object requestMessage) throws ApiException {
        ApiResponse<Object> resp = datasetsPutTableWithHttpInfo(datasetKey, tableName, requestMessage);
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
    public ApiResponse<Object> datasetsPutTableWithHttpInfo(String datasetKey, String tableName, Object requestMessage) throws ApiException {
        com.squareup.okhttp.Call call = datasetsPutTableValidateBeforeCall(datasetKey, tableName, requestMessage, null, null);
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
    public com.squareup.okhttp.Call datasetsPutTableAsync(String datasetKey, String tableName, Object requestMessage, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsPutTableValidateBeforeCall(datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsPutTableInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param tableName The table name (required)
     * @param requestMessage The request message (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsPutTableInGroupCall(String groupId, String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsPutTableInGroupValidateBeforeCall(String groupId, String datasetKey, String tableName, Object requestMessage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsPutTableInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsPutTableInGroup(Async)");
        }
        
        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling datasetsPutTableInGroup(Async)");
        }
        
        // verify the required parameter 'requestMessage' is set
        if (requestMessage == null) {
            throw new ApiException("Missing the required parameter 'requestMessage' when calling datasetsPutTableInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsPutTableInGroupCall(groupId, datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
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
    public Object datasetsPutTableInGroup(String groupId, String datasetKey, String tableName, Object requestMessage) throws ApiException {
        ApiResponse<Object> resp = datasetsPutTableInGroupWithHttpInfo(groupId, datasetKey, tableName, requestMessage);
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
    public ApiResponse<Object> datasetsPutTableInGroupWithHttpInfo(String groupId, String datasetKey, String tableName, Object requestMessage) throws ApiException {
        com.squareup.okhttp.Call call = datasetsPutTableInGroupValidateBeforeCall(groupId, datasetKey, tableName, requestMessage, null, null);
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
    public com.squareup.okhttp.Call datasetsPutTableInGroupAsync(String groupId, String datasetKey, String tableName, Object requestMessage, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsPutTableInGroupValidateBeforeCall(groupId, datasetKey, tableName, requestMessage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsRefreshDataset
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsRefreshDatasetCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsRefreshDatasetValidateBeforeCall(String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsRefreshDataset(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsRefreshDatasetCall(datasetKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Start a dataset refresh
     * 
     * @param datasetKey The dataset id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object datasetsRefreshDataset(String datasetKey) throws ApiException {
        ApiResponse<Object> resp = datasetsRefreshDatasetWithHttpInfo(datasetKey);
        return resp.getData();
    }

    /**
     * Start a dataset refresh
     * 
     * @param datasetKey The dataset id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> datasetsRefreshDatasetWithHttpInfo(String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsRefreshDatasetValidateBeforeCall(datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsRefreshDatasetAsync(String datasetKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsRefreshDatasetValidateBeforeCall(datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsRefreshDatasetInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsRefreshDatasetInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsRefreshDatasetInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsRefreshDatasetInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsRefreshDatasetInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsRefreshDatasetInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
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
    public Object datasetsRefreshDatasetInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<Object> resp = datasetsRefreshDatasetInGroupWithHttpInfo(groupId, datasetKey);
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
    public ApiResponse<Object> datasetsRefreshDatasetInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsRefreshDatasetInGroupValidateBeforeCall(groupId, datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsRefreshDatasetInGroupAsync(String groupId, String datasetKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsRefreshDatasetInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsSetAllDatasetConnections
     * @param datasetKey The dataset id (required)
     * @param parameters The body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsSetAllDatasetConnectionsCall(String datasetKey, ConnectionDetails parameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsSetAllDatasetConnectionsValidateBeforeCall(String datasetKey, ConnectionDetails parameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsSetAllDatasetConnections(Async)");
        }
        
        // verify the required parameter 'parameters' is set
        if (parameters == null) {
            throw new ApiException("Missing the required parameter 'parameters' when calling datasetsSetAllDatasetConnections(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsSetAllDatasetConnectionsCall(datasetKey, parameters, progressListener, progressRequestListener);
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
    public Object datasetsSetAllDatasetConnections(String datasetKey, ConnectionDetails parameters) throws ApiException {
        ApiResponse<Object> resp = datasetsSetAllDatasetConnectionsWithHttpInfo(datasetKey, parameters);
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
    public ApiResponse<Object> datasetsSetAllDatasetConnectionsWithHttpInfo(String datasetKey, ConnectionDetails parameters) throws ApiException {
        com.squareup.okhttp.Call call = datasetsSetAllDatasetConnectionsValidateBeforeCall(datasetKey, parameters, null, null);
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
    public com.squareup.okhttp.Call datasetsSetAllDatasetConnectionsAsync(String datasetKey, ConnectionDetails parameters, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsSetAllDatasetConnectionsValidateBeforeCall(datasetKey, parameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsSetAllDatasetConnectionsInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param parameters The body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsSetAllDatasetConnectionsInGroupCall(String groupId, String datasetKey, ConnectionDetails parameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsSetAllDatasetConnectionsInGroupValidateBeforeCall(String groupId, String datasetKey, ConnectionDetails parameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsSetAllDatasetConnectionsInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsSetAllDatasetConnectionsInGroup(Async)");
        }
        
        // verify the required parameter 'parameters' is set
        if (parameters == null) {
            throw new ApiException("Missing the required parameter 'parameters' when calling datasetsSetAllDatasetConnectionsInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsSetAllDatasetConnectionsInGroupCall(groupId, datasetKey, parameters, progressListener, progressRequestListener);
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
    public Object datasetsSetAllDatasetConnectionsInGroup(String groupId, String datasetKey, ConnectionDetails parameters) throws ApiException {
        ApiResponse<Object> resp = datasetsSetAllDatasetConnectionsInGroupWithHttpInfo(groupId, datasetKey, parameters);
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
    public ApiResponse<Object> datasetsSetAllDatasetConnectionsInGroupWithHttpInfo(String groupId, String datasetKey, ConnectionDetails parameters) throws ApiException {
        com.squareup.okhttp.Call call = datasetsSetAllDatasetConnectionsInGroupValidateBeforeCall(groupId, datasetKey, parameters, null, null);
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
    public com.squareup.okhttp.Call datasetsSetAllDatasetConnectionsInGroupAsync(String groupId, String datasetKey, ConnectionDetails parameters, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsSetAllDatasetConnectionsInGroupValidateBeforeCall(groupId, datasetKey, parameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datasetsTakeOverInGroup
     * @param groupId The group id (required)
     * @param datasetKey The dataset id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datasetsTakeOverInGroupCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call datasetsTakeOverInGroupValidateBeforeCall(String groupId, String datasetKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling datasetsTakeOverInGroup(Async)");
        }
        
        // verify the required parameter 'datasetKey' is set
        if (datasetKey == null) {
            throw new ApiException("Missing the required parameter 'datasetKey' when calling datasetsTakeOverInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = datasetsTakeOverInGroupCall(groupId, datasetKey, progressListener, progressRequestListener);
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
    public Object datasetsTakeOverInGroup(String groupId, String datasetKey) throws ApiException {
        ApiResponse<Object> resp = datasetsTakeOverInGroupWithHttpInfo(groupId, datasetKey);
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
    public ApiResponse<Object> datasetsTakeOverInGroupWithHttpInfo(String groupId, String datasetKey) throws ApiException {
        com.squareup.okhttp.Call call = datasetsTakeOverInGroupValidateBeforeCall(groupId, datasetKey, null, null);
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
    public com.squareup.okhttp.Call datasetsTakeOverInGroupAsync(String groupId, String datasetKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datasetsTakeOverInGroupValidateBeforeCall(groupId, datasetKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
