package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private ID id;

  /**
   * @return the id
   */
  public ID getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(ID id) {
    this.id = id;
  }

}