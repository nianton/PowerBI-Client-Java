# DatasetsApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bindToGateway**](DatasetsApi.md#bindToGateway) | **POST** /v1.0/myorg/datasets/{datasetKey}/Default.BindToGateway | Bind dataset to gateway
[**bindToGatewayInGroup**](DatasetsApi.md#bindToGatewayInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.BindToGateway | Bind dataset to gateway
[**deleteDatasetById**](DatasetsApi.md#deleteDatasetById) | **DELETE** /v1.0/myorg/datasets/{datasetKey} | Deletes the dataset with the specified id
[**deleteDatasetByIdInGroup**](DatasetsApi.md#deleteDatasetByIdInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey} | Deletes the dataset with the specified id
[**deleteRows**](DatasetsApi.md#deleteRows) | **DELETE** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName}/rows | Deletes all rows from the specified table
[**deleteRowsInGroup**](DatasetsApi.md#deleteRowsInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName}/rows | Deletes all rows from the specified table
[**generateTokenInGroup**](DatasetsApi.md#generateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/GenerateToken | Generate token to view the specified dataset
[**getDatasetById**](DatasetsApi.md#getDatasetById) | **GET** /v1.0/myorg/datasets/{datasetKey} | Gets the dataset metadata for the specifeid dataset id
[**getDatasetByIdInGroup**](DatasetsApi.md#getDatasetByIdInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey} | Gets the dataset metadata for the specifeid dataset id
[**getDatasets**](DatasetsApi.md#getDatasets) | **GET** /v1.0/myorg/datasets | Returns the datasets
[**getDatasetsInGroup**](DatasetsApi.md#getDatasetsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets | Returns the datasets
[**getDatasources**](DatasetsApi.md#getDatasources) | **GET** /v1.0/myorg/datasets/{datasetKey}/datasources | Gets a list of datasource for the specified dataset
[**getDatasourcesInGroup**](DatasetsApi.md#getDatasourcesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/datasources | Gets a list of datasource for the specified dataset
[**getGatewayDatasources**](DatasetsApi.md#getGatewayDatasources) | **GET** /v1.0/myorg/datasets/{datasetKey}/Default.GetBoundGatewayDatasources | Gets a list of bound gateway datasources for the specified dataset
[**getGatewayDatasourcesInGroup**](DatasetsApi.md#getGatewayDatasourcesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.GetBoundGatewayDatasources | Gets a list of bound gateway datasources for the specified dataset
[**getRefreshHistory**](DatasetsApi.md#getRefreshHistory) | **GET** /v1.0/myorg/datasets/{datasetKey}/refreshes | Gets the dataset refresh history
[**getRefreshHistoryInGroup**](DatasetsApi.md#getRefreshHistoryInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/refreshes | Gets the dataset refresh history
[**getTables**](DatasetsApi.md#getTables) | **GET** /v1.0/myorg/datasets/{datasetKey}/tables | Gets all tables within the specified dataset
[**getTablesInGroup**](DatasetsApi.md#getTablesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables | Gets all tables within the specified dataset
[**postDataset**](DatasetsApi.md#postDataset) | **POST** /v1.0/myorg/datasets | Post a new entity to datasets
[**postDatasetInGroup**](DatasetsApi.md#postDatasetInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets | Post a new entity to datasets
[**postRows**](DatasetsApi.md#postRows) | **POST** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName}/rows | Posts new data rows into the specified table
[**postRowsInGroup**](DatasetsApi.md#postRowsInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName}/rows | Posts new data rows into the specified table
[**putTable**](DatasetsApi.md#putTable) | **PUT** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName} | Updates a schema and metadata for the specified table
[**putTableInGroup**](DatasetsApi.md#putTableInGroup) | **PUT** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName} | Updates a schema and metadata for the specified table
[**refreshDataset**](DatasetsApi.md#refreshDataset) | **POST** /v1.0/myorg/datasets/{datasetKey}/refreshes | Start a dataset refresh
[**refreshDatasetInGroup**](DatasetsApi.md#refreshDatasetInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/refreshes | Start a dataset refresh
[**setAllDatasetConnections**](DatasetsApi.md#setAllDatasetConnections) | **POST** /v1.0/myorg/datasets/{datasetKey}/Default.SetAllConnections | Sets all connections for the specified dataset
[**setAllDatasetConnectionsInGroup**](DatasetsApi.md#setAllDatasetConnectionsInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.SetAllConnections | Sets all connections for the specified dataset
[**takeOverInGroup**](DatasetsApi.md#takeOverInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.TakeOver | Take Over a dataset


<a name="bindToGateway"></a>
# **bindToGateway**
> Object bindToGateway(datasetKey, bindToGatewayRequest)

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
    Object result = apiInstance.bindToGateway(datasetKey, bindToGatewayRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#bindToGateway");
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

<a name="bindToGatewayInGroup"></a>
# **bindToGatewayInGroup**
> Object bindToGatewayInGroup(groupId, datasetKey, bindToGatewayRequest)

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
    Object result = apiInstance.bindToGatewayInGroup(groupId, datasetKey, bindToGatewayRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#bindToGatewayInGroup");
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

<a name="deleteDatasetById"></a>
# **deleteDatasetById**
> Object deleteDatasetById(datasetKey)

Deletes the dataset with the specified id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    Object result = apiInstance.deleteDatasetById(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#deleteDatasetById");
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

<a name="deleteDatasetByIdInGroup"></a>
# **deleteDatasetByIdInGroup**
> Object deleteDatasetByIdInGroup(groupId, datasetKey)

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
    Object result = apiInstance.deleteDatasetByIdInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#deleteDatasetByIdInGroup");
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

<a name="deleteRows"></a>
# **deleteRows**
> Object deleteRows(datasetKey, tableName)

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
    Object result = apiInstance.deleteRows(datasetKey, tableName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#deleteRows");
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

<a name="deleteRowsInGroup"></a>
# **deleteRowsInGroup**
> Object deleteRowsInGroup(groupId, datasetKey, tableName)

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
    Object result = apiInstance.deleteRowsInGroup(groupId, datasetKey, tableName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#deleteRowsInGroup");
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

<a name="generateTokenInGroup"></a>
# **generateTokenInGroup**
> EmbedToken generateTokenInGroup(groupId, datasetKey, requestParameters)

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
    EmbedToken result = apiInstance.generateTokenInGroup(groupId, datasetKey, requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#generateTokenInGroup");
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

<a name="getDatasetById"></a>
# **getDatasetById**
> Dataset getDatasetById(datasetKey)

Gets the dataset metadata for the specifeid dataset id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    Dataset result = apiInstance.getDatasetById(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getDatasetById");
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

<a name="getDatasetByIdInGroup"></a>
# **getDatasetByIdInGroup**
> Dataset getDatasetByIdInGroup(groupId, datasetKey)

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
    Dataset result = apiInstance.getDatasetByIdInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getDatasetByIdInGroup");
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

<a name="getDatasets"></a>
# **getDatasets**
> ODataResponseListDataset getDatasets()

Returns the datasets

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
try {
    ODataResponseListDataset result = apiInstance.getDatasets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getDatasets");
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

<a name="getDatasetsInGroup"></a>
# **getDatasetsInGroup**
> ODataResponseListDataset getDatasetsInGroup(groupId)

Returns the datasets

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String groupId = "groupId_example"; // String | The group id
try {
    ODataResponseListDataset result = apiInstance.getDatasetsInGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getDatasetsInGroup");
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

<a name="getDatasources"></a>
# **getDatasources**
> ODataResponseListDatasource getDatasources(datasetKey)

Gets a list of datasource for the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | 
try {
    ODataResponseListDatasource result = apiInstance.getDatasources(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getDatasources");
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

<a name="getDatasourcesInGroup"></a>
# **getDatasourcesInGroup**
> ODataResponseListDatasource getDatasourcesInGroup(groupId, datasetKey)

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
    ODataResponseListDatasource result = apiInstance.getDatasourcesInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getDatasourcesInGroup");
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

<a name="getGatewayDatasources"></a>
# **getGatewayDatasources**
> ODataResponseListGatewayDatasource getGatewayDatasources(datasetKey)

Gets a list of bound gateway datasources for the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    ODataResponseListGatewayDatasource result = apiInstance.getGatewayDatasources(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getGatewayDatasources");
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

<a name="getGatewayDatasourcesInGroup"></a>
# **getGatewayDatasourcesInGroup**
> ODataResponseListGatewayDatasource getGatewayDatasourcesInGroup(groupId, datasetKey)

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
    ODataResponseListGatewayDatasource result = apiInstance.getGatewayDatasourcesInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getGatewayDatasourcesInGroup");
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

<a name="getRefreshHistory"></a>
# **getRefreshHistory**
> ODataResponseListRefresh getRefreshHistory(datasetKey, top)

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
    ODataResponseListRefresh result = apiInstance.getRefreshHistory(datasetKey, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getRefreshHistory");
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

<a name="getRefreshHistoryInGroup"></a>
# **getRefreshHistoryInGroup**
> ODataResponseListRefresh getRefreshHistoryInGroup(groupId, datasetKey, top)

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
    ODataResponseListRefresh result = apiInstance.getRefreshHistoryInGroup(groupId, datasetKey, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getRefreshHistoryInGroup");
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

<a name="getTables"></a>
# **getTables**
> ODataResponseListTable getTables(datasetKey)

Gets all tables within the specified dataset

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    ODataResponseListTable result = apiInstance.getTables(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getTables");
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

<a name="getTablesInGroup"></a>
# **getTablesInGroup**
> ODataResponseListTable getTablesInGroup(groupId, datasetKey)

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
    ODataResponseListTable result = apiInstance.getTablesInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#getTablesInGroup");
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

<a name="postDataset"></a>
# **postDataset**
> Dataset postDataset(dataset)

Post a new entity to datasets

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
Dataset dataset = new Dataset(); // Dataset | Create dataset parameters
try {
    Dataset result = apiInstance.postDataset(dataset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#postDataset");
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

<a name="postDatasetInGroup"></a>
# **postDatasetInGroup**
> Dataset postDatasetInGroup(groupId, dataset)

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
    Dataset result = apiInstance.postDatasetInGroup(groupId, dataset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#postDatasetInGroup");
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

<a name="postRows"></a>
# **postRows**
> Object postRows(datasetKey, tableName, requestMessage)

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
    Object result = apiInstance.postRows(datasetKey, tableName, requestMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#postRows");
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

<a name="postRowsInGroup"></a>
# **postRowsInGroup**
> Object postRowsInGroup(groupId, datasetKey, tableName, requestMessage)

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
    Object result = apiInstance.postRowsInGroup(groupId, datasetKey, tableName, requestMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#postRowsInGroup");
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

<a name="putTable"></a>
# **putTable**
> Object putTable(datasetKey, tableName, requestMessage)

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
    Object result = apiInstance.putTable(datasetKey, tableName, requestMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#putTable");
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

<a name="putTableInGroup"></a>
# **putTableInGroup**
> Object putTableInGroup(groupId, datasetKey, tableName, requestMessage)

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
    Object result = apiInstance.putTableInGroup(groupId, datasetKey, tableName, requestMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#putTableInGroup");
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

<a name="refreshDataset"></a>
# **refreshDataset**
> Object refreshDataset(datasetKey)

Start a dataset refresh

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.DatasetsApi;


DatasetsApi apiInstance = new DatasetsApi();
String datasetKey = "datasetKey_example"; // String | The dataset id
try {
    Object result = apiInstance.refreshDataset(datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#refreshDataset");
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

<a name="refreshDatasetInGroup"></a>
# **refreshDatasetInGroup**
> Object refreshDatasetInGroup(groupId, datasetKey)

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
    Object result = apiInstance.refreshDatasetInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#refreshDatasetInGroup");
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

<a name="setAllDatasetConnections"></a>
# **setAllDatasetConnections**
> Object setAllDatasetConnections(datasetKey, parameters)

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
    Object result = apiInstance.setAllDatasetConnections(datasetKey, parameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#setAllDatasetConnections");
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

<a name="setAllDatasetConnectionsInGroup"></a>
# **setAllDatasetConnectionsInGroup**
> Object setAllDatasetConnectionsInGroup(groupId, datasetKey, parameters)

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
    Object result = apiInstance.setAllDatasetConnectionsInGroup(groupId, datasetKey, parameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#setAllDatasetConnectionsInGroup");
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

<a name="takeOverInGroup"></a>
# **takeOverInGroup**
> Object takeOverInGroup(groupId, datasetKey)

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
    Object result = apiInstance.takeOverInGroup(groupId, datasetKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#takeOverInGroup");
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

