package com.microsoft.powerbi.api;

import com.microsoft.powerbi.ApiException;
import com.microsoft.powerbi.models.CloneReportRequest;
import com.microsoft.powerbi.models.Dashboard;
import com.microsoft.powerbi.models.EmbedToken;
import java.io.File;
import com.microsoft.powerbi.models.GenerateTokenRequest;
import com.microsoft.powerbi.models.ODataResponseListReport;
import com.microsoft.powerbi.models.RebindReportRequest;
import com.microsoft.powerbi.models.Report;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsApi
 */
@Ignore
public class ReportsApiTest {

    private final ReportsApi api = new ReportsApi();

    
    /**
     * Get the specified dashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dashboardsGetDashboardTest() throws ApiException {
        String dashboardKey = null;
        Dashboard response = api.dashboardsGetDashboard(dashboardKey);

        // TODO: test validations
    }
    
    /**
     * Clones the specified report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsCloneReportTest() throws ApiException {
        String reportKey = null;
        CloneReportRequest requestParameters = null;
        Report response = api.reportsCloneReport(reportKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Clones the specified report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsCloneReportInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        CloneReportRequest requestParameters = null;
        Report response = api.reportsCloneReportInGroup(groupId, reportKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Deletes the specified report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsDeleteReportTest() throws ApiException {
        String reportKey = null;
        Object response = api.reportsDeleteReport(reportKey);

        // TODO: test validations
    }
    
    /**
     * Deletes the specified report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsDeleteReportInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        Object response = api.reportsDeleteReportInGroup(groupId, reportKey);

        // TODO: test validations
    }
    
    /**
     * Exports the specified report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsExportReportTest() throws ApiException {
        String reportKey = null;
        File response = api.reportsExportReport(reportKey);

        // TODO: test validations
    }
    
    /**
     * Exports the specified report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsExportReportInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        File response = api.reportsExportReportInGroup(groupId, reportKey);

        // TODO: test validations
    }
    
    /**
     * Generate token to view or edit the specified report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGenerateTokenTest() throws ApiException {
        String reportKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.reportsGenerateToken(reportKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Generate token to create a new report on a given dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGenerateTokenForCreateTest() throws ApiException {
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.reportsGenerateTokenForCreate(requestParameters);

        // TODO: test validations
    }
    
    /**
     * Generate token to create a new report on a given dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGenerateTokenForCreateInGroupTest() throws ApiException {
        String groupId = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.reportsGenerateTokenForCreateInGroup(groupId, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Generate token to view or edit the specified report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGenerateTokenInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.reportsGenerateTokenInGroup(groupId, reportKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Get the specified report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGetReportTest() throws ApiException {
        String reportKey = null;
        Report response = api.reportsGetReport(reportKey);

        // TODO: test validations
    }
    
    /**
     * Get the specified report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGetReportInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        Report response = api.reportsGetReportInGroup(groupId, reportKey);

        // TODO: test validations
    }
    
    /**
     * Gets a list of reports
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGetReportsTest() throws ApiException {
        ODataResponseListReport response = api.reportsGetReports();

        // TODO: test validations
    }
    
    /**
     * Gets a list of reports available within the specified group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGetReportsInGroupTest() throws ApiException {
        String groupId = null;
        ODataResponseListReport response = api.reportsGetReportsInGroup(groupId);

        // TODO: test validations
    }
    
    /**
     * Rebinds the specified report to requested dataset id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsRebindReportTest() throws ApiException {
        String reportKey = null;
        RebindReportRequest requestParameters = null;
        Object response = api.reportsRebindReport(reportKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Rebinds the specified report to requested dataset id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsRebindReportInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        RebindReportRequest requestParameters = null;
        Object response = api.reportsRebindReportInGroup(groupId, reportKey, requestParameters);

        // TODO: test validations
    }
    
}
