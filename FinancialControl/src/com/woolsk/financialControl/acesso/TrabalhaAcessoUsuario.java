package com.woolsk.financialControl.acesso;

import javax.faces.bean.ManagedBean;

import com.woolsk.financialControl.bean.Usuario;
import com.woolsk.financialControl.seguranca.Digester;
import com.woolsk.financialControl.trabalha.Trabalha;

@ManagedBean(name="acessoUsuario")
public class TrabalhaAcessoUsuario extends Trabalha{
	
	private Usuario usuario = new Usuario();
	private boolean resposta;
	
	public void validaAcesso(){
		if(!usuario.getNomeUsuario().equals("") && !usuario.getSenha().equals("")){
			if(verifica()){
				resposta = true;
			} else{
				resposta = false;
			}
		}		
	}
	
	private boolean verifica(){
		if(verificaUsuario()){
			if(verificaSenha()){
				return true;
			}
		}
		return false;
	}
	
	private boolean verificaUsuario(){
		if(consulta.getPorNomeUsuario(usuario.getNomeUsuario()) != null){
			return true;
		}
		return false;
	}
	
	private boolean verificaSenha(){
		Digester d = new Digester();
		if(consulta.getUsuarioPorSenha(d.digesterPasswords(usuario.getSenha())) != null){
			return true;
		}
		return false;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isResposta() {
		return resposta;
	}

	public void setResposta(boolean resposta) {
		this.resposta = resposta;
	}
}
