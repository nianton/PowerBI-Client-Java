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
import java.util.ArrayList;
import java.util.List;

/**
 * The identity that the generated token should reflect
 */
@ApiModel(description = "The identity that the generated token should reflect")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class EffectiveIdentity {
  @SerializedName("username")
  private String username = null;

  @SerializedName("roles")
  private List<String> roles = null;

  @SerializedName("datasets")
  private List<String> datasets = new ArrayList<String>();

  public EffectiveIdentity username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The effective username reflected by a token for applying RLS rules
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The effective username reflected by a token for applying RLS rules")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public EffectiveIdentity roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public EffectiveIdentity addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * An array of roles reflected by a token when applying RLS rules
   * @return roles
  **/
  @ApiModelProperty(value = "An array of roles reflected by a token when applying RLS rules")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public EffectiveIdentity datasets(List<String> datasets) {
    this.datasets = datasets;
    return this;
  }

  public EffectiveIdentity addDatasetsItem(String datasetsItem) {
    this.datasets.add(datasetsItem);
    return this;
  }

   /**
   * An array of datasets for which this mapping applies to, if not provided - applies to all datasets
   * @return datasets
  **/
  @ApiModelProperty(required = true, value = "An array of datasets for which this mapping applies to, if not provided - applies to all datasets")
  public List<String> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<String> datasets) {
    this.datasets = datasets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectiveIdentity effectiveIdentity = (EffectiveIdentity) o;
    return Objects.equals(this.username, effectiveIdentity.username) &&
        Objects.equals(this.roles, effectiveIdentity.roles) &&
        Objects.equals(this.datasets, effectiveIdentity.datasets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, roles, datasets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectiveIdentity {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
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

