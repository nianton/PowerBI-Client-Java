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
 * Object representing basic authentication credentials
 */
@ApiModel(description = "Object representing basic authentication credentials")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class BasicCredentials {
  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  public BasicCredentials username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username required to access the datasource
   * @return username
  **/
  @ApiModelProperty(value = "Username required to access the datasource")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public BasicCredentials password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password required to access the datasource
   * @return password
  **/
  @ApiModelProperty(value = "Password required to access the datasource")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicCredentials basicCredentials = (BasicCredentials) o;
    return Objects.equals(this.username, basicCredentials.username) &&
        Objects.equals(this.password, basicCredentials.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicCredentials {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

