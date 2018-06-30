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
import org.threeten.bp.OffsetDateTime;

/**
 * A Power BI refresh history entry
 */
@ApiModel(description = "A Power BI refresh history entry")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class Refresh {
  @SerializedName("refreshType")
  private String refreshType = null;

  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  @SerializedName("endTime")
  private OffsetDateTime endTime = null;

  @SerializedName("serviceExceptionJson")
  private String serviceExceptionJson = null;

  @SerializedName("status")
  private String status = null;

  public Refresh refreshType(String refreshType) {
    this.refreshType = refreshType;
    return this;
  }

   /**
   * 
   * @return refreshType
  **/
  @ApiModelProperty(value = "")
  public String getRefreshType() {
    return refreshType;
  }

  public void setRefreshType(String refreshType) {
    this.refreshType = refreshType;
  }

  public Refresh startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public Refresh endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public Refresh serviceExceptionJson(String serviceExceptionJson) {
    this.serviceExceptionJson = serviceExceptionJson;
    return this;
  }

   /**
   * 
   * @return serviceExceptionJson
  **/
  @ApiModelProperty(value = "")
  public String getServiceExceptionJson() {
    return serviceExceptionJson;
  }

  public void setServiceExceptionJson(String serviceExceptionJson) {
    this.serviceExceptionJson = serviceExceptionJson;
  }

  public Refresh status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Refresh refresh = (Refresh) o;
    return Objects.equals(this.refreshType, refresh.refreshType) &&
        Objects.equals(this.startTime, refresh.startTime) &&
        Objects.equals(this.endTime, refresh.endTime) &&
        Objects.equals(this.serviceExceptionJson, refresh.serviceExceptionJson) &&
        Objects.equals(this.status, refresh.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshType, startTime, endTime, serviceExceptionJson, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Refresh {\n");
    
    sb.append("    refreshType: ").append(toIndentedString(refreshType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    serviceExceptionJson: ").append(toIndentedString(serviceExceptionJson)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

