package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.repository;

import br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model.Patient;

public interface PatientRepository {

  Patient persist(Patient patient);
  
}