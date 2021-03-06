package com.woolsk.financialControl.acesso;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.woolsk.financialControl.bean.Usuario;
import com.woolsk.financialControl.seguranca.Digester;
import com.woolsk.financialControl.trabalha.Trabalha;

@ManagedBean(name="cadastroUsuario")
public class TrabalhaCadastroUsuario extends Trabalha{
	
	private Usuario usuario = new Usuario();
	
	public void adicionarUsuario(){
		if(verificaNovoCadastro(this.usuario)){
			persistencia.save(this.usuario);
			this.usuario = null;
		}
	}
	
	private boolean verificaNovoCadastro(Usuario usuario){
		if(usuario != null){	
			List<String> listaDados = new ArrayList<String>();
			listaDados.add(usuario.getEmailUsuario());
			listaDados.add(usuario.getNome());
			listaDados.add(usuario.getNomeUsuario());
			listaDados.add(usuario.getSenha());
			if(verificaDados(listaDados)){
				if(verificaSenha()){
					if(verificaUsuario()){
						if(verificaEmail()){							
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	private boolean verificaEmail(){
		if(consulta.getUsuarioPorEmail(usuario.getEmailUsuario()) == null){
			return true;
		}
		return false;
	}
	
	private boolean verificaUsuario(){
		if(consulta.getPorNomeUsuario(usuario.getNomeUsuario()) == null){
			return true;
		}
		return false;
	}
	
	private boolean verificaDados(List<String> listaDados){
		if(listaDados.size() > 0 && listaDados != null){
			for(int a = 0; a < listaDados.size(); a++){
				if(listaDados.get(a).equals("")){
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	private boolean verificaSenha(){
		try{			
			Digester d = new Digester();
			usuario.setSenha(d.digesterPasswords(usuario.getSenha()));
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
