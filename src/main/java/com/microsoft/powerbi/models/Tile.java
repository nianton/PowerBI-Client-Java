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
 * A Power BI Tile
 */
@ApiModel(description = "A Power BI Tile")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class Tile {
  @SerializedName("id")
  private String id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("rowSpan")
  private Integer rowSpan = null;

  @SerializedName("colSpan")
  private Integer colSpan = null;

  @SerializedName("embedUrl")
  private String embedUrl = null;

  @SerializedName("embedData")
  private String embedData = null;

  @SerializedName("reportId")
  private String reportId = null;

  @SerializedName("datasetId")
  private String datasetId = null;

  public Tile id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The tile id
   * @return id
  **/
  @ApiModelProperty(value = "The tile id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Tile title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The dashboard display name
   * @return title
  **/
  @ApiModelProperty(value = "The dashboard display name")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Tile rowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
    return this;
  }

   /**
   * number of rows a tile should span
   * @return rowSpan
  **/
  @ApiModelProperty(value = "number of rows a tile should span")
  public Integer getRowSpan() {
    return rowSpan;
  }

  public void setRowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
  }

  public Tile colSpan(Integer colSpan) {
    this.colSpan = colSpan;
    return this;
  }

   /**
   * number of columns a tile should span
   * @return colSpan
  **/
  @ApiModelProperty(value = "number of columns a tile should span")
  public Integer getColSpan() {
    return colSpan;
  }

  public void setColSpan(Integer colSpan) {
    this.colSpan = colSpan;
  }

  public Tile embedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
    return this;
  }

   /**
   * The tile embed url
   * @return embedUrl
  **/
  @ApiModelProperty(value = "The tile embed url")
  public String getEmbedUrl() {
    return embedUrl;
  }

  public void setEmbedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
  }

  public Tile embedData(String embedData) {
    this.embedData = embedData;
    return this;
  }

   /**
   * The tile embed data
   * @return embedData
  **/
  @ApiModelProperty(value = "The tile embed data")
  public String getEmbedData() {
    return embedData;
  }

  public void setEmbedData(String embedData) {
    this.embedData = embedData;
  }

  public Tile reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The report id
   * @return reportId
  **/
  @ApiModelProperty(value = "The report id")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public Tile datasetId(String datasetId) {
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
    Tile tile = (Tile) o;
    return Objects.equals(this.id, tile.id) &&
        Objects.equals(this.title, tile.title) &&
        Objects.equals(this.rowSpan, tile.rowSpan) &&
        Objects.equals(this.colSpan, tile.colSpan) &&
        Objects.equals(this.embedUrl, tile.embedUrl) &&
        Objects.equals(this.embedData, tile.embedData) &&
        Objects.equals(this.reportId, tile.reportId) &&
        Objects.equals(this.datasetId, tile.datasetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, rowSpan, colSpan, embedUrl, embedData, reportId, datasetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    rowSpan: ").append(toIndentedString(rowSpan)).append("\n");
    sb.append("    colSpan: ").append(toIndentedString(colSpan)).append("\n");
    sb.append("    embedUrl: ").append(toIndentedString(embedUrl)).append("\n");
    sb.append("    embedData: ").append(toIndentedString(embedData)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
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

