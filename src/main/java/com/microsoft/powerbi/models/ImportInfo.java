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
 * The import info
 */
@ApiModel(description = "The import info")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class ImportInfo {
  @SerializedName("filePath")
  private String filePath = null;

  @SerializedName("connectionType")
  private String connectionType = null;

  public ImportInfo filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * The file path to import
   * @return filePath
  **/
  @ApiModelProperty(value = "The file path to import")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public ImportInfo connectionType(String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * The import connection type
   * @return connectionType
  **/
  @ApiModelProperty(value = "The import connection type")
  public String getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportInfo importInfo = (ImportInfo) o;
    return Objects.equals(this.filePath, importInfo.filePath) &&
        Objects.equals(this.connectionType, importInfo.connectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, connectionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportInfo {\n");
    
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
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

