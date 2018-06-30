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
 * Connection String wrapper.
 */
@ApiModel(description = "Connection String wrapper.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class ConnectionDetails {
  @SerializedName("connectionString")
  private String connectionString = null;

  public ConnectionDetails connectionString(String connectionString) {
    this.connectionString = connectionString;
    return this;
  }

   /**
   * A dataset connection string.
   * @return connectionString
  **/
  @ApiModelProperty(value = "A dataset connection string.")
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
    ConnectionDetails connectionDetails = (ConnectionDetails) o;
    return Objects.equals(this.connectionString, connectionDetails.connectionString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionDetails {\n");
    
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

