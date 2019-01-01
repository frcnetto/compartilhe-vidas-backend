package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.repository;

import java.util.List;

import br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model.Patient;

public interface PatientRepository {

  Patient persist(Patient patient);
  List<Patient> listAll();
  
}