package br.com.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.AbstractMap.SimpleImmutableEntry;

public class Aula87ListAula22ArrayList {

	public static void main(String[] args) {
		
		String aula1 = "Futebol";
		String aula2 = "Basquete";
		String aula3 = "Natação";
		String aula4 = "Vôlei";
		String aula5 = "Tênis";
		
		//Collection -> List (List extends Collection) -> ArrayList (ArrayList implements List);
		//Permiti elementos duplicados na lista;
		//Trabalha com os elementos na ordem em que são incluídos na lista;
		
		//FORMAS DE DECLARAR UMA LISTA;
		ArrayList<String> aulas = new ArrayList(); 
		//ArrayList<String> aulas = new ArrayList<String>();
		//ArrayList<String> aulas = new ArrayList<>(); // A partir da versão 7 do Java só precisa colocar os sinais de <>;
		//List<String> aulas = new ArrayList(); //A classe ArrayList implementa a classe List;	
		
		//ADICIONANDO ELEMENTOS EM UMA LISTA;
		aulas.add(aula1);
		aulas.add(aula2); //aulas.add(1, aula2); -> Indica exatamente em que indice eu quero adicionar o meu elemento;
		aulas.add(aula3);
		aulas.add(aula4);
		aulas.add(aula5);
		aulas.add(aula1); //Aceita elementos duplicados;
				
		System.out.println(aulas);
			
		//MOSTRAR OS ELEMENTOS DE UMA LISTA;
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		System.out.println(aulas.size()); //Verifica o tamanho da lista;
		System.out.println(aulas.contains(aula1)); //Verifica se um elemento contém ou não na lista (true ou false);
		
		String primeiraAula = aulas.get(0); //Verifica qual o elemento contido no indice;
		System.out.println(primeiraAula);
		
		System.out.println(aulas.indexOf("Natação")); //Mostra em que indice está o elemento;
		
		System.out.println(aulas.subList(1, 3)); //Cria uma sublista com apenas elementos a partir de um indice a outro. A posição inicial é inclusiva e a final não;
		
		aulas.subList(1, 3).clear(); //Remove a sublista da lista principal;
		System.out.println(aulas);
		
		//PECORRER TODA A LISTA;
		for (int i = 0; i < aulas.size(); i++) { 
			System.out.println("Aula: " + aulas.get(i)); //Irá pecorrer cada indice da lista;
		}
		
		//ALTERAR ELEMENTOS DE UMA LISTA;
		for (int i = 0; i < aulas.size(); i++) {
			String aulasMaiusculas = aulas.get(i);
			aulas.set(i, aulasMaiusculas.toUpperCase()); //Altera os elementos para caixa alta;
		}
		
		System.out.println(aulas);
		
		for (int i = 0; i < aulas.size(); i++) {
			String aulasMinusculas = aulas.get(i);
			aulas.set(i, aulasMinusculas.toLowerCase()); //Altera os elementos de caixa alta para caixa baixa;
		}
		
		System.out.println(aulas);
		
		//MÉTODO forEach;
		//aulas.forEach(action);
		aulas.forEach(aula -> { //Designa uma ação para cada elemento da lista; Pode executar um trecho de código para cada elemento da lista;
			System.out.println("Pecorrendo a lista ");
			System.out.println("Aula: " + aula);
		});
		
		//ORDENAR A LISTA POR ORDEM ALFABETICA;
		aulas.add("Atletismo");
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//REMOVENDO ELEMENTOS DE UMA LISTA;
		//aulas.remove(index); Remove pelo indice;
		aulas.remove(0);
		aulas.remove(1);
		//Quando o elemento de um indice é removido, o elemento do indice posterior ocupa o lugar do indice antecessor;
		System.out.println(aulas);
				
		//aulas.remove(Object o); Remove o elemento/objeto;
		aulas.remove(aula2);
		System.out.println(aulas);
				
		//aulas.removeAll(aulas); //Remove todos os elementos da lista; 
		
		//LIMPAR OS ELEMENTOS DE UMA LISTA;
		aulas.clear(); //limpa todo os elementos da lsita;
		System.out.println(aulas);
		
		System.out.println(aulas.isEmpty()); //Verifica se a lista está vazia; (True ou False);
		
		//PARA ADICIONAR TODOS OS ELEMENTOS DE UMA LISTA PARA OUTRA;
		ArrayList<String> aulas1 = new ArrayList(); //Criando a lista;
		aulas1.add("A");
		aulas1.add("B");
		aulas1.add("C");
		System.out.println("Lista aulas:" + aulas1);
		
		aulas.addAll(aulas1); //Adiciona todos os elementos de uma lista em outra, nesse caso, todos os elementos da lista "aulas1" foram adicionados na lista "aulas";
		System.out.println("Lista aulas2" + aulas);
		
		aulas1.clear(); //Limpando a lista aulas1;
		
			//Ou podemos transferir dessa outra forma:
		List<String> aulas2 = Arrays.asList("D", "E", "F"); //Transforma uma Array em uma coleção;
		aulas1.addAll(aulas2);
		System.out.println("Lista aulas1: " + aulas1.toString());
		

	}

}
