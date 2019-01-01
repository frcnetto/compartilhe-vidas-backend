package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.model.Patient;
import br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.repository.PatientRepositoryImpl;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

  @Autowired
  private PatientRepositoryImpl repository;

  @Override
  public Patient save( Patient patient ) {
		return repository.persist( patient );
  }
  
  @Override
  public List<Patient> listAll() {
    return repository.listAll();
  }

  @Override
  public Patient edit( Patient patient ) {
    return repository.edit( patient );
  }

  @Override
  public Long delete( Long primaryKey ) {
    return repository.delete( primaryKey );
  }

}