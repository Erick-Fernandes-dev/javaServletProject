package br.alura.gerenciador_02.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Alura");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		
		Banco.lista.add(empresa1);
		Banco.lista.add(empresa2);
		Banco.lista.add(new Empresa("Google"));
		
		
	}
	
	
	public void adciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	
	public List<Empresa> getEmpresa() {
		return Banco.lista;
	}

}
