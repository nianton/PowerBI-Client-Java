

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


import com.microsoft.powerbi.models.CloneTileRequest;
import com.microsoft.powerbi.models.EmbedToken;
import com.microsoft.powerbi.models.GenerateTokenRequest;
import com.microsoft.powerbi.models.ODataResponseListTile;
import com.microsoft.powerbi.models.Tile;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TilesApi {
    private ApiClient apiClient;

    public TilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cloneTile
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Clone tile parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cloneTileCall(String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey}/Clone"
            .replaceAll("\\{" + "dashboardKey" + "\\}", apiClient.escapeString(dashboardKey.toString()))
            .replaceAll("\\{" + "tileKey" + "\\}", apiClient.escapeString(tileKey.toString()));

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
    private com.squareup.okhttp.Call cloneTileValidateBeforeCall(String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling cloneTile(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling cloneTile(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling cloneTile(Async)");
        }
        

        com.squareup.okhttp.Call call = cloneTileCall(dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Clones the specified tile
     * 
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Clone tile parameters (required)
     * @return Tile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tile cloneTile(String dashboardKey, String tileKey, CloneTileRequest requestParameters) throws ApiException {
        ApiResponse<Tile> resp = cloneTileWithHttpInfo(dashboardKey, tileKey, requestParameters);
        return resp.getData();
    }

    /**
     * Clones the specified tile
     * 
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Clone tile parameters (required)
     * @return ApiResponse&lt;Tile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tile> cloneTileWithHttpInfo(String dashboardKey, String tileKey, CloneTileRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = cloneTileValidateBeforeCall(dashboardKey, tileKey, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Clones the specified tile (asynchronously)
     * 
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Clone tile parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cloneTileAsync(String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ApiCallback<Tile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cloneTileValidateBeforeCall(dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cloneTileInGroup
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Clone tile parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cloneTileInGroupCall(String groupId, String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey}/Clone"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "dashboardKey" + "\\}", apiClient.escapeString(dashboardKey.toString()))
            .replaceAll("\\{" + "tileKey" + "\\}", apiClient.escapeString(tileKey.toString()));

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
    private com.squareup.okhttp.Call cloneTileInGroupValidateBeforeCall(String groupId, String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling cloneTileInGroup(Async)");
        }
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling cloneTileInGroup(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling cloneTileInGroup(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling cloneTileInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = cloneTileInGroupCall(groupId, dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Clones the specified tile
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Clone tile parameters (required)
     * @return Tile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tile cloneTileInGroup(String groupId, String dashboardKey, String tileKey, CloneTileRequest requestParameters) throws ApiException {
        ApiResponse<Tile> resp = cloneTileInGroupWithHttpInfo(groupId, dashboardKey, tileKey, requestParameters);
        return resp.getData();
    }

    /**
     * Clones the specified tile
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Clone tile parameters (required)
     * @return ApiResponse&lt;Tile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tile> cloneTileInGroupWithHttpInfo(String groupId, String dashboardKey, String tileKey, CloneTileRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = cloneTileInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Clones the specified tile (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Clone tile parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cloneTileInGroupAsync(String groupId, String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ApiCallback<Tile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cloneTileInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for generateToken
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Generate token parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generateTokenCall(String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey}/GenerateToken"
            .replaceAll("\\{" + "dashboardKey" + "\\}", apiClient.escapeString(dashboardKey.toString()))
            .replaceAll("\\{" + "tileKey" + "\\}", apiClient.escapeString(tileKey.toString()));

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
    private com.squareup.okhttp.Call generateTokenValidateBeforeCall(String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling generateToken(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling generateToken(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling generateToken(Async)");
        }
        

        com.squareup.okhttp.Call call = generateTokenCall(dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generate token to view the specified tile
     * 
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Generate token parameters (required)
     * @return EmbedToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmbedToken generateToken(String dashboardKey, String tileKey, GenerateTokenRequest requestParameters) throws ApiException {
        ApiResponse<EmbedToken> resp = generateTokenWithHttpInfo(dashboardKey, tileKey, requestParameters);
        return resp.getData();
    }

    /**
     * Generate token to view the specified tile
     * 
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Generate token parameters (required)
     * @return ApiResponse&lt;EmbedToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmbedToken> generateTokenWithHttpInfo(String dashboardKey, String tileKey, GenerateTokenRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = generateTokenValidateBeforeCall(dashboardKey, tileKey, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate token to view the specified tile (asynchronously)
     * 
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Generate token parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generateTokenAsync(String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ApiCallback<EmbedToken> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = generateTokenValidateBeforeCall(dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for generateTokenInGroup
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Generate token parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generateTokenInGroupCall(String groupId, String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey}/GenerateToken"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "dashboardKey" + "\\}", apiClient.escapeString(dashboardKey.toString()))
            .replaceAll("\\{" + "tileKey" + "\\}", apiClient.escapeString(tileKey.toString()));

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
    private com.squareup.okhttp.Call generateTokenInGroupValidateBeforeCall(String groupId, String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling generateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling generateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling generateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling generateTokenInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = generateTokenInGroupCall(groupId, dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generate token to view the specified tile
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Generate token parameters (required)
     * @return EmbedToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmbedToken generateTokenInGroup(String groupId, String dashboardKey, String tileKey, GenerateTokenRequest requestParameters) throws ApiException {
        ApiResponse<EmbedToken> resp = generateTokenInGroupWithHttpInfo(groupId, dashboardKey, tileKey, requestParameters);
        return resp.getData();
    }

    /**
     * Generate token to view the specified tile
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Generate token parameters (required)
     * @return ApiResponse&lt;EmbedToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmbedToken> generateTokenInGroupWithHttpInfo(String groupId, String dashboardKey, String tileKey, GenerateTokenRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = generateTokenInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate token to view the specified tile (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Generate token parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generateTokenInGroupAsync(String groupId, String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ApiCallback<EmbedToken> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = generateTokenInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTile
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTileCall(String dashboardKey, String tileKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey}"
            .replaceAll("\\{" + "dashboardKey" + "\\}", apiClient.escapeString(dashboardKey.toString()))
            .replaceAll("\\{" + "tileKey" + "\\}", apiClient.escapeString(tileKey.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTileValidateBeforeCall(String dashboardKey, String tileKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling getTile(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling getTile(Async)");
        }
        

        com.squareup.okhttp.Call call = getTileCall(dashboardKey, tileKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a specified tile in a specified dashboard
     * 
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @return Tile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tile getTile(String dashboardKey, String tileKey) throws ApiException {
        ApiResponse<Tile> resp = getTileWithHttpInfo(dashboardKey, tileKey);
        return resp.getData();
    }

    /**
     * Get a specified tile in a specified dashboard
     * 
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @return ApiResponse&lt;Tile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tile> getTileWithHttpInfo(String dashboardKey, String tileKey) throws ApiException {
        com.squareup.okhttp.Call call = getTileValidateBeforeCall(dashboardKey, tileKey, null, null);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a specified tile in a specified dashboard (asynchronously)
     * 
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTileAsync(String dashboardKey, String tileKey, final ApiCallback<Tile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTileValidateBeforeCall(dashboardKey, tileKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTileInGroup
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTileInGroupCall(String groupId, String dashboardKey, String tileKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey}"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "dashboardKey" + "\\}", apiClient.escapeString(dashboardKey.toString()))
            .replaceAll("\\{" + "tileKey" + "\\}", apiClient.escapeString(tileKey.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTileInGroupValidateBeforeCall(String groupId, String dashboardKey, String tileKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getTileInGroup(Async)");
        }
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling getTileInGroup(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling getTileInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getTileInGroupCall(groupId, dashboardKey, tileKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a specified tile in a specified dashboard in a group
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @return Tile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tile getTileInGroup(String groupId, String dashboardKey, String tileKey) throws ApiException {
        ApiResponse<Tile> resp = getTileInGroupWithHttpInfo(groupId, dashboardKey, tileKey);
        return resp.getData();
    }

    /**
     * Get a specified tile in a specified dashboard in a group
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @return ApiResponse&lt;Tile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tile> getTileInGroupWithHttpInfo(String groupId, String dashboardKey, String tileKey) throws ApiException {
        com.squareup.okhttp.Call call = getTileInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, null, null);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a specified tile in a specified dashboard in a group (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTileInGroupAsync(String groupId, String dashboardKey, String tileKey, final ApiCallback<Tile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTileInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTiles
     * @param dashboardKey The dashboard id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTilesCall(String dashboardKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/dashboards/{dashboardKey}/tiles"
            .replaceAll("\\{" + "dashboardKey" + "\\}", apiClient.escapeString(dashboardKey.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTilesValidateBeforeCall(String dashboardKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling getTiles(Async)");
        }
        

        com.squareup.okhttp.Call call = getTilesCall(dashboardKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get tiles in the specified dashboard
     * 
     * @param dashboardKey The dashboard id (required)
     * @return ODataResponseListTile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListTile getTiles(String dashboardKey) throws ApiException {
        ApiResponse<ODataResponseListTile> resp = getTilesWithHttpInfo(dashboardKey);
        return resp.getData();
    }

    /**
     * Get tiles in the specified dashboard
     * 
     * @param dashboardKey The dashboard id (required)
     * @return ApiResponse&lt;ODataResponseListTile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListTile> getTilesWithHttpInfo(String dashboardKey) throws ApiException {
        com.squareup.okhttp.Call call = getTilesValidateBeforeCall(dashboardKey, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListTile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get tiles in the specified dashboard (asynchronously)
     * 
     * @param dashboardKey The dashboard id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTilesAsync(String dashboardKey, final ApiCallback<ODataResponseListTile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTilesValidateBeforeCall(dashboardKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListTile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTilesInGroup
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTilesInGroupCall(String groupId, String dashboardKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "dashboardKey" + "\\}", apiClient.escapeString(dashboardKey.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTilesInGroupValidateBeforeCall(String groupId, String dashboardKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getTilesInGroup(Async)");
        }
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling getTilesInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getTilesInGroupCall(groupId, dashboardKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get tiles in the specified dashboard in a group
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @return ODataResponseListTile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListTile getTilesInGroup(String groupId, String dashboardKey) throws ApiException {
        ApiResponse<ODataResponseListTile> resp = getTilesInGroupWithHttpInfo(groupId, dashboardKey);
        return resp.getData();
    }

    /**
     * Get tiles in the specified dashboard in a group
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @return ApiResponse&lt;ODataResponseListTile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListTile> getTilesInGroupWithHttpInfo(String groupId, String dashboardKey) throws ApiException {
        com.squareup.okhttp.Call call = getTilesInGroupValidateBeforeCall(groupId, dashboardKey, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListTile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get tiles in the specified dashboard in a group (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTilesInGroupAsync(String groupId, String dashboardKey, final ApiCallback<ODataResponseListTile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTilesInGroupValidateBeforeCall(groupId, dashboardKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListTile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
