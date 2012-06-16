package com.woolsk.financialControl.jdbc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TrabalhaSessao {

	private static EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("FinancialControl");
	private static EntityManager manager = managerFactory.createEntityManager();
	
	public static EntityManager getManager() {
		return manager;
	}
	public static void setManager(EntityManager manager) {
		TrabalhaSessao.manager = manager;
	}
}
