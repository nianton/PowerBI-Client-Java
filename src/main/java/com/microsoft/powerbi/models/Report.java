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
 * A Power BI Report
 */
@ApiModel(description = "A Power BI Report")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class Report {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("webUrl")
  private String webUrl = null;

  @SerializedName("embedUrl")
  private String embedUrl = null;

  @SerializedName("datasetId")
  private String datasetId = null;

  public Report id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The report id
   * @return id
  **/
  @ApiModelProperty(value = "The report id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Report name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The report name
   * @return name
  **/
  @ApiModelProperty(value = "The report name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Report webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

   /**
   * The report web url
   * @return webUrl
  **/
  @ApiModelProperty(value = "The report web url")
  public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }

  public Report embedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
    return this;
  }

   /**
   * The report embed url
   * @return embedUrl
  **/
  @ApiModelProperty(value = "The report embed url")
  public String getEmbedUrl() {
    return embedUrl;
  }

  public void setEmbedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
  }

  public Report datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

   /**
   * The dataset id
   * @return datasetId
  **/
  @ApiModelProperty(value = "The dataset id")
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
    Report report = (Report) o;
    return Objects.equals(this.id, report.id) &&
        Objects.equals(this.name, report.name) &&
        Objects.equals(this.webUrl, report.webUrl) &&
        Objects.equals(this.embedUrl, report.embedUrl) &&
        Objects.equals(this.datasetId, report.datasetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, webUrl, embedUrl, datasetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    embedUrl: ").append(toIndentedString(embedUrl)).append("\n");
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

