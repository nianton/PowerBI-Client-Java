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
 * A Power BI user Access Right entry for datasource
 */
@ApiModel(description = "A Power BI user Access Right entry for datasource")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class UserAccessRight {
  /**
   * Access rights user has for datasource
   */
  @JsonAdapter(DatasourceAccessRightEnum.Adapter.class)
  public enum DatasourceAccessRightEnum {
    NONE("None"),
    
    READ("Read"),
    
    WRITE("Write"),
    
    ADMIN("Admin"),
    
    READWRITE("ReadWrite");

    private String value;

    DatasourceAccessRightEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DatasourceAccessRightEnum fromValue(String text) {
      for (DatasourceAccessRightEnum b : DatasourceAccessRightEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DatasourceAccessRightEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DatasourceAccessRightEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DatasourceAccessRightEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DatasourceAccessRightEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("datasourceAccessRight")
  private DatasourceAccessRightEnum datasourceAccessRight = null;

  @SerializedName("emailAddress")
  private String emailAddress = null;

  public UserAccessRight datasourceAccessRight(DatasourceAccessRightEnum datasourceAccessRight) {
    this.datasourceAccessRight = datasourceAccessRight;
    return this;
  }

   /**
   * Access rights user has for datasource
   * @return datasourceAccessRight
  **/
  @ApiModelProperty(value = "Access rights user has for datasource")
  public DatasourceAccessRightEnum getDatasourceAccessRight() {
    return datasourceAccessRight;
  }

  public void setDatasourceAccessRight(DatasourceAccessRightEnum datasourceAccessRight) {
    this.datasourceAccessRight = datasourceAccessRight;
  }

  public UserAccessRight emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address of the user.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "Email address of the user.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccessRight userAccessRight = (UserAccessRight) o;
    return Objects.equals(this.datasourceAccessRight, userAccessRight.datasourceAccessRight) &&
        Objects.equals(this.emailAddress, userAccessRight.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasourceAccessRight, emailAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccessRight {\n");
    
    sb.append("    datasourceAccessRight: ").append(toIndentedString(datasourceAccessRight)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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

