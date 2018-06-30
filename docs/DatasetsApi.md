# DatasetsApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**datasetsBindToGateway**](DatasetsApi.md#datasetsBindToGateway) | **POST** /v1.0/myorg/datasets/{datasetKey}/Default.BindToGateway | Bind dataset to gateway
[**datasetsBindToGatewayInGroup**](DatasetsApi.md#datasetsBindToGatewayInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.BindToGateway | Bind dataset to gateway
[**datasetsDeleteDatasetById**](DatasetsApi.md#datasetsDeleteDatasetById) | **DELETE** /v1.0/myorg/datasets/{datasetKey} | Deletes the dataset with the specified id
[**datasetsDeleteDatasetByIdInGroup**](DatasetsApi.md#datasetsDeleteDatasetByIdInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey} | Deletes the dataset with the specified id
[**datasetsDeleteRows**](DatasetsApi.md#datasetsDeleteRows) | **DELETE** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName}/rows | Deletes all rows from the specified table
[**datasetsDeleteRowsInGroup**](DatasetsApi.md#datasetsDeleteRowsInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName}/rows | Deletes all rows from the specified table
[**datasetsGenerateTokenInGroup**](DatasetsApi.md#datasetsGenerateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/GenerateToken | Generate token to view the specified dataset
[**datasetsGetDatasetById**](DatasetsApi.md#datasetsGetDatasetById) | **GET** /v1.0/myorg/datasets/{datasetKey} | Gets the dataset metadata for the specifeid dataset id
[**datasetsGetDatasetByIdInGroup**](DatasetsApi.md#datasetsGetDatasetByIdInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey} | Gets the dataset metadata for the specifeid dataset id
[**datasetsGetDatasets**](DatasetsApi.md#datasetsGetDatasets) | **GET** /v1.0/myorg/datasets | Returns the datasets
[**datasetsGetDatasetsInGroup**](DatasetsApi.md#datasetsGetDatasetsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets | Returns the datasets
[**datasetsGetDatasources**](DatasetsApi.md#datasetsGetDatasources) | **GET** /v1.0/myorg/datasets/{datasetKey}/datasources | Gets a list of datasource for the specified dataset
[**datasetsGetDatasourcesInGroup**](DatasetsApi.md#datasetsGetDatasourcesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/datasources | Gets a list of datasource for the specified dataset
[**datasetsGetGatewayDatasources**](DatasetsApi.md#datasetsGetGatewayDatasources) | **GET** /v1.0/myorg/datasets/{datasetKey}/Default.GetBoundGatewayDatasources | Gets a list of bound gateway datasources for the specified dataset
[**datasetsGetGatewayDatasourcesInGroup**](DatasetsApi.md#datasetsGetGatewayDatasourcesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.GetBoundGatewayDatasources | Gets a list of bound gateway datasources for the specified dataset
[**datasetsGetRefreshHistory**](DatasetsApi.md#datasetsGetRefreshHistory) | **GET** /v1.0/myorg/datasets/{datasetKey}/refreshes | Gets the dataset refresh history
[**datasetsGetRefreshHistoryInGroup**](DatasetsApi.md#datasetsGetRefreshHistoryInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/refreshes | Gets the dataset refresh history
[**datasetsGetTables**](DatasetsApi.md#datasetsGetTables) | **GET** /v1.0/myorg/datasets/{datasetKey}/tables | Gets all tables within the specified dataset
[**datasetsGetTablesInGroup**](DatasetsApi.md#datasetsGetTablesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables | Gets all tables within the specified dataset
[**datasetsPostDataset**](DatasetsApi.md#datasetsPostDataset) | **POST** /v1.0/myorg/datasets | Post a new entity to datasets
[**datasetsPostDatasetInGroup**](DatasetsApi.md#datasetsPostDatasetInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets | Post a new entity to datasets
[**datasetsPostRows**](DatasetsApi.md#datasetsPostRows) | **POST** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName}/rows | Posts new data rows into the specified table
[**datasetsPostRowsInGroup**](DatasetsApi.md#datasetsPostRowsInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName}/rows | Posts new data rows into the specified table
[**datasetsPutTable**](DatasetsApi.md#datasetsPutTable) | **PUT** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName} | Updates a schema and metadata for the specified table
[**datasetsPutTableInGroup**](DatasetsApi.md#datasetsPutTableInGroup) | **PUT** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName} | Updates a schema and metadata for the specified table
[**datasetsRefreshDataset**](DatasetsApi.md#datasetsRefreshDataset) | **POST** /v1.0/myorg/datasets/{datasetKey}/refreshes | Start a dataset refresh
[**datasetsRefreshDatasetInGroup**](DatasetsApi.md#datasetsRefreshDatasetInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/refreshes | Start a dataset refresh
[**datasetsSetAllDatasetConnections**](DatasetsApi.md#datasetsSetAllDatasetConnections) | **POST** /v1.0/myorg/datasets/{datasetKey}/Default.SetAllConnections | Sets all connections for the specified dataset
[**datasetsSetAllDatasetConnectionsInGroup**](DatasetsApi.md#datasetsSetAllDatasetConnectionsInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.SetAllConnections | Sets all connections for the specified dataset
[**datasetsTakeOverInGroup**](DatasetsApi.md#datasetsTakeOverInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.TakeOver | Take Over a dataset


<a name="datasetsBindToGateway"></a>
# **datasetsBindToGateway**
> Object datasetsBindToGateway(datasetKey, bindToGatewayRequest)

Bind dataset to gateway

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
BindToGatewayRequest bindToGatewayRequest = new BindToGatewayRequest(); // BindToGatewayRequest | The bind to gateway request
try {
    Object result = apiInstance.datasetsBindToGateway(datasetKey, bindToGatewayRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsBindToGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**| The dataset id |
 **bindToGatewayRequest** | [**BindToGatewayRequest**](BindToGatewayRequest.md)| The bind to gateway request |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="datasetsBindToGatewayInGroup"></a>
# **datasetsBindToGatewayInGroup**
> Object datasetsBindToGatewayInGroup(groupId, datasetKey, bindToGatewayRequest)

Bind dataset to gateway

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
BindToGatewayRequest bindToGatewayRequest = new BindToGatewayRequest(); // BindToGatewayRequest | The bind to gateway request
try {
    Object result = apiInstance.datasetsBindToGatewayInGroup(groupId, datasetKey, bindToGatewayRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsBindToGatewayInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |
 **bindToGatewayRequest** | [**BindToGatewayRequest**](BindToGatewayRequest.md)| The bind to gateway request |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="datasetsDeleteDatasetById"></a>
# **datasetsDeleteDatasetById**
> Object datasetsDeleteDatasetById(datasetKey)

Deletes the dataset with the specified id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    Object result = apiInstance.datasetsDeleteDatasetById(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsDeleteDatasetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**| The dataset id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="datasetsDeleteDatasetByIdInGroup"></a>
# **datasetsDeleteDatasetByIdInGroup**
> Object datasetsDeleteDatasetByIdInGroup(groupId, datasetKey)

Deletes the dataset with the specified id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    Object result = apiInstance.datasetsDeleteDatasetByIdInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsDeleteDatasetByIdInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="datasetsDeleteRows"></a>
# **datasetsDeleteRows**
> Object datasetsDeleteRows(datasetKey, tableName)

Deletes all rows from the specified table

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
String tableName = "tableName_example"; // String | The table name
try {
    Object result = apiInstance.datasetsDeleteRows(datasetKey, tableName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsDeleteRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**| The dataset id |
 **tableName** | **String**| The table name |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="datasetsDeleteRowsInGroup"></a>
# **datasetsDeleteRowsInGroup**
> Object datasetsDeleteRowsInGroup(groupId, datasetKey, tableName)

Deletes all rows from the specified table

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
String tableName = "tableName_example"; // String | The table name
try {
    Object result = apiInstance.datasetsDeleteRowsInGroup(groupId, datasetKey, tableName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsDeleteRowsInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |
 **tableName** | **String**| The table name |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="datasetsGenerateTokenInGroup"></a>
# **datasetsGenerateTokenInGroup**
> EmbedToken datasetsGenerateTokenInGroup(groupId, datasetKey, requestParameters)

Generate token to view the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
GenerateTokenRequest requestParameters = new GenerateTokenRequest(); // GenerateTokenRequest | Generate token parameters
try {
    EmbedToken result = apiInstance.datasetsGenerateTokenInGroup(groupId, datasetKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGenerateTokenInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |
 **requestParameters** | [**GenerateTokenRequest**](GenerateTokenRequest.md)| Generate token parameters |

### Return type

[**EmbedToken**](EmbedToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datasetsGetDatasetById"></a>
# **datasetsGetDatasetById**
> Dataset datasetsGetDatasetById(datasetKey)

Gets the dataset metadata for the specifeid dataset id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    Dataset result = apiInstance.datasetsGetDatasetById(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetDatasetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**| The dataset id |

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsGetDatasetByIdInGroup"></a>
# **datasetsGetDatasetByIdInGroup**
> Dataset datasetsGetDatasetByIdInGroup(groupId, datasetKey)

Gets the dataset metadata for the specifeid dataset id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    Dataset result = apiInstance.datasetsGetDatasetByIdInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetDatasetByIdInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsGetDatasets"></a>
# **datasetsGetDatasets**
> ODataResponseListDataset datasetsGetDatasets()

Returns the datasets

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
try {
    ODataResponseListDataset result = apiInstance.datasetsGetDatasets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetDatasets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ODataResponseListDataset**](ODataResponseListDataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsGetDatasetsInGroup"></a>
# **datasetsGetDatasetsInGroup**
> ODataResponseListDataset datasetsGetDatasetsInGroup(groupId)

Returns the datasets

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
try {
    ODataResponseListDataset result = apiInstance.datasetsGetDatasetsInGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetDatasetsInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |

### Return type

[**ODataResponseListDataset**](ODataResponseListDataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsGetDatasources"></a>
# **datasetsGetDatasources**
> ODataResponseListDatasource datasetsGetDatasources(datasetKey)

Gets a list of datasource for the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | 
try {
    ODataResponseListDatasource result = apiInstance.datasetsGetDatasources(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetDatasources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**|  |

### Return type

[**ODataResponseListDatasource**](ODataResponseListDatasource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsGetDatasourcesInGroup"></a>
# **datasetsGetDatasourcesInGroup**
> ODataResponseListDatasource datasetsGetDatasourcesInGroup(groupId, datasetKey)

Gets a list of datasource for the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | 
try {
    ODataResponseListDatasource result = apiInstance.datasetsGetDatasourcesInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetDatasourcesInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**|  |

### Return type

[**ODataResponseListDatasource**](ODataResponseListDatasource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsGetGatewayDatasources"></a>
# **datasetsGetGatewayDatasources**
> ODataResponseListGatewayDatasource datasetsGetGatewayDatasources(datasetKey)

Gets a list of bound gateway datasources for the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    ODataResponseListGatewayDatasource result = apiInstance.datasetsGetGatewayDatasources(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetGatewayDatasources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**| The dataset id |

### Return type

[**ODataResponseListGatewayDatasource**](ODataResponseListGatewayDatasource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsGetGatewayDatasourcesInGroup"></a>
# **datasetsGetGatewayDatasourcesInGroup**
> ODataResponseListGatewayDatasource datasetsGetGatewayDatasourcesInGroup(groupId, datasetKey)

Gets a list of bound gateway datasources for the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    ODataResponseListGatewayDatasource result = apiInstance.datasetsGetGatewayDatasourcesInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetGatewayDatasourcesInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |

### Return type

[**ODataResponseListGatewayDatasource**](ODataResponseListGatewayDatasource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsGetRefreshHistory"></a>
# **datasetsGetRefreshHistory**
> ODataResponseListRefresh datasetsGetRefreshHistory(datasetKey, top)

Gets the dataset refresh history

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
Integer top = 56; // Integer | The requested number of entries in the refresh history, if not supported the default is all available entries
try {
    ODataResponseListRefresh result = apiInstance.datasetsGetRefreshHistory(datasetKey, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetRefreshHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**| The dataset id |
 **top** | **Integer**| The requested number of entries in the refresh history, if not supported the default is all available entries | [optional]

### Return type

[**ODataResponseListRefresh**](ODataResponseListRefresh.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsGetRefreshHistoryInGroup"></a>
# **datasetsGetRefreshHistoryInGroup**
> ODataResponseListRefresh datasetsGetRefreshHistoryInGroup(groupId, datasetKey, top)

Gets the dataset refresh history

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
Integer top = 56; // Integer | The requested number of entries in the refresh history, if not supported the default is all available entries
try {
    ODataResponseListRefresh result = apiInstance.datasetsGetRefreshHistoryInGroup(groupId, datasetKey, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetRefreshHistoryInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |
 **top** | **Integer**| The requested number of entries in the refresh history, if not supported the default is all available entries | [optional]

### Return type

[**ODataResponseListRefresh**](ODataResponseListRefresh.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsGetTables"></a>
# **datasetsGetTables**
> ODataResponseListTable datasetsGetTables(datasetKey)

Gets all tables within the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    ODataResponseListTable result = apiInstance.datasetsGetTables(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetTables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**| The dataset id |

### Return type

[**ODataResponseListTable**](ODataResponseListTable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsGetTablesInGroup"></a>
# **datasetsGetTablesInGroup**
> ODataResponseListTable datasetsGetTablesInGroup(groupId, datasetKey)

Gets all tables within the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    ODataResponseListTable result = apiInstance.datasetsGetTablesInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsGetTablesInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |

### Return type

[**ODataResponseListTable**](ODataResponseListTable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetsPostDataset"></a>
# **datasetsPostDataset**
> Dataset datasetsPostDataset(dataset)

Post a new entity to datasets

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
Dataset dataset = new Dataset(); // Dataset | Create dataset parameters
try {
    Dataset result = apiInstance.datasetsPostDataset(dataset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsPostDataset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset** | [**Dataset**](Dataset.md)| Create dataset parameters |

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datasetsPostDatasetInGroup"></a>
# **datasetsPostDatasetInGroup**
> Dataset datasetsPostDatasetInGroup(groupId, dataset)

Post a new entity to datasets

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
Dataset dataset = new Dataset(); // Dataset | Create dataset parameters
try {
    Dataset result = apiInstance.datasetsPostDatasetInGroup(groupId, dataset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsPostDatasetInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **dataset** | [**Dataset**](Dataset.md)| Create dataset parameters |

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datasetsPostRows"></a>
# **datasetsPostRows**
> Object datasetsPostRows(datasetKey, tableName, requestMessage)

Posts new data rows into the specified table

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
String tableName = "tableName_example"; // String | The table name
Object requestMessage = null; // Object | The request message
try {
    Object result = apiInstance.datasetsPostRows(datasetKey, tableName, requestMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsPostRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**| The dataset id |
 **tableName** | **String**| The table name |
 **requestMessage** | [**Object**](Object.md)| The request message |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="datasetsPostRowsInGroup"></a>
# **datasetsPostRowsInGroup**
> Object datasetsPostRowsInGroup(groupId, datasetKey, tableName, requestMessage)

Posts new data rows into the specified table

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
String tableName = "tableName_example"; // String | The table name
Object requestMessage = null; // Object | The request message
try {
    Object result = apiInstance.datasetsPostRowsInGroup(groupId, datasetKey, tableName, requestMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsPostRowsInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |
 **tableName** | **String**| The table name |
 **requestMessage** | [**Object**](Object.md)| The request message |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="datasetsPutTable"></a>
# **datasetsPutTable**
> Object datasetsPutTable(datasetKey, tableName, requestMessage)

Updates a schema and metadata for the specified table

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
String tableName = "tableName_example"; // String | The table name
Object requestMessage = null; // Object | The request message
try {
    Object result = apiInstance.datasetsPutTable(datasetKey, tableName, requestMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsPutTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**| The dataset id |
 **tableName** | **String**| The table name |
 **requestMessage** | [**Object**](Object.md)| The request message |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="datasetsPutTableInGroup"></a>
# **datasetsPutTableInGroup**
> Object datasetsPutTableInGroup(groupId, datasetKey, tableName, requestMessage)

Updates a schema and metadata for the specified table

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
String tableName = "tableName_example"; // String | The table name
Object requestMessage = null; // Object | The request message
try {
    Object result = apiInstance.datasetsPutTableInGroup(groupId, datasetKey, tableName, requestMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsPutTableInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |
 **tableName** | **String**| The table name |
 **requestMessage** | [**Object**](Object.md)| The request message |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="datasetsRefreshDataset"></a>
# **datasetsRefreshDataset**
> Object datasetsRefreshDataset(datasetKey)

Start a dataset refresh

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    Object result = apiInstance.datasetsRefreshDataset(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsRefreshDataset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**| The dataset id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="datasetsRefreshDatasetInGroup"></a>
# **datasetsRefreshDatasetInGroup**
> Object datasetsRefreshDatasetInGroup(groupId, datasetKey)

Start a dataset refresh

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    Object result = apiInstance.datasetsRefreshDatasetInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsRefreshDatasetInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="datasetsSetAllDatasetConnections"></a>
# **datasetsSetAllDatasetConnections**
> Object datasetsSetAllDatasetConnections(datasetKey, parameters)

Sets all connections for the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
ConnectionDetails parameters = new ConnectionDetails(); // ConnectionDetails | The body
try {
    Object result = apiInstance.datasetsSetAllDatasetConnections(datasetKey, parameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsSetAllDatasetConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetKey** | **String**| The dataset id |
 **parameters** | [**ConnectionDetails**](ConnectionDetails.md)| The body |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="datasetsSetAllDatasetConnectionsInGroup"></a>
# **datasetsSetAllDatasetConnectionsInGroup**
> Object datasetsSetAllDatasetConnectionsInGroup(groupId, datasetKey, parameters)

Sets all connections for the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
ConnectionDetails parameters = new ConnectionDetails(); // ConnectionDetails | The body
try {
    Object result = apiInstance.datasetsSetAllDatasetConnectionsInGroup(groupId, datasetKey, parameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsSetAllDatasetConnectionsInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |
 **parameters** | [**ConnectionDetails**](ConnectionDetails.md)| The body |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="datasetsTakeOverInGroup"></a>
# **datasetsTakeOverInGroup**
> Object datasetsTakeOverInGroup(groupId, datasetKey)

Take Over a dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    Object result = apiInstance.datasetsTakeOverInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetsTakeOverInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetKey** | **String**| The dataset id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

