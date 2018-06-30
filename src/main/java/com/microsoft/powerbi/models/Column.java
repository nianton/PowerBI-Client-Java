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
 * A Power BI Column
 */
@ApiModel(description = "A Power BI Column")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class Column {
  @SerializedName("name")
  private String name = null;

  @SerializedName("dataType")
  private String dataType = null;

  public Column name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The column name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The column name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Column dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * The column data type
   * @return dataType
  **/
  @ApiModelProperty(required = true, value = "The column data type")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Column column = (Column) o;
    return Objects.equals(this.name, column.name) &&
        Objects.equals(this.dataType, column.dataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dataType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Column {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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

