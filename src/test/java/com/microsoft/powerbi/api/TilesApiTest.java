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
    public void dashboardsCloneTileTest() throws ApiException {
        String dashboardKey = null;
        String tileKey = null;
        CloneTileRequest requestParameters = null;
        Tile response = api.dashboardsCloneTile(dashboardKey, tileKey, requestParameters);

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
    public void dashboardsCloneTileInGroupTest() throws ApiException {
        String groupId = null;
        String dashboardKey = null;
        String tileKey = null;
        CloneTileRequest requestParameters = null;
        Tile response = api.dashboardsCloneTileInGroup(groupId, dashboardKey, tileKey, requestParameters);

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
    public void dashboardsGetTileTest() throws ApiException {
        String dashboardKey = null;
        String tileKey = null;
        Tile response = api.dashboardsGetTile(dashboardKey, tileKey);

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
    public void dashboardsGetTileInGroupTest() throws ApiException {
        String groupId = null;
        String dashboardKey = null;
        String tileKey = null;
        Tile response = api.dashboardsGetTileInGroup(groupId, dashboardKey, tileKey);

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
    public void dashboardsGetTilesTest() throws ApiException {
        String dashboardKey = null;
        ODataResponseListTile response = api.dashboardsGetTiles(dashboardKey);

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
    public void dashboardsGetTilesInGroupTest() throws ApiException {
        String groupId = null;
        String dashboardKey = null;
        ODataResponseListTile response = api.dashboardsGetTilesInGroup(groupId, dashboardKey);

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
    public void tilesGenerateTokenTest() throws ApiException {
        String dashboardKey = null;
        String tileKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.tilesGenerateToken(dashboardKey, tileKey, requestParameters);

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
    public void tilesGenerateTokenInGroupTest() throws ApiException {
        String groupId = null;
        String dashboardKey = null;
        String tileKey = null;
        GenerateTokenRequest requestParameters = null;
        EmbedToken response = api.tilesGenerateTokenInGroup(groupId, dashboardKey, tileKey, requestParameters);

        // TODO: test validations
    }
    
}
