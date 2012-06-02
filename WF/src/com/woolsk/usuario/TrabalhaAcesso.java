package com.woolsk.usuario;

import javax.servlet.http.HttpServletRequest;

import com.woolsk.jdbc.UsuarioJDBC;
import com.woolsk.trabalha.Trabalha;

public class TrabalhaAcesso extends Trabalha{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioJDBC usuarioJDBC = new UsuarioJDBC();

	public String inicio(HttpServletRequest request, String operacao){
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		if(!usuario.equals("") && !senha.equals("")){
			if(usuarioJDBC.verificaUsuarioESenha(usuario, senha)){
				operacao = "sistema";
			}else{
				request.setAttribute("aviso", "Úsuario ou senha ínvalido.");
				operacao = "inicio";
			}
		}else{
			request.setAttribute("aviso", "Úsuario ou senha não preenchido.");
		}
		return operacao;
	}

}
