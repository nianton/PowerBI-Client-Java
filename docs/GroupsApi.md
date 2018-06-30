# GroupsApi

All URIs are relative to *https://api.powerbi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupsAddGroupUser**](GroupsApi.md#groupsAddGroupUser) | **POST** /v1.0/myorg/groups/{groupId}/users | Add a group user
[**groupsCreateGroup**](GroupsApi.md#groupsCreateGroup) | **POST** /v1.0/myorg/groups | Create new group
[**groupsDeleteGroup**](GroupsApi.md#groupsDeleteGroup) | **DELETE** /v1.0/myorg/groups/{groupId} | Deletes the specified group
[**groupsDeleteUserInGroup**](GroupsApi.md#groupsDeleteUserInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/users/{user} | Deletes the specified group
[**groupsGetGroupUsers**](GroupsApi.md#groupsGetGroupUsers) | **GET** /v1.0/myorg/groups/{groupId}/users | Get a group users list
[**groupsGetGroups**](GroupsApi.md#groupsGetGroups) | **GET** /v1.0/myorg/groups | Returns a list of groups


<a name="groupsAddGroupUser"></a>
# **groupsAddGroupUser**
> Object groupsAddGroupUser(groupId, userDetails)

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
    Object result = apiInstance.groupsAddGroupUser(groupId, userDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsAddGroupUser");
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

<a name="groupsCreateGroup"></a>
# **groupsCreateGroup**
> Group groupsCreateGroup(requestParameters)

Create new group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
GroupCreationRequest requestParameters = new GroupCreationRequest(); // GroupCreationRequest | Create group request parameters
try {
    Group result = apiInstance.groupsCreateGroup(requestParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsCreateGroup");
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

<a name="groupsDeleteGroup"></a>
# **groupsDeleteGroup**
> Object groupsDeleteGroup(groupId)

Deletes the specified group

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | The group id to delete
try {
    Object result = apiInstance.groupsDeleteGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsDeleteGroup");
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

<a name="groupsDeleteUserInGroup"></a>
# **groupsDeleteUserInGroup**
> Object groupsDeleteUserInGroup(groupId, user)

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
    Object result = apiInstance.groupsDeleteUserInGroup(groupId, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsDeleteUserInGroup");
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

<a name="groupsGetGroupUsers"></a>
# **groupsGetGroupUsers**
> ODataResponseListGroupUserAccessRight groupsGetGroupUsers(groupId)

Get a group users list

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | The group id
try {
    ODataResponseListGroupUserAccessRight result = apiInstance.groupsGetGroupUsers(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGetGroupUsers");
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

<a name="groupsGetGroups"></a>
# **groupsGetGroups**
> ODataResponseListGroup groupsGetGroups()

Returns a list of groups

### Example
```java
// Import classes:
//import com.microsoft.powerbi.ApiException;
//import com.microsoft.powerbi.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
try {
    ODataResponseListGroup result = apiInstance.groupsGetGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGetGroups");
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

