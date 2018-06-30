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
 * The credential details
 */
@ApiModel(description = "The credential details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class CredentialDetails {
  @SerializedName("credentials")
  private String credentials = null;

  @SerializedName("credentialType")
  private String credentialType = null;

  @SerializedName("encryptedConnection")
  private String encryptedConnection = null;

  @SerializedName("encryptionAlgorithm")
  private String encryptionAlgorithm = null;

  @SerializedName("privacyLevel")
  private String privacyLevel = null;

  public CredentialDetails credentials(String credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * The credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "The credentials")
  public String getCredentials() {
    return credentials;
  }

  public void setCredentials(String credentials) {
    this.credentials = credentials;
  }

  public CredentialDetails credentialType(String credentialType) {
    this.credentialType = credentialType;
    return this;
  }

   /**
   * The connection type
   * @return credentialType
  **/
  @ApiModelProperty(value = "The connection type")
  public String getCredentialType() {
    return credentialType;
  }

  public void setCredentialType(String credentialType) {
    this.credentialType = credentialType;
  }

  public CredentialDetails encryptedConnection(String encryptedConnection) {
    this.encryptedConnection = encryptedConnection;
    return this;
  }

   /**
   * The encrypted connection
   * @return encryptedConnection
  **/
  @ApiModelProperty(value = "The encrypted connection")
  public String getEncryptedConnection() {
    return encryptedConnection;
  }

  public void setEncryptedConnection(String encryptedConnection) {
    this.encryptedConnection = encryptedConnection;
  }

  public CredentialDetails encryptionAlgorithm(String encryptionAlgorithm) {
    this.encryptionAlgorithm = encryptionAlgorithm;
    return this;
  }

   /**
   * The encryption algorithm
   * @return encryptionAlgorithm
  **/
  @ApiModelProperty(value = "The encryption algorithm")
  public String getEncryptionAlgorithm() {
    return encryptionAlgorithm;
  }

  public void setEncryptionAlgorithm(String encryptionAlgorithm) {
    this.encryptionAlgorithm = encryptionAlgorithm;
  }

  public CredentialDetails privacyLevel(String privacyLevel) {
    this.privacyLevel = privacyLevel;
    return this;
  }

   /**
   * The privacy level
   * @return privacyLevel
  **/
  @ApiModelProperty(value = "The privacy level")
  public String getPrivacyLevel() {
    return privacyLevel;
  }

  public void setPrivacyLevel(String privacyLevel) {
    this.privacyLevel = privacyLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialDetails credentialDetails = (CredentialDetails) o;
    return Objects.equals(this.credentials, credentialDetails.credentials) &&
        Objects.equals(this.credentialType, credentialDetails.credentialType) &&
        Objects.equals(this.encryptedConnection, credentialDetails.encryptedConnection) &&
        Objects.equals(this.encryptionAlgorithm, credentialDetails.encryptionAlgorithm) &&
        Objects.equals(this.privacyLevel, credentialDetails.privacyLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, credentialType, encryptedConnection, encryptionAlgorithm, privacyLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialDetails {\n");
    
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    encryptedConnection: ").append(toIndentedString(encryptedConnection)).append("\n");
    sb.append("    encryptionAlgorithm: ").append(toIndentedString(encryptionAlgorithm)).append("\n");
    sb.append("    privacyLevel: ").append(toIndentedString(privacyLevel)).append("\n");
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

