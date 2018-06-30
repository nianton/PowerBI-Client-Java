package com.microsoft.powerbi;

import com.microsoft.powerbi.api.DashboardsApi;
import com.microsoft.powerbi.api.DatasetsApi;
import com.microsoft.powerbi.api.DatasourcesApi;
import com.microsoft.powerbi.api.GatewaysApi;
import com.microsoft.powerbi.api.GroupsApi;
import com.microsoft.powerbi.api.ImportsApi;
import com.microsoft.powerbi.api.ReportsApi;
import com.microsoft.powerbi.api.TilesApi;

public class PowerBiApiClient {
    
    private ApiClient apiClient;
    private DashboardsApi dashboards;
    private ReportsApi reports;
    private GroupsApi groups;
    private DatasetsApi datasets;
    private DatasourcesApi datasources;
    private TilesApi tiles;
    private ImportsApi imports;
    private GatewaysApi gateways;

    public PowerBiApiClient() {
        this(Configuration.getDefaultApiClient());
    }
    
	public PowerBiApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
        this.dashboards = new DashboardsApi(apiClient);
        this.groups = new GroupsApi(apiClient);
        this.datasets = new DatasetsApi(apiClient);
        this.datasources = new DatasourcesApi(apiClient);
        this.reports = new ReportsApi(apiClient);
        this.tiles = new TilesApi(apiClient);
        this.imports = new ImportsApi(apiClient);
        this.gateways = new GatewaysApi(apiClient);
    }

	/**
	 * @return the gateways
	 */
	public GatewaysApi getGateways() {
		return gateways;
	}

	/**
	 * @return the imports
	 */
	public ImportsApi getImports() {
		return imports;
	}

	/**
	 * @return the tiles
	 */
	public TilesApi getTiles() {
		return tiles;
	}

	/**
	 * @return the datasources
	 */
	public DatasourcesApi getDatasources() {
		return datasources;
	}

	/**
	 * @return the datasets
	 */
	public DatasetsApi getDatasets() {
		return datasets;
	}

	/**
	 * @return the groups
	 */
	public GroupsApi getGroups() {
		return groups;
	}

	/**
	 * @return the reports
	 */
	public ReportsApi getReports() {
		return reports;
	}

	/**
	 * @return the dashboards
	 */
	public DashboardsApi getDashboards() {
		return dashboards;
	}

        /**
	 * @return the apiClient
	 */
	public ApiClient getApiClient() {
		return apiClient;
    }
    
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
        this.dashboards.setApiClient(apiClient);
        this.groups.setApiClient(apiClient);
        this.datasets.setApiClient(apiClient);
        this.datasources.setApiClient(apiClient);
        this.tiles.setApiClient(apiClient);
        this.reports.setApiClient(apiClient);
        this.imports.setApiClient(apiClient);
        this.gateways.setApiClient(apiClient);
    }
}