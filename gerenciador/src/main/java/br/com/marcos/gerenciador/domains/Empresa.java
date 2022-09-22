package br.com.marcos.gerenciador.domains;

import java.util.Date;

public class Empresa {

	private Integer id;
	private String nome;
	private Date dataAbertura = new Date();

	public Empresa(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		if (id != null) {
			this.id = id;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		if (dataAbertura != null) {
			this.dataAbertura = dataAbertura;
		}
	}
}
