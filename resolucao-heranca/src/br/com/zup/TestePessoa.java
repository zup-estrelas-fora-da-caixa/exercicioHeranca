package br.com.zup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestePessoa {

	public static void main(String[] args) {
		
		// Criando a lista
		List<String> linguagens = new ArrayList<>(Arrays.asList("Java", "Python", "Pascal"));
		List<String> filmes = new ArrayList<String>(Arrays.asList("Avengers", "Coach Carter", "A culpa é das estrelas"));
		
		// Criando o Random
		Random random = new Random();
		
		// Criando o objeto programador
		Programador programador = new Programador(linguagens, 10, true, "Fulano", "de Tal", 25);
		Ator ator = new Ator(filmes, false, 1970, "Tony", "Stark", 50);
		
		int numero = random.nextInt(ator.getFilmesParticipados().size());
		
		ator.setMelhorFilme(ator.sorteioFilme(numero, ator.getFilmesParticipados()));
		
		System.out.println(programador);
		System.out.println(ator);
	}

}
