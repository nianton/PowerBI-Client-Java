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
 * A Power BI datasource
 */
@ApiModel(description = "A Power BI datasource")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class Datasource {
  @SerializedName("name")
  private String name = null;

  @SerializedName("connectionString")
  private String connectionString = null;

  public Datasource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The datasource name
   * @return name
  **/
  @ApiModelProperty(value = "The datasource name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Datasource connectionString(String connectionString) {
    this.connectionString = connectionString;
    return this;
  }

   /**
   * The datasource connection string
   * @return connectionString
  **/
  @ApiModelProperty(value = "The datasource connection string")
  public String getConnectionString() {
    return connectionString;
  }

  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datasource datasource = (Datasource) o;
    return Objects.equals(this.name, datasource.name) &&
        Objects.equals(this.connectionString, datasource.connectionString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, connectionString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datasource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
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

