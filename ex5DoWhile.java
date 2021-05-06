package lacosDeRepeticao;

import java.util.Scanner;

//Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números digitados
public class ex5DoWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int tecNum, soma=0;
		do {
			System.out.printf("Insira o número: ");
			tecNum = entrada.nextInt();
			soma = soma += tecNum;
		} while (tecNum != 0);

		System.out.printf("\nA soma dos números inseridos é de: " + soma);

	}

	{
	}
}
