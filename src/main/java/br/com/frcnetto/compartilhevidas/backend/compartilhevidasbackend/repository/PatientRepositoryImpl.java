package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.repository;

import org.springframework.stereotype.Repository;

import br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model.Patient;

@Repository
public class PatientRepositoryImpl extends AbstractRepository<Patient, Long> implements PatientRepository {
  
}