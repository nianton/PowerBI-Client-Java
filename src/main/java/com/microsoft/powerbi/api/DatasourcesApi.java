

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
     * Build call for gatewaysAddDatasourceUser
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param addUserToDatasourceRequest The add user to datasource request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call gatewaysAddDatasourceUserCall(String gatewayId, String datasourceId, UserAccessRight addUserToDatasourceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call gatewaysAddDatasourceUserValidateBeforeCall(String gatewayId, String datasourceId, UserAccessRight addUserToDatasourceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling gatewaysAddDatasourceUser(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling gatewaysAddDatasourceUser(Async)");
        }
        
        // verify the required parameter 'addUserToDatasourceRequest' is set
        if (addUserToDatasourceRequest == null) {
            throw new ApiException("Missing the required parameter 'addUserToDatasourceRequest' when calling gatewaysAddDatasourceUser(Async)");
        }
        

        com.squareup.okhttp.Call call = gatewaysAddDatasourceUserCall(gatewayId, datasourceId, addUserToDatasourceRequest, progressListener, progressRequestListener);
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
    public Object gatewaysAddDatasourceUser(String gatewayId, String datasourceId, UserAccessRight addUserToDatasourceRequest) throws ApiException {
        ApiResponse<Object> resp = gatewaysAddDatasourceUserWithHttpInfo(gatewayId, datasourceId, addUserToDatasourceRequest);
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
    public ApiResponse<Object> gatewaysAddDatasourceUserWithHttpInfo(String gatewayId, String datasourceId, UserAccessRight addUserToDatasourceRequest) throws ApiException {
        com.squareup.okhttp.Call call = gatewaysAddDatasourceUserValidateBeforeCall(gatewayId, datasourceId, addUserToDatasourceRequest, null, null);
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
    public com.squareup.okhttp.Call gatewaysAddDatasourceUserAsync(String gatewayId, String datasourceId, UserAccessRight addUserToDatasourceRequest, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = gatewaysAddDatasourceUserValidateBeforeCall(gatewayId, datasourceId, addUserToDatasourceRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for gatewaysCreateDatasource
     * @param gatewayId The gateway id (required)
     * @param datasourceToGatewayRequest The datasource requested to create (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call gatewaysCreateDatasourceCall(String gatewayId, PublishDatasourceToGatewayRequest datasourceToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call gatewaysCreateDatasourceValidateBeforeCall(String gatewayId, PublishDatasourceToGatewayRequest datasourceToGatewayRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling gatewaysCreateDatasource(Async)");
        }
        
        // verify the required parameter 'datasourceToGatewayRequest' is set
        if (datasourceToGatewayRequest == null) {
            throw new ApiException("Missing the required parameter 'datasourceToGatewayRequest' when calling gatewaysCreateDatasource(Async)");
        }
        

        com.squareup.okhttp.Call call = gatewaysCreateDatasourceCall(gatewayId, datasourceToGatewayRequest, progressListener, progressRequestListener);
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
    public GatewayDatasource gatewaysCreateDatasource(String gatewayId, PublishDatasourceToGatewayRequest datasourceToGatewayRequest) throws ApiException {
        ApiResponse<GatewayDatasource> resp = gatewaysCreateDatasourceWithHttpInfo(gatewayId, datasourceToGatewayRequest);
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
    public ApiResponse<GatewayDatasource> gatewaysCreateDatasourceWithHttpInfo(String gatewayId, PublishDatasourceToGatewayRequest datasourceToGatewayRequest) throws ApiException {
        com.squareup.okhttp.Call call = gatewaysCreateDatasourceValidateBeforeCall(gatewayId, datasourceToGatewayRequest, null, null);
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
    public com.squareup.okhttp.Call gatewaysCreateDatasourceAsync(String gatewayId, PublishDatasourceToGatewayRequest datasourceToGatewayRequest, final ApiCallback<GatewayDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = gatewaysCreateDatasourceValidateBeforeCall(gatewayId, datasourceToGatewayRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GatewayDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for gatewaysDeleteDatasource
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call gatewaysDeleteDatasourceCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call gatewaysDeleteDatasourceValidateBeforeCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling gatewaysDeleteDatasource(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling gatewaysDeleteDatasource(Async)");
        }
        

        com.squareup.okhttp.Call call = gatewaysDeleteDatasourceCall(gatewayId, datasourceId, progressListener, progressRequestListener);
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
    public Object gatewaysDeleteDatasource(String gatewayId, String datasourceId) throws ApiException {
        ApiResponse<Object> resp = gatewaysDeleteDatasourceWithHttpInfo(gatewayId, datasourceId);
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
    public ApiResponse<Object> gatewaysDeleteDatasourceWithHttpInfo(String gatewayId, String datasourceId) throws ApiException {
        com.squareup.okhttp.Call call = gatewaysDeleteDatasourceValidateBeforeCall(gatewayId, datasourceId, null, null);
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
    public com.squareup.okhttp.Call gatewaysDeleteDatasourceAsync(String gatewayId, String datasourceId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = gatewaysDeleteDatasourceValidateBeforeCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for gatewaysDeleteDatasourceUser
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param emailAdress The user&#39;s email address (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call gatewaysDeleteDatasourceUserCall(String gatewayId, String datasourceId, String emailAdress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call gatewaysDeleteDatasourceUserValidateBeforeCall(String gatewayId, String datasourceId, String emailAdress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling gatewaysDeleteDatasourceUser(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling gatewaysDeleteDatasourceUser(Async)");
        }
        
        // verify the required parameter 'emailAdress' is set
        if (emailAdress == null) {
            throw new ApiException("Missing the required parameter 'emailAdress' when calling gatewaysDeleteDatasourceUser(Async)");
        }
        

        com.squareup.okhttp.Call call = gatewaysDeleteDatasourceUserCall(gatewayId, datasourceId, emailAdress, progressListener, progressRequestListener);
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
    public Object gatewaysDeleteDatasourceUser(String gatewayId, String datasourceId, String emailAdress) throws ApiException {
        ApiResponse<Object> resp = gatewaysDeleteDatasourceUserWithHttpInfo(gatewayId, datasourceId, emailAdress);
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
    public ApiResponse<Object> gatewaysDeleteDatasourceUserWithHttpInfo(String gatewayId, String datasourceId, String emailAdress) throws ApiException {
        com.squareup.okhttp.Call call = gatewaysDeleteDatasourceUserValidateBeforeCall(gatewayId, datasourceId, emailAdress, null, null);
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
    public com.squareup.okhttp.Call gatewaysDeleteDatasourceUserAsync(String gatewayId, String datasourceId, String emailAdress, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = gatewaysDeleteDatasourceUserValidateBeforeCall(gatewayId, datasourceId, emailAdress, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for gatewaysGetDatasourceById
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call gatewaysGetDatasourceByIdCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call gatewaysGetDatasourceByIdValidateBeforeCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling gatewaysGetDatasourceById(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling gatewaysGetDatasourceById(Async)");
        }
        

        com.squareup.okhttp.Call call = gatewaysGetDatasourceByIdCall(gatewayId, datasourceId, progressListener, progressRequestListener);
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
    public GatewayDatasource gatewaysGetDatasourceById(String gatewayId, String datasourceId) throws ApiException {
        ApiResponse<GatewayDatasource> resp = gatewaysGetDatasourceByIdWithHttpInfo(gatewayId, datasourceId);
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
    public ApiResponse<GatewayDatasource> gatewaysGetDatasourceByIdWithHttpInfo(String gatewayId, String datasourceId) throws ApiException {
        com.squareup.okhttp.Call call = gatewaysGetDatasourceByIdValidateBeforeCall(gatewayId, datasourceId, null, null);
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
    public com.squareup.okhttp.Call gatewaysGetDatasourceByIdAsync(String gatewayId, String datasourceId, final ApiCallback<GatewayDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = gatewaysGetDatasourceByIdValidateBeforeCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GatewayDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for gatewaysGetDatasourceStatusById
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call gatewaysGetDatasourceStatusByIdCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call gatewaysGetDatasourceStatusByIdValidateBeforeCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling gatewaysGetDatasourceStatusById(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling gatewaysGetDatasourceStatusById(Async)");
        }
        

        com.squareup.okhttp.Call call = gatewaysGetDatasourceStatusByIdCall(gatewayId, datasourceId, progressListener, progressRequestListener);
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
    public Object gatewaysGetDatasourceStatusById(String gatewayId, String datasourceId) throws ApiException {
        ApiResponse<Object> resp = gatewaysGetDatasourceStatusByIdWithHttpInfo(gatewayId, datasourceId);
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
    public ApiResponse<Object> gatewaysGetDatasourceStatusByIdWithHttpInfo(String gatewayId, String datasourceId) throws ApiException {
        com.squareup.okhttp.Call call = gatewaysGetDatasourceStatusByIdValidateBeforeCall(gatewayId, datasourceId, null, null);
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
    public com.squareup.okhttp.Call gatewaysGetDatasourceStatusByIdAsync(String gatewayId, String datasourceId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = gatewaysGetDatasourceStatusByIdValidateBeforeCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for gatewaysGetDatasourceUsers
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call gatewaysGetDatasourceUsersCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call gatewaysGetDatasourceUsersValidateBeforeCall(String gatewayId, String datasourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling gatewaysGetDatasourceUsers(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling gatewaysGetDatasourceUsers(Async)");
        }
        

        com.squareup.okhttp.Call call = gatewaysGetDatasourceUsersCall(gatewayId, datasourceId, progressListener, progressRequestListener);
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
    public ODataResponseListUserAccessRight gatewaysGetDatasourceUsers(String gatewayId, String datasourceId) throws ApiException {
        ApiResponse<ODataResponseListUserAccessRight> resp = gatewaysGetDatasourceUsersWithHttpInfo(gatewayId, datasourceId);
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
    public ApiResponse<ODataResponseListUserAccessRight> gatewaysGetDatasourceUsersWithHttpInfo(String gatewayId, String datasourceId) throws ApiException {
        com.squareup.okhttp.Call call = gatewaysGetDatasourceUsersValidateBeforeCall(gatewayId, datasourceId, null, null);
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
    public com.squareup.okhttp.Call gatewaysGetDatasourceUsersAsync(String gatewayId, String datasourceId, final ApiCallback<ODataResponseListUserAccessRight> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = gatewaysGetDatasourceUsersValidateBeforeCall(gatewayId, datasourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListUserAccessRight>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for gatewaysGetDatasources
     * @param gatewayId The gateway id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call gatewaysGetDatasourcesCall(String gatewayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call gatewaysGetDatasourcesValidateBeforeCall(String gatewayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling gatewaysGetDatasources(Async)");
        }
        

        com.squareup.okhttp.Call call = gatewaysGetDatasourcesCall(gatewayId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all datasources of specific gateway
     * 
     * @param gatewayId The gateway id (required)
     * @return ODataResponseListGatewayDatasource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListGatewayDatasource gatewaysGetDatasources(String gatewayId) throws ApiException {
        ApiResponse<ODataResponseListGatewayDatasource> resp = gatewaysGetDatasourcesWithHttpInfo(gatewayId);
        return resp.getData();
    }

    /**
     * Get all datasources of specific gateway
     * 
     * @param gatewayId The gateway id (required)
     * @return ApiResponse&lt;ODataResponseListGatewayDatasource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListGatewayDatasource> gatewaysGetDatasourcesWithHttpInfo(String gatewayId) throws ApiException {
        com.squareup.okhttp.Call call = gatewaysGetDatasourcesValidateBeforeCall(gatewayId, null, null);
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
    public com.squareup.okhttp.Call gatewaysGetDatasourcesAsync(String gatewayId, final ApiCallback<ODataResponseListGatewayDatasource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = gatewaysGetDatasourcesValidateBeforeCall(gatewayId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListGatewayDatasource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for gatewaysUpdateDatasource
     * @param gatewayId The gateway id (required)
     * @param datasourceId The datasource id (required)
     * @param updateDatasourceRequest The update datasource request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call gatewaysUpdateDatasourceCall(String gatewayId, String datasourceId, UpdateDatasourceRequest updateDatasourceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call gatewaysUpdateDatasourceValidateBeforeCall(String gatewayId, String datasourceId, UpdateDatasourceRequest updateDatasourceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling gatewaysUpdateDatasource(Async)");
        }
        
        // verify the required parameter 'datasourceId' is set
        if (datasourceId == null) {
            throw new ApiException("Missing the required parameter 'datasourceId' when calling gatewaysUpdateDatasource(Async)");
        }
        
        // verify the required parameter 'updateDatasourceRequest' is set
        if (updateDatasourceRequest == null) {
            throw new ApiException("Missing the required parameter 'updateDatasourceRequest' when calling gatewaysUpdateDatasource(Async)");
        }
        

        com.squareup.okhttp.Call call = gatewaysUpdateDatasourceCall(gatewayId, datasourceId, updateDatasourceRequest, progressListener, progressRequestListener);
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
    public Object gatewaysUpdateDatasource(String gatewayId, String datasourceId, UpdateDatasourceRequest updateDatasourceRequest) throws ApiException {
        ApiResponse<Object> resp = gatewaysUpdateDatasourceWithHttpInfo(gatewayId, datasourceId, updateDatasourceRequest);
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
    public ApiResponse<Object> gatewaysUpdateDatasourceWithHttpInfo(String gatewayId, String datasourceId, UpdateDatasourceRequest updateDatasourceRequest) throws ApiException {
        com.squareup.okhttp.Call call = gatewaysUpdateDatasourceValidateBeforeCall(gatewayId, datasourceId, updateDatasourceRequest, null, null);
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
    public com.squareup.okhttp.Call gatewaysUpdateDatasourceAsync(String gatewayId, String datasourceId, UpdateDatasourceRequest updateDatasourceRequest, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = gatewaysUpdateDatasourceValidateBeforeCall(gatewayId, datasourceId, updateDatasourceRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
