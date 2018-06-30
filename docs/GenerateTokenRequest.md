
# GenerateTokenRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessLevel** | [**AccessLevelEnum**](#AccessLevelEnum) | The dataset mode or type |  [optional]
**datasetId** | **String** | The dataset Id |  [optional]
**allowSaveAs** | **Boolean** | Allow SaveAs the report with generated token. |  [optional]
**identities** | [**List&lt;EffectiveIdentity&gt;**](EffectiveIdentity.md) | The effective identities to use for RLS rules |  [optional]


<a name="AccessLevelEnum"></a>
## Enum: AccessLevelEnum
Name | Value
---- | -----
VIEW | &quot;View&quot;
EDIT | &quot;Edit&quot;
CREATE | &quot;Create&quot;



