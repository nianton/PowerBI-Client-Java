package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.powerbi.models.CredentialDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An Update Datasource To Gateway Request
 */
@ApiModel(description = "An Update Datasource To Gateway Request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class UpdateDatasourceRequest {
  @SerializedName("credentialDetails")
  private CredentialDetails credentialDetails = null;

  public UpdateDatasourceRequest credentialDetails(CredentialDetails credentialDetails) {
    this.credentialDetails = credentialDetails;
    return this;
  }

   /**
   * Get credentialDetails
   * @return credentialDetails
  **/
  @ApiModelProperty(value = "")
  public CredentialDetails getCredentialDetails() {
    return credentialDetails;
  }

  public void setCredentialDetails(CredentialDetails credentialDetails) {
    this.credentialDetails = credentialDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDatasourceRequest updateDatasourceRequest = (UpdateDatasourceRequest) o;
    return Objects.equals(this.credentialDetails, updateDatasourceRequest.credentialDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDatasourceRequest {\n");
    
    sb.append("    credentialDetails: ").append(toIndentedString(credentialDetails)).append("\n");
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

