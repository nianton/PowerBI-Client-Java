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
import org.threeten.bp.OffsetDateTime;

/**
 * Power BI Embed Token
 */
@ApiModel(description = "Power BI Embed Token")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T21:03:34.740Z")
public class EmbedToken {
  @SerializedName("token")
  private String token = null;

  @SerializedName("tokenId")
  private String tokenId = null;

  @SerializedName("expiration")
  private OffsetDateTime expiration = null;

  public EmbedToken token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Embed token.
   * @return token
  **/
  @ApiModelProperty(value = "Embed token.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public EmbedToken tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Unique token Id.
   * @return tokenId
  **/
  @ApiModelProperty(value = "Unique token Id.")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public EmbedToken expiration(OffsetDateTime expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Expiration time of token - in UTC.
   * @return expiration
  **/
  @ApiModelProperty(value = "Expiration time of token - in UTC.")
  public OffsetDateTime getExpiration() {
    return expiration;
  }

  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbedToken embedToken = (EmbedToken) o;
    return Objects.equals(this.token, embedToken.token) &&
        Objects.equals(this.tokenId, embedToken.tokenId) &&
        Objects.equals(this.expiration, embedToken.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, tokenId, expiration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbedToken {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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

