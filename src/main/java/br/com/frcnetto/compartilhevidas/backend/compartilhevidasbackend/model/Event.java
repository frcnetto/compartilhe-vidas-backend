package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table( name = "EVENTS" )
public class Event extends AbstractEntity<Long>{

  private static final long serialVersionUID = 1L;

  @Column( nullable = false )
  @Enumerated(EnumType.STRING)
  private EventType type;

  @Column
  private String details;

  @JoinColumn( nullable = false )
  @ManyToOne
  private User user;

  @Column( columnDefinition = "DATE" )
  @DateTimeFormat( iso = ISO.DATE )
  private LocalDate date;

  public EventType getType() {
    return this.type;
  }

  public void setType(EventType type) {
    this.type = type;
  }

  public String getDetails() {
    return this.details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
  
}