# ImportsApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**importsGetImportById**](ImportsApi.md#importsGetImportById) | **GET** /v1.0/myorg/imports/{importId} | Gets the import metadata for the specifed import id
[**importsGetImportByIdInGroup**](ImportsApi.md#importsGetImportByIdInGroup) | **GET** /v1.0/myorg/groups/{groupId}/imports/{importId} | Gets the import metadata for the specifed import id
[**importsGetImports**](ImportsApi.md#importsGetImports) | **GET** /v1.0/myorg/imports | Returns a list of imports
[**importsGetImportsInGroup**](ImportsApi.md#importsGetImportsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/imports | Returns a list of imports for the specified group
[**importsPostImport**](ImportsApi.md#importsPostImport) | **POST** /v1.0/myorg/imports | Creates a new import using the specified import info
[**importsPostImportInGroup**](ImportsApi.md#importsPostImportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/imports | Creates a new import using the specified import info


<a name="importsGetImportById"></a>
# **importsGetImportById**
> ModelImport importsGetImportById(importId)

Gets the import metadata for the specifed import id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ImportsApi;


ImportsApi apiInstance = new ImportsApi();
String importId = "importId_example"; // String | The import id
try {
    ModelImport result = apiInstance.importsGetImportById(importId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#importsGetImportById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importId** | **String**| The import id |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importsGetImportByIdInGroup"></a>
# **importsGetImportByIdInGroup**
> ModelImport importsGetImportByIdInGroup(groupId, importId)

Gets the import metadata for the specifed import id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ImportsApi;


ImportsApi apiInstance = new ImportsApi();
String groupId = "groupId_example"; // String | The group id
String importId = "importId_example"; // String | The import id
try {
    ModelImport result = apiInstance.importsGetImportByIdInGroup(groupId, importId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#importsGetImportByIdInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **importId** | **String**| The import id |

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importsGetImports"></a>
# **importsGetImports**
> ODataResponseListImport importsGetImports()

Returns a list of imports

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ImportsApi;


ImportsApi apiInstance = new ImportsApi();
try {
    ODataResponseListImport result = apiInstance.importsGetImports();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#importsGetImports");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ODataResponseListImport**](ODataResponseListImport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importsGetImportsInGroup"></a>
# **importsGetImportsInGroup**
> ODataResponseListImport importsGetImportsInGroup(groupId)

Returns a list of imports for the specified group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ImportsApi;


ImportsApi apiInstance = new ImportsApi();
String groupId = "groupId_example"; // String | The group id
try {
    ODataResponseListImport result = apiInstance.importsGetImportsInGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#importsGetImportsInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |

### Return type

[**ODataResponseListImport**](ODataResponseListImport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importsPostImport"></a>
# **importsPostImport**
> ModelImport importsPostImport(datasetDisplayName, importInfo, nameConflict)

Creates a new import using the specified import info

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ImportsApi;


ImportsApi apiInstance = new ImportsApi();
String datasetDisplayName = "datasetDisplayName_example"; // String | The display name of the dataset
ImportInfo importInfo = new ImportInfo(); // ImportInfo | The import to post
String nameConflict = "nameConflict_example"; // String | Determines what to do if a dataset with the same name already exists
try {
    ModelImport result = apiInstance.importsPostImport(datasetDisplayName, importInfo, nameConflict);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#importsPostImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetDisplayName** | **String**| The display name of the dataset |
 **importInfo** | [**ImportInfo**](ImportInfo.md)| The import to post |
 **nameConflict** | **String**| Determines what to do if a dataset with the same name already exists | [optional] [enum: Ignore, Abort, Overwrite]

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importsPostImportInGroup"></a>
# **importsPostImportInGroup**
> ModelImport importsPostImportInGroup(groupId, datasetDisplayName, importInfo, nameConflict)

Creates a new import using the specified import info

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ImportsApi;


ImportsApi apiInstance = new ImportsApi();
String groupId = "groupId_example"; // String | The group id
String datasetDisplayName = "datasetDisplayName_example"; // String | The display name of the dataset
ImportInfo importInfo = new ImportInfo(); // ImportInfo | The import to post
String nameConflict = "nameConflict_example"; // String | Determines what to do if a dataset with the same name already exists
try {
    ModelImport result = apiInstance.importsPostImportInGroup(groupId, datasetDisplayName, importInfo, nameConflict);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#importsPostImportInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **datasetDisplayName** | **String**| The display name of the dataset |
 **importInfo** | [**ImportInfo**](ImportInfo.md)| The import to post |
 **nameConflict** | **String**| Determines what to do if a dataset with the same name already exists | [optional]

### Return type

[**ModelImport**](ModelImport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

