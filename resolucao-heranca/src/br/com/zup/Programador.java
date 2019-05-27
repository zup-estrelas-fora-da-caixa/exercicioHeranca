package br.com.zup;

import java.util.List;

public class Programador extends Pessoa {
	
	// Atributos
	private List<String> linguagensUsadas;
	private int anosExperiencia;
	private boolean gostaCafe;
	
	// Construtor
	public Programador(List<String> linguagensUsadas, int anosExperiencia, boolean gostaCafe,
			String nome, String sobrenome, int idade) {
		
		super(nome, sobrenome, idade);
		
		this.linguagensUsadas = linguagensUsadas;
		this.anosExperiencia = anosExperiencia;
		this.gostaCafe = gostaCafe;
	}

	// Getters e Setters
	public List<String> getLinguagensUsadas() {
		return linguagensUsadas;
	}

	public void setLinguagensUsadas(List<String> linguagensUsadas) {
		this.linguagensUsadas = linguagensUsadas;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	public boolean isGostaCafe() {
		return gostaCafe;
	}

	public void setGostaCafe(boolean gostaCafe) {
		this.gostaCafe = gostaCafe;
	}
	
	// Método toString
	public String toString() {
		
		String modelo = "";
		
		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "Sobrenome -> " + super.getSobrenome() + "\n";
		modelo += "Idade -> " + super.getIdade() + "\n";
		modelo += "Linguagens Usadas -> " + this.getLinguagensUsadas() + "\n";
		modelo += "Anos de Experiencia -> " + this.getAnosExperiencia() + "\n";
		modelo += "Gosta de Café? -> " + this.isGostaCafe() + "\n";
		
		return modelo;
	}
}
