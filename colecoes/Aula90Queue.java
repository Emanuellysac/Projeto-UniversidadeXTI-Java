package br.com.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Aula90Queue {

	public static void main(String[] args) {
		
		//Representa listas de esperas;
		//Collection -> Queue -> LinkedList ou PriorityQueue;
		
		//FIFO -> Primeiro a entrar é o primeiro a sair;
		Queue<String> fila1 = new LinkedList<>();
		
		fila1.add("Ricardo"); //Os elementos são adicionados no FINAL da fila;
		fila1.add("Sandra");
		fila1.add("Beatriz");
		fila1.offer("Maria"); //O mesmo de "add", também adiciona o elemento no FINAL da fila;
		
		System.out.println(fila1);
		
		System.out.println(fila1.peek()); //Retorna qual o próximo elemento da fila sem remove-lo;
		
		fila1.poll(); //Remove o elemento do INICIO da fila;
		System.out.println(fila1);
		
		//Outros métodos disponíveis apenas na classe LinkedList;
			//LinkedList<String> fila2 = new LinkedList<>(); //Para instanciar uma nova fila para a classe LinkedList;
		LinkedList<String> fila2 = (LinkedList<String>) fila1; //Cast -> Para a fila2 receber os elementos da fila1 a qual pertence a uma classe maior que é a Queue;

		fila2.addFirst("caio"); //Adiciona o elemento no INICIO da fila;
		fila2.addLast("José"); //Adiciona o elemento no FINAL da fila;
		
		System.out.println(fila2);
		
		System.out.println(fila2.peekFirst()); //Retorna qual o primeiro elemento da fila, sem remover;
		System.out.println(fila2.peekLast()); //Retorna qual o último elemento da fila, sem remover;
	
		fila2.pollFirst(); //Remove o primeiro elemento da fila;
		fila2.pollLast(); //Remove o último elemento da fila;
		
		System.out.println(fila2);
	}
}
