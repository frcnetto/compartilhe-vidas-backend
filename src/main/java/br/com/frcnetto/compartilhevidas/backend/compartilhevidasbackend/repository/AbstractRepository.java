package br.com.frcnetto.compartilhevidas.backend.compartilhevidasbackend.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractRepository<T, PK extends Serializable> {

  @SuppressWarnings("unchecked")
  private final Class<T> entityClass = 
      (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

  @PersistenceContext
  private EntityManager entityManager;

  protected EntityManager getEntityManager(){
    return entityManager;
  }

  public T persist(T entity){
    entityManager.persist(entity);
    return entity;
  }

  public List<T> listAll(){
    return entityManager
            .createQuery("from " + entityClass.getSimpleName(), entityClass )
            .getResultList();
  }

  public T edit( T entity){
    return entityManager.merge( entity );
  }

  public PK delete( PK primaryKey ){
    entityManager.remove( entityManager.getReference(entityClass, primaryKey) );
    return primaryKey;
  }

}