package com.woolsk.financialControl.trabalha;

import com.woolsk.financialControl.jdbc.TrabalhaConsulta;
import com.woolsk.financialControl.jdbc.TrabalhaPersistencia;
import com.woolsk.financialControl.jdbc.TrabalhaSessao;

public class Trabalha {
	private static TrabalhaSessao sessao = new TrabalhaSessao();
	public static TrabalhaPersistencia persistencia = new TrabalhaPersistencia(sessao.getManager());
	public static TrabalhaConsulta consulta = new TrabalhaConsulta(sessao.getManager());

}
