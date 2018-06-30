# TilesApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dashboardsCloneTile**](TilesApi.md#dashboardsCloneTile) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey}/Clone | Clones the specified tile
[**dashboardsCloneTileInGroup**](TilesApi.md#dashboardsCloneTileInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey}/Clone | Clones the specified tile
[**dashboardsGetTile**](TilesApi.md#dashboardsGetTile) | **GET** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey} | Get a specified tile in a specified dashboard
[**dashboardsGetTileInGroup**](TilesApi.md#dashboardsGetTileInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey} | Get a specified tile in a specified dashboard in a group
[**dashboardsGetTiles**](TilesApi.md#dashboardsGetTiles) | **GET** /v1.0/myorg/dashboards/{dashboardKey}/tiles | Get tiles in the specified dashboard
[**dashboardsGetTilesInGroup**](TilesApi.md#dashboardsGetTilesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles | Get tiles in the specified dashboard in a group
[**tilesGenerateToken**](TilesApi.md#tilesGenerateToken) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey}/GenerateToken | Generate token to view the specified tile
[**tilesGenerateTokenInGroup**](TilesApi.md#tilesGenerateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey}/GenerateToken | Generate token to view the specified tile


<a name="dashboardsCloneTile"></a>
# **dashboardsCloneTile**
> Tile dashboardsCloneTile(dashboardKey, tileKey, requestParameters)

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
    Tile result = apiInstance.dashboardsCloneTile(dashboardKey, tileKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#dashboardsCloneTile");
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

<a name="dashboardsCloneTileInGroup"></a>
# **dashboardsCloneTileInGroup**
> Tile dashboardsCloneTileInGroup(groupId, dashboardKey, tileKey, requestParameters)

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
    Tile result = apiInstance.dashboardsCloneTileInGroup(groupId, dashboardKey, tileKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#dashboardsCloneTileInGroup");
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

<a name="dashboardsGetTile"></a>
# **dashboardsGetTile**
> Tile dashboardsGetTile(dashboardKey, tileKey)

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
    Tile result = apiInstance.dashboardsGetTile(dashboardKey, tileKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#dashboardsGetTile");
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

<a name="dashboardsGetTileInGroup"></a>
# **dashboardsGetTileInGroup**
> Tile dashboardsGetTileInGroup(groupId, dashboardKey, tileKey)

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
    Tile result = apiInstance.dashboardsGetTileInGroup(groupId, dashboardKey, tileKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#dashboardsGetTileInGroup");
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

<a name="dashboardsGetTiles"></a>
# **dashboardsGetTiles**
> ODataResponseListTile dashboardsGetTiles(dashboardKey)

Get tiles in the specified dashboard

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.TilesApi;


TilesApi apiInstance = new TilesApi();
String dashboardKey = "dashboardKey_example"; // String | The dashboard id
try {
    ODataResponseListTile result = apiInstance.dashboardsGetTiles(dashboardKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#dashboardsGetTiles");
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

<a name="dashboardsGetTilesInGroup"></a>
# **dashboardsGetTilesInGroup**
> ODataResponseListTile dashboardsGetTilesInGroup(groupId, dashboardKey)

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
    ODataResponseListTile result = apiInstance.dashboardsGetTilesInGroup(groupId, dashboardKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#dashboardsGetTilesInGroup");
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

<a name="tilesGenerateToken"></a>
# **tilesGenerateToken**
> EmbedToken tilesGenerateToken(dashboardKey, tileKey, requestParameters)

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
    EmbedToken result = apiInstance.tilesGenerateToken(dashboardKey, tileKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#tilesGenerateToken");
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

<a name="tilesGenerateTokenInGroup"></a>
# **tilesGenerateTokenInGroup**
> EmbedToken tilesGenerateTokenInGroup(groupId, dashboardKey, tileKey, requestParameters)

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
    EmbedToken result = apiInstance.tilesGenerateTokenInGroup(groupId, dashboardKey, tileKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#tilesGenerateTokenInGroup");
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

