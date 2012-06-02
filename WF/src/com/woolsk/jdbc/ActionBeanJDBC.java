package com.woolsk.jdbc;

import javax.persistence.Query;

import com.woolsk.bean.ActionBean;

public class ActionBeanJDBC extends TrabalhaJDBC{
	
	public String retornaPagina(String action){
		String hql = "Select a from ActionBean a where a.action = "+action+" a";
		Query query = entityManager.createQuery(hql);
		ActionBean actionBean = (ActionBean)query.getSingleResult();
		if(!actionBean.getCaminho().equals("")){
			return actionBean.getCaminho();
		}
		return "erro";
	}

}
