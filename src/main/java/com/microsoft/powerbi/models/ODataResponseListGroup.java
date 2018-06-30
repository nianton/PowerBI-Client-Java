package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.powerbi.models.Group;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Odata response wrapper for a Power BI Group list
 */
@ApiModel(description = "Odata response wrapper for a Power BI Group list")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class ODataResponseListGroup {
  @SerializedName("odata.context")
  private String odataContext = null;

  @SerializedName("value")
  private List<Group> value = null;

  public ODataResponseListGroup odataContext(String odataContext) {
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

  public ODataResponseListGroup value(List<Group> value) {
    this.value = value;
    return this;
  }

  public ODataResponseListGroup addValueItem(Group valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<Group>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * The groups
   * @return value
  **/
  @ApiModelProperty(value = "The groups")
  public List<Group> getValue() {
    return value;
  }

  public void setValue(List<Group> value) {
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
    ODataResponseListGroup odataResponseListGroup = (ODataResponseListGroup) o;
    return Objects.equals(this.odataContext, odataResponseListGroup.odataContext) &&
        Objects.equals(this.value, odataResponseListGroup.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ODataResponseListGroup {\n");
    
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

