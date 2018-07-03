# GroupsApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGroupUser**](GroupsApi.md#addGroupUser) | **POST** /v1.0/myorg/groups/{groupId}/users | Add a group user
[**createGroup**](GroupsApi.md#createGroup) | **POST** /v1.0/myorg/groups | Create new group
[**deleteGroup**](GroupsApi.md#deleteGroup) | **DELETE** /v1.0/myorg/groups/{groupId} | Deletes the specified group
[**deleteUserInGroup**](GroupsApi.md#deleteUserInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/users/{user} | Deletes the specified group
[**getGroupUsers**](GroupsApi.md#getGroupUsers) | **GET** /v1.0/myorg/groups/{groupId}/users | Get a group users list
[**getGroups**](GroupsApi.md#getGroups) | **GET** /v1.0/myorg/groups | Returns a list of groups


<a name="addGroupUser"></a>
# **addGroupUser**
> Object addGroupUser(groupId, userDetails)

Add a group user

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | The group id
GroupUserAccessRight userDetails = new GroupUserAccessRight(); // GroupUserAccessRight | user access right details
try {
    Object result = apiInstance.addGroupUser(groupId, userDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#addGroupUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **userDetails** | [**GroupUserAccessRight**](GroupUserAccessRight.md)| user access right details |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createGroup"></a>
# **createGroup**
> Group createGroup(requestParameters)

Create new group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
GroupCreationRequest requestParameters = new GroupCreationRequest(); // GroupCreationRequest | Create group request parameters
try {
    Group result = apiInstance.createGroup(requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestParameters** | [**GroupCreationRequest**](GroupCreationRequest.md)| Create group request parameters |

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroup"></a>
# **deleteGroup**
> Object deleteGroup(groupId)

Deletes the specified group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | The group id to delete
try {
    Object result = apiInstance.deleteGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id to delete |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUserInGroup"></a>
# **deleteUserInGroup**
> Object deleteUserInGroup(groupId, user)

Deletes the specified group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | The group id
String user = "user_example"; // String | The user email to delete
try {
    Object result = apiInstance.deleteUserInGroup(groupId, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#deleteUserInGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |
 **user** | **String**| The user email to delete |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getGroupUsers"></a>
# **getGroupUsers**
> ODataResponseListGroupUserAccessRight getGroupUsers(groupId)

Get a group users list

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | The group id
try {
    ODataResponseListGroupUserAccessRight result = apiInstance.getGroupUsers(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroupUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id |

### Return type

[**ODataResponseListGroupUserAccessRight**](ODataResponseListGroupUserAccessRight.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroups"></a>
# **getGroups**
> ODataResponseListGroup getGroups()

Returns a list of groups

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
try {
    ODataResponseListGroup result = apiInstance.getGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ODataResponseListGroup**](ODataResponseListGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

