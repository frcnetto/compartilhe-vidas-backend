package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model.Patient;
import br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.service.PatientServiceImpl;

@RestController("/patient")
public class PatientController {

  @Autowired
  private PatientServiceImpl service;

  @PostMapping
  public ResponseEntity<Object> save( @RequestBody Patient patient ){

    try {
      return ResponseEntity.ok( service.save(patient) );
    } 
    
    catch (Exception e) {
      return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping
  public ResponseEntity<Object> list(){
    
    return ResponseEntity.ok(new Patient());
  }
  
}