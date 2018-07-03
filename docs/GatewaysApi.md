# GatewaysApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGatewayById**](GatewaysApi.md#getGatewayById) | **GET** /v1.0/myorg/gateways/{gatewayId} | Returns the specified gateway
[**getGateways**](GatewaysApi.md#getGateways) | **GET** /v1.0/myorg/gateways | Returns a list of gateways


<a name="getGatewayById"></a>
# **getGatewayById**
> Gateway getGatewayById(gatewayId)

Returns the specified gateway

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GatewaysApi;


GatewaysApi apiInstance = new GatewaysApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
try {
    Gateway result = apiInstance.getGatewayById(gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GatewaysApi#getGatewayById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **String**| The gateway id |

### Return type

[**Gateway**](Gateway.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGateways"></a>
# **getGateways**
> ODataResponseListGateway getGateways()

Returns a list of gateways

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GatewaysApi;


GatewaysApi apiInstance = new GatewaysApi();
try {
    ODataResponseListGateway result = apiInstance.getGateways();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GatewaysApi#getGateways");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ODataResponseListGateway**](ODataResponseListGateway.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

