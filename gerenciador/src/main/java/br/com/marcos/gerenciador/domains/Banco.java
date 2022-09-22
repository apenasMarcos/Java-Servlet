package br.com.marcos.gerenciador.domains;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<>();
	private static Integer chaveSequencial =  0;
	
    static {
        Empresa empresa = new Empresa("Alura");
        empresa.setId(chaveSequencial++);
        Empresa empresa2 = new Empresa("Caelum");
        empresa2.setId(chaveSequencial++);
        empresas.add(empresa);
        empresas.add(empresa2);
    }

	public void adiciona(Empresa empresa) {
		
		empresa.setId(Banco.chaveSequencial++);
		empresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.empresas;
	}
	
	public Empresa getEmpresa(int numero) {
		return empresas.get(numero);
	}
	
	public void removeEmpresa(int id) {
		empresas.remove(id);
	}
}
