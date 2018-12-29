package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue( "USER" )
public class User extends Patient {

  private static final long serialVersionUID = 1L;

  @Column( nullable = false, unique = true )
  private String email;

  @OneToMany( mappedBy = "user", cascade = CascadeType.ALL )
  private List<Event> pregnancies;

  @OneToMany( mappedBy = "user", cascade = CascadeType.ALL )
  private List<Event> donations;

  @OneToMany( mappedBy = "user", cascade = CascadeType.ALL )
  private List<Event> tattoos;

  @OneToMany( mappedBy = "user", cascade = CascadeType.ALL )
  private List<Event> diseases;

  @OneToMany( mappedBy = "user", cascade = CascadeType.ALL )
  private List<Campaign> campaigns;

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Event> getPregnancies() {
    return this.pregnancies;
  }

  public void setPregnancies(List<Event> pregnancies) {
    this.pregnancies = pregnancies;
  }

  public List<Event> getDonations() {
    return this.donations;
  }

  public void setDonations(List<Event> donations) {
    this.donations = donations;
  }

  public List<Event> getTattoos() {
    return this.tattoos;
  }

  public void setTattoos(List<Event> tattoos) {
    this.tattoos = tattoos;
  }

  public List<Event> getDiseases() {
    return this.diseases;
  }

  public void setDiseases(List<Event> diseases) {
    this.diseases = diseases;
  }

  public List<Campaign> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<Campaign> campaigns) {
    this.campaigns = campaigns;
  }

  public boolean isPregnant(){

    if ( pregnancies == null || pregnancies.isEmpty() )
      return false;
      
    for (Event pregnancy : pregnancies) 
      if ( pregnancy.getDate() == null )
        return true;

    return false;  
  }

  public boolean hasBeenPregnant(){
    return pregnancies != null ? ! pregnancies.isEmpty() : false;
  }

  public boolean hasDonated(){
    return donations != null ? ! donations.isEmpty() : false;
  }

  public boolean hasTattoo(){
    return tattoos != null ? ! tattoos.isEmpty() : false;
  }

  public boolean hasDiseases(){
    return diseases != null ? ! diseases.isEmpty() : false;
  }

  @Override
  public String toString() {
    return 
      "{" + 
        " name         = '" + getName()        + "'" + 
        ", email       = '" + getEmail()       + "'" + 
        ", age         = '" + getAge()         + "'" +
        ", gender      = '" + getGender()      + "'" + 
        ", weight      = '" + getWeight()      + "'" + 
        ", bloodType   = '" + getBloodType()   + "'" + 
        ", pregnancies = '" + getPregnancies() + "'" + 
        ", donations   = '" + getDonations()   + "'" + 
        ", tattoos     = '" + getTattoos()     + "'" +
        ", diseases    = '" + getDiseases()    + "'" +
      "}";
  }

}