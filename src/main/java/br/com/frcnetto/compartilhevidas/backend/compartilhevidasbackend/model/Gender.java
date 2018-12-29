package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

public enum Gender {
  
  MASCULINE('M'),
  FEMININE('F');	
  
  private char gender;

  Gender( char gender ){
    this.gender = gender;
  }

  public char getGender(){
    return gender;
  }
  
}