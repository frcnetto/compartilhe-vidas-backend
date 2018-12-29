package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "PERSONS" )
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "PERSON_TYPE" )
public class Patient extends AbstractEntity<Long>{

  private static final long serialVersionUID = 1L;

  @Column( nullable = false )
  private String name;

  @Column( nullable = false )
  private int age;

  @Column( nullable = false, length = 1 )
  @Enumerated( EnumType.STRING )
  private Gender gender;

  @Column( nullable = false, columnDefinition = "DECIMAL(9,2) DEFAULT 0.00" )
  private Float weight;

  @Column( nullable = false )
  @Enumerated( EnumType.STRING )
  private BloodType bloodType;

  @OneToOne
  private Address address;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Gender getGender() {
    return this.gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Float getWeight() {
    return this.weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public BloodType getBloodType() {
    return this.bloodType;
  }

  public void setBloodType(BloodType bloodType) {
    this.bloodType = bloodType;
  }

  public Address getAdress() {
    return this.address;
  }

  public void setAdress(Address address) {
    this.address = address;
  }
  
}