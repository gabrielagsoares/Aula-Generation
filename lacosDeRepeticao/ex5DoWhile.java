package lacosDeRepeticao;

import java.util.Scanner;

//Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros digitados
public class ex5DoWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int tecNum, soma=0;
		do {
			System.out.printf("Insira o n�mero: ");
			tecNum = entrada.nextInt();
			soma = soma += tecNum;
		} while (tecNum != 0);

		System.out.printf("\nA soma dos n�meros inseridos � de: " + soma);

	}

	{
	}
}
