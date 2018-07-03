# ImportsApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getImportById**](ImportsApi.md#getImportById) | **GET** /v1.0/myorg/imports/{importId} | Gets the import metadata for the specifed import id
[**getImportByIdInGroup**](ImportsApi.md#getImportByIdInGroup) | **GET** /v1.0/myorg/groups/{groupId}/imports/{importId} | Gets the import metadata for the specifed import id
[**getImports**](ImportsApi.md#getImports) | **GET** /v1.0/myorg/imports | Returns a list of imports
[**getImportsInGroup**](ImportsApi.md#getImportsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/imports | Returns a list of imports for the specified group
[**postImport**](ImportsApi.md#postImport) | **POST** /v1.0/myorg/imports | Creates a new import using the specified import info
[**postImportInGroup**](ImportsApi.md#postImportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/imports | Creates a new import using the specified import info


<a name="getImportById"></a>
# **getImportById**
> ModelImport getImportById(importId)

Gets the import metadata for the specifed import id

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ImportsApi;


ImportsApi apiInstance = new ImportsApi();
String importId = "importId_example"; // String | The import id
try {
    ModelImport result = apiInstance.getImportById(importId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#getImportById");
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

<a name="getImportByIdInGroup"></a>
# **getImportByIdInGroup**
> ModelImport getImportByIdInGroup(groupId, importId)

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
    ModelImport result = apiInstance.getImportByIdInGroup(groupId, importId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#getImportByIdInGroup");
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

<a name="getImports"></a>
# **getImports**
> ODataResponseListImport getImports()

Returns a list of imports

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ImportsApi;


ImportsApi apiInstance = new ImportsApi();
try {
    ODataResponseListImport result = apiInstance.getImports();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#getImports");
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

<a name="getImportsInGroup"></a>
# **getImportsInGroup**
> ODataResponseListImport getImportsInGroup(groupId)

Returns a list of imports for the specified group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.ImportsApi;


ImportsApi apiInstance = new ImportsApi();
String groupId = "groupId_example"; // String | The group id
try {
    ODataResponseListImport result = apiInstance.getImportsInGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#getImportsInGroup");
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

<a name="postImport"></a>
# **postImport**
> ModelImport postImport(datasetDisplayName, importInfo, nameConflict)

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
    ModelImport result = apiInstance.postImport(datasetDisplayName, importInfo, nameConflict);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#postImport");
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

<a name="postImportInGroup"></a>
# **postImportInGroup**
> ModelImport postImportInGroup(groupId, datasetDisplayName, importInfo, nameConflict)

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
    ModelImport result = apiInstance.postImportInGroup(groupId, datasetDisplayName, importInfo, nameConflict);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportsApi#postImportInGroup");
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

