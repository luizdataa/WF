package com.woolsk.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Testes {
	
	public static void main(String[] args){
 		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ModuloFinanceiro");
		EntityManager em = factory.createEntityManager();
		//Query query = em.createQuery("select u from Usuario u where u.idUsuario = 1");
		//Object lista =  query.getSingleResult();
		
		String teste = "";
		String novoTeste = "";
	}
}
