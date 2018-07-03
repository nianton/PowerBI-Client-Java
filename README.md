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
            Dashboard result = apiInstance.addDashboard(requestParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#addDashboard");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.powerbi.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DashboardsApi* | [**addDashboard**](docs/DashboardsApi.md#addDashboard) | **POST** /v1.0/myorg/dashboards | Add a new empty dashboard
*DashboardsApi* | [**addDashboardInGroup**](docs/DashboardsApi.md#addDashboardInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards | Add a new empty dashboard
*DashboardsApi* | [**generateToken**](docs/DashboardsApi.md#generateToken) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/GenerateToken | Generate token to view the specified dashboard
*DashboardsApi* | [**generateTokenInGroup**](docs/DashboardsApi.md#generateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/GenerateToken | Generate token to view the specified dashboard
*DashboardsApi* | [**getDashboards**](docs/DashboardsApi.md#getDashboards) | **GET** /v1.0/myorg/dashboards | Gets a list of dashboards
*DashboardsApi* | [**getDashboardsInGroup**](docs/DashboardsApi.md#getDashboardsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards | Gets a list of dashboards in a group
*DatasetsApi* | [**bindToGateway**](docs/DatasetsApi.md#bindToGateway) | **POST** /v1.0/myorg/datasets/{datasetKey}/Default.BindToGateway | Bind dataset to gateway
*DatasetsApi* | [**bindToGatewayInGroup**](docs/DatasetsApi.md#bindToGatewayInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.BindToGateway | Bind dataset to gateway
*DatasetsApi* | [**deleteDatasetById**](docs/DatasetsApi.md#deleteDatasetById) | **DELETE** /v1.0/myorg/datasets/{datasetKey} | Deletes the dataset with the specified id
*DatasetsApi* | [**deleteDatasetByIdInGroup**](docs/DatasetsApi.md#deleteDatasetByIdInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey} | Deletes the dataset with the specified id
*DatasetsApi* | [**deleteRows**](docs/DatasetsApi.md#deleteRows) | **DELETE** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName}/rows | Deletes all rows from the specified table
*DatasetsApi* | [**deleteRowsInGroup**](docs/DatasetsApi.md#deleteRowsInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName}/rows | Deletes all rows from the specified table
*DatasetsApi* | [**generateTokenInGroup**](docs/DatasetsApi.md#generateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/GenerateToken | Generate token to view the specified dataset
*DatasetsApi* | [**getDatasetById**](docs/DatasetsApi.md#getDatasetById) | **GET** /v1.0/myorg/datasets/{datasetKey} | Gets the dataset metadata for the specifeid dataset id
*DatasetsApi* | [**getDatasetByIdInGroup**](docs/DatasetsApi.md#getDatasetByIdInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey} | Gets the dataset metadata for the specifeid dataset id
*DatasetsApi* | [**getDatasets**](docs/DatasetsApi.md#getDatasets) | **GET** /v1.0/myorg/datasets | Returns the datasets
*DatasetsApi* | [**getDatasetsInGroup**](docs/DatasetsApi.md#getDatasetsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets | Returns the datasets
*DatasetsApi* | [**getDatasources**](docs/DatasetsApi.md#getDatasources) | **GET** /v1.0/myorg/datasets/{datasetKey}/datasources | Gets a list of datasource for the specified dataset
*DatasetsApi* | [**getDatasourcesInGroup**](docs/DatasetsApi.md#getDatasourcesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/datasources | Gets a list of datasource for the specified dataset
*DatasetsApi* | [**getGatewayDatasources**](docs/DatasetsApi.md#getGatewayDatasources) | **GET** /v1.0/myorg/datasets/{datasetKey}/Default.GetBoundGatewayDatasources | Gets a list of bound gateway datasources for the specified dataset
*DatasetsApi* | [**getGatewayDatasourcesInGroup**](docs/DatasetsApi.md#getGatewayDatasourcesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.GetBoundGatewayDatasources | Gets a list of bound gateway datasources for the specified dataset
*DatasetsApi* | [**getRefreshHistory**](docs/DatasetsApi.md#getRefreshHistory) | **GET** /v1.0/myorg/datasets/{datasetKey}/refreshes | Gets the dataset refresh history
*DatasetsApi* | [**getRefreshHistoryInGroup**](docs/DatasetsApi.md#getRefreshHistoryInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/refreshes | Gets the dataset refresh history
*DatasetsApi* | [**getTables**](docs/DatasetsApi.md#getTables) | **GET** /v1.0/myorg/datasets/{datasetKey}/tables | Gets all tables within the specified dataset
*DatasetsApi* | [**getTablesInGroup**](docs/DatasetsApi.md#getTablesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables | Gets all tables within the specified dataset
*DatasetsApi* | [**postDataset**](docs/DatasetsApi.md#postDataset) | **POST** /v1.0/myorg/datasets | Post a new entity to datasets
*DatasetsApi* | [**postDatasetInGroup**](docs/DatasetsApi.md#postDatasetInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets | Post a new entity to datasets
*DatasetsApi* | [**postRows**](docs/DatasetsApi.md#postRows) | **POST** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName}/rows | Posts new data rows into the specified table
*DatasetsApi* | [**postRowsInGroup**](docs/DatasetsApi.md#postRowsInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName}/rows | Posts new data rows into the specified table
*DatasetsApi* | [**putTable**](docs/DatasetsApi.md#putTable) | **PUT** /v1.0/myorg/datasets/{datasetKey}/tables/{tableName} | Updates a schema and metadata for the specified table
*DatasetsApi* | [**putTableInGroup**](docs/DatasetsApi.md#putTableInGroup) | **PUT** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/tables/{tableName} | Updates a schema and metadata for the specified table
*DatasetsApi* | [**refreshDataset**](docs/DatasetsApi.md#refreshDataset) | **POST** /v1.0/myorg/datasets/{datasetKey}/refreshes | Start a dataset refresh
*DatasetsApi* | [**refreshDatasetInGroup**](docs/DatasetsApi.md#refreshDatasetInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/refreshes | Start a dataset refresh
*DatasetsApi* | [**setAllDatasetConnections**](docs/DatasetsApi.md#setAllDatasetConnections) | **POST** /v1.0/myorg/datasets/{datasetKey}/Default.SetAllConnections | Sets all connections for the specified dataset
*DatasetsApi* | [**setAllDatasetConnectionsInGroup**](docs/DatasetsApi.md#setAllDatasetConnectionsInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.SetAllConnections | Sets all connections for the specified dataset
*DatasetsApi* | [**takeOverInGroup**](docs/DatasetsApi.md#takeOverInGroup) | **POST** /v1.0/myorg/groups/{groupId}/datasets/{datasetKey}/Default.TakeOver | Take Over a dataset
*DatasourcesApi* | [**addDatasourceUser**](docs/DatasourcesApi.md#addDatasourceUser) | **POST** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users | Get a datasource user
*DatasourcesApi* | [**createDatasource**](docs/DatasourcesApi.md#createDatasource) | **POST** /v1.0/myorg/gateways/{gatewayId}/datasources | Create a datasource
*DatasourcesApi* | [**deleteDatasource**](docs/DatasourcesApi.md#deleteDatasource) | **DELETE** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Delete a datasource
*DatasourcesApi* | [**deleteDatasourceUser**](docs/DatasourcesApi.md#deleteDatasourceUser) | **DELETE** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users/{emailAdress} | Delete a datasource user
*DatasourcesApi* | [**getDatasourceById**](docs/DatasourcesApi.md#getDatasourceById) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Get a datasource by id
*DatasourcesApi* | [**getDatasourceStatusById**](docs/DatasourcesApi.md#getDatasourceStatusById) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/status | Get a datasource status by id
*DatasourcesApi* | [**getDatasourceUsers**](docs/DatasourcesApi.md#getDatasourceUsers) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId}/users | Get a datasource users list
*DatasourcesApi* | [**getDatasources**](docs/DatasourcesApi.md#getDatasources) | **GET** /v1.0/myorg/gateways/{gatewayId}/datasources | Get all datasources of specific gateway
*DatasourcesApi* | [**updateDatasource**](docs/DatasourcesApi.md#updateDatasource) | **PATCH** /v1.0/myorg/gateways/{gatewayId}/datasources/{datasourceId} | Update a datasource credentials
*GatewaysApi* | [**getGatewayById**](docs/GatewaysApi.md#getGatewayById) | **GET** /v1.0/myorg/gateways/{gatewayId} | Returns the specified gateway
*GatewaysApi* | [**getGateways**](docs/GatewaysApi.md#getGateways) | **GET** /v1.0/myorg/gateways | Returns a list of gateways
*GroupsApi* | [**addGroupUser**](docs/GroupsApi.md#addGroupUser) | **POST** /v1.0/myorg/groups/{groupId}/users | Add a group user
*GroupsApi* | [**createGroup**](docs/GroupsApi.md#createGroup) | **POST** /v1.0/myorg/groups | Create new group
*GroupsApi* | [**deleteGroup**](docs/GroupsApi.md#deleteGroup) | **DELETE** /v1.0/myorg/groups/{groupId} | Deletes the specified group
*GroupsApi* | [**deleteUserInGroup**](docs/GroupsApi.md#deleteUserInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/users/{user} | Deletes the specified group
*GroupsApi* | [**getGroupUsers**](docs/GroupsApi.md#getGroupUsers) | **GET** /v1.0/myorg/groups/{groupId}/users | Get a group users list
*GroupsApi* | [**getGroups**](docs/GroupsApi.md#getGroups) | **GET** /v1.0/myorg/groups | Returns a list of groups
*ImportsApi* | [**getImportById**](docs/ImportsApi.md#getImportById) | **GET** /v1.0/myorg/imports/{importId} | Gets the import metadata for the specifed import id
*ImportsApi* | [**getImportByIdInGroup**](docs/ImportsApi.md#getImportByIdInGroup) | **GET** /v1.0/myorg/groups/{groupId}/imports/{importId} | Gets the import metadata for the specifed import id
*ImportsApi* | [**getImports**](docs/ImportsApi.md#getImports) | **GET** /v1.0/myorg/imports | Returns a list of imports
*ImportsApi* | [**getImportsInGroup**](docs/ImportsApi.md#getImportsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/imports | Returns a list of imports for the specified group
*ImportsApi* | [**postImport**](docs/ImportsApi.md#postImport) | **POST** /v1.0/myorg/imports | Creates a new import using the specified import info
*ImportsApi* | [**postImportInGroup**](docs/ImportsApi.md#postImportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/imports | Creates a new import using the specified import info
*ReportsApi* | [**cloneReport**](docs/ReportsApi.md#cloneReport) | **POST** /v1.0/myorg/reports/{reportKey}/Clone | Clones the specified report
*ReportsApi* | [**cloneReportInGroup**](docs/ReportsApi.md#cloneReportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Clone | Clones the specified report
*ReportsApi* | [**deleteReport**](docs/ReportsApi.md#deleteReport) | **DELETE** /v1.0/myorg/reports/{reportKey} | Deletes the specified report
*ReportsApi* | [**deleteReportInGroup**](docs/ReportsApi.md#deleteReportInGroup) | **DELETE** /v1.0/myorg/groups/{groupId}/reports/{reportKey} | Deletes the specified report
*ReportsApi* | [**exportReport**](docs/ReportsApi.md#exportReport) | **GET** /v1.0/myorg/reports/{reportKey}/Export | Exports the specified report
*ReportsApi* | [**exportReportInGroup**](docs/ReportsApi.md#exportReportInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Export | Exports the specified report
*ReportsApi* | [**generateToken**](docs/ReportsApi.md#generateToken) | **POST** /v1.0/myorg/reports/{reportKey}/GenerateToken | Generate token to view or edit the specified report
*ReportsApi* | [**generateTokenForCreate**](docs/ReportsApi.md#generateTokenForCreate) | **POST** /v1.0/myorg/reports/GenerateToken | Generate token to create a new report on a given dataset
*ReportsApi* | [**generateTokenForCreateInGroup**](docs/ReportsApi.md#generateTokenForCreateInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/GenerateToken | Generate token to create a new report on a given dataset
*ReportsApi* | [**generateTokenInGroup**](docs/ReportsApi.md#generateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/GenerateToken | Generate token to view or edit the specified report
*ReportsApi* | [**getDashboard**](docs/ReportsApi.md#getDashboard) | **POST** /v1.0/myorg/dashboards/{dashboardKey} | Get the specified dashboard
*ReportsApi* | [**getReport**](docs/ReportsApi.md#getReport) | **GET** /v1.0/myorg/reports/{reportKey} | Get the specified report
*ReportsApi* | [**getReportInGroup**](docs/ReportsApi.md#getReportInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports/{reportKey} | Get the specified report
*ReportsApi* | [**getReports**](docs/ReportsApi.md#getReports) | **GET** /v1.0/myorg/reports | Gets a list of reports
*ReportsApi* | [**getReportsInGroup**](docs/ReportsApi.md#getReportsInGroup) | **GET** /v1.0/myorg/groups/{groupId}/reports | Gets a list of reports available within the specified group
*ReportsApi* | [**rebindReport**](docs/ReportsApi.md#rebindReport) | **POST** /v1.0/myorg/reports/{reportKey}/Rebind | Rebinds the specified report to requested dataset id
*ReportsApi* | [**rebindReportInGroup**](docs/ReportsApi.md#rebindReportInGroup) | **POST** /v1.0/myorg/groups/{groupId}/reports/{reportKey}/Rebind | Rebinds the specified report to requested dataset id
*TilesApi* | [**cloneTile**](docs/TilesApi.md#cloneTile) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey}/Clone | Clones the specified tile
*TilesApi* | [**cloneTileInGroup**](docs/TilesApi.md#cloneTileInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey}/Clone | Clones the specified tile
*TilesApi* | [**generateToken**](docs/TilesApi.md#generateToken) | **POST** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey}/GenerateToken | Generate token to view the specified tile
*TilesApi* | [**generateTokenInGroup**](docs/TilesApi.md#generateTokenInGroup) | **POST** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey}/GenerateToken | Generate token to view the specified tile
*TilesApi* | [**getTile**](docs/TilesApi.md#getTile) | **GET** /v1.0/myorg/dashboards/{dashboardKey}/tiles/{tileKey} | Get a specified tile in a specified dashboard
*TilesApi* | [**getTileInGroup**](docs/TilesApi.md#getTileInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles/{tileKey} | Get a specified tile in a specified dashboard in a group
*TilesApi* | [**getTiles**](docs/TilesApi.md#getTiles) | **GET** /v1.0/myorg/dashboards/{dashboardKey}/tiles | Get tiles in the specified dashboard
*TilesApi* | [**getTilesInGroup**](docs/TilesApi.md#getTilesInGroup) | **GET** /v1.0/myorg/groups/{groupId}/dashboards/{dashboardKey}/tiles | Get tiles in the specified dashboard in a group


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

