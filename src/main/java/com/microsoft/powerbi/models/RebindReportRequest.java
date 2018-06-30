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
 * Power BI Rebind Report Request
 */
@ApiModel(description = "Power BI Rebind Report Request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class RebindReportRequest {
  @SerializedName("datasetId")
  private String datasetId = null;

  public RebindReportRequest datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

   /**
   * The new dataset of the rebinded report
   * @return datasetId
  **/
  @ApiModelProperty(value = "The new dataset of the rebinded report")
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebindReportRequest rebindReportRequest = (RebindReportRequest) o;
    return Objects.equals(this.datasetId, rebindReportRequest.datasetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebindReportRequest {\n");
    
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
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

