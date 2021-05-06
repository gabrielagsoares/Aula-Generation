package br.com.generation.gabriela;

import java.util.Scanner;
		// programa que exibe se número é ímpar ou par 
		//se for par exibir raiz
public class javaNovoex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int numero;
		double raiz;
		double quadrado;
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if(numero%2 == 0) {
		System.out.println("par ");
		raiz = Math.sqrt(numero);
		System.out.println("\nA raiz quadrada do número é: " + raiz);
		}
		
		else {
			System.out.println("ímpar");
		}
		
				
	}
}
