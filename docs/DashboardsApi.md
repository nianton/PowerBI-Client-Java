# DashboardsApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDashboard**](DashboardsApi.md#addDashboard) | **POST** /v1.0/myorg/dashboards | Add a new empty dashboard
[**addDashboardInGroup**](DashboardsApi.md#addDashboardInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards | Add a new empty dashboard
[**generateToken**](DashboardsApi.md#generateToken) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/GenerateToken | Generate token to view the specified dashboard
[**generateTokenInGroup**](DashboardsApi.md#generateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/GenerateToken | Generate token to view the specified dashboard
[**getDashboards**](DashboardsApi.md#getDashboards) | **GET** /v1.0/myorg/dashboards | Gets a list of dashboards
[**getDashboardsInGroup**](DashboardsApi.md#getDashboardsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards | Gets a list of dashboards in a group


<a name="addDashboard"></a>
# **addDashboard**
> Dashboard addDashboard(requestParameters)

Add a new empty dashboard

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DashboardsApi;


DashboardsApi apiInstance = new DashboardsApi();
AddDashboardRequest requestParameters = new AddDashboardRequest(); // AddDashboardRequest | Add dashboard parameters
try {
    Dashboard result = apiInstance.addDashboard(requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#addDashboard");
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

<a name="addDashboardInGroup"></a>
# **addDashboardInGroup**
> Dashboard addDashboardInGroup(groupId, requestParameters)

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
    Dashboard result = apiInstance.addDashboardInGroup(groupId, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#addDashboardInGroup");
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

<a name="generateToken"></a>
# **generateToken**
> EmbedToken generateToken(dashboardKey, requestParameters)

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
    EmbedToken result = apiInstance.generateToken(dashboardKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#generateToken");
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

<a name="generateTokenInGroup"></a>
# **generateTokenInGroup**
> EmbedToken generateTokenInGroup(groupId, dashboardKey, requestParameters)

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
    EmbedToken result = apiInstance.generateTokenInGroup(groupId, dashboardKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#generateTokenInGroup");
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

<a name="getDashboards"></a>
# **getDashboards**
> ODataResponseListDashboard getDashboards()

Gets a list of dashboards

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DashboardsApi;


DashboardsApi apiInstance = new DashboardsApi();
try {
    ODataResponseListDashboard result = apiInstance.getDashboards();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#getDashboards");
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

<a name="getDashboardsInGroup"></a>
# **getDashboardsInGroup**
> ODataResponseListDashboard getDashboardsInGroup(groupId)

Gets a list of dashboards in a group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DashboardsApi;


DashboardsApi apiInstance = new DashboardsApi();
String groupId = "groupId_example"; // String | The group id
try {
    ODataResponseListDashboard result = apiInstance.getDashboardsInGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#getDashboardsInGroup");
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

