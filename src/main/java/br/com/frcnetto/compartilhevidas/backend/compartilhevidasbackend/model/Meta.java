package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

public class Meta {

  private String version;


  public Meta( String version ) {
    this.version = version;
  }

  public String getVersion() {
    return this.version;
  }

  public void setVersion(String version) {
    this.version = version;
  }  
  
}