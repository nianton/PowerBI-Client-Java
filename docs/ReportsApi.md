# ReportsApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dashboardsGetDashboard**](ReportsApi.md#dashboardsGetDashboard) | **POST** /v1.0/myorg/dashboards/{dashboardKey} | Get the specified dashboard
[**reportsCloneReport**](ReportsApi.md#reportsCloneReport) | **POST** /v1.0/myorg/reports/{reportKey}/Clone | Clones the specified report
[**reportsCloneReportInGroup**](ReportsApi.md#reportsCloneReportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Clone | Clones the specified report
[**reportsDeleteReport**](ReportsApi.md#reportsDeleteReport) | **DELETE** /v1.0/myorg/reports/{reportKey} | Deletes the specified report
[**reportsDeleteReportInGroup**](ReportsApi.md#reportsDeleteReportInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/reports/{reportKey} | Deletes the specified report
[**reportsExportReport**](ReportsApi.md#reportsExportReport) | **GET** /v1.0/myorg/reports/{reportKey}/Export | Exports the specified report
[**reportsExportReportInGroup**](ReportsApi.md#reportsExportReportInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Export | Exports the specified report
[**reportsGenerateToken**](ReportsApi.md#reportsGenerateToken) | **POST** /v1.0/myorg/reports/{reportKey}/GenerateToken | Generate token to view or edit the specified report
[**reportsGenerateTokenForCreate**](ReportsApi.md#reportsGenerateTokenForCreate) | **POST** /v1.0/myorg/reports/GenerateToken | Generate token to create a new report on a given dataset
[**reportsGenerateTokenForCreateInGroup**](ReportsApi.md#reportsGenerateTokenForCreateInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/GenerateToken | Generate token to create a new report on a given dataset
[**reportsGenerateTokenInGroup**](ReportsApi.md#reportsGenerateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/GenerateToken | Generate token to view or edit the specified report
[**reportsGetReport**](ReportsApi.md#reportsGetReport) | **GET** /v1.0/myorg/reports/{reportKey} | Get the specified report
[**reportsGetReportInGroup**](ReportsApi.md#reportsGetReportInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports/{reportKey} | Get the specified report
[**reportsGetReports**](ReportsApi.md#reportsGetReports) | **GET** /v1.0/myorg/reports | Gets a list of reports
[**reportsGetReportsInGroup**](ReportsApi.md#reportsGetReportsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports | Gets a list of reports available within the specified group
[**reportsRebindReport**](ReportsApi.md#reportsRebindReport) | **POST** /v1.0/myorg/reports/{reportKey}/Rebind | Rebinds the specified report to requested dataset id
[**reportsRebindReportInGroup**](ReportsApi.md#reportsRebindReportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Rebind | Rebinds the specified report to requested dataset id


<a name="dashboardsGetDashboard"></a>
# **dashboardsGetDashboard**
> Dashboard dashboardsGetDashboard(dashboardKey)

Get the specified dashboard

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
try {
    Dashboard result = apiInstance.dashboardsGetDashboard(dashboardKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#dashboardsGetDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardKey** | **String**| The dashboard id |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reportsCloneReport"></a>
# **reportsCloneReport**
> Report reportsCloneReport(reportKey, requestParameters)

Clones the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportKey = "reportKey_example"; // String | The report id
CloneReportRequest requestParameters = new CloneReportRequest(); // CloneReportRequest | Clone report parameters
try {
    Report result = apiInstance.reportsCloneReport(reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsCloneReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportKey** | **String**| The report id |
 **requestParameters** | [**CloneReportRequest**](CloneReportRequest.md)| Clone report parameters |

### Return type

[**Report**](Report.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reportsCloneReportInGroup"></a>
# **reportsCloneReportInGroup**
> Report reportsCloneReportInGroup(groupId, reportKey, requestParameters)

Clones the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String groupId = "groupId_example"; // String | The group id
String reportKey = "reportKey_example"; // String | The report id
CloneReportRequest requestParameters = new CloneReportRequest(); // CloneReportRequest | Clone report parameters
try {
    Report result = apiInstance.reportsCloneReportInGroup(groupId, reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsCloneReportInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **reportKey** | **String**| The report id |
 **requestParameters** | [**CloneReportRequest**](CloneReportRequest.md)| Clone report parameters |

### Return type

[**Report**](Report.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reportsDeleteReport"></a>
# **reportsDeleteReport**
> Object reportsDeleteReport(reportKey)

Deletes the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportKey = "reportKey_example"; // String | The report id
try {
    Object result = apiInstance.reportsDeleteReport(reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsDeleteReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportKey** | **String**| The report id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reportsDeleteReportInGroup"></a>
# **reportsDeleteReportInGroup**
> Object reportsDeleteReportInGroup(groupId, reportKey)

Deletes the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String groupId = "groupId_example"; // String | The group id
String reportKey = "reportKey_example"; // String | The report id
try {
    Object result = apiInstance.reportsDeleteReportInGroup(groupId, reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsDeleteReportInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **reportKey** | **String**| The report id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reportsExportReport"></a>
# **reportsExportReport**
> File reportsExportReport(reportKey)

Exports the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportKey = "reportKey_example"; // String | The report id
try {
    File result = apiInstance.reportsExportReport(reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsExportReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportKey** | **String**| The report id |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

<a name="reportsExportReportInGroup"></a>
# **reportsExportReportInGroup**
> File reportsExportReportInGroup(groupId, reportKey)

Exports the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String groupId = "groupId_example"; // String | The group id
String reportKey = "reportKey_example"; // String | The report id
try {
    File result = apiInstance.reportsExportReportInGroup(groupId, reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsExportReportInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **reportKey** | **String**| The report id |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

<a name="reportsGenerateToken"></a>
# **reportsGenerateToken**
> EmbedToken reportsGenerateToken(reportKey, requestParameters)

Generate token to view or edit the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportKey = "reportKey_example"; // String | The report id
GenerateTokenRequest requestParameters = new GenerateTokenRequest(); // GenerateTokenRequest | Generate token parameters
try {
    EmbedToken result = apiInstance.reportsGenerateToken(reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGenerateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportKey** | **String**| The report id |
 **requestParameters** | [**GenerateTokenRequest**](GenerateTokenRequest.md)| Generate token parameters |

### Return type

[**EmbedToken**](EmbedToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reportsGenerateTokenForCreate"></a>
# **reportsGenerateTokenForCreate**
> EmbedToken reportsGenerateTokenForCreate(requestParameters)

Generate token to create a new report on a given dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
GenerateTokenRequest requestParameters = new GenerateTokenRequest(); // GenerateTokenRequest | Generate token parameters
try {
    EmbedToken result = apiInstance.reportsGenerateTokenForCreate(requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGenerateTokenForCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestParameters** | [**GenerateTokenRequest**](GenerateTokenRequest.md)| Generate token parameters |

### Return type

[**EmbedToken**](EmbedToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reportsGenerateTokenForCreateInGroup"></a>
# **reportsGenerateTokenForCreateInGroup**
> EmbedToken reportsGenerateTokenForCreateInGroup(groupId, requestParameters)

Generate token to create a new report on a given dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String groupId = "groupId_example"; // String | The group id
GenerateTokenRequest requestParameters = new GenerateTokenRequest(); // GenerateTokenRequest | Generate token parameters
try {
    EmbedToken result = apiInstance.reportsGenerateTokenForCreateInGroup(groupId, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGenerateTokenForCreateInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **requestParameters** | [**GenerateTokenRequest**](GenerateTokenRequest.md)| Generate token parameters |

### Return type

[**EmbedToken**](EmbedToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reportsGenerateTokenInGroup"></a>
# **reportsGenerateTokenInGroup**
> EmbedToken reportsGenerateTokenInGroup(groupId, reportKey, requestParameters)

Generate token to view or edit the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String groupId = "groupId_example"; // String | The group id
String reportKey = "reportKey_example"; // String | The report id
GenerateTokenRequest requestParameters = new GenerateTokenRequest(); // GenerateTokenRequest | Generate token parameters
try {
    EmbedToken result = apiInstance.reportsGenerateTokenInGroup(groupId, reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGenerateTokenInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **reportKey** | **String**| The report id |
 **requestParameters** | [**GenerateTokenRequest**](GenerateTokenRequest.md)| Generate token parameters |

### Return type

[**EmbedToken**](EmbedToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reportsGetReport"></a>
# **reportsGetReport**
> Report reportsGetReport(reportKey)

Get the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportKey = "reportKey_example"; // String | The report id
try {
    Report result = apiInstance.reportsGetReport(reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportKey** | **String**| The report id |

### Return type

[**Report**](Report.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reportsGetReportInGroup"></a>
# **reportsGetReportInGroup**
> Report reportsGetReportInGroup(groupId, reportKey)

Get the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String groupId = "groupId_example"; // String | The group id
String reportKey = "reportKey_example"; // String | The report id
try {
    Report result = apiInstance.reportsGetReportInGroup(groupId, reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetReportInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **reportKey** | **String**| The report id |

### Return type

[**Report**](Report.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reportsGetReports"></a>
# **reportsGetReports**
> ODataResponseListReport reportsGetReports()

Gets a list of reports

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
try {
    ODataResponseListReport result = apiInstance.reportsGetReports();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetReports");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ODataResponseListReport**](ODataResponseListReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reportsGetReportsInGroup"></a>
# **reportsGetReportsInGroup**
> ODataResponseListReport reportsGetReportsInGroup(groupId)

Gets a list of reports available within the specified group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String groupId = "groupId_example"; // String | The group id
try {
    ODataResponseListReport result = apiInstance.reportsGetReportsInGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsGetReportsInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |

### Return type

[**ODataResponseListReport**](ODataResponseListReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reportsRebindReport"></a>
# **reportsRebindReport**
> Object reportsRebindReport(reportKey, requestParameters)

Rebinds the specified report to requested dataset id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportKey = "reportKey_example"; // String | The report id
RebindReportRequest requestParameters = new RebindReportRequest(); // RebindReportRequest | Rebind report parameters
try {
    Object result = apiInstance.reportsRebindReport(reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsRebindReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportKey** | **String**| The report id |
 **requestParameters** | [**RebindReportRequest**](RebindReportRequest.md)| Rebind report parameters |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="reportsRebindReportInGroup"></a>
# **reportsRebindReportInGroup**
> Object reportsRebindReportInGroup(groupId, reportKey, requestParameters)

Rebinds the specified report to requested dataset id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String groupId = "groupId_example"; // String | The group id
String reportKey = "reportKey_example"; // String | The report id
RebindReportRequest requestParameters = new RebindReportRequest(); // RebindReportRequest | Rebind report parameters
try {
    Object result = apiInstance.reportsRebindReportInGroup(groupId, reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#reportsRebindReportInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **reportKey** | **String**| The report id |
 **requestParameters** | [**RebindReportRequest**](RebindReportRequest.md)| Rebind report parameters |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

