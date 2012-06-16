package com.woolsk.financialControl.jdbc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TrabalhaPersistencia {

	private EntityManager manager;
	
	public TrabalhaPersistencia(EntityManager manager){
//		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("FinancialControl");
//		this.manager = managerFactory.createEntityManager();
		this.manager = manager;
	}
	
	public boolean trabalhaAuditoria(Object object) {
		return false;
	}

	public void save(Object object) {
		manager.persist(object);
		finalizaOperacao();
	}

	public void update(Object object) {
		manager.refresh(object);
		finalizaOperacao();
	}

	public void delete(Object object) {
		manager.remove(object);
		finalizaOperacao();
	}
	
	private void finalizaOperacao(){
		manager.getTransaction().begin();
		manager.getTransaction().commit();
	}
}
