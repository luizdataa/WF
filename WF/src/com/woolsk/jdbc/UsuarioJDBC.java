package com.woolsk.jdbc;

import javax.persistence.Query;

public class UsuarioJDBC extends TrabalhaJDBC{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean verificaUsuarioESenha(String usuario, String senha){
		try{			
			String hql = "Select u from Usuario u where u.nomeUsuario = '"+usuario+"' and u.senha = '"+senha+"'";
			Query query = entityManager.createQuery(hql);		
			query.getSingleResult();
		}catch(Exception e){
			return false;
		}
		return true;
	}
}
