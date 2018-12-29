package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

public enum EventType {

  PREGNANCY("Pregnancy"),
  TATTOO("Tattoo"),
  DONATION("Donation"),
  DISEASE("Disease");

  private String type;

  EventType( String type ){
    this.type = type;
  }

  public String getType(){
    return type;
  }
  
}