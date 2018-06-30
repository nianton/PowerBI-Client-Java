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
 * Power BI Clone Report Request
 */
@ApiModel(description = "Power BI Clone Report Request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class CloneReportRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("targetWorkspaceId")
  private String targetWorkspaceId = null;

  @SerializedName("targetModelId")
  private String targetModelId = null;

  public CloneReportRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The requested report name
   * @return name
  **/
  @ApiModelProperty(value = "The requested report name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloneReportRequest targetWorkspaceId(String targetWorkspaceId) {
    this.targetWorkspaceId = targetWorkspaceId;
    return this;
  }

   /**
   * Optional parameter for specifying the target workspace id
   * @return targetWorkspaceId
  **/
  @ApiModelProperty(value = "Optional parameter for specifying the target workspace id")
  public String getTargetWorkspaceId() {
    return targetWorkspaceId;
  }

  public void setTargetWorkspaceId(String targetWorkspaceId) {
    this.targetWorkspaceId = targetWorkspaceId;
  }

  public CloneReportRequest targetModelId(String targetModelId) {
    this.targetModelId = targetModelId;
    return this;
  }

   /**
   * Optional parameter for specifying the target associated model (dataset) id
   * @return targetModelId
  **/
  @ApiModelProperty(value = "Optional parameter for specifying the target associated model (dataset) id")
  public String getTargetModelId() {
    return targetModelId;
  }

  public void setTargetModelId(String targetModelId) {
    this.targetModelId = targetModelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloneReportRequest cloneReportRequest = (CloneReportRequest) o;
    return Objects.equals(this.name, cloneReportRequest.name) &&
        Objects.equals(this.targetWorkspaceId, cloneReportRequest.targetWorkspaceId) &&
        Objects.equals(this.targetModelId, cloneReportRequest.targetModelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, targetWorkspaceId, targetModelId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloneReportRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetWorkspaceId: ").append(toIndentedString(targetWorkspaceId)).append("\n");
    sb.append("    targetModelId: ").append(toIndentedString(targetModelId)).append("\n");
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

