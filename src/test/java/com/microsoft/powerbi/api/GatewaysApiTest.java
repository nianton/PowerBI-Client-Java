package com.microsoft.powerbi.api;

import com.microsoft.powerbi.ApiException;
import com.microsoft.powerbi.models.Gateway;
import com.microsoft.powerbi.models.ODataResponseListGateway;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GatewaysApi
 */
@Ignore
public class GatewaysApiTest {

    private final GatewaysApi api = new GatewaysApi();

    
    /**
     * Returns the specified gateway
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGatewayByIdTest() throws ApiException {
        String gatewayId = null;
        Gateway response = api.getGatewayById(gatewayId);

        // TODO: test validations
    }
    
    /**
     * Returns a list of gateways
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGatewaysTest() throws ApiException {
        ODataResponseListGateway response = api.getGateways();

        // TODO: test validations
    }
    
}
