

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


import com.microsoft.powerbi.models.Gateway;
import com.microsoft.powerbi.models.ODataResponseListGateway;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GatewaysApi {
    private ApiClient apiClient;

    public GatewaysApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GatewaysApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getGatewayById
     * @param gatewayId The gateway id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGatewayByIdCall(String gatewayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/gateways/{gatewayId}"
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
    private com.squareup.okhttp.Call getGatewayByIdValidateBeforeCall(String gatewayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling getGatewayById(Async)");
        }
        

        com.squareup.okhttp.Call call = getGatewayByIdCall(gatewayId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns the specified gateway
     * 
     * @param gatewayId The gateway id (required)
     * @return Gateway
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Gateway getGatewayById(String gatewayId) throws ApiException {
        ApiResponse<Gateway> resp = getGatewayByIdWithHttpInfo(gatewayId);
        return resp.getData();
    }

    /**
     * Returns the specified gateway
     * 
     * @param gatewayId The gateway id (required)
     * @return ApiResponse&lt;Gateway&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Gateway> getGatewayByIdWithHttpInfo(String gatewayId) throws ApiException {
        com.squareup.okhttp.Call call = getGatewayByIdValidateBeforeCall(gatewayId, null, null);
        Type localVarReturnType = new TypeToken<Gateway>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns the specified gateway (asynchronously)
     * 
     * @param gatewayId The gateway id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGatewayByIdAsync(String gatewayId, final ApiCallback<Gateway> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGatewayByIdValidateBeforeCall(gatewayId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Gateway>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGateways
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGatewaysCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/gateways";

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
    private com.squareup.okhttp.Call getGatewaysValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getGatewaysCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a list of gateways
     * 
     * @return ODataResponseListGateway
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListGateway getGateways() throws ApiException {
        ApiResponse<ODataResponseListGateway> resp = getGatewaysWithHttpInfo();
        return resp.getData();
    }

    /**
     * Returns a list of gateways
     * 
     * @return ApiResponse&lt;ODataResponseListGateway&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListGateway> getGatewaysWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getGatewaysValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListGateway>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of gateways (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGatewaysAsync(final ApiCallback<ODataResponseListGateway> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGatewaysValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListGateway>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
