package com.woolsk.financialControl.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Padroes {

	@Id @GeneratedValue
	private int idPadrao;
	
	private String descricao1;
	private String descricao2;
	private String descricao3;
	private String descricao4;
	
	public int getIdPadrao() {
		return idPadrao;
	}
	public void setIdPadrao(int idPadrao) {
		this.idPadrao = idPadrao;
	}
	public String getDescricao1() {
		return descricao1;
	}
	public void setDescricao1(String descricao1) {
		this.descricao1 = descricao1;
	}
	public String getDescricao2() {
		return descricao2;
	}
	public void setDescricao2(String descricao2) {
		this.descricao2 = descricao2;
	}
	public String getDescricao3() {
		return descricao3;
	}
	public void setDescricao3(String descricao3) {
		this.descricao3 = descricao3;
	}
	public String getDescricao4() {
		return descricao4;
	}
	public void setDescricao4(String descricao4) {
		this.descricao4 = descricao4;
	}
}
