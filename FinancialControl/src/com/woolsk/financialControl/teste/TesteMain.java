package com.woolsk.financialControl.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.woolsk.financialControl.bean.Padroes;

public class TesteMain {
	
	public static void main(String[] args){
		
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("FinancialControl");
		EntityManager manager = managerFactory.createEntityManager();
		
		Padroes novoPadrao = new Padroes();
		novoPadrao.setDescricao1("padrão de ids");
		novoPadrao.setDescricao2("idNomeBean");
		
		manager.persist(novoPadrao);
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();
		
	}

}
