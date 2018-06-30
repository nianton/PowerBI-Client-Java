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
 * A Power BI user Access Right entry for group
 */
@ApiModel(description = "A Power BI user Access Right entry for group")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class GroupUserAccessRight {
  /**
   * Access rights user has for group
   */
  @JsonAdapter(GroupUserAccessRightEnum.Adapter.class)
  public enum GroupUserAccessRightEnum {
    NONE("None"),
    
    MEMBER("Member"),
    
    ADMIN("Admin");

    private String value;

    GroupUserAccessRightEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GroupUserAccessRightEnum fromValue(String text) {
      for (GroupUserAccessRightEnum b : GroupUserAccessRightEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GroupUserAccessRightEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GroupUserAccessRightEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GroupUserAccessRightEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GroupUserAccessRightEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("groupUserAccessRight")
  private GroupUserAccessRightEnum groupUserAccessRight = null;

  @SerializedName("emailAddress")
  private String emailAddress = null;

  public GroupUserAccessRight groupUserAccessRight(GroupUserAccessRightEnum groupUserAccessRight) {
    this.groupUserAccessRight = groupUserAccessRight;
    return this;
  }

   /**
   * Access rights user has for group
   * @return groupUserAccessRight
  **/
  @ApiModelProperty(value = "Access rights user has for group")
  public GroupUserAccessRightEnum getGroupUserAccessRight() {
    return groupUserAccessRight;
  }

  public void setGroupUserAccessRight(GroupUserAccessRightEnum groupUserAccessRight) {
    this.groupUserAccessRight = groupUserAccessRight;
  }

  public GroupUserAccessRight emailAddress(String emailAddress) {
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
    GroupUserAccessRight groupUserAccessRight = (GroupUserAccessRight) o;
    return Objects.equals(this.groupUserAccessRight, groupUserAccessRight.groupUserAccessRight) &&
        Objects.equals(this.emailAddress, groupUserAccessRight.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupUserAccessRight, emailAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupUserAccessRight {\n");
    
    sb.append("    groupUserAccessRight: ").append(toIndentedString(groupUserAccessRight)).append("\n");
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

