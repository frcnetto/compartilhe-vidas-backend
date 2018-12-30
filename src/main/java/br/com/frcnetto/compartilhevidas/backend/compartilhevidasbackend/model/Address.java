package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table( name = "ADDRESSES" )
public class Address extends AbstractEntity<Long>{

  private static final long serialVersionUID = 1L;

  @Column( nullable = false )
	private String street;

  @Column( nullable = false )
	private String neighborhood;

  @Column( nullable = false )
	private String city;

  @Column( nullable = false, length = 2 )
	@Enumerated( EnumType.STRING )
	private State state;

  @Column( nullable = false, length = 9 )
	private String zipCode;

  @Column( nullable = false, length = 9 )
	private String number;

	@Column
	private String complement;


	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNeighborhood() {
		return this.neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return this.complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

}