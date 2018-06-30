package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.powerbi.models.Dataset;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A dataset odata list wrapper
 */
@ApiModel(description = "A dataset odata list wrapper")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class ODataResponseListDataset {
  @SerializedName("odata.context")
  private String odataContext = null;

  @SerializedName("value")
  private List<Dataset> value = null;

  public ODataResponseListDataset odataContext(String odataContext) {
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

  public ODataResponseListDataset value(List<Dataset> value) {
    this.value = value;
    return this;
  }

  public ODataResponseListDataset addValueItem(Dataset valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<Dataset>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * The datasets
   * @return value
  **/
  @ApiModelProperty(value = "The datasets")
  public List<Dataset> getValue() {
    return value;
  }

  public void setValue(List<Dataset> value) {
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
    ODataResponseListDataset odataResponseListDataset = (ODataResponseListDataset) o;
    return Objects.equals(this.odataContext, odataResponseListDataset.odataContext) &&
        Objects.equals(this.value, odataResponseListDataset.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ODataResponseListDataset {\n");
    
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

