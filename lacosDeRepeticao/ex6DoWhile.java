package lacosDeRepeticao;

import java.util.Scanner;

		//programa recebe números inteiros 
			//imprime a média dos números múltiplos de 3 // Para sair digitar 0 
				
public class ex6DoWhile {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numeros, media=0, soma=0, cont=0;
		do {
			System.out.printf("Insira o número: ");
			numeros = entrada.nextInt();
			
			if(numeros % 3 == 0 && numeros !=0);
			soma = soma + numeros;
			cont++;
			
		} while (numeros != 0);
			media = soma/ cont;
			
		System.out.printf("\nA média dos números multiplos de 3 é: " + media);

	}

	{
	}
}


