package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.service;

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

}