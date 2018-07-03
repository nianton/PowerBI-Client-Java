# TilesApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneTile**](TilesApi.md#cloneTile) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey}/Clone | Clones the specified tile
[**cloneTileInGroup**](TilesApi.md#cloneTileInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey}/Clone | Clones the specified tile
[**generateToken**](TilesApi.md#generateToken) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey}/GenerateToken | Generate token to view the specified tile
[**generateTokenInGroup**](TilesApi.md#generateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey}/GenerateToken | Generate token to view the specified tile
[**getTile**](TilesApi.md#getTile) | **GET** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey} | Get a specified tile in a specified dashboard
[**getTileInGroup**](TilesApi.md#getTileInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey} | Get a specified tile in a specified dashboard in a group
[**getTiles**](TilesApi.md#getTiles) | **GET** /v1.0/myorg/dashboards/{dashboardKey}/tiles | Get tiles in the specified dashboard
[**getTilesInGroup**](TilesApi.md#getTilesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles | Get tiles in the specified dashboard in a group


<a name="cloneTile"></a>
# **cloneTile**
> Tile cloneTile(dashboardKey, tileKey, requestParameters)

Clones the specified tile

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.TilesApi;


TilesApi apiInstance = new TilesApi();
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
String tileKey = "tileKey_example"; // String | The tile id
CloneTileRequest requestParameters = new CloneTileRequest(); // CloneTileRequest | Clone tile parameters
try {
    Tile result = apiInstance.cloneTile(dashboardKey, tileKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#cloneTile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardKey** | **String**| The dashboard id |
 **tileKey** | **String**| The tile id |
 **requestParameters** | [**CloneTileRequest**](CloneTileRequest.md)| Clone tile parameters |

### Return type

[**Tile**](Tile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloneTileInGroup"></a>
# **cloneTileInGroup**
> Tile cloneTileInGroup(groupId, dashboardKey, tileKey, requestParameters)

Clones the specified tile

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.TilesApi;


TilesApi apiInstance = new TilesApi();
String groupId = "groupId_example"; // String | The group id
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
String tileKey = "tileKey_example"; // String | The tile id
CloneTileRequest requestParameters = new CloneTileRequest(); // CloneTileRequest | Clone tile parameters
try {
    Tile result = apiInstance.cloneTileInGroup(groupId, dashboardKey, tileKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#cloneTileInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **dashboardKey** | **String**| The dashboard id |
 **tileKey** | **String**| The tile id |
 **requestParameters** | [**CloneTileRequest**](CloneTileRequest.md)| Clone tile parameters |

### Return type

[**Tile**](Tile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="generateToken"></a>
# **generateToken**
> EmbedToken generateToken(dashboardKey, tileKey, requestParameters)

Generate token to view the specified tile

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.TilesApi;


TilesApi apiInstance = new TilesApi();
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
String tileKey = "tileKey_example"; // String | The tile id
GenerateTokenRequest requestParameters = new GenerateTokenRequest(); // GenerateTokenRequest | Generate token parameters
try {
    EmbedToken result = apiInstance.generateToken(dashboardKey, tileKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#generateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardKey** | **String**| The dashboard id |
 **tileKey** | **String**| The tile id |
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
> EmbedToken generateTokenInGroup(groupId, dashboardKey, tileKey, requestParameters)

Generate token to view the specified tile

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.TilesApi;


TilesApi apiInstance = new TilesApi();
String groupId = "groupId_example"; // String | The group id
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
String tileKey = "tileKey_example"; // String | The tile id
GenerateTokenRequest requestParameters = new GenerateTokenRequest(); // GenerateTokenRequest | Generate token parameters
try {
    EmbedToken result = apiInstance.generateTokenInGroup(groupId, dashboardKey, tileKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#generateTokenInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **dashboardKey** | **String**| The dashboard id |
 **tileKey** | **String**| The tile id |
 **requestParameters** | [**GenerateTokenRequest**](GenerateTokenRequest.md)| Generate token parameters |

### Return type

[**EmbedToken**](EmbedToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTile"></a>
# **getTile**
> Tile getTile(dashboardKey, tileKey)

Get a specified tile in a specified dashboard

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.TilesApi;


TilesApi apiInstance = new TilesApi();
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
String tileKey = "tileKey_example"; // String | The tile id
try {
    Tile result = apiInstance.getTile(dashboardKey, tileKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#getTile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardKey** | **String**| The dashboard id |
 **tileKey** | **String**| The tile id |

### Return type

[**Tile**](Tile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTileInGroup"></a>
# **getTileInGroup**
> Tile getTileInGroup(groupId, dashboardKey, tileKey)

Get a specified tile in a specified dashboard in a group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.TilesApi;


TilesApi apiInstance = new TilesApi();
String groupId = "groupId_example"; // String | The group id
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
String tileKey = "tileKey_example"; // String | The tile id
try {
    Tile result = apiInstance.getTileInGroup(groupId, dashboardKey, tileKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#getTileInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **dashboardKey** | **String**| The dashboard id |
 **tileKey** | **String**| The tile id |

### Return type

[**Tile**](Tile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTiles"></a>
# **getTiles**
> ODataResponseListTile getTiles(dashboardKey)

Get tiles in the specified dashboard

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.TilesApi;


TilesApi apiInstance = new TilesApi();
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
try {
    ODataResponseListTile result = apiInstance.getTiles(dashboardKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#getTiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardKey** | **String**| The dashboard id |

### Return type

[**ODataResponseListTile**](ODataResponseListTile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTilesInGroup"></a>
# **getTilesInGroup**
> ODataResponseListTile getTilesInGroup(groupId, dashboardKey)

Get tiles in the specified dashboard in a group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.TilesApi;


TilesApi apiInstance = new TilesApi();
String groupId = "groupId_example"; // String | The group id
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
try {
    ODataResponseListTile result = apiInstance.getTilesInGroup(groupId, dashboardKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#getTilesInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **dashboardKey** | **String**| The dashboard id |

### Return type

[**ODataResponseListTile**](ODataResponseListTile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

