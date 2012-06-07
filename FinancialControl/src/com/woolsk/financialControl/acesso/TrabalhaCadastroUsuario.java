package com.woolsk.financialControl.acesso;

import javax.faces.bean.ManagedBean;

import com.woolsk.financialControl.bean.Usuario;

@ManagedBean(name="cadastroUsuario")
public class TrabalhaCadastroUsuario{
	
	private Usuario usuario = new Usuario();
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
