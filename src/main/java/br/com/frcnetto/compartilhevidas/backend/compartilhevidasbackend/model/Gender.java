package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

public enum Gender {
  
  MASCULINE("MASCULINE"),
  FEMININE("FEMININE");	
  
  private String gender;

  Gender( String gender ){
    this.gender = gender;
  }

  public String getGender(){
    return gender;
  }
  
}