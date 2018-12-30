package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model.Meta;

@RestController
public class Home {

  @RequestMapping( "/" )
  public Meta getMeta(){
    return new Meta( "1.0.0" );
  }
  
}