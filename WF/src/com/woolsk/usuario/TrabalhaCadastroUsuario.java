package com.woolsk.usuario;

import javax.servlet.http.HttpServletRequest;

import com.woolsk.bean.Usuario;
import com.woolsk.jdbc.UsuarioJDBC;
import com.woolsk.trabalha.Trabalha;

public class TrabalhaCadastroUsuario extends Trabalha{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
	
	public String incio(HttpServletRequest request, String operacao){
		try{
			Usuario novoUsuario = new Usuario();
			novoUsuario.setNome(request.getParameter("nome"));
			novoUsuario.setNomeUsuario(request.getParameter("nomeUsuario"));
			novoUsuario.setSenha(request.getParameter("senha"));
			novoUsuario.setEmail(request.getParameter("email"));
			usuarioJDBC.save(novoUsuario);
			request.setAttribute("sucesso", "Úsuario salvo com sucesso.");
		}catch(Exception e){
			request.setAttribute("aviso", "Erro ao cadastro úsuario.");
			e.printStackTrace();
		}
		return operacao;
	}

}
