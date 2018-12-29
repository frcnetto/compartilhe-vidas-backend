package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table( name = "ADRESSES" )
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

}