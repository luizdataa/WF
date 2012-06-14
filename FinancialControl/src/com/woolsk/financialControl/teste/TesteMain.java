package com.woolsk.financialControl.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteMain {
	
	public static void main(String[] args){
		
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("FinancialControl");
		EntityManager manager = managerFactory.createEntityManager();
	}

}
