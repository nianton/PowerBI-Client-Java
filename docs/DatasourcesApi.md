# DatasourcesApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDatasourceUser**](DatasourcesApi.md#addDatasourceUser) | **POST** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users | Get a datasource user
[**createDatasource**](DatasourcesApi.md#createDatasource) | **POST** /v1.0/myorg/gateways/{gatewayId}/datasources | Create a datasource
[**deleteDatasource**](DatasourcesApi.md#deleteDatasource) | **DELETE** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Delete a datasource
[**deleteDatasourceUser**](DatasourcesApi.md#deleteDatasourceUser) | **DELETE** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users/{emailAdress} | Delete a datasource user
[**getDatasourceById**](DatasourcesApi.md#getDatasourceById) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Get a datasource by id
[**getDatasourceStatusById**](DatasourcesApi.md#getDatasourceStatusById) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/status | Get a datasource status by id
[**getDatasourceUsers**](DatasourcesApi.md#getDatasourceUsers) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users | Get a datasource users list
[**getDatasources**](DatasourcesApi.md#getDatasources) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources | Get all datasources of specific gateway
[**updateDatasource**](DatasourcesApi.md#updateDatasource) | **PATCH** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Update a datasource credentials


<a name="addDatasourceUser"></a>
# **addDatasourceUser**
> Object addDatasourceUser(gatewayId, datasourceId, addUserToDatasourceRequest)

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
    Object result = apiInstance.addDatasourceUser(gatewayId, datasourceId, addUserToDatasourceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#addDatasourceUser");
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

<a name="createDatasource"></a>
# **createDatasource**
> GatewayDatasource createDatasource(gatewayId, datasourceToGatewayRequest)

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
    GatewayDatasource result = apiInstance.createDatasource(gatewayId, datasourceToGatewayRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#createDatasource");
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

<a name="deleteDatasource"></a>
# **deleteDatasource**
> Object deleteDatasource(gatewayId, datasourceId)

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
    Object result = apiInstance.deleteDatasource(gatewayId, datasourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#deleteDatasource");
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

<a name="deleteDatasourceUser"></a>
# **deleteDatasourceUser**
> Object deleteDatasourceUser(gatewayId, datasourceId, emailAdress)

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
    Object result = apiInstance.deleteDatasourceUser(gatewayId, datasourceId, emailAdress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#deleteDatasourceUser");
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

<a name="getDatasourceById"></a>
# **getDatasourceById**
> GatewayDatasource getDatasourceById(gatewayId, datasourceId)

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
    GatewayDatasource result = apiInstance.getDatasourceById(gatewayId, datasourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#getDatasourceById");
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

<a name="getDatasourceStatusById"></a>
# **getDatasourceStatusById**
> Object getDatasourceStatusById(gatewayId, datasourceId)

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
    Object result = apiInstance.getDatasourceStatusById(gatewayId, datasourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#getDatasourceStatusById");
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

<a name="getDatasourceUsers"></a>
# **getDatasourceUsers**
> ODataResponseListUserAccessRight getDatasourceUsers(gatewayId, datasourceId)

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
    ODataResponseListUserAccessRight result = apiInstance.getDatasourceUsers(gatewayId, datasourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#getDatasourceUsers");
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

<a name="getDatasources"></a>
# **getDatasources**
> ODataResponseListGatewayDatasource getDatasources(gatewayId)

Get all datasources of specific gateway

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasourcesApi;


DatasourcesApi apiInstance = new DatasourcesApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
try {
    ODataResponseListGatewayDatasource result = apiInstance.getDatasources(gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#getDatasources");
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

<a name="updateDatasource"></a>
# **updateDatasource**
> Object updateDatasource(gatewayId, datasourceId, updateDatasourceRequest)

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
    Object result = apiInstance.updateDatasource(gatewayId, datasourceId, updateDatasourceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourcesApi#updateDatasource");
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

