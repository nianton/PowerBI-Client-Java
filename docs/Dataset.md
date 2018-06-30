
# Dataset

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The dataset id |  [optional]
**name** | **String** | The dataset name | 
**configuredBy** | **String** | The dataset owner |  [optional]
**defaultRetentionPolicy** | **String** | The dataset default data retention policy |  [optional]
**addRowsAPIEnabled** | **Boolean** | Is Push Dataset |  [optional]
**tables** | [**List&lt;Table&gt;**](Table.md) | The dataset tables | 
**webUrl** | **String** | The dataset web url |  [optional]
**datasources** | [**List&lt;Datasource&gt;**](Datasource.md) | The datasources associated with this dataset |  [optional]
**defaultMode** | [**DefaultModeEnum**](#DefaultModeEnum) | The dataset mode or type |  [optional]
**isRefreshable** | **Boolean** | Can this dataset be refreshed |  [optional]
**isEffectiveIdentityRequired** | **Boolean** | Dataset requires effective identity |  [optional]
**isEffectiveIdentityRolesRequired** | **Boolean** | Dataset requires roles |  [optional]
**isOnPremGatewayRequired** | **Boolean** | Dataset requires onprem gateway |  [optional]


<a name="DefaultModeEnum"></a>
## Enum: DefaultModeEnum
Name | Value
---- | -----
ASAZURE | &quot;AsAzure&quot;
ASONPREM | &quot;AsOnPrem&quot;
PUSH | &quot;Push&quot;
STREAMING | &quot;Streaming&quot;
PUSHSTREAMING | &quot;PushStreaming&quot;



