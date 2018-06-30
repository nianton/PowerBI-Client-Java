package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.powerbi.models.Dashboard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Odata response wrapper for a Power BI Dashboard collection
 */
@ApiModel(description = "Odata response wrapper for a Power BI Dashboard collection")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class ODataResponseListDashboard {
  @SerializedName("odata.context")
  private String odataContext = null;

  @SerializedName("value")
  private List<Dashboard> value = null;

  public ODataResponseListDashboard odataContext(String odataContext) {
    this.odataContext = odataContext;
    return this;
  }

   /**
   * OData context
   * @return odataContext
  **/
  @ApiModelProperty(value = "OData context")
  public String getOdataContext() {
    return odataContext;
  }

  public void setOdataContext(String odataContext) {
    this.odataContext = odataContext;
  }

  public ODataResponseListDashboard value(List<Dashboard> value) {
    this.value = value;
    return this;
  }

  public ODataResponseListDashboard addValueItem(Dashboard valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<Dashboard>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * The dashboard collection
   * @return value
  **/
  @ApiModelProperty(value = "The dashboard collection")
  public List<Dashboard> getValue() {
    return value;
  }

  public void setValue(List<Dashboard> value) {
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
    ODataResponseListDashboard odataResponseListDashboard = (ODataResponseListDashboard) o;
    return Objects.equals(this.odataContext, odataResponseListDashboard.odataContext) &&
        Objects.equals(this.value, odataResponseListDashboard.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ODataResponseListDashboard {\n");
    
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

