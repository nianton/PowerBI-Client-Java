

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
     * Build call for dashboardsCloneTile
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Clone tile parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dashboardsCloneTileCall(String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call dashboardsCloneTileValidateBeforeCall(String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling dashboardsCloneTile(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling dashboardsCloneTile(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling dashboardsCloneTile(Async)");
        }
        

        com.squareup.okhttp.Call call = dashboardsCloneTileCall(dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
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
    public Tile dashboardsCloneTile(String dashboardKey, String tileKey, CloneTileRequest requestParameters) throws ApiException {
        ApiResponse<Tile> resp = dashboardsCloneTileWithHttpInfo(dashboardKey, tileKey, requestParameters);
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
    public ApiResponse<Tile> dashboardsCloneTileWithHttpInfo(String dashboardKey, String tileKey, CloneTileRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = dashboardsCloneTileValidateBeforeCall(dashboardKey, tileKey, requestParameters, null, null);
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
    public com.squareup.okhttp.Call dashboardsCloneTileAsync(String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ApiCallback<Tile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dashboardsCloneTileValidateBeforeCall(dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dashboardsCloneTileInGroup
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Clone tile parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dashboardsCloneTileInGroupCall(String groupId, String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call dashboardsCloneTileInGroupValidateBeforeCall(String groupId, String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling dashboardsCloneTileInGroup(Async)");
        }
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling dashboardsCloneTileInGroup(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling dashboardsCloneTileInGroup(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling dashboardsCloneTileInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = dashboardsCloneTileInGroupCall(groupId, dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
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
    public Tile dashboardsCloneTileInGroup(String groupId, String dashboardKey, String tileKey, CloneTileRequest requestParameters) throws ApiException {
        ApiResponse<Tile> resp = dashboardsCloneTileInGroupWithHttpInfo(groupId, dashboardKey, tileKey, requestParameters);
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
    public ApiResponse<Tile> dashboardsCloneTileInGroupWithHttpInfo(String groupId, String dashboardKey, String tileKey, CloneTileRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = dashboardsCloneTileInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, requestParameters, null, null);
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
    public com.squareup.okhttp.Call dashboardsCloneTileInGroupAsync(String groupId, String dashboardKey, String tileKey, CloneTileRequest requestParameters, final ApiCallback<Tile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dashboardsCloneTileInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dashboardsGetTile
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dashboardsGetTileCall(String dashboardKey, String tileKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call dashboardsGetTileValidateBeforeCall(String dashboardKey, String tileKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling dashboardsGetTile(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling dashboardsGetTile(Async)");
        }
        

        com.squareup.okhttp.Call call = dashboardsGetTileCall(dashboardKey, tileKey, progressListener, progressRequestListener);
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
    public Tile dashboardsGetTile(String dashboardKey, String tileKey) throws ApiException {
        ApiResponse<Tile> resp = dashboardsGetTileWithHttpInfo(dashboardKey, tileKey);
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
    public ApiResponse<Tile> dashboardsGetTileWithHttpInfo(String dashboardKey, String tileKey) throws ApiException {
        com.squareup.okhttp.Call call = dashboardsGetTileValidateBeforeCall(dashboardKey, tileKey, null, null);
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
    public com.squareup.okhttp.Call dashboardsGetTileAsync(String dashboardKey, String tileKey, final ApiCallback<Tile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dashboardsGetTileValidateBeforeCall(dashboardKey, tileKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dashboardsGetTileInGroup
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dashboardsGetTileInGroupCall(String groupId, String dashboardKey, String tileKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call dashboardsGetTileInGroupValidateBeforeCall(String groupId, String dashboardKey, String tileKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling dashboardsGetTileInGroup(Async)");
        }
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling dashboardsGetTileInGroup(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling dashboardsGetTileInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = dashboardsGetTileInGroupCall(groupId, dashboardKey, tileKey, progressListener, progressRequestListener);
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
    public Tile dashboardsGetTileInGroup(String groupId, String dashboardKey, String tileKey) throws ApiException {
        ApiResponse<Tile> resp = dashboardsGetTileInGroupWithHttpInfo(groupId, dashboardKey, tileKey);
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
    public ApiResponse<Tile> dashboardsGetTileInGroupWithHttpInfo(String groupId, String dashboardKey, String tileKey) throws ApiException {
        com.squareup.okhttp.Call call = dashboardsGetTileInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, null, null);
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
    public com.squareup.okhttp.Call dashboardsGetTileInGroupAsync(String groupId, String dashboardKey, String tileKey, final ApiCallback<Tile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dashboardsGetTileInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dashboardsGetTiles
     * @param dashboardKey The dashboard id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dashboardsGetTilesCall(String dashboardKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call dashboardsGetTilesValidateBeforeCall(String dashboardKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling dashboardsGetTiles(Async)");
        }
        

        com.squareup.okhttp.Call call = dashboardsGetTilesCall(dashboardKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get tiles in the specified dashboard
     * 
     * @param dashboardKey The dashboard id (required)
     * @return ODataResponseListTile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListTile dashboardsGetTiles(String dashboardKey) throws ApiException {
        ApiResponse<ODataResponseListTile> resp = dashboardsGetTilesWithHttpInfo(dashboardKey);
        return resp.getData();
    }

    /**
     * Get tiles in the specified dashboard
     * 
     * @param dashboardKey The dashboard id (required)
     * @return ApiResponse&lt;ODataResponseListTile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListTile> dashboardsGetTilesWithHttpInfo(String dashboardKey) throws ApiException {
        com.squareup.okhttp.Call call = dashboardsGetTilesValidateBeforeCall(dashboardKey, null, null);
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
    public com.squareup.okhttp.Call dashboardsGetTilesAsync(String dashboardKey, final ApiCallback<ODataResponseListTile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dashboardsGetTilesValidateBeforeCall(dashboardKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListTile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dashboardsGetTilesInGroup
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dashboardsGetTilesInGroupCall(String groupId, String dashboardKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call dashboardsGetTilesInGroupValidateBeforeCall(String groupId, String dashboardKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling dashboardsGetTilesInGroup(Async)");
        }
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling dashboardsGetTilesInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = dashboardsGetTilesInGroupCall(groupId, dashboardKey, progressListener, progressRequestListener);
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
    public ODataResponseListTile dashboardsGetTilesInGroup(String groupId, String dashboardKey) throws ApiException {
        ApiResponse<ODataResponseListTile> resp = dashboardsGetTilesInGroupWithHttpInfo(groupId, dashboardKey);
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
    public ApiResponse<ODataResponseListTile> dashboardsGetTilesInGroupWithHttpInfo(String groupId, String dashboardKey) throws ApiException {
        com.squareup.okhttp.Call call = dashboardsGetTilesInGroupValidateBeforeCall(groupId, dashboardKey, null, null);
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
    public com.squareup.okhttp.Call dashboardsGetTilesInGroupAsync(String groupId, String dashboardKey, final ApiCallback<ODataResponseListTile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dashboardsGetTilesInGroupValidateBeforeCall(groupId, dashboardKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListTile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tilesGenerateToken
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Generate token parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tilesGenerateTokenCall(String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call tilesGenerateTokenValidateBeforeCall(String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling tilesGenerateToken(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling tilesGenerateToken(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling tilesGenerateToken(Async)");
        }
        

        com.squareup.okhttp.Call call = tilesGenerateTokenCall(dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
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
    public EmbedToken tilesGenerateToken(String dashboardKey, String tileKey, GenerateTokenRequest requestParameters) throws ApiException {
        ApiResponse<EmbedToken> resp = tilesGenerateTokenWithHttpInfo(dashboardKey, tileKey, requestParameters);
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
    public ApiResponse<EmbedToken> tilesGenerateTokenWithHttpInfo(String dashboardKey, String tileKey, GenerateTokenRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = tilesGenerateTokenValidateBeforeCall(dashboardKey, tileKey, requestParameters, null, null);
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
    public com.squareup.okhttp.Call tilesGenerateTokenAsync(String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ApiCallback<EmbedToken> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tilesGenerateTokenValidateBeforeCall(dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tilesGenerateTokenInGroup
     * @param groupId The group id (required)
     * @param dashboardKey The dashboard id (required)
     * @param tileKey The tile id (required)
     * @param requestParameters Generate token parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tilesGenerateTokenInGroupCall(String groupId, String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call tilesGenerateTokenInGroupValidateBeforeCall(String groupId, String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling tilesGenerateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling tilesGenerateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'tileKey' is set
        if (tileKey == null) {
            throw new ApiException("Missing the required parameter 'tileKey' when calling tilesGenerateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling tilesGenerateTokenInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = tilesGenerateTokenInGroupCall(groupId, dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
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
    public EmbedToken tilesGenerateTokenInGroup(String groupId, String dashboardKey, String tileKey, GenerateTokenRequest requestParameters) throws ApiException {
        ApiResponse<EmbedToken> resp = tilesGenerateTokenInGroupWithHttpInfo(groupId, dashboardKey, tileKey, requestParameters);
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
    public ApiResponse<EmbedToken> tilesGenerateTokenInGroupWithHttpInfo(String groupId, String dashboardKey, String tileKey, GenerateTokenRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = tilesGenerateTokenInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, requestParameters, null, null);
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
    public com.squareup.okhttp.Call tilesGenerateTokenInGroupAsync(String groupId, String dashboardKey, String tileKey, GenerateTokenRequest requestParameters, final ApiCallback<EmbedToken> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tilesGenerateTokenInGroupValidateBeforeCall(groupId, dashboardKey, tileKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
