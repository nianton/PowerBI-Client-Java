
# EffectiveIdentity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | The effective username reflected by a token for applying RLS rules | 
**roles** | **List&lt;String&gt;** | An array of roles reflected by a token when applying RLS rules |  [optional]
**datasets** | **List&lt;String&gt;** | An array of datasets for which this mapping applies to, if not provided - applies to all datasets | 
**customData** | **String** | The value of customdata to be used for applying RLS rules (Only supported for live connections to Azure Analysis Services) |  [optional]



