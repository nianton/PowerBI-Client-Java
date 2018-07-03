# ReportsApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneReport**](ReportsApi.md#cloneReport) | **POST** /v1.0/myorg/reports/{reportKey}/Clone | Clones the specified report
[**cloneReportInGroup**](ReportsApi.md#cloneReportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Clone | Clones the specified report
[**deleteReport**](ReportsApi.md#deleteReport) | **DELETE** /v1.0/myorg/reports/{reportKey} | Deletes the specified report
[**deleteReportInGroup**](ReportsApi.md#deleteReportInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/reports/{reportKey} | Deletes the specified report
[**exportReport**](ReportsApi.md#exportReport) | **GET** /v1.0/myorg/reports/{reportKey}/Export | Exports the specified report
[**exportReportInGroup**](ReportsApi.md#exportReportInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Export | Exports the specified report
[**generateToken**](ReportsApi.md#generateToken) | **POST** /v1.0/myorg/reports/{reportKey}/GenerateToken | Generate token to view or edit the specified report
[**generateTokenForCreate**](ReportsApi.md#generateTokenForCreate) | **POST** /v1.0/myorg/reports/GenerateToken | Generate token to create a new report on a given dataset
[**generateTokenForCreateInGroup**](ReportsApi.md#generateTokenForCreateInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/GenerateToken | Generate token to create a new report on a given dataset
[**generateTokenInGroup**](ReportsApi.md#generateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/GenerateToken | Generate token to view or edit the specified report
[**getDashboard**](ReportsApi.md#getDashboard) | **POST** /v1.0/myorg/dashboards/{dashboardKey} | Get the specified dashboard
[**getReport**](ReportsApi.md#getReport) | **GET** /v1.0/myorg/reports/{reportKey} | Get the specified report
[**getReportInGroup**](ReportsApi.md#getReportInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports/{reportKey} | Get the specified report
[**getReports**](ReportsApi.md#getReports) | **GET** /v1.0/myorg/reports | Gets a list of reports
[**getReportsInGroup**](ReportsApi.md#getReportsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports | Gets a list of reports available within the specified group
[**rebindReport**](ReportsApi.md#rebindReport) | **POST** /v1.0/myorg/reports/{reportKey}/Rebind | Rebinds the specified report to requested dataset id
[**rebindReportInGroup**](ReportsApi.md#rebindReportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Rebind | Rebinds the specified report to requested dataset id


<a name="cloneReport"></a>
# **cloneReport**
> Report cloneReport(reportKey, requestParameters)

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
    Report result = apiInstance.cloneReport(reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#cloneReport");
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

<a name="cloneReportInGroup"></a>
# **cloneReportInGroup**
> Report cloneReportInGroup(groupId, reportKey, requestParameters)

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
    Report result = apiInstance.cloneReportInGroup(groupId, reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#cloneReportInGroup");
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

<a name="deleteReport"></a>
# **deleteReport**
> Object deleteReport(reportKey)

Deletes the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportKey = "reportKey_example"; // String | The report id
try {
    Object result = apiInstance.deleteReport(reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#deleteReport");
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

<a name="deleteReportInGroup"></a>
# **deleteReportInGroup**
> Object deleteReportInGroup(groupId, reportKey)

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
    Object result = apiInstance.deleteReportInGroup(groupId, reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#deleteReportInGroup");
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

<a name="exportReport"></a>
# **exportReport**
> File exportReport(reportKey)

Exports the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportKey = "reportKey_example"; // String | The report id
try {
    File result = apiInstance.exportReport(reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#exportReport");
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

<a name="exportReportInGroup"></a>
# **exportReportInGroup**
> File exportReportInGroup(groupId, reportKey)

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
    File result = apiInstance.exportReportInGroup(groupId, reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#exportReportInGroup");
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

<a name="generateToken"></a>
# **generateToken**
> EmbedToken generateToken(reportKey, requestParameters)

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
    EmbedToken result = apiInstance.generateToken(reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateToken");
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

<a name="generateTokenForCreate"></a>
# **generateTokenForCreate**
> EmbedToken generateTokenForCreate(requestParameters)

Generate token to create a new report on a given dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
GenerateTokenRequest requestParameters = new GenerateTokenRequest(); // GenerateTokenRequest | Generate token parameters
try {
    EmbedToken result = apiInstance.generateTokenForCreate(requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateTokenForCreate");
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

<a name="generateTokenForCreateInGroup"></a>
# **generateTokenForCreateInGroup**
> EmbedToken generateTokenForCreateInGroup(groupId, requestParameters)

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
    EmbedToken result = apiInstance.generateTokenForCreateInGroup(groupId, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateTokenForCreateInGroup");
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

<a name="generateTokenInGroup"></a>
# **generateTokenInGroup**
> EmbedToken generateTokenInGroup(groupId, reportKey, requestParameters)

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
    EmbedToken result = apiInstance.generateTokenInGroup(groupId, reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateTokenInGroup");
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

<a name="getDashboard"></a>
# **getDashboard**
> Dashboard getDashboard(dashboardKey)

Get the specified dashboard

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
try {
    Dashboard result = apiInstance.getDashboard(dashboardKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getDashboard");
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

<a name="getReport"></a>
# **getReport**
> Report getReport(reportKey)

Get the specified report

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportKey = "reportKey_example"; // String | The report id
try {
    Report result = apiInstance.getReport(reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReport");
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

<a name="getReportInGroup"></a>
# **getReportInGroup**
> Report getReportInGroup(groupId, reportKey)

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
    Report result = apiInstance.getReportInGroup(groupId, reportKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReportInGroup");
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

<a name="getReports"></a>
# **getReports**
> ODataResponseListReport getReports()

Gets a list of reports

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
try {
    ODataResponseListReport result = apiInstance.getReports();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReports");
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

<a name="getReportsInGroup"></a>
# **getReportsInGroup**
> ODataResponseListReport getReportsInGroup(groupId)

Gets a list of reports available within the specified group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String groupId = "groupId_example"; // String | The group id
try {
    ODataResponseListReport result = apiInstance.getReportsInGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReportsInGroup");
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

<a name="rebindReport"></a>
# **rebindReport**
> Object rebindReport(reportKey, requestParameters)

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
    Object result = apiInstance.rebindReport(reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#rebindReport");
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

<a name="rebindReportInGroup"></a>
# **rebindReportInGroup**
> Object rebindReportInGroup(groupId, reportKey, requestParameters)

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
    Object result = apiInstance.rebindReportInGroup(groupId, reportKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#rebindReportInGroup");
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

