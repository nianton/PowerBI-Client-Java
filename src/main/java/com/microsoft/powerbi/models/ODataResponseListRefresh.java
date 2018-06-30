package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.powerbi.models.Refresh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Odata response wrapper for a Power BI Refresh history
 */
@ApiModel(description = "Odata response wrapper for a Power BI Refresh history")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class ODataResponseListRefresh {
  @SerializedName("odata.context")
  private String odataContext = null;

  @SerializedName("value")
  private List<Refresh> value = null;

  public ODataResponseListRefresh odataContext(String odataContext) {
    this.odataContext = odataContext;
    return this;
  }

   /**
   * Get odataContext
   * @return odataContext
  **/
  @ApiModelProperty(value = "")
  public String getOdataContext() {
    return odataContext;
  }

  public void setOdataContext(String odataContext) {
    this.odataContext = odataContext;
  }

  public ODataResponseListRefresh value(List<Refresh> value) {
    this.value = value;
    return this;
  }

  public ODataResponseListRefresh addValueItem(Refresh valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<Refresh>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * The Refresh history list
   * @return value
  **/
  @ApiModelProperty(value = "The Refresh history list")
  public List<Refresh> getValue() {
    return value;
  }

  public void setValue(List<Refresh> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ODataResponseListRefresh odataResponseListRefresh = (ODataResponseListRefresh) o;
    return Objects.equals(this.odataContext, odataResponseListRefresh.odataContext) &&
        Objects.equals(this.value, odataResponseListRefresh.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ODataResponseListRefresh {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

