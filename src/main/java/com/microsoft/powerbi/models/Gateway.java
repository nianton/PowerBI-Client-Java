package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.powerbi.models.GatewayPublicKey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A Power BI Gateway
 */
@ApiModel(description = "A Power BI Gateway")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class Gateway {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("gatewayAnnotation")
  private String gatewayAnnotation = null;

  @SerializedName("publicKey")
  private GatewayPublicKey publicKey = null;

  @SerializedName("gatewayStatus")
  private String gatewayStatus = null;

  public Gateway id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The gateway id
   * @return id
  **/
  @ApiModelProperty(value = "The gateway id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Gateway name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The gateway name
   * @return name
  **/
  @ApiModelProperty(value = "The gateway name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gateway type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The gateway type
   * @return type
  **/
  @ApiModelProperty(value = "The gateway type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Gateway gatewayAnnotation(String gatewayAnnotation) {
    this.gatewayAnnotation = gatewayAnnotation;
    return this;
  }

   /**
   * The gateway annotation
   * @return gatewayAnnotation
  **/
  @ApiModelProperty(value = "The gateway annotation")
  public String getGatewayAnnotation() {
    return gatewayAnnotation;
  }

  public void setGatewayAnnotation(String gatewayAnnotation) {
    this.gatewayAnnotation = gatewayAnnotation;
  }

  public Gateway publicKey(GatewayPublicKey publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * The gateway public key
   * @return publicKey
  **/
  @ApiModelProperty(value = "The gateway public key")
  public GatewayPublicKey getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(GatewayPublicKey publicKey) {
    this.publicKey = publicKey;
  }

  public Gateway gatewayStatus(String gatewayStatus) {
    this.gatewayStatus = gatewayStatus;
    return this;
  }

   /**
   * The gateway connectivity status
   * @return gatewayStatus
  **/
  @ApiModelProperty(value = "The gateway connectivity status")
  public String getGatewayStatus() {
    return gatewayStatus;
  }

  public void setGatewayStatus(String gatewayStatus) {
    this.gatewayStatus = gatewayStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gateway gateway = (Gateway) o;
    return Objects.equals(this.id, gateway.id) &&
        Objects.equals(this.name, gateway.name) &&
        Objects.equals(this.type, gateway.type) &&
        Objects.equals(this.gatewayAnnotation, gateway.gatewayAnnotation) &&
        Objects.equals(this.publicKey, gateway.publicKey) &&
        Objects.equals(this.gatewayStatus, gateway.gatewayStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, gatewayAnnotation, publicKey, gatewayStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gateway {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    gatewayAnnotation: ").append(toIndentedString(gatewayAnnotation)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    gatewayStatus: ").append(toIndentedString(gatewayStatus)).append("\n");
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

