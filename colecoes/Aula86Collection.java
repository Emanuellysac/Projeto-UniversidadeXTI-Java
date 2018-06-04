package br.com.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Aula86Collection {

	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList(); //A classe ArrayList implementa a classe Collection;
		
		collection.add("A");
		collection.add("B");
		collection.add("C");
	
		System.out.println(collection.toString()); //Sa�da;
		System.out.println(collection.isEmpty()); //Verifica se a lista est� vazia;
		System.out.println(collection.contains("A")); //Verifica se um elemento cont�m na lista;
		
		collection.remove("A"); //Remove o elemento da lista;
		System.out.println(collection.toString());
		
		collection.removeAll(collection); //Remove todos os elementos da lista;
		System.out.println(collection.toString());
		
		Collection<String> collection2 = Arrays.asList("D", "E"); //Transforma um Array em uma Cole��o;
		collection.addAll(collection2); //Transfere todos os elementos da lista "collection2" para a lista collection;
		System.out.println("Lista collection: " + collection.toString());
		
		System.out.println(collection.containsAll(collection2)); //Verifica se existem todos os elementos da lista "collection2" na lista collection"; (true ou false)
		
		collection.removeAll(collection2); //Remove todos os elementos da lista "collection" recebidos pela lista "collection2";
		System.out.println("Elementos removidos!" + collection);
		
		collection.add("F");
		collection.add("G");
		collection.add("H");
		
		//M�todo toArray:
		//collection.toArray(); Object[] -> Converte a cole��o em um array de objetos;
		//collection.toArray(T[]); T[]  -> Recebe um tipo de par�metro ou seja, um tipo de array que deseja retornar;
		String [] string = collection.toArray(new String[collection.size()]); //Transformando a Cole��o em um Array de String;
		System.out.println(Arrays.toString(string));
	}

}
