package br.com.colecoes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Aula89Set {

	public static void main(String[] args) {
		
		//Collection -> Set -> Sorted Set -> HashSet;
		//As classes que implementam a interface Set não aceitam duplicatas de registros;
		
		//Array;
		String[] cores = {"Verde", "Amarelo", "Azul", "Branco", "Azul", "Amarelo", "Verde"};
		
		//List;
		List<String> list = Arrays.asList(cores);
		System.out.println(list);
		
		//Set;
		Set<String> set = new HashSet <>(list);
		System.out.println(set);
		
	}
}
