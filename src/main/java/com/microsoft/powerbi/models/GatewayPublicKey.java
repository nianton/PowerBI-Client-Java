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
 * A Power BI Gateway Public Key
 */
@ApiModel(description = "A Power BI Gateway Public Key")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class GatewayPublicKey {
  @SerializedName("exponent")
  private String exponent = null;

  @SerializedName("modulus")
  private String modulus = null;

  public GatewayPublicKey exponent(String exponent) {
    this.exponent = exponent;
    return this;
  }

   /**
   * The public key exponent
   * @return exponent
  **/
  @ApiModelProperty(value = "The public key exponent")
  public String getExponent() {
    return exponent;
  }

  public void setExponent(String exponent) {
    this.exponent = exponent;
  }

  public GatewayPublicKey modulus(String modulus) {
    this.modulus = modulus;
    return this;
  }

   /**
   * The public key  modulus
   * @return modulus
  **/
  @ApiModelProperty(value = "The public key  modulus")
  public String getModulus() {
    return modulus;
  }

  public void setModulus(String modulus) {
    this.modulus = modulus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayPublicKey gatewayPublicKey = (GatewayPublicKey) o;
    return Objects.equals(this.exponent, gatewayPublicKey.exponent) &&
        Objects.equals(this.modulus, gatewayPublicKey.modulus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exponent, modulus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayPublicKey {\n");
    
    sb.append("    exponent: ").append(toIndentedString(exponent)).append("\n");
    sb.append("    modulus: ").append(toIndentedString(modulus)).append("\n");
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

