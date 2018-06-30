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
 * Power BI Clone Tile Request
 */
@ApiModel(description = "Power BI Clone Tile Request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class CloneTileRequest {
  @SerializedName("targetDashboardId")
  private String targetDashboardId = null;

  @SerializedName("targetWorkspaceId")
  private String targetWorkspaceId = null;

  @SerializedName("targetReportId")
  private String targetReportId = null;

  @SerializedName("targetModelId")
  private String targetModelId = null;

  @SerializedName("positionConflictAction")
  private String positionConflictAction = null;

  public CloneTileRequest targetDashboardId(String targetDashboardId) {
    this.targetDashboardId = targetDashboardId;
    return this;
  }

   /**
   * The target dashboard id
   * @return targetDashboardId
  **/
  @ApiModelProperty(value = "The target dashboard id")
  public String getTargetDashboardId() {
    return targetDashboardId;
  }

  public void setTargetDashboardId(String targetDashboardId) {
    this.targetDashboardId = targetDashboardId;
  }

  public CloneTileRequest targetWorkspaceId(String targetWorkspaceId) {
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

  public CloneTileRequest targetReportId(String targetReportId) {
    this.targetReportId = targetReportId;
    return this;
  }

   /**
   * Optional parameter for specifying the target report id
   * @return targetReportId
  **/
  @ApiModelProperty(value = "Optional parameter for specifying the target report id")
  public String getTargetReportId() {
    return targetReportId;
  }

  public void setTargetReportId(String targetReportId) {
    this.targetReportId = targetReportId;
  }

  public CloneTileRequest targetModelId(String targetModelId) {
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

  public CloneTileRequest positionConflictAction(String positionConflictAction) {
    this.positionConflictAction = positionConflictAction;
    return this;
  }

   /**
   * Optional parameter for specifying the action in case of position conflict
   * @return positionConflictAction
  **/
  @ApiModelProperty(value = "Optional parameter for specifying the action in case of position conflict")
  public String getPositionConflictAction() {
    return positionConflictAction;
  }

  public void setPositionConflictAction(String positionConflictAction) {
    this.positionConflictAction = positionConflictAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloneTileRequest cloneTileRequest = (CloneTileRequest) o;
    return Objects.equals(this.targetDashboardId, cloneTileRequest.targetDashboardId) &&
        Objects.equals(this.targetWorkspaceId, cloneTileRequest.targetWorkspaceId) &&
        Objects.equals(this.targetReportId, cloneTileRequest.targetReportId) &&
        Objects.equals(this.targetModelId, cloneTileRequest.targetModelId) &&
        Objects.equals(this.positionConflictAction, cloneTileRequest.positionConflictAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetDashboardId, targetWorkspaceId, targetReportId, targetModelId, positionConflictAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloneTileRequest {\n");
    
    sb.append("    targetDashboardId: ").append(toIndentedString(targetDashboardId)).append("\n");
    sb.append("    targetWorkspaceId: ").append(toIndentedString(targetWorkspaceId)).append("\n");
    sb.append("    targetReportId: ").append(toIndentedString(targetReportId)).append("\n");
    sb.append("    targetModelId: ").append(toIndentedString(targetModelId)).append("\n");
    sb.append("    positionConflictAction: ").append(toIndentedString(positionConflictAction)).append("\n");
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

