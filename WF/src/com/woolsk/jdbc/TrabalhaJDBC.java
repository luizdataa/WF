package com.woolsk.jdbc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.woolsk.trabalha.Trabalha;

public class TrabalhaJDBC extends Trabalha{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory entityManagerFactory;
	protected EntityManager entityManager;
	
	public TrabalhaJDBC(){
		entityManagerFactory = Persistence.createEntityManagerFactory("ModuloFinanceiro");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public boolean save(Object object){
		entityManager.persist(object);	
		if(finalizaOperacao()){
			return true;
		}
		return false;
	}
	
	public boolean update(Object object){
		entityManager.refresh(object);
		if(finalizaOperacao()){
			return true;
		}
		return false;
	}
	
	public boolean delete(Object object){
		entityManager.remove(object);
		if(finalizaOperacao()){
			return true;
		}
		return false;
	}
	
	private boolean finalizaOperacao(){
		try{			
			entityManager.getTransaction().begin();
			entityManager.getTransaction().commit();
			entityManagerFactory.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
}
