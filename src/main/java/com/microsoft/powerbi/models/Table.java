package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.powerbi.models.Column;
import com.microsoft.powerbi.models.Row;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A dataset table
 */
@ApiModel(description = "A dataset table")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class Table {
  @SerializedName("name")
  private String name = null;

  @SerializedName("columns")
  private List<Column> columns = new ArrayList<Column>();

  @SerializedName("rows")
  private List<Row> rows = null;

  public Table name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The table name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The table name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Table columns(List<Column> columns) {
    this.columns = columns;
    return this;
  }

  public Table addColumnsItem(Column columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * The column schema for this table
   * @return columns
  **/
  @ApiModelProperty(required = true, value = "The column schema for this table")
  public List<Column> getColumns() {
    return columns;
  }

  public void setColumns(List<Column> columns) {
    this.columns = columns;
  }

  public Table rows(List<Row> rows) {
    this.rows = rows;
    return this;
  }

  public Table addRowsItem(Row rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<Row>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * The data rows within this tabe
   * @return rows
  **/
  @ApiModelProperty(value = "The data rows within this tabe")
  public List<Row> getRows() {
    return rows;
  }

  public void setRows(List<Row> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Table table = (Table) o;
    return Objects.equals(this.name, table.name) &&
        Objects.equals(this.columns, table.columns) &&
        Objects.equals(this.rows, table.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, columns, rows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

