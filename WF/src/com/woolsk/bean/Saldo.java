package com.woolsk.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Saldo {

	@Id
	@GeneratedValue
	private int idSaldo;
	private String descricao;
	private Date dataEntrada;
	private double valor;
	
	public int getIdSaldo() {
		return idSaldo;
	}
	public void setIdSaldo(int idSaldo) {
		this.idSaldo = idSaldo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
