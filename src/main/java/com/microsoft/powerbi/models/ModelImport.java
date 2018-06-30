package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.powerbi.models.Dataset;
import com.microsoft.powerbi.models.Report;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * The import object
 */
@ApiModel(description = "The import object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class ModelImport {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("importState")
  private String importState = null;

  @SerializedName("reports")
  private List<Report> reports = null;

  @SerializedName("datasets")
  private List<Dataset> datasets = null;

  @SerializedName("createdDateTime")
  private OffsetDateTime createdDateTime = null;

  @SerializedName("updatedDateTime")
  private OffsetDateTime updatedDateTime = null;

  public ModelImport id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The import id
   * @return id
  **/
  @ApiModelProperty(value = "The import id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ModelImport name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The import name name
   * @return name
  **/
  @ApiModelProperty(value = "The import name name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelImport importState(String importState) {
    this.importState = importState;
    return this;
  }

   /**
   * The import upload state
   * @return importState
  **/
  @ApiModelProperty(value = "The import upload state")
  public String getImportState() {
    return importState;
  }

  public void setImportState(String importState) {
    this.importState = importState;
  }

  public ModelImport reports(List<Report> reports) {
    this.reports = reports;
    return this;
  }

  public ModelImport addReportsItem(Report reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<Report>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * The reports associated with this import
   * @return reports
  **/
  @ApiModelProperty(value = "The reports associated with this import")
  public List<Report> getReports() {
    return reports;
  }

  public void setReports(List<Report> reports) {
    this.reports = reports;
  }

  public ModelImport datasets(List<Dataset> datasets) {
    this.datasets = datasets;
    return this;
  }

  public ModelImport addDatasetsItem(Dataset datasetsItem) {
    if (this.datasets == null) {
      this.datasets = new ArrayList<Dataset>();
    }
    this.datasets.add(datasetsItem);
    return this;
  }

   /**
   * The datasets associated with this import
   * @return datasets
  **/
  @ApiModelProperty(value = "The datasets associated with this import")
  public List<Dataset> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<Dataset> datasets) {
    this.datasets = datasets;
  }

  public ModelImport createdDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Import creation time
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "Import creation time")
  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public ModelImport updatedDateTime(OffsetDateTime updatedDateTime) {
    this.updatedDateTime = updatedDateTime;
    return this;
  }

   /**
   * Import last update time
   * @return updatedDateTime
  **/
  @ApiModelProperty(value = "Import last update time")
  public OffsetDateTime getUpdatedDateTime() {
    return updatedDateTime;
  }

  public void setUpdatedDateTime(OffsetDateTime updatedDateTime) {
    this.updatedDateTime = updatedDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelImport _import = (ModelImport) o;
    return Objects.equals(this.id, _import.id) &&
        Objects.equals(this.name, _import.name) &&
        Objects.equals(this.importState, _import.importState) &&
        Objects.equals(this.reports, _import.reports) &&
        Objects.equals(this.datasets, _import.datasets) &&
        Objects.equals(this.createdDateTime, _import.createdDateTime) &&
        Objects.equals(this.updatedDateTime, _import.updatedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, importState, reports, datasets, createdDateTime, updatedDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelImport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    importState: ").append(toIndentedString(importState)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    updatedDateTime: ").append(toIndentedString(updatedDateTime)).append("\n");
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

