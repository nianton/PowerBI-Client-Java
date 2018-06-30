# GatewaysApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gatewaysGetGatewayById**](GatewaysApi.md#gatewaysGetGatewayById) | **GET** /v1.0/myorg/gateways/{gatewayId} | Returns the specified gateway
[**gatewaysGetGateways**](GatewaysApi.md#gatewaysGetGateways) | **GET** /v1.0/myorg/gateways | Returns a list of gateways


<a name="gatewaysGetGatewayById"></a>
# **gatewaysGetGatewayById**
> Gateway gatewaysGetGatewayById(gatewayId)

Returns the specified gateway

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GatewaysApi;


GatewaysApi apiInstance = new GatewaysApi();
String gatewayId = "gatewayId_example"; // String | The gateway id
try {
    Gateway result = apiInstance.gatewaysGetGatewayById(gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GatewaysApi#gatewaysGetGatewayById");
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

<a name="gatewaysGetGateways"></a>
# **gatewaysGetGateways**
> ODataResponseListGateway gatewaysGetGateways()

Returns a list of gateways

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GatewaysApi;


GatewaysApi apiInstance = new GatewaysApi();
try {
    ODataResponseListGateway result = apiInstance.gatewaysGetGateways();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GatewaysApi#gatewaysGetGateways");
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

