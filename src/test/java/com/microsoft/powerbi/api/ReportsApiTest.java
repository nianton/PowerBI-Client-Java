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
     * Clones the specified report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cloneReportTest() throws ApiException {
        String reportKey = null;
        CloneReportRequest requestParameters = null;
        Report response = api.cloneReport(reportKey, requestParameters);

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
    public void cloneReportInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        CloneReportRequest requestParameters = null;
        Report response = api.cloneReportInGroup(groupId, reportKey, requestParameters);

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
    public void deleteReportTest() throws ApiException {
        String reportKey = null;
        Object response = api.deleteReport(reportKey);

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
    public void deleteReportInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        Object response = api.deleteReportInGroup(groupId, reportKey);

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
    public void exportReportTest() throws ApiException {
        String reportKey = null;
        File response = api.exportReport(reportKey);

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
    public void exportReportInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        File response = api.exportReportInGroup(groupId, reportKey);

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
    public void generateTokenTest() throws ApiException {
        String reportKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.generateToken(reportKey, requestParameters);

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
    public void generateTokenForCreateTest() throws ApiException {
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.generateTokenForCreate(requestParameters);

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
    public void generateTokenForCreateInGroupTest() throws ApiException {
        String groupId = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.generateTokenForCreateInGroup(groupId, requestParameters);

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
    public void generateTokenInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.generateTokenInGroup(groupId, reportKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Get the specified dashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDashboardTest() throws ApiException {
        String dashboardKey = null;
        Dashboard response = api.getDashboard(dashboardKey);

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
    public void getReportTest() throws ApiException {
        String reportKey = null;
        Report response = api.getReport(reportKey);

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
    public void getReportInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        Report response = api.getReportInGroup(groupId, reportKey);

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
    public void getReportsTest() throws ApiException {
        ODataResponseListReport response = api.getReports();

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
    public void getReportsInGroupTest() throws ApiException {
        String groupId = null;
        ODataResponseListReport response = api.getReportsInGroup(groupId);

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
    public void rebindReportTest() throws ApiException {
        String reportKey = null;
        RebindReportRequest requestParameters = null;
        Object response = api.rebindReport(reportKey, requestParameters);

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
    public void rebindReportInGroupTest() throws ApiException {
        String groupId = null;
        String reportKey = null;
        RebindReportRequest requestParameters = null;
        Object response = api.rebindReportInGroup(groupId, reportKey, requestParameters);

        // TODO: test validations
    }
    
}
