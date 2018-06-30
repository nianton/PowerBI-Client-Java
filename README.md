# PowerBI API Client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.microsoft</groupId>
    <artifactId>microsoft-powerbi-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.microsoft:microsoft-powerbi-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/microsoft-powerbi-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.microsoft.powerbi.*;
import com.microsoft.powerbi.auth.*;
import com.microsoft.powerbi.models.*;
import com.microsoft.powerbi.api.DashboardsApi;

import java.io.File;
import java.util.*;

public class DashboardsApiExample {

    public static void main(String[] args) {
        
        DashboardsApi apiInstance = new DashboardsApi();
        AddDashboardRequest requestParameters = new AddDashboardRequest(); // AddDashboardRequest | Add dashboard parameters
        try {
            Dashboard result = apiInstance.dashboardsAddDashboard(requestParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#dashboardsAddDashboard");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.powerbi.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DashboardsApi* | [**dashboardsAddDashboard**](docs/DashboardsApi.md#dashboardsAddDashboard) | **POST** /v1.0/myorg/dashboards | Add a new empty dashboard
*DashboardsApi* | [**dashboardsAddDashboardInGroup**](docs/DashboardsApi.md#dashboardsAddDashboardInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards | Add a new empty dashboard
*DashboardsApi* | [**dashboardsGenerateToken**](docs/DashboardsApi.md#dashboardsGenerateToken) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/GenerateToken | Generate token to view the specified dashboard
*DashboardsApi* | [**dashboardsGenerateTokenInGroup**](docs/DashboardsApi.md#dashboardsGenerateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/GenerateToken | Generate token to view the specified dashboard
*DashboardsApi* | [**dashboardsGetDashboards**](docs/DashboardsApi.md#dashboardsGetDashboards) | **GET** /v1.0/myorg/dashboards | Gets a list of dashboards
*DashboardsApi* | [**dashboardsGetDashboardsInGroup**](docs/DashboardsApi.md#dashboardsGetDashboardsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards | Gets a list of dashboards in a group
*DatasetsApi* | [**datasetsBindToGateway**](docs/DatasetsApi.md#datasetsBindToGateway) | **POST** /v1.0/myorg/datasets/{datasetKey}/Default.BindToGateway | Bind dataset to gateway
*DatasetsApi* | [**datasetsBindToGatewayInGroup**](docs/DatasetsApi.md#datasetsBindToGatewayInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.BindToGateway | Bind dataset to gateway
*DatasetsApi* | [**datasetsDeleteDatasetById**](docs/DatasetsApi.md#datasetsDeleteDatasetById) | **DELETE** /v1.0/myorg/datasets/{datasetKey} | Deletes the dataset with the specified id
*DatasetsApi* | [**datasetsDeleteDatasetByIdInGroup**](docs/DatasetsApi.md#datasetsDeleteDatasetByIdInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey} | Deletes the dataset with the specified id
*DatasetsApi* | [**datasetsDeleteRows**](docs/DatasetsApi.md#datasetsDeleteRows) | **DELETE** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName}/rows | Deletes all rows from the specified table
*DatasetsApi* | [**datasetsDeleteRowsInGroup**](docs/DatasetsApi.md#datasetsDeleteRowsInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName}/rows | Deletes all rows from the specified table
*DatasetsApi* | [**datasetsGenerateTokenInGroup**](docs/DatasetsApi.md#datasetsGenerateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/GenerateToken | Generate token to view the specified dataset
*DatasetsApi* | [**datasetsGetDatasetById**](docs/DatasetsApi.md#datasetsGetDatasetById) | **GET** /v1.0/myorg/datasets/{datasetKey} | Gets the dataset metadata for the specifeid dataset id
*DatasetsApi* | [**datasetsGetDatasetByIdInGroup**](docs/DatasetsApi.md#datasetsGetDatasetByIdInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey} | Gets the dataset metadata for the specifeid dataset id
*DatasetsApi* | [**datasetsGetDatasets**](docs/DatasetsApi.md#datasetsGetDatasets) | **GET** /v1.0/myorg/datasets | Returns the datasets
*DatasetsApi* | [**datasetsGetDatasetsInGroup**](docs/DatasetsApi.md#datasetsGetDatasetsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets | Returns the datasets
*DatasetsApi* | [**datasetsGetDatasources**](docs/DatasetsApi.md#datasetsGetDatasources) | **GET** /v1.0/myorg/datasets/{datasetKey}/datasources | Gets a list of datasource for the specified dataset
*DatasetsApi* | [**datasetsGetDatasourcesInGroup**](docs/DatasetsApi.md#datasetsGetDatasourcesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/datasources | Gets a list of datasource for the specified dataset
*DatasetsApi* | [**datasetsGetGatewayDatasources**](docs/DatasetsApi.md#datasetsGetGatewayDatasources) | **GET** /v1.0/myorg/datasets/{datasetKey}/Default.GetBoundGatewayDatasources | Gets a list of bound gateway datasources for the specified dataset
*DatasetsApi* | [**datasetsGetGatewayDatasourcesInGroup**](docs/DatasetsApi.md#datasetsGetGatewayDatasourcesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.GetBoundGatewayDatasources | Gets a list of bound gateway datasources for the specified dataset
*DatasetsApi* | [**datasetsGetRefreshHistory**](docs/DatasetsApi.md#datasetsGetRefreshHistory) | **GET** /v1.0/myorg/datasets/{datasetKey}/refreshes | Gets the dataset refresh history
*DatasetsApi* | [**datasetsGetRefreshHistoryInGroup**](docs/DatasetsApi.md#datasetsGetRefreshHistoryInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/refreshes | Gets the dataset refresh history
*DatasetsApi* | [**datasetsGetTables**](docs/DatasetsApi.md#datasetsGetTables) | **GET** /v1.0/myorg/datasets/{datasetKey}/tables | Gets all tables within the specified dataset
*DatasetsApi* | [**datasetsGetTablesInGroup**](docs/DatasetsApi.md#datasetsGetTablesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables | Gets all tables within the specified dataset
*DatasetsApi* | [**datasetsPostDataset**](docs/DatasetsApi.md#datasetsPostDataset) | **POST** /v1.0/myorg/datasets | Post a new entity to datasets
*DatasetsApi* | [**datasetsPostDatasetInGroup**](docs/DatasetsApi.md#datasetsPostDatasetInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets | Post a new entity to datasets
*DatasetsApi* | [**datasetsPostRows**](docs/DatasetsApi.md#datasetsPostRows) | **POST** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName}/rows | Posts new data rows into the specified table
*DatasetsApi* | [**datasetsPostRowsInGroup**](docs/DatasetsApi.md#datasetsPostRowsInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName}/rows | Posts new data rows into the specified table
*DatasetsApi* | [**datasetsPutTable**](docs/DatasetsApi.md#datasetsPutTable) | **PUT** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName} | Updates a schema and metadata for the specified table
*DatasetsApi* | [**datasetsPutTableInGroup**](docs/DatasetsApi.md#datasetsPutTableInGroup) | **PUT** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName} | Updates a schema and metadata for the specified table
*DatasetsApi* | [**datasetsRefreshDataset**](docs/DatasetsApi.md#datasetsRefreshDataset) | **POST** /v1.0/myorg/datasets/{datasetKey}/refreshes | Start a dataset refresh
*DatasetsApi* | [**datasetsRefreshDatasetInGroup**](docs/DatasetsApi.md#datasetsRefreshDatasetInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/refreshes | Start a dataset refresh
*DatasetsApi* | [**datasetsSetAllDatasetConnections**](docs/DatasetsApi.md#datasetsSetAllDatasetConnections) | **POST** /v1.0/myorg/datasets/{datasetKey}/Default.SetAllConnections | Sets all connections for the specified dataset
*DatasetsApi* | [**datasetsSetAllDatasetConnectionsInGroup**](docs/DatasetsApi.md#datasetsSetAllDatasetConnectionsInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.SetAllConnections | Sets all connections for the specified dataset
*DatasetsApi* | [**datasetsTakeOverInGroup**](docs/DatasetsApi.md#datasetsTakeOverInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.TakeOver | Take Over a dataset
*DatasourcesApi* | [**gatewaysAddDatasourceUser**](docs/DatasourcesApi.md#gatewaysAddDatasourceUser) | **POST** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users | Get a datasource user
*DatasourcesApi* | [**gatewaysCreateDatasource**](docs/DatasourcesApi.md#gatewaysCreateDatasource) | **POST** /v1.0/myorg/gateways/{gatewayId}/datasources | Create a datasource
*DatasourcesApi* | [**gatewaysDeleteDatasource**](docs/DatasourcesApi.md#gatewaysDeleteDatasource) | **DELETE** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Delete a datasource
*DatasourcesApi* | [**gatewaysDeleteDatasourceUser**](docs/DatasourcesApi.md#gatewaysDeleteDatasourceUser) | **DELETE** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users/{emailAdress} | Delete a datasource user
*DatasourcesApi* | [**gatewaysGetDatasourceById**](docs/DatasourcesApi.md#gatewaysGetDatasourceById) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Get a datasource by id
*DatasourcesApi* | [**gatewaysGetDatasourceStatusById**](docs/DatasourcesApi.md#gatewaysGetDatasourceStatusById) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/status | Get a datasource status by id
*DatasourcesApi* | [**gatewaysGetDatasourceUsers**](docs/DatasourcesApi.md#gatewaysGetDatasourceUsers) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users | Get a datasource users list
*DatasourcesApi* | [**gatewaysGetDatasources**](docs/DatasourcesApi.md#gatewaysGetDatasources) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources | Get all datasources of specific gateway
*DatasourcesApi* | [**gatewaysUpdateDatasource**](docs/DatasourcesApi.md#gatewaysUpdateDatasource) | **PATCH** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Update a datasource credentials
*GatewaysApi* | [**gatewaysGetGatewayById**](docs/GatewaysApi.md#gatewaysGetGatewayById) | **GET** /v1.0/myorg/gateways/{gatewayId} | Returns the specified gateway
*GatewaysApi* | [**gatewaysGetGateways**](docs/GatewaysApi.md#gatewaysGetGateways) | **GET** /v1.0/myorg/gateways | Returns a list of gateways
*GroupsApi* | [**groupsAddGroupUser**](docs/GroupsApi.md#groupsAddGroupUser) | **POST** /v1.0/myorg/groups/{groupId}/users | Add a group user
*GroupsApi* | [**groupsCreateGroup**](docs/GroupsApi.md#groupsCreateGroup) | **POST** /v1.0/myorg/groups | Create new group
*GroupsApi* | [**groupsDeleteGroup**](docs/GroupsApi.md#groupsDeleteGroup) | **DELETE** /v1.0/myorg/groups/{groupId} | Deletes the specified group
*GroupsApi* | [**groupsDeleteUserInGroup**](docs/GroupsApi.md#groupsDeleteUserInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/users/{user} | Deletes the specified group
*GroupsApi* | [**groupsGetGroupUsers**](docs/GroupsApi.md#groupsGetGroupUsers) | **GET** /v1.0/myorg/groups/{groupId}/users | Get a group users list
*GroupsApi* | [**groupsGetGroups**](docs/GroupsApi.md#groupsGetGroups) | **GET** /v1.0/myorg/groups | Returns a list of groups
*ImportsApi* | [**importsGetImportById**](docs/ImportsApi.md#importsGetImportById) | **GET** /v1.0/myorg/imports/{importId} | Gets the import metadata for the specifed import id
*ImportsApi* | [**importsGetImportByIdInGroup**](docs/ImportsApi.md#importsGetImportByIdInGroup) | **GET** /v1.0/myorg/groups/{groupId}/imports/{importId} | Gets the import metadata for the specifed import id
*ImportsApi* | [**importsGetImports**](docs/ImportsApi.md#importsGetImports) | **GET** /v1.0/myorg/imports | Returns a list of imports
*ImportsApi* | [**importsGetImportsInGroup**](docs/ImportsApi.md#importsGetImportsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/imports | Returns a list of imports for the specified group
*ImportsApi* | [**importsPostImport**](docs/ImportsApi.md#importsPostImport) | **POST** /v1.0/myorg/imports | Creates a new import using the specified import info
*ImportsApi* | [**importsPostImportInGroup**](docs/ImportsApi.md#importsPostImportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/imports | Creates a new import using the specified import info
*ReportsApi* | [**dashboardsGetDashboard**](docs/ReportsApi.md#dashboardsGetDashboard) | **POST** /v1.0/myorg/dashboards/{dashboardKey} | Get the specified dashboard
*ReportsApi* | [**reportsCloneReport**](docs/ReportsApi.md#reportsCloneReport) | **POST** /v1.0/myorg/reports/{reportKey}/Clone | Clones the specified report
*ReportsApi* | [**reportsCloneReportInGroup**](docs/ReportsApi.md#reportsCloneReportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Clone | Clones the specified report
*ReportsApi* | [**reportsDeleteReport**](docs/ReportsApi.md#reportsDeleteReport) | **DELETE** /v1.0/myorg/reports/{reportKey} | Deletes the specified report
*ReportsApi* | [**reportsDeleteReportInGroup**](docs/ReportsApi.md#reportsDeleteReportInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/reports/{reportKey} | Deletes the specified report
*ReportsApi* | [**reportsExportReport**](docs/ReportsApi.md#reportsExportReport) | **GET** /v1.0/myorg/reports/{reportKey}/Export | Exports the specified report
*ReportsApi* | [**reportsExportReportInGroup**](docs/ReportsApi.md#reportsExportReportInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Export | Exports the specified report
*ReportsApi* | [**reportsGenerateToken**](docs/ReportsApi.md#reportsGenerateToken) | **POST** /v1.0/myorg/reports/{reportKey}/GenerateToken | Generate token to view or edit the specified report
*ReportsApi* | [**reportsGenerateTokenForCreate**](docs/ReportsApi.md#reportsGenerateTokenForCreate) | **POST** /v1.0/myorg/reports/GenerateToken | Generate token to create a new report on a given dataset
*ReportsApi* | [**reportsGenerateTokenForCreateInGroup**](docs/ReportsApi.md#reportsGenerateTokenForCreateInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/GenerateToken | Generate token to create a new report on a given dataset
*ReportsApi* | [**reportsGenerateTokenInGroup**](docs/ReportsApi.md#reportsGenerateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/GenerateToken | Generate token to view or edit the specified report
*ReportsApi* | [**reportsGetReport**](docs/ReportsApi.md#reportsGetReport) | **GET** /v1.0/myorg/reports/{reportKey} | Get the specified report
*ReportsApi* | [**reportsGetReportInGroup**](docs/ReportsApi.md#reportsGetReportInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports/{reportKey} | Get the specified report
*ReportsApi* | [**reportsGetReports**](docs/ReportsApi.md#reportsGetReports) | **GET** /v1.0/myorg/reports | Gets a list of reports
*ReportsApi* | [**reportsGetReportsInGroup**](docs/ReportsApi.md#reportsGetReportsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports | Gets a list of reports available within the specified group
*ReportsApi* | [**reportsRebindReport**](docs/ReportsApi.md#reportsRebindReport) | **POST** /v1.0/myorg/reports/{reportKey}/Rebind | Rebinds the specified report to requested dataset id
*ReportsApi* | [**reportsRebindReportInGroup**](docs/ReportsApi.md#reportsRebindReportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Rebind | Rebinds the specified report to requested dataset id
*TilesApi* | [**dashboardsCloneTile**](docs/TilesApi.md#dashboardsCloneTile) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey}/Clone | Clones the specified tile
*TilesApi* | [**dashboardsCloneTileInGroup**](docs/TilesApi.md#dashboardsCloneTileInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey}/Clone | Clones the specified tile
*TilesApi* | [**dashboardsGetTile**](docs/TilesApi.md#dashboardsGetTile) | **GET** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey} | Get a specified tile in a specified dashboard
*TilesApi* | [**dashboardsGetTileInGroup**](docs/TilesApi.md#dashboardsGetTileInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey} | Get a specified tile in a specified dashboard in a group
*TilesApi* | [**dashboardsGetTiles**](docs/TilesApi.md#dashboardsGetTiles) | **GET** /v1.0/myorg/dashboards/{dashboardKey}/tiles | Get tiles in the specified dashboard
*TilesApi* | [**dashboardsGetTilesInGroup**](docs/TilesApi.md#dashboardsGetTilesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles | Get tiles in the specified dashboard in a group
*TilesApi* | [**tilesGenerateToken**](docs/TilesApi.md#tilesGenerateToken) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey}/GenerateToken | Generate token to view the specified tile
*TilesApi* | [**tilesGenerateTokenInGroup**](docs/TilesApi.md#tilesGenerateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey}/GenerateToken | Generate token to view the specified tile


## Documentation for Models

 - [AddDashboardRequest](docs/AddDashboardRequest.md)
 - [BasicCredentials](docs/BasicCredentials.md)
 - [BindToGatewayRequest](docs/BindToGatewayRequest.md)
 - [CloneReportRequest](docs/CloneReportRequest.md)
 - [CloneTileRequest](docs/CloneTileRequest.md)
 - [Column](docs/Column.md)
 - [ConnectionDetails](docs/ConnectionDetails.md)
 - [CredentialDetails](docs/CredentialDetails.md)
 - [Dashboard](docs/Dashboard.md)
 - [Dataset](docs/Dataset.md)
 - [Datasource](docs/Datasource.md)
 - [EffectiveIdentity](docs/EffectiveIdentity.md)
 - [EmbedToken](docs/EmbedToken.md)
 - [Gateway](docs/Gateway.md)
 - [GatewayDatasource](docs/GatewayDatasource.md)
 - [GatewayPublicKey](docs/GatewayPublicKey.md)
 - [GenerateTokenRequest](docs/GenerateTokenRequest.md)
 - [Group](docs/Group.md)
 - [GroupCreationRequest](docs/GroupCreationRequest.md)
 - [GroupUser](docs/GroupUser.md)
 - [GroupUserAccessRight](docs/GroupUserAccessRight.md)
 - [ImportInfo](docs/ImportInfo.md)
 - [ModelImport](docs/ModelImport.md)
 - [ODataResponseListDashboard](docs/ODataResponseListDashboard.md)
 - [ODataResponseListDataset](docs/ODataResponseListDataset.md)
 - [ODataResponseListDatasource](docs/ODataResponseListDatasource.md)
 - [ODataResponseListGateway](docs/ODataResponseListGateway.md)
 - [ODataResponseListGatewayDatasource](docs/ODataResponseListGatewayDatasource.md)
 - [ODataResponseListGroup](docs/ODataResponseListGroup.md)
 - [ODataResponseListGroupUserAccessRight](docs/ODataResponseListGroupUserAccessRight.md)
 - [ODataResponseListImport](docs/ODataResponseListImport.md)
 - [ODataResponseListRefresh](docs/ODataResponseListRefresh.md)
 - [ODataResponseListReport](docs/ODataResponseListReport.md)
 - [ODataResponseListTable](docs/ODataResponseListTable.md)
 - [ODataResponseListTile](docs/ODataResponseListTile.md)
 - [ODataResponseListUserAccessRight](docs/ODataResponseListUserAccessRight.md)
 - [Object](docs/Object.md)
 - [PublishDatasourceToGatewayRequest](docs/PublishDatasourceToGatewayRequest.md)
 - [RebindReportRequest](docs/RebindReportRequest.md)
 - [Refresh](docs/Refresh.md)
 - [Report](docs/Report.md)
 - [Row](docs/Row.md)
 - [Table](docs/Table.md)
 - [Tile](docs/Tile.md)
 - [UpdateDatasourceRequest](docs/UpdateDatasourceRequest.md)
 - [UserAccessRight](docs/UserAccessRight.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



