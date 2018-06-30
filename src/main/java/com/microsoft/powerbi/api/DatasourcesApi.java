

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


import com.microsoft.powerbi.models.GatewayDatasource;
import com.microsoft.powerbi.models.ODataResponseListGatewayDatasource;
import com.microsoft.powerbi.models.ODataResponseListUserAccessRight;
import com.microsoft.powerbi.models.PublishDatasourceToGatewayRequest;
import com.microsoft.powerbi.models.UpdateDatasourceRequest;
import com.microsoft.powerbi.models.UserAccessRight;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatasourcesApi {
    private ApiClient apiClient;

    public DatasourcesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DatasourcesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addDatasourceUser
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param addUserToDatasourceRequest The add user to datasource request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addDatasourceUserCall(String gatewayId, String datasourceId, UserAccessRight addUserToDatasourceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = addUserToDatasourceRequest;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users"
            .replaceAll("\\{" + "gatewayId" + "\\}", apiClient.escapeString(gatewayId.toString()))
            .replaceAll("\\{" + "datasourceId" + "\\}", apiClient.escapeString(datasourceId.toString()));

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
    private com.squareup.okhttp.Call addDatasourceUserValidateBeforeCall(String gatewayId, String datasourceId, UserAccessRight addUserToDatasourceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling addDatasourceUser(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling addDatasourceUser(Async)");
        }
        
        // verify the required parameter 'addUserToDatasourceRequest' is set
        if (addUserToDatasourceRequest == null) {
            throw new ApiException("Missing the required parameter 'addUserToDatasourceRequest' when calling addDatasourceUser(Async)");
        }
        

        com.squareup.okhttp.Call call = addDatasourceUserCall(gatewayId, datasourceId, addUserToDatasourceRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a datasource user
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param addUserToDatasourceRequest The add user to datasource request (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object addDatasourceUser(String gatewayId, String datasourceId, UserAccessRight addUserToDatasourceRequest) throws ApiException {
        ApiResponse<Object> resp = addDatasourceUserWithHttpInfo(gatewayId, datasourceId, addUserToDatasourceRequest);
        return resp.getData();
    }

    /**
     * Get a datasource user
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param addUserToDatasourceRequest The add user to datasource request (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> addDatasourceUserWithHttpInfo(String gatewayId, String datasourceId, UserAccessRight addUserToDatasourceRequest) throws ApiException {
        com.squareup.okhttp.Call call = addDatasourceUserValidateBeforeCall(gatewayId, datasourceId, addUserToDatasourceRequest, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a datasource user (asynchronously)
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param addUserToDatasourceRequest The add user to datasource request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addDatasourceUserAsync(String gatewayId, String datasourceId, UserAccessRight addUserToDatasourceRequest, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addDatasourceUserValidateBeforeCall(gatewayId, datasourceId, addUserToDatasourceRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createDatasource
     * @param gatewayId The gateway id (required)
     * @param datasourceToGatewayRequest The datasource requested to create (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDatasourceCall(String gatewayId, PublishDatasourceToGatewayRequest datasourceToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = datasourceToGatewayRequest;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/gateways/{gatewayId}/datasources"
            .replaceAll("\\{" + "gatewayId" + "\\}", apiClient.escapeString(gatewayId.toString()));

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
    private com.squareup.okhttp.Call createDatasourceValidateBeforeCall(String gatewayId, PublishDatasourceToGatewayRequest datasourceToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling createDatasource(Async)");
        }
        
        // verify the required parameter 'datasourceToGatewayRequest' is set
        if (datasourceToGatewayRequest == null) {
            throw new ApiException("Missing the required parameter 'datasourceToGatewayRequest' when calling createDatasource(Async)");
        }
        

        com.squareup.okhttp.Call call = createDatasourceCall(gatewayId, datasourceToGatewayRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a datasource
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceToGatewayRequest The datasource requested to create (required)
     * @return GatewayDatasource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GatewayDatasource createDatasource(String gatewayId, PublishDatasourceToGatewayRequest datasourceToGatewayRequest) throws ApiException {
        ApiResponse<GatewayDatasource> resp = createDatasourceWithHttpInfo(gatewayId, datasourceToGatewayRequest);
        return resp.getData();
    }

    /**
     * Create a datasource
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceToGatewayRequest The datasource requested to create (required)
     * @return ApiResponse&lt;GatewayDatasource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GatewayDatasource> createDatasourceWithHttpInfo(String gatewayId, PublishDatasourceToGatewayRequest datasourceToGatewayRequest) throws ApiException {
        com.squareup.okhttp.Call call = createDatasourceValidateBeforeCall(gatewayId, datasourceToGatewayRequest, null, null);
        Type localVarReturnType = new TypeToken<GatewayDatasource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a datasource (asynchronously)
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceToGatewayRequest The datasource requested to create (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDatasourceAsync(String gatewayId, PublishDatasourceToGatewayRequest datasourceToGatewayRequest, final ApiCallback<GatewayDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDatasourceValidateBeforeCall(gatewayId, datasourceToGatewayRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GatewayDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDatasource
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDatasourceCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}"
            .replaceAll("\\{" + "gatewayId" + "\\}", apiClient.escapeString(gatewayId.toString()))
            .replaceAll("\\{" + "datasourceId" + "\\}", apiClient.escapeString(datasourceId.toString()));

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
    private com.squareup.okhttp.Call deleteDatasourceValidateBeforeCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling deleteDatasource(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling deleteDatasource(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteDatasourceCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a datasource
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object deleteDatasource(String gatewayId, String datasourceId) throws ApiException {
        ApiResponse<Object> resp = deleteDatasourceWithHttpInfo(gatewayId, datasourceId);
        return resp.getData();
    }

    /**
     * Delete a datasource
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deleteDatasourceWithHttpInfo(String gatewayId, String datasourceId) throws ApiException {
        com.squareup.okhttp.Call call = deleteDatasourceValidateBeforeCall(gatewayId, datasourceId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a datasource (asynchronously)
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDatasourceAsync(String gatewayId, String datasourceId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteDatasourceValidateBeforeCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDatasourceUser
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param emailAdress The user&#39;s email address (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDatasourceUserCall(String gatewayId, String datasourceId, String emailAdress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users/{emailAdress}"
            .replaceAll("\\{" + "gatewayId" + "\\}", apiClient.escapeString(gatewayId.toString()))
            .replaceAll("\\{" + "datasourceId" + "\\}", apiClient.escapeString(datasourceId.toString()))
            .replaceAll("\\{" + "emailAdress" + "\\}", apiClient.escapeString(emailAdress.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDatasourceUserValidateBeforeCall(String gatewayId, String datasourceId, String emailAdress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling deleteDatasourceUser(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling deleteDatasourceUser(Async)");
        }
        
        // verify the required parameter 'emailAdress' is set
        if (emailAdress == null) {
            throw new ApiException("Missing the required parameter 'emailAdress' when calling deleteDatasourceUser(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteDatasourceUserCall(gatewayId, datasourceId, emailAdress, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a datasource user
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param emailAdress The user&#39;s email address (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object deleteDatasourceUser(String gatewayId, String datasourceId, String emailAdress) throws ApiException {
        ApiResponse<Object> resp = deleteDatasourceUserWithHttpInfo(gatewayId, datasourceId, emailAdress);
        return resp.getData();
    }

    /**
     * Delete a datasource user
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param emailAdress The user&#39;s email address (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deleteDatasourceUserWithHttpInfo(String gatewayId, String datasourceId, String emailAdress) throws ApiException {
        com.squareup.okhttp.Call call = deleteDatasourceUserValidateBeforeCall(gatewayId, datasourceId, emailAdress, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a datasource user (asynchronously)
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param emailAdress The user&#39;s email address (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDatasourceUserAsync(String gatewayId, String datasourceId, String emailAdress, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteDatasourceUserValidateBeforeCall(gatewayId, datasourceId, emailAdress, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasourceById
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasourceByIdCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}"
            .replaceAll("\\{" + "gatewayId" + "\\}", apiClient.escapeString(gatewayId.toString()))
            .replaceAll("\\{" + "datasourceId" + "\\}", apiClient.escapeString(datasourceId.toString()));

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
    private com.squareup.okhttp.Call getDatasourceByIdValidateBeforeCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling getDatasourceById(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling getDatasourceById(Async)");
        }
        

        com.squareup.okhttp.Call call = getDatasourceByIdCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a datasource by id
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @return GatewayDatasource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GatewayDatasource getDatasourceById(String gatewayId, String datasourceId) throws ApiException {
        ApiResponse<GatewayDatasource> resp = getDatasourceByIdWithHttpInfo(gatewayId, datasourceId);
        return resp.getData();
    }

    /**
     * Get a datasource by id
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @return ApiResponse&lt;GatewayDatasource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GatewayDatasource> getDatasourceByIdWithHttpInfo(String gatewayId, String datasourceId) throws ApiException {
        com.squareup.okhttp.Call call = getDatasourceByIdValidateBeforeCall(gatewayId, datasourceId, null, null);
        Type localVarReturnType = new TypeToken<GatewayDatasource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a datasource by id (asynchronously)
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasourceByIdAsync(String gatewayId, String datasourceId, final ApiCallback<GatewayDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDatasourceByIdValidateBeforeCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GatewayDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasourceStatusById
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasourceStatusByIdCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/status"
            .replaceAll("\\{" + "gatewayId" + "\\}", apiClient.escapeString(gatewayId.toString()))
            .replaceAll("\\{" + "datasourceId" + "\\}", apiClient.escapeString(datasourceId.toString()));

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
    private com.squareup.okhttp.Call getDatasourceStatusByIdValidateBeforeCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling getDatasourceStatusById(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling getDatasourceStatusById(Async)");
        }
        

        com.squareup.okhttp.Call call = getDatasourceStatusByIdCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a datasource status by id
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object getDatasourceStatusById(String gatewayId, String datasourceId) throws ApiException {
        ApiResponse<Object> resp = getDatasourceStatusByIdWithHttpInfo(gatewayId, datasourceId);
        return resp.getData();
    }

    /**
     * Get a datasource status by id
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> getDatasourceStatusByIdWithHttpInfo(String gatewayId, String datasourceId) throws ApiException {
        com.squareup.okhttp.Call call = getDatasourceStatusByIdValidateBeforeCall(gatewayId, datasourceId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a datasource status by id (asynchronously)
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasourceStatusByIdAsync(String gatewayId, String datasourceId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDatasourceStatusByIdValidateBeforeCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasourceUsers
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasourceUsersCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users"
            .replaceAll("\\{" + "gatewayId" + "\\}", apiClient.escapeString(gatewayId.toString()))
            .replaceAll("\\{" + "datasourceId" + "\\}", apiClient.escapeString(datasourceId.toString()));

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
    private com.squareup.okhttp.Call getDatasourceUsersValidateBeforeCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling getDatasourceUsers(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling getDatasourceUsers(Async)");
        }
        

        com.squareup.okhttp.Call call = getDatasourceUsersCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a datasource users list
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @return ODataResponseListUserAccessRight
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListUserAccessRight getDatasourceUsers(String gatewayId, String datasourceId) throws ApiException {
        ApiResponse<ODataResponseListUserAccessRight> resp = getDatasourceUsersWithHttpInfo(gatewayId, datasourceId);
        return resp.getData();
    }

    /**
     * Get a datasource users list
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @return ApiResponse&lt;ODataResponseListUserAccessRight&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListUserAccessRight> getDatasourceUsersWithHttpInfo(String gatewayId, String datasourceId) throws ApiException {
        com.squareup.okhttp.Call call = getDatasourceUsersValidateBeforeCall(gatewayId, datasourceId, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListUserAccessRight>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a datasource users list (asynchronously)
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasourceUsersAsync(String gatewayId, String datasourceId, final ApiCallback<ODataResponseListUserAccessRight> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDatasourceUsersValidateBeforeCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListUserAccessRight>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasources
     * @param gatewayId The gateway id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasourcesCall(String gatewayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/gateways/{gatewayId}/datasources"
            .replaceAll("\\{" + "gatewayId" + "\\}", apiClient.escapeString(gatewayId.toString()));

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
    private com.squareup.okhttp.Call getDatasourcesValidateBeforeCall(String gatewayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling getDatasources(Async)");
        }
        

        com.squareup.okhttp.Call call = getDatasourcesCall(gatewayId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all datasources of specific gateway
     * 
     * @param gatewayId The gateway id (required)
     * @return ODataResponseListGatewayDatasource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListGatewayDatasource getDatasources(String gatewayId) throws ApiException {
        ApiResponse<ODataResponseListGatewayDatasource> resp = getDatasourcesWithHttpInfo(gatewayId);
        return resp.getData();
    }

    /**
     * Get all datasources of specific gateway
     * 
     * @param gatewayId The gateway id (required)
     * @return ApiResponse&lt;ODataResponseListGatewayDatasource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListGatewayDatasource> getDatasourcesWithHttpInfo(String gatewayId) throws ApiException {
        com.squareup.okhttp.Call call = getDatasourcesValidateBeforeCall(gatewayId, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListGatewayDatasource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all datasources of specific gateway (asynchronously)
     * 
     * @param gatewayId The gateway id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasourcesAsync(String gatewayId, final ApiCallback<ODataResponseListGatewayDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDatasourcesValidateBeforeCall(gatewayId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListGatewayDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateDatasource
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param updateDatasourceRequest The update datasource request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDatasourceCall(String gatewayId, String datasourceId, UpdateDatasourceRequest updateDatasourceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateDatasourceRequest;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}"
            .replaceAll("\\{" + "gatewayId" + "\\}", apiClient.escapeString(gatewayId.toString()))
            .replaceAll("\\{" + "datasourceId" + "\\}", apiClient.escapeString(datasourceId.toString()));

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateDatasourceValidateBeforeCall(String gatewayId, String datasourceId, UpdateDatasourceRequest updateDatasourceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling updateDatasource(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling updateDatasource(Async)");
        }
        
        // verify the required parameter 'updateDatasourceRequest' is set
        if (updateDatasourceRequest == null) {
            throw new ApiException("Missing the required parameter 'updateDatasourceRequest' when calling updateDatasource(Async)");
        }
        

        com.squareup.okhttp.Call call = updateDatasourceCall(gatewayId, datasourceId, updateDatasourceRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a datasource credentials
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param updateDatasourceRequest The update datasource request (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object updateDatasource(String gatewayId, String datasourceId, UpdateDatasourceRequest updateDatasourceRequest) throws ApiException {
        ApiResponse<Object> resp = updateDatasourceWithHttpInfo(gatewayId, datasourceId, updateDatasourceRequest);
        return resp.getData();
    }

    /**
     * Update a datasource credentials
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param updateDatasourceRequest The update datasource request (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> updateDatasourceWithHttpInfo(String gatewayId, String datasourceId, UpdateDatasourceRequest updateDatasourceRequest) throws ApiException {
        com.squareup.okhttp.Call call = updateDatasourceValidateBeforeCall(gatewayId, datasourceId, updateDatasourceRequest, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a datasource credentials (asynchronously)
     * 
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param updateDatasourceRequest The update datasource request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDatasourceAsync(String gatewayId, String datasourceId, UpdateDatasourceRequest updateDatasourceRequest, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDatasourceValidateBeforeCall(gatewayId, datasourceId, updateDatasourceRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
