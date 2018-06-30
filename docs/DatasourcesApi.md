# DatasourcesApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gatewaysAddDatasourceUser**](DatasourcesApi.md#gatewaysAddDatasourceUser) | **POST** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users | Get a datasource user
[**gatewaysCreateDatasource**](DatasourcesApi.md#gatewaysCreateDatasource) | **POST** /v1.0/myorg/gateways/{gatewayId}/datasources | Create a datasource
[**gatewaysDeleteDatasource**](DatasourcesApi.md#gatewaysDeleteDatasource) | **DELETE** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Delete a datasource
[**gatewaysDeleteDatasourceUser**](DatasourcesApi.md#gatewaysDeleteDatasourceUser) | **DELETE** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users/{emailAdress} | Delete a datasource user
[**gatewaysGetDatasourceById**](DatasourcesApi.md#gatewaysGetDatasourceById) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Get a datasource by id
[**gatewaysGetDatasourceStatusById**](DatasourcesApi.md#gatewaysGetDatasourceStatusById) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/status | Get a datasource status by id
[**gatewaysGetDatasourceUsers**](DatasourcesApi.md#gatewaysGetDatasourceUsers) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users | Get a datasource users list
[**gatewaysGetDatasources**](DatasourcesApi.md#gatewaysGetDatasources) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources | Get all datasources of specific gateway
[**gatewaysUpdateDatasource**](DatasourcesApi.md#gatewaysUpdateDatasource) | **PATCH** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Update a datasource credentials


<a name="gatewaysAddDatasourceUser"></a>
# **gatewaysAddDatasourceUser**
> Object gatewaysAddDatasourceUser(gatewayId, datasourceId, addUserToDatasourceRequest)

Get a datasource user

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasourcesApi;


DatasourcesApi apiInstance = new DatasourcesApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
String datasourceId = "datasourceId_example"; // String | The datasource id
UserAccessRight addUserToDatasourceRequest = new UserAccessRight(); // UserAccessRight | The add user to datasource request
try {
    Object result = apiInstance.gatewaysAddDatasourceUser(gatewayId, datasourceId, addUserToDatasourceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#gatewaysAddDatasourceUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **String**| The gateway id |
 **datasourceId** | **String**| The datasource id |
 **addUserToDatasourceRequest** | [**UserAccessRight**](UserAccessRight.md)| The add user to datasource request |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="gatewaysCreateDatasource"></a>
# **gatewaysCreateDatasource**
> GatewayDatasource gatewaysCreateDatasource(gatewayId, datasourceToGatewayRequest)

Create a datasource

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasourcesApi;


DatasourcesApi apiInstance = new DatasourcesApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
PublishDatasourceToGatewayRequest datasourceToGatewayRequest = new PublishDatasourceToGatewayRequest(); // PublishDatasourceToGatewayRequest | The datasource requested to create
try {
    GatewayDatasource result = apiInstance.gatewaysCreateDatasource(gatewayId, datasourceToGatewayRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#gatewaysCreateDatasource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **String**| The gateway id |
 **datasourceToGatewayRequest** | [**PublishDatasourceToGatewayRequest**](PublishDatasourceToGatewayRequest.md)| The datasource requested to create |

### Return type

[**GatewayDatasource**](GatewayDatasource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gatewaysDeleteDatasource"></a>
# **gatewaysDeleteDatasource**
> Object gatewaysDeleteDatasource(gatewayId, datasourceId)

Delete a datasource

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasourcesApi;


DatasourcesApi apiInstance = new DatasourcesApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
String datasourceId = "datasourceId_example"; // String | The datasource id
try {
    Object result = apiInstance.gatewaysDeleteDatasource(gatewayId, datasourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#gatewaysDeleteDatasource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **String**| The gateway id |
 **datasourceId** | **String**| The datasource id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="gatewaysDeleteDatasourceUser"></a>
# **gatewaysDeleteDatasourceUser**
> Object gatewaysDeleteDatasourceUser(gatewayId, datasourceId, emailAdress)

Delete a datasource user

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasourcesApi;


DatasourcesApi apiInstance = new DatasourcesApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
String datasourceId = "datasourceId_example"; // String | The datasource id
String emailAdress = "emailAdress_example"; // String | The user's email address
try {
    Object result = apiInstance.gatewaysDeleteDatasourceUser(gatewayId, datasourceId, emailAdress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#gatewaysDeleteDatasourceUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **String**| The gateway id |
 **datasourceId** | **String**| The datasource id |
 **emailAdress** | **String**| The user&#39;s email address |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="gatewaysGetDatasourceById"></a>
# **gatewaysGetDatasourceById**
> GatewayDatasource gatewaysGetDatasourceById(gatewayId, datasourceId)

Get a datasource by id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasourcesApi;


DatasourcesApi apiInstance = new DatasourcesApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
String datasourceId = "datasourceId_example"; // String | The datasource id
try {
    GatewayDatasource result = apiInstance.gatewaysGetDatasourceById(gatewayId, datasourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#gatewaysGetDatasourceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **String**| The gateway id |
 **datasourceId** | **String**| The datasource id |

### Return type

[**GatewayDatasource**](GatewayDatasource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gatewaysGetDatasourceStatusById"></a>
# **gatewaysGetDatasourceStatusById**
> Object gatewaysGetDatasourceStatusById(gatewayId, datasourceId)

Get a datasource status by id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasourcesApi;


DatasourcesApi apiInstance = new DatasourcesApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
String datasourceId = "datasourceId_example"; // String | The datasource id
try {
    Object result = apiInstance.gatewaysGetDatasourceStatusById(gatewayId, datasourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#gatewaysGetDatasourceStatusById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **String**| The gateway id |
 **datasourceId** | **String**| The datasource id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gatewaysGetDatasourceUsers"></a>
# **gatewaysGetDatasourceUsers**
> ODataResponseListUserAccessRight gatewaysGetDatasourceUsers(gatewayId, datasourceId)

Get a datasource users list

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasourcesApi;


DatasourcesApi apiInstance = new DatasourcesApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
String datasourceId = "datasourceId_example"; // String | The datasource id
try {
    ODataResponseListUserAccessRight result = apiInstance.gatewaysGetDatasourceUsers(gatewayId, datasourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#gatewaysGetDatasourceUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **String**| The gateway id |
 **datasourceId** | **String**| The datasource id |

### Return type

[**ODataResponseListUserAccessRight**](ODataResponseListUserAccessRight.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gatewaysGetDatasources"></a>
# **gatewaysGetDatasources**
> ODataResponseListGatewayDatasource gatewaysGetDatasources(gatewayId)

Get all datasources of specific gateway

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasourcesApi;


DatasourcesApi apiInstance = new DatasourcesApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
try {
    ODataResponseListGatewayDatasource result = apiInstance.gatewaysGetDatasources(gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#gatewaysGetDatasources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **String**| The gateway id |

### Return type

[**ODataResponseListGatewayDatasource**](ODataResponseListGatewayDatasource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gatewaysUpdateDatasource"></a>
# **gatewaysUpdateDatasource**
> Object gatewaysUpdateDatasource(gatewayId, datasourceId, updateDatasourceRequest)

Update a datasource credentials

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasourcesApi;


DatasourcesApi apiInstance = new DatasourcesApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
String datasourceId = "datasourceId_example"; // String | The datasource id
UpdateDatasourceRequest updateDatasourceRequest = new UpdateDatasourceRequest(); // UpdateDatasourceRequest | The update datasource request
try {
    Object result = apiInstance.gatewaysUpdateDatasource(gatewayId, datasourceId, updateDatasourceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#gatewaysUpdateDatasource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **String**| The gateway id |
 **datasourceId** | **String**| The datasource id |
 **updateDatasourceRequest** | [**UpdateDatasourceRequest**](UpdateDatasourceRequest.md)| The update datasource request |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

