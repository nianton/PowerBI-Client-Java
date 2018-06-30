package com.microsoft.powerbi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.microsoft.powerbi.models.EffectiveIdentity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Power BI Generate Token Request
 */
@ApiModel(description = "Power BI Generate Token Request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class GenerateTokenRequest {
  /**
   * The dataset mode or type
   */
  @JsonAdapter(AccessLevelEnum.Adapter.class)
  public enum AccessLevelEnum {
    VIEW("View"),
    
    EDIT("Edit"),
    
    CREATE("Create");

    private String value;

    AccessLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessLevelEnum fromValue(String text) {
      for (AccessLevelEnum b : AccessLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accessLevel")
  private AccessLevelEnum accessLevel = null;

  @SerializedName("datasetId")
  private String datasetId = null;

  @SerializedName("allowSaveAs")
  private Boolean allowSaveAs = null;

  @SerializedName("identities")
  private List<EffectiveIdentity> identities = null;

  public GenerateTokenRequest accessLevel(AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

   /**
   * The dataset mode or type
   * @return accessLevel
  **/
  @ApiModelProperty(value = "The dataset mode or type")
  public AccessLevelEnum getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
  }

  public GenerateTokenRequest datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

   /**
   * The dataset Id
   * @return datasetId
  **/
  @ApiModelProperty(value = "The dataset Id")
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public GenerateTokenRequest allowSaveAs(Boolean allowSaveAs) {
    this.allowSaveAs = allowSaveAs;
    return this;
  }

   /**
   * Allow SaveAs the report with generated token.
   * @return allowSaveAs
  **/
  @ApiModelProperty(value = "Allow SaveAs the report with generated token.")
  public Boolean isAllowSaveAs() {
    return allowSaveAs;
  }

  public void setAllowSaveAs(Boolean allowSaveAs) {
    this.allowSaveAs = allowSaveAs;
  }

  public GenerateTokenRequest identities(List<EffectiveIdentity> identities) {
    this.identities = identities;
    return this;
  }

  public GenerateTokenRequest addIdentitiesItem(EffectiveIdentity identitiesItem) {
    if (this.identities == null) {
      this.identities = new ArrayList<EffectiveIdentity>();
    }
    this.identities.add(identitiesItem);
    return this;
  }

   /**
   * The effective identities to use for RLS rules
   * @return identities
  **/
  @ApiModelProperty(value = "The effective identities to use for RLS rules")
  public List<EffectiveIdentity> getIdentities() {
    return identities;
  }

  public void setIdentities(List<EffectiveIdentity> identities) {
    this.identities = identities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateTokenRequest generateTokenRequest = (GenerateTokenRequest) o;
    return Objects.equals(this.accessLevel, generateTokenRequest.accessLevel) &&
        Objects.equals(this.datasetId, generateTokenRequest.datasetId) &&
        Objects.equals(this.allowSaveAs, generateTokenRequest.allowSaveAs) &&
        Objects.equals(this.identities, generateTokenRequest.identities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel, datasetId, allowSaveAs, identities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateTokenRequest {\n");
    
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    allowSaveAs: ").append(toIndentedString(allowSaveAs)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
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

