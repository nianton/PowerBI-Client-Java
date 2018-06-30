package com.microsoft.powerbi.api;

import com.microsoft.powerbi.ApiException;
import com.microsoft.powerbi.models.CloneTileRequest;
import com.microsoft.powerbi.models.EmbedToken;
import com.microsoft.powerbi.models.GenerateTokenRequest;
import com.microsoft.powerbi.models.ODataResponseListTile;
import com.microsoft.powerbi.models.Tile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TilesApi
 */
@Ignore
public class TilesApiTest {

    private final TilesApi api = new TilesApi();

    
    /**
     * Clones the specified tile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cloneTileTest() throws ApiException {
        String dashboardKey = null;
        String tileKey = null;
        CloneTileRequest requestParameters = null;
        Tile response = api.cloneTile(dashboardKey, tileKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Clones the specified tile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cloneTileInGroupTest() throws ApiException {
        String groupId = null;
        String dashboardKey = null;
        String tileKey = null;
        CloneTileRequest requestParameters = null;
        Tile response = api.cloneTileInGroup(groupId, dashboardKey, tileKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Generate token to view the specified tile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateTokenTest() throws ApiException {
        String dashboardKey = null;
        String tileKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.generateToken(dashboardKey, tileKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Generate token to view the specified tile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateTokenInGroupTest() throws ApiException {
        String groupId = null;
        String dashboardKey = null;
        String tileKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.generateTokenInGroup(groupId, dashboardKey, tileKey, requestParameters);

        // TODO: test validations
    }
    
    /**
     * Get a specified tile in a specified dashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTileTest() throws ApiException {
        String dashboardKey = null;
        String tileKey = null;
        Tile response = api.getTile(dashboardKey, tileKey);

        // TODO: test validations
    }
    
    /**
     * Get a specified tile in a specified dashboard in a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTileInGroupTest() throws ApiException {
        String groupId = null;
        String dashboardKey = null;
        String tileKey = null;
        Tile response = api.getTileInGroup(groupId, dashboardKey, tileKey);

        // TODO: test validations
    }
    
    /**
     * Get tiles in the specified dashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTilesTest() throws ApiException {
        String dashboardKey = null;
        ODataResponseListTile response = api.getTiles(dashboardKey);

        // TODO: test validations
    }
    
    /**
     * Get tiles in the specified dashboard in a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTilesInGroupTest() throws ApiException {
        String groupId = null;
        String dashboardKey = null;
        ODataResponseListTile response = api.getTilesInGroup(groupId, dashboardKey);

        // TODO: test validations
    }
    
}
