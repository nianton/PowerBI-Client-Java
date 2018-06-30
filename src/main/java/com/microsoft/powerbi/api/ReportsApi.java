

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


import com.microsoft.powerbi.models.CloneReportRequest;
import com.microsoft.powerbi.models.Dashboard;
import com.microsoft.powerbi.models.EmbedToken;
import java.io.File;
import com.microsoft.powerbi.models.GenerateTokenRequest;
import com.microsoft.powerbi.models.ODataResponseListReport;
import com.microsoft.powerbi.models.RebindReportRequest;
import com.microsoft.powerbi.models.Report;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportsApi {
    private ApiClient apiClient;

    public ReportsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cloneReport
     * @param reportKey The report id (required)
     * @param requestParameters Clone report parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cloneReportCall(String reportKey, CloneReportRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/reports/{reportKey}/Clone"
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

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
    private com.squareup.okhttp.Call cloneReportValidateBeforeCall(String reportKey, CloneReportRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling cloneReport(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling cloneReport(Async)");
        }
        

        com.squareup.okhttp.Call call = cloneReportCall(reportKey, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Clones the specified report
     * 
     * @param reportKey The report id (required)
     * @param requestParameters Clone report parameters (required)
     * @return Report
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Report cloneReport(String reportKey, CloneReportRequest requestParameters) throws ApiException {
        ApiResponse<Report> resp = cloneReportWithHttpInfo(reportKey, requestParameters);
        return resp.getData();
    }

    /**
     * Clones the specified report
     * 
     * @param reportKey The report id (required)
     * @param requestParameters Clone report parameters (required)
     * @return ApiResponse&lt;Report&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Report> cloneReportWithHttpInfo(String reportKey, CloneReportRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = cloneReportValidateBeforeCall(reportKey, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<Report>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Clones the specified report (asynchronously)
     * 
     * @param reportKey The report id (required)
     * @param requestParameters Clone report parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cloneReportAsync(String reportKey, CloneReportRequest requestParameters, final ApiCallback<Report> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cloneReportValidateBeforeCall(reportKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Report>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cloneReportInGroup
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Clone report parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cloneReportInGroupCall(String groupId, String reportKey, CloneReportRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/reports/{reportKey}/Clone"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

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
    private com.squareup.okhttp.Call cloneReportInGroupValidateBeforeCall(String groupId, String reportKey, CloneReportRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling cloneReportInGroup(Async)");
        }
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling cloneReportInGroup(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling cloneReportInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = cloneReportInGroupCall(groupId, reportKey, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Clones the specified report
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Clone report parameters (required)
     * @return Report
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Report cloneReportInGroup(String groupId, String reportKey, CloneReportRequest requestParameters) throws ApiException {
        ApiResponse<Report> resp = cloneReportInGroupWithHttpInfo(groupId, reportKey, requestParameters);
        return resp.getData();
    }

    /**
     * Clones the specified report
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Clone report parameters (required)
     * @return ApiResponse&lt;Report&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Report> cloneReportInGroupWithHttpInfo(String groupId, String reportKey, CloneReportRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = cloneReportInGroupValidateBeforeCall(groupId, reportKey, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<Report>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Clones the specified report (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Clone report parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cloneReportInGroupAsync(String groupId, String reportKey, CloneReportRequest requestParameters, final ApiCallback<Report> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cloneReportInGroupValidateBeforeCall(groupId, reportKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Report>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteReport
     * @param reportKey The report id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteReportCall(String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/reports/{reportKey}"
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

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
    private com.squareup.okhttp.Call deleteReportValidateBeforeCall(String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling deleteReport(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteReportCall(reportKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes the specified report
     * 
     * @param reportKey The report id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object deleteReport(String reportKey) throws ApiException {
        ApiResponse<Object> resp = deleteReportWithHttpInfo(reportKey);
        return resp.getData();
    }

    /**
     * Deletes the specified report
     * 
     * @param reportKey The report id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deleteReportWithHttpInfo(String reportKey) throws ApiException {
        com.squareup.okhttp.Call call = deleteReportValidateBeforeCall(reportKey, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes the specified report (asynchronously)
     * 
     * @param reportKey The report id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteReportAsync(String reportKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteReportValidateBeforeCall(reportKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteReportInGroup
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteReportInGroupCall(String groupId, String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/reports/{reportKey}"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

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
    private com.squareup.okhttp.Call deleteReportInGroupValidateBeforeCall(String groupId, String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling deleteReportInGroup(Async)");
        }
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling deleteReportInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteReportInGroupCall(groupId, reportKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes the specified report
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object deleteReportInGroup(String groupId, String reportKey) throws ApiException {
        ApiResponse<Object> resp = deleteReportInGroupWithHttpInfo(groupId, reportKey);
        return resp.getData();
    }

    /**
     * Deletes the specified report
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deleteReportInGroupWithHttpInfo(String groupId, String reportKey) throws ApiException {
        com.squareup.okhttp.Call call = deleteReportInGroupValidateBeforeCall(groupId, reportKey, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes the specified report (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteReportInGroupAsync(String groupId, String reportKey, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteReportInGroupValidateBeforeCall(groupId, reportKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for exportReport
     * @param reportKey The report id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call exportReportCall(String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/reports/{reportKey}/Export"
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/zip"
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
    private com.squareup.okhttp.Call exportReportValidateBeforeCall(String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling exportReport(Async)");
        }
        

        com.squareup.okhttp.Call call = exportReportCall(reportKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Exports the specified report
     * 
     * @param reportKey The report id (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File exportReport(String reportKey) throws ApiException {
        ApiResponse<File> resp = exportReportWithHttpInfo(reportKey);
        return resp.getData();
    }

    /**
     * Exports the specified report
     * 
     * @param reportKey The report id (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> exportReportWithHttpInfo(String reportKey) throws ApiException {
        com.squareup.okhttp.Call call = exportReportValidateBeforeCall(reportKey, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Exports the specified report (asynchronously)
     * 
     * @param reportKey The report id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call exportReportAsync(String reportKey, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = exportReportValidateBeforeCall(reportKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for exportReportInGroup
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call exportReportInGroupCall(String groupId, String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/reports/{reportKey}/Export"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/zip"
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
    private com.squareup.okhttp.Call exportReportInGroupValidateBeforeCall(String groupId, String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling exportReportInGroup(Async)");
        }
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling exportReportInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = exportReportInGroupCall(groupId, reportKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Exports the specified report
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File exportReportInGroup(String groupId, String reportKey) throws ApiException {
        ApiResponse<File> resp = exportReportInGroupWithHttpInfo(groupId, reportKey);
        return resp.getData();
    }

    /**
     * Exports the specified report
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> exportReportInGroupWithHttpInfo(String groupId, String reportKey) throws ApiException {
        com.squareup.okhttp.Call call = exportReportInGroupValidateBeforeCall(groupId, reportKey, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Exports the specified report (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call exportReportInGroupAsync(String groupId, String reportKey, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = exportReportInGroupValidateBeforeCall(groupId, reportKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for generateToken
     * @param reportKey The report id (required)
     * @param requestParameters Generate token parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generateTokenCall(String reportKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/reports/{reportKey}/GenerateToken"
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

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
    private com.squareup.okhttp.Call generateTokenValidateBeforeCall(String reportKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling generateToken(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling generateToken(Async)");
        }
        

        com.squareup.okhttp.Call call = generateTokenCall(reportKey, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generate token to view or edit the specified report
     * 
     * @param reportKey The report id (required)
     * @param requestParameters Generate token parameters (required)
     * @return EmbedToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmbedToken generateToken(String reportKey, GenerateTokenRequest requestParameters) throws ApiException {
        ApiResponse<EmbedToken> resp = generateTokenWithHttpInfo(reportKey, requestParameters);
        return resp.getData();
    }

    /**
     * Generate token to view or edit the specified report
     * 
     * @param reportKey The report id (required)
     * @param requestParameters Generate token parameters (required)
     * @return ApiResponse&lt;EmbedToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmbedToken> generateTokenWithHttpInfo(String reportKey, GenerateTokenRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = generateTokenValidateBeforeCall(reportKey, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate token to view or edit the specified report (asynchronously)
     * 
     * @param reportKey The report id (required)
     * @param requestParameters Generate token parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generateTokenAsync(String reportKey, GenerateTokenRequest requestParameters, final ApiCallback<EmbedToken> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = generateTokenValidateBeforeCall(reportKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for generateTokenForCreate
     * @param requestParameters Generate token parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generateTokenForCreateCall(GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/reports/GenerateToken";

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
    private com.squareup.okhttp.Call generateTokenForCreateValidateBeforeCall(GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling generateTokenForCreate(Async)");
        }
        

        com.squareup.okhttp.Call call = generateTokenForCreateCall(requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generate token to create a new report on a given dataset
     * 
     * @param requestParameters Generate token parameters (required)
     * @return EmbedToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmbedToken generateTokenForCreate(GenerateTokenRequest requestParameters) throws ApiException {
        ApiResponse<EmbedToken> resp = generateTokenForCreateWithHttpInfo(requestParameters);
        return resp.getData();
    }

    /**
     * Generate token to create a new report on a given dataset
     * 
     * @param requestParameters Generate token parameters (required)
     * @return ApiResponse&lt;EmbedToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmbedToken> generateTokenForCreateWithHttpInfo(GenerateTokenRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = generateTokenForCreateValidateBeforeCall(requestParameters, null, null);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate token to create a new report on a given dataset (asynchronously)
     * 
     * @param requestParameters Generate token parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generateTokenForCreateAsync(GenerateTokenRequest requestParameters, final ApiCallback<EmbedToken> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = generateTokenForCreateValidateBeforeCall(requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for generateTokenForCreateInGroup
     * @param groupId The group id (required)
     * @param requestParameters Generate token parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generateTokenForCreateInGroupCall(String groupId, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/reports/GenerateToken"
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
    private com.squareup.okhttp.Call generateTokenForCreateInGroupValidateBeforeCall(String groupId, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling generateTokenForCreateInGroup(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling generateTokenForCreateInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = generateTokenForCreateInGroupCall(groupId, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generate token to create a new report on a given dataset
     * 
     * @param groupId The group id (required)
     * @param requestParameters Generate token parameters (required)
     * @return EmbedToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmbedToken generateTokenForCreateInGroup(String groupId, GenerateTokenRequest requestParameters) throws ApiException {
        ApiResponse<EmbedToken> resp = generateTokenForCreateInGroupWithHttpInfo(groupId, requestParameters);
        return resp.getData();
    }

    /**
     * Generate token to create a new report on a given dataset
     * 
     * @param groupId The group id (required)
     * @param requestParameters Generate token parameters (required)
     * @return ApiResponse&lt;EmbedToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmbedToken> generateTokenForCreateInGroupWithHttpInfo(String groupId, GenerateTokenRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = generateTokenForCreateInGroupValidateBeforeCall(groupId, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate token to create a new report on a given dataset (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param requestParameters Generate token parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generateTokenForCreateInGroupAsync(String groupId, GenerateTokenRequest requestParameters, final ApiCallback<EmbedToken> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = generateTokenForCreateInGroupValidateBeforeCall(groupId, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for generateTokenInGroup
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Generate token parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generateTokenInGroupCall(String groupId, String reportKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/reports/{reportKey}/GenerateToken"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

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
    private com.squareup.okhttp.Call generateTokenInGroupValidateBeforeCall(String groupId, String reportKey, GenerateTokenRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling generateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling generateTokenInGroup(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling generateTokenInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = generateTokenInGroupCall(groupId, reportKey, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generate token to view or edit the specified report
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Generate token parameters (required)
     * @return EmbedToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmbedToken generateTokenInGroup(String groupId, String reportKey, GenerateTokenRequest requestParameters) throws ApiException {
        ApiResponse<EmbedToken> resp = generateTokenInGroupWithHttpInfo(groupId, reportKey, requestParameters);
        return resp.getData();
    }

    /**
     * Generate token to view or edit the specified report
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Generate token parameters (required)
     * @return ApiResponse&lt;EmbedToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmbedToken> generateTokenInGroupWithHttpInfo(String groupId, String reportKey, GenerateTokenRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = generateTokenInGroupValidateBeforeCall(groupId, reportKey, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate token to view or edit the specified report (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Generate token parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generateTokenInGroupAsync(String groupId, String reportKey, GenerateTokenRequest requestParameters, final ApiCallback<EmbedToken> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = generateTokenInGroupValidateBeforeCall(groupId, reportKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbedToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDashboard
     * @param dashboardKey The dashboard id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDashboardCall(String dashboardKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/dashboards/{dashboardKey}"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDashboardValidateBeforeCall(String dashboardKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardKey' is set
        if (dashboardKey == null) {
            throw new ApiException("Missing the required parameter 'dashboardKey' when calling getDashboard(Async)");
        }
        

        com.squareup.okhttp.Call call = getDashboardCall(dashboardKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get the specified dashboard
     * 
     * @param dashboardKey The dashboard id (required)
     * @return Dashboard
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dashboard getDashboard(String dashboardKey) throws ApiException {
        ApiResponse<Dashboard> resp = getDashboardWithHttpInfo(dashboardKey);
        return resp.getData();
    }

    /**
     * Get the specified dashboard
     * 
     * @param dashboardKey The dashboard id (required)
     * @return ApiResponse&lt;Dashboard&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dashboard> getDashboardWithHttpInfo(String dashboardKey) throws ApiException {
        com.squareup.okhttp.Call call = getDashboardValidateBeforeCall(dashboardKey, null, null);
        Type localVarReturnType = new TypeToken<Dashboard>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the specified dashboard (asynchronously)
     * 
     * @param dashboardKey The dashboard id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDashboardAsync(String dashboardKey, final ApiCallback<Dashboard> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDashboardValidateBeforeCall(dashboardKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dashboard>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getReport
     * @param reportKey The report id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getReportCall(String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/reports/{reportKey}"
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

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
    private com.squareup.okhttp.Call getReportValidateBeforeCall(String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling getReport(Async)");
        }
        

        com.squareup.okhttp.Call call = getReportCall(reportKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get the specified report
     * 
     * @param reportKey The report id (required)
     * @return Report
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Report getReport(String reportKey) throws ApiException {
        ApiResponse<Report> resp = getReportWithHttpInfo(reportKey);
        return resp.getData();
    }

    /**
     * Get the specified report
     * 
     * @param reportKey The report id (required)
     * @return ApiResponse&lt;Report&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Report> getReportWithHttpInfo(String reportKey) throws ApiException {
        com.squareup.okhttp.Call call = getReportValidateBeforeCall(reportKey, null, null);
        Type localVarReturnType = new TypeToken<Report>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the specified report (asynchronously)
     * 
     * @param reportKey The report id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getReportAsync(String reportKey, final ApiCallback<Report> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getReportValidateBeforeCall(reportKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Report>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getReportInGroup
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getReportInGroupCall(String groupId, String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/reports/{reportKey}"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

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
    private com.squareup.okhttp.Call getReportInGroupValidateBeforeCall(String groupId, String reportKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getReportInGroup(Async)");
        }
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling getReportInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getReportInGroupCall(groupId, reportKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get the specified report
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @return Report
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Report getReportInGroup(String groupId, String reportKey) throws ApiException {
        ApiResponse<Report> resp = getReportInGroupWithHttpInfo(groupId, reportKey);
        return resp.getData();
    }

    /**
     * Get the specified report
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @return ApiResponse&lt;Report&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Report> getReportInGroupWithHttpInfo(String groupId, String reportKey) throws ApiException {
        com.squareup.okhttp.Call call = getReportInGroupValidateBeforeCall(groupId, reportKey, null, null);
        Type localVarReturnType = new TypeToken<Report>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the specified report (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getReportInGroupAsync(String groupId, String reportKey, final ApiCallback<Report> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getReportInGroupValidateBeforeCall(groupId, reportKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Report>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getReports
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getReportsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/reports";

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
    private com.squareup.okhttp.Call getReportsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getReportsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of reports
     * 
     * @return ODataResponseListReport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListReport getReports() throws ApiException {
        ApiResponse<ODataResponseListReport> resp = getReportsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets a list of reports
     * 
     * @return ApiResponse&lt;ODataResponseListReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListReport> getReportsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getReportsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListReport>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of reports (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getReportsAsync(final ApiCallback<ODataResponseListReport> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getReportsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListReport>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getReportsInGroup
     * @param groupId The group id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getReportsInGroupCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/reports"
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
    private com.squareup.okhttp.Call getReportsInGroupValidateBeforeCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getReportsInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = getReportsInGroupCall(groupId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of reports available within the specified group
     * 
     * @param groupId The group id (required)
     * @return ODataResponseListReport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ODataResponseListReport getReportsInGroup(String groupId) throws ApiException {
        ApiResponse<ODataResponseListReport> resp = getReportsInGroupWithHttpInfo(groupId);
        return resp.getData();
    }

    /**
     * Gets a list of reports available within the specified group
     * 
     * @param groupId The group id (required)
     * @return ApiResponse&lt;ODataResponseListReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ODataResponseListReport> getReportsInGroupWithHttpInfo(String groupId) throws ApiException {
        com.squareup.okhttp.Call call = getReportsInGroupValidateBeforeCall(groupId, null, null);
        Type localVarReturnType = new TypeToken<ODataResponseListReport>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of reports available within the specified group (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getReportsInGroupAsync(String groupId, final ApiCallback<ODataResponseListReport> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getReportsInGroupValidateBeforeCall(groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ODataResponseListReport>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rebindReport
     * @param reportKey The report id (required)
     * @param requestParameters Rebind report parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rebindReportCall(String reportKey, RebindReportRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/reports/{reportKey}/Rebind"
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

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
    private com.squareup.okhttp.Call rebindReportValidateBeforeCall(String reportKey, RebindReportRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling rebindReport(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling rebindReport(Async)");
        }
        

        com.squareup.okhttp.Call call = rebindReportCall(reportKey, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Rebinds the specified report to requested dataset id
     * 
     * @param reportKey The report id (required)
     * @param requestParameters Rebind report parameters (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object rebindReport(String reportKey, RebindReportRequest requestParameters) throws ApiException {
        ApiResponse<Object> resp = rebindReportWithHttpInfo(reportKey, requestParameters);
        return resp.getData();
    }

    /**
     * Rebinds the specified report to requested dataset id
     * 
     * @param reportKey The report id (required)
     * @param requestParameters Rebind report parameters (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> rebindReportWithHttpInfo(String reportKey, RebindReportRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = rebindReportValidateBeforeCall(reportKey, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rebinds the specified report to requested dataset id (asynchronously)
     * 
     * @param reportKey The report id (required)
     * @param requestParameters Rebind report parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rebindReportAsync(String reportKey, RebindReportRequest requestParameters, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rebindReportValidateBeforeCall(reportKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rebindReportInGroup
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Rebind report parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rebindReportInGroupCall(String groupId, String reportKey, RebindReportRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestParameters;

        // create path and map variables
        String localVarPath = "/v1.0/myorg/groups/{groupId}/reports/{reportKey}/Rebind"
            .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
            .replaceAll("\\{" + "reportKey" + "\\}", apiClient.escapeString(reportKey.toString()));

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
    private com.squareup.okhttp.Call rebindReportInGroupValidateBeforeCall(String groupId, String reportKey, RebindReportRequest requestParameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling rebindReportInGroup(Async)");
        }
        
        // verify the required parameter 'reportKey' is set
        if (reportKey == null) {
            throw new ApiException("Missing the required parameter 'reportKey' when calling rebindReportInGroup(Async)");
        }
        
        // verify the required parameter 'requestParameters' is set
        if (requestParameters == null) {
            throw new ApiException("Missing the required parameter 'requestParameters' when calling rebindReportInGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = rebindReportInGroupCall(groupId, reportKey, requestParameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Rebinds the specified report to requested dataset id
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Rebind report parameters (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object rebindReportInGroup(String groupId, String reportKey, RebindReportRequest requestParameters) throws ApiException {
        ApiResponse<Object> resp = rebindReportInGroupWithHttpInfo(groupId, reportKey, requestParameters);
        return resp.getData();
    }

    /**
     * Rebinds the specified report to requested dataset id
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Rebind report parameters (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> rebindReportInGroupWithHttpInfo(String groupId, String reportKey, RebindReportRequest requestParameters) throws ApiException {
        com.squareup.okhttp.Call call = rebindReportInGroupValidateBeforeCall(groupId, reportKey, requestParameters, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rebinds the specified report to requested dataset id (asynchronously)
     * 
     * @param groupId The group id (required)
     * @param reportKey The report id (required)
     * @param requestParameters Rebind report parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rebindReportInGroupAsync(String groupId, String reportKey, RebindReportRequest requestParameters, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rebindReportInGroupValidateBeforeCall(groupId, reportKey, requestParameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
