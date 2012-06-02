package com.woolsk.action;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.woolsk.jdbc.ActionBeanJDBC;
import com.woolsk.trabalha.Trabalha;
import com.woolsk.trabalha.TrabalhaCadastroAction;
import com.woolsk.usuario.TrabalhaAcesso;
import com.woolsk.usuario.TrabalhaCadastroUsuario;

public class SistemaAction extends Trabalha{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TrabalhaAcesso trabalhaAcesso;
	private TrabalhaCadastroUsuario trabalhaCadastroUsuario;
	private TrabalhaCadastroAction trabalhaCadastroAction;
	
	private ActionBeanJDBC actionBeanJDBC = new ActionBeanJDBC();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacao = request.getParameter("operacao");		
		if(!operacao.equals("")){
			switch(retornaOperacao(operacao)){
				case 1: operacao = getTrabalhaAcesso().inicio(request, operacao);
						break;
				case 2: operacao = getTrabalhaCadastroUsuario().incio(request, operacao);
						break;
				case 3: operacao = getTrabalhaCadastroAction().inicio(request, operacao);
						break;
			}
			direcionaPagina(operacao, request, response);
		}else{
			direcionaPagina("erro", request, response);
		}
	}
	
	private int retornaOperacao(String operacao){
		HashMap<String, Integer> lista = new HashMap<String, Integer>();
		lista.put("acesso", 1);
		lista.put("cadastro", 2);
//		lista.put("cadastroAction", 3);
		if(!lista.containsKey(operacao)){
			return 0;			
		}
		return lista.get(operacao);
	}
	
	private void direcionaPagina(String action, HttpServletRequest request, HttpServletResponse response){
		RequestDispatcher requestDispatcher;
		if(!action.equals("") && request != null && response != null){
			requestDispatcher = request.getRequestDispatcher(retornaPagina(action));
			try{
				requestDispatcher.forward(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		} else{
			requestDispatcher = request.getRequestDispatcher(retornaPagina("erro"));
		}
	}
	
//	private String retornaPagina(String action){
//		return actionBeanJDBC.retornaPagina(action);
//	}
	
	private String retornaPagina(String action){
		HashMap<String, String> listaPagina = new HashMap<String, String>();
		listaPagina.put("inicio", "/index.jsp");
		listaPagina.put("acesso", "paginas/sistema/sistema.jsp");
		listaPagina.put("cadastro", "paginas/utilitarios/cadastro.jsp");
		listaPagina.put("sistema", "paginas/sistema/sistema.jsp");
		
		listaPagina.put("erro", "paginas/erro/erro.jsp");
		if(!listaPagina.containsKey(action)){
			return "";
		}
		return listaPagina.get(action);
	}

	public TrabalhaAcesso getTrabalhaAcesso() {
		return trabalhaAcesso = new TrabalhaAcesso();
	}

	public void setTrabalhaAcesso(TrabalhaAcesso trabalhaAcesso) {
		this.trabalhaAcesso = trabalhaAcesso;
	}

	public TrabalhaCadastroUsuario getTrabalhaCadastroUsuario() {
		return trabalhaCadastroUsuario = new TrabalhaCadastroUsuario();
	}

	public void setTrabalhaCadastroUsuario(
			TrabalhaCadastroUsuario trabalhaCadastroUsuario) {
		this.trabalhaCadastroUsuario = trabalhaCadastroUsuario;
	}

	public TrabalhaCadastroAction getTrabalhaCadastroAction() {
		return trabalhaCadastroAction = new TrabalhaCadastroAction();
	}

	public void setTrabalhaCadastroAction(
			TrabalhaCadastroAction trabalhaCadastroAction) {
		this.trabalhaCadastroAction = trabalhaCadastroAction;
	}
	
}
