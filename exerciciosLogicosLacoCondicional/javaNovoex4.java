package exerciciosLogicosLacoCondicional;

import java.util.Scanner;
		// programa que exibe se n�mero � �mpar ou par 
		//se for par exibir raiz
public class javaNovoex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int numero;
		double raiz;
		double quadrado;
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextInt();
		
		if(numero%2 == 0) {
		System.out.println("par ");
		raiz = Math.sqrt(numero);
		System.out.println("\nA raiz quadrada do n�mero �: " + raiz);
		}
		
		else {
			System.out.println("�mpar");
		}
		
				
	}
}
