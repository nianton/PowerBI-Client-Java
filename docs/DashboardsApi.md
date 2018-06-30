# DashboardsApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dashboardsAddDashboard**](DashboardsApi.md#dashboardsAddDashboard) | **POST** /v1.0/myorg/dashboards | Add a new empty dashboard
[**dashboardsAddDashboardInGroup**](DashboardsApi.md#dashboardsAddDashboardInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards | Add a new empty dashboard
[**dashboardsGenerateToken**](DashboardsApi.md#dashboardsGenerateToken) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/GenerateToken | Generate token to view the specified dashboard
[**dashboardsGenerateTokenInGroup**](DashboardsApi.md#dashboardsGenerateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/GenerateToken | Generate token to view the specified dashboard
[**dashboardsGetDashboards**](DashboardsApi.md#dashboardsGetDashboards) | **GET** /v1.0/myorg/dashboards | Gets a list of dashboards
[**dashboardsGetDashboardsInGroup**](DashboardsApi.md#dashboardsGetDashboardsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards | Gets a list of dashboards in a group


<a name="dashboardsAddDashboard"></a>
# **dashboardsAddDashboard**
> Dashboard dashboardsAddDashboard(requestParameters)

Add a new empty dashboard

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DashboardsApi;


DashboardsApi apiInstance = new DashboardsApi();
AddDashboardRequest requestParameters = new AddDashboardRequest(); // AddDashboardRequest | Add dashboard parameters
try {
    Dashboard result = apiInstance.dashboardsAddDashboard(requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardsAddDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestParameters** | [**AddDashboardRequest**](AddDashboardRequest.md)| Add dashboard parameters |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dashboardsAddDashboardInGroup"></a>
# **dashboardsAddDashboardInGroup**
> Dashboard dashboardsAddDashboardInGroup(groupId, requestParameters)

Add a new empty dashboard

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DashboardsApi;


DashboardsApi apiInstance = new DashboardsApi();
String groupId = "groupId_example"; // String | The group id
AddDashboardRequest requestParameters = new AddDashboardRequest(); // AddDashboardRequest | Add dashboard parameters
try {
    Dashboard result = apiInstance.dashboardsAddDashboardInGroup(groupId, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardsAddDashboardInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **requestParameters** | [**AddDashboardRequest**](AddDashboardRequest.md)| Add dashboard parameters |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dashboardsGenerateToken"></a>
# **dashboardsGenerateToken**
> EmbedToken dashboardsGenerateToken(dashboardKey, requestParameters)

Generate token to view the specified dashboard

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DashboardsApi;


DashboardsApi apiInstance = new DashboardsApi();
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
GenerateTokenRequest requestParameters = new GenerateTokenRequest(); // GenerateTokenRequest | Generate token parameters
try {
    EmbedToken result = apiInstance.dashboardsGenerateToken(dashboardKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardsGenerateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardKey** | **String**| The dashboard id |
 **requestParameters** | [**GenerateTokenRequest**](GenerateTokenRequest.md)| Generate token parameters |

### Return type

[**EmbedToken**](EmbedToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dashboardsGenerateTokenInGroup"></a>
# **dashboardsGenerateTokenInGroup**
> EmbedToken dashboardsGenerateTokenInGroup(groupId, dashboardKey, requestParameters)

Generate token to view the specified dashboard

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DashboardsApi;


DashboardsApi apiInstance = new DashboardsApi();
String groupId = "groupId_example"; // String | The group id
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
GenerateTokenRequest requestParameters = new GenerateTokenRequest(); // GenerateTokenRequest | Generate token parameters
try {
    EmbedToken result = apiInstance.dashboardsGenerateTokenInGroup(groupId, dashboardKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardsGenerateTokenInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **dashboardKey** | **String**| The dashboard id |
 **requestParameters** | [**GenerateTokenRequest**](GenerateTokenRequest.md)| Generate token parameters |

### Return type

[**EmbedToken**](EmbedToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dashboardsGetDashboards"></a>
# **dashboardsGetDashboards**
> ODataResponseListDashboard dashboardsGetDashboards()

Gets a list of dashboards

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DashboardsApi;


DashboardsApi apiInstance = new DashboardsApi();
try {
    ODataResponseListDashboard result = apiInstance.dashboardsGetDashboards();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardsGetDashboards");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ODataResponseListDashboard**](ODataResponseListDashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dashboardsGetDashboardsInGroup"></a>
# **dashboardsGetDashboardsInGroup**
> ODataResponseListDashboard dashboardsGetDashboardsInGroup(groupId)

Gets a list of dashboards in a group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DashboardsApi;


DashboardsApi apiInstance = new DashboardsApi();
String groupId = "groupId_example"; // String | The group id
try {
    ODataResponseListDashboard result = apiInstance.dashboardsGetDashboardsInGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardsGetDashboardsInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |

### Return type

[**ODataResponseListDashboard**](ODataResponseListDashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

