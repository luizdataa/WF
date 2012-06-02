package com.woolsk.trabalha;

import javax.servlet.http.HttpServletRequest;

import com.woolsk.bean.ActionBean;
import com.woolsk.jdbc.ActionBeanJDBC;

public class TrabalhaCadastroAction extends Trabalha{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ActionBeanJDBC actionBeanJDBC = new ActionBeanJDBC();

	public String inicio(HttpServletRequest request, String operacao){
		String action = request.getParameter("action");
		String caminho = request.getParameter("caminho");
		ActionBean novaPagina = new ActionBean();
		novaPagina.setAction(action);
		novaPagina.setCaminho(caminho);
		actionBeanJDBC.save(novaPagina);
		return operacao;
	}
	
}
