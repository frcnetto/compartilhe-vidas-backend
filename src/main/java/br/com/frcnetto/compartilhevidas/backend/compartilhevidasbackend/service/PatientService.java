package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.service;

import java.util.List;

import br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model.Patient;

public interface PatientService {

  Patient save( Patient patient );
  List<Patient> listAll();
  Patient edit( Patient patient );
  Long delete( Long primaryKey );
  
}