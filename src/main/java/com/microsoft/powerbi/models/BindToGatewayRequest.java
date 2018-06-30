package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The Bind dataset to gateway request
 */
@ApiModel(description = "The Bind dataset to gateway request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class BindToGatewayRequest {
  @SerializedName("gatewayObjectId")
  private String gatewayObjectId = null;

  public BindToGatewayRequest gatewayObjectId(String gatewayObjectId) {
    this.gatewayObjectId = gatewayObjectId;
    return this;
  }

   /**
   * The gateway id
   * @return gatewayObjectId
  **/
  @ApiModelProperty(value = "The gateway id")
  public String getGatewayObjectId() {
    return gatewayObjectId;
  }

  public void setGatewayObjectId(String gatewayObjectId) {
    this.gatewayObjectId = gatewayObjectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BindToGatewayRequest bindToGatewayRequest = (BindToGatewayRequest) o;
    return Objects.equals(this.gatewayObjectId, bindToGatewayRequest.gatewayObjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayObjectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BindToGatewayRequest {\n");
    
    sb.append("    gatewayObjectId: ").append(toIndentedString(gatewayObjectId)).append("\n");
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

