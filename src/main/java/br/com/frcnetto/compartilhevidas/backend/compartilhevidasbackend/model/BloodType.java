package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

public enum BloodType {
  
  APLUS("A+"),
  AMINUS("A-"),
  BPLUS("B+"),
  BMINUS("B-"),
  OPLUS("O+"),
  OMINUS("O-"),
  ABPLUS("AB+"), 
  ABMINUS("AB-");	
  
  private String type;

  BloodType( String type ){
    this.type = type;
  }

  public String getType(){
    return type;
  }
  
}