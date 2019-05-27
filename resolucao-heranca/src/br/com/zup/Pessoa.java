package br.com.zup;

public class Pessoa {
	
	// Atributos
	private String nome;
	private String sobrenome;
	private int idade;
	
	// Construtor
	public Pessoa(String nome, String sobrenome, int idade) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
