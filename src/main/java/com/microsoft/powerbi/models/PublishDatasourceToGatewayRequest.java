package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.powerbi.models.CredentialDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A Publish Datasource To Gateway Request
 */
@ApiModel(description = "A Publish Datasource To Gateway Request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class PublishDatasourceToGatewayRequest {
  @SerializedName("dataSourceType")
  private String dataSourceType = null;

  @SerializedName("connectionDetails")
  private String connectionDetails = null;

  @SerializedName("credentialDetails")
  private CredentialDetails credentialDetails = null;

  @SerializedName("dataSourceName")
  private String dataSourceName = null;

  public PublishDatasourceToGatewayRequest dataSourceType(String dataSourceType) {
    this.dataSourceType = dataSourceType;
    return this;
  }

   /**
   * The datasource type
   * @return dataSourceType
  **/
  @ApiModelProperty(value = "The datasource type")
  public String getDataSourceType() {
    return dataSourceType;
  }

  public void setDataSourceType(String dataSourceType) {
    this.dataSourceType = dataSourceType;
  }

  public PublishDatasourceToGatewayRequest connectionDetails(String connectionDetails) {
    this.connectionDetails = connectionDetails;
    return this;
  }

   /**
   * The connection details
   * @return connectionDetails
  **/
  @ApiModelProperty(value = "The connection details")
  public String getConnectionDetails() {
    return connectionDetails;
  }

  public void setConnectionDetails(String connectionDetails) {
    this.connectionDetails = connectionDetails;
  }

  public PublishDatasourceToGatewayRequest credentialDetails(CredentialDetails credentialDetails) {
    this.credentialDetails = credentialDetails;
    return this;
  }

   /**
   * Get credentialDetails
   * @return credentialDetails
  **/
  @ApiModelProperty(value = "")
  public CredentialDetails getCredentialDetails() {
    return credentialDetails;
  }

  public void setCredentialDetails(CredentialDetails credentialDetails) {
    this.credentialDetails = credentialDetails;
  }

  public PublishDatasourceToGatewayRequest dataSourceName(String dataSourceName) {
    this.dataSourceName = dataSourceName;
    return this;
  }

   /**
   * The datasource name
   * @return dataSourceName
  **/
  @ApiModelProperty(value = "The datasource name")
  public String getDataSourceName() {
    return dataSourceName;
  }

  public void setDataSourceName(String dataSourceName) {
    this.dataSourceName = dataSourceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishDatasourceToGatewayRequest publishDatasourceToGatewayRequest = (PublishDatasourceToGatewayRequest) o;
    return Objects.equals(this.dataSourceType, publishDatasourceToGatewayRequest.dataSourceType) &&
        Objects.equals(this.connectionDetails, publishDatasourceToGatewayRequest.connectionDetails) &&
        Objects.equals(this.credentialDetails, publishDatasourceToGatewayRequest.credentialDetails) &&
        Objects.equals(this.dataSourceName, publishDatasourceToGatewayRequest.dataSourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceType, connectionDetails, credentialDetails, dataSourceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishDatasourceToGatewayRequest {\n");
    
    sb.append("    dataSourceType: ").append(toIndentedString(dataSourceType)).append("\n");
    sb.append("    connectionDetails: ").append(toIndentedString(connectionDetails)).append("\n");
    sb.append("    credentialDetails: ").append(toIndentedString(credentialDetails)).append("\n");
    sb.append("    dataSourceName: ").append(toIndentedString(dataSourceName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

