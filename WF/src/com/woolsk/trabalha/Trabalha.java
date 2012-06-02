package com.woolsk.trabalha;

import javax.servlet.http.HttpServlet;

import com.woolsk.jdbc.TrabalhaJDBC;

public class Trabalha extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	public boolean verificaObjetoNullo(Object objeto){
		if(!objeto.equals(null) && objeto != null){
			return true;
		}
		return false;
	}
	
	
}
