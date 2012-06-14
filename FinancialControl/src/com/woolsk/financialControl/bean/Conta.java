package com.woolsk.financialControl.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Conta {

	@Id @GeneratedValue
	private int idConta;
	
	
}
