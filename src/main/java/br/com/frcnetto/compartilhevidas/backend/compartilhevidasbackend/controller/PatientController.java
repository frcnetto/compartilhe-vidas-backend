package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model.Patient;
import br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.service.PatientServiceImpl;

@RestController
@RequestMapping( "/patient" )
public class PatientController {

  @Autowired
  private PatientServiceImpl service;

  @PostMapping( "/save" )
  public ResponseEntity<Object> save( @RequestBody Patient patient ){

    try {
      return ResponseEntity.ok( service.save(patient) );
    } 
    
    catch (Exception e) {
      return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping( "/list" )
  public ResponseEntity<Object> list(){

    try {     
      return ResponseEntity.ok( service.listAll() );
    } 
    
    catch (Exception e) {
      return new ResponseEntity<Object>( e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR );
    }
  }

  @PostMapping( "/edit" )
  public ResponseEntity<Object> edit( @RequestBody Patient patient ){
    
    try {     
      return ResponseEntity.ok( service.edit( patient ) );
    } 
    
    catch (Exception e) {
      return new ResponseEntity<Object>( e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR );
    }
  }
  
}