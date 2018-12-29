package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "CAMPAIGNS" )
public class Campaign extends AbstractEntity<Long> {

  private static final long serialVersionUID = 1L;

  @JoinColumn( nullable = false )
  @ManyToOne
  private User user;

  @Column
  private boolean ownBenefit;

  @OneToOne
  private Patient patient;

  @OneToOne
  private Address hospital;

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public boolean isOwnBenefit() {
    return this.ownBenefit;
  }

  public boolean getOwnBenefit() {
    return this.ownBenefit;
  }

  public void setOwnBenefit(boolean ownBenefit) {
    this.ownBenefit = ownBenefit;
  }

  public Patient getPatient() {
    return this.patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public Address getHospital() {
    return this.hospital;
  }

  public void setHospital(Address hospital) {
    this.hospital = hospital;
  }

}