package com.woolsk.testes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BeanTeste {
	
	@Id
	@GeneratedValue
	private int idTeste;
	private String descricaoTeste;
	
	public int getIdTeste() {
		return idTeste;
	}
	public void setIdTeste(int idTeste) {
		this.idTeste = idTeste;
	}
	public String getDescricaoTeste() {
		return descricaoTeste;
	}
	public void setDescricaoTeste(String descricaoTeste) {
		this.descricaoTeste = descricaoTeste;
	}	
	
}
