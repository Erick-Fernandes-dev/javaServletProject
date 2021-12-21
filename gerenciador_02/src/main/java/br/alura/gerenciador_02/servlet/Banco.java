package br.alura.gerenciador_02.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
		
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		
		Empresa empresa = new Empresa();
		empresa.setNome("Algnologia");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Alura");
		
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
		Banco.lista.add(new Empresa("Caelum"));
		
		
	}
	
	
	public void adciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresa() {
		
		return Banco.lista;
		
	}
	
	
}
