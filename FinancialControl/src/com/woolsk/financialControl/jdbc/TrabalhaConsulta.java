package com.woolsk.financialControl.jdbc;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.woolsk.financialControl.bean.Usuario;

public class TrabalhaConsulta {
	
	private EntityManager manager;
	
	public TrabalhaConsulta(EntityManager manager){
		this.manager = manager;
	}
	
	public Usuario getPorNomeUsuario(String nomeUsuario){
		String hql = "Select u from Usuario u where u.nomeUsuario = '" + nomeUsuario + "'";
		Query query = manager.createQuery(hql);
		return (Usuario) query.getSingleResult();
	}
	
	public Usuario getUsuarioPorSenha(String senha){
		String hql = "Select s from Usuario s where s.senha = '" + senha + "'";
		Query query = manager.createQuery(hql);
		return (Usuario) query.getSingleResult();
	}
	
	public Usuario getUsuarioPorEmail(String email){
		String hql = "Select e from Usuario e where e.emailUsuario = '" + email + "'";
		Query query = manager.createQuery(hql);
		return (Usuario) query.getSingleResult();
	}

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	
}
