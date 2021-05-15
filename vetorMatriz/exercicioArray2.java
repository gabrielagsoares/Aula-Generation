package vetorMatriz;

import java.util.Scanner;

/*programa recebe 6 números inteiros
            (a) mostrar números pares digitados;  
			(b) soma dos números pares digitados; 
			(c)números ímpares digitados; 
			(d)quantidade de números ímpares digitados.
		*/
public class exercicioArray2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[] = new int[6], somaPar = 0, somaImpar = 0, valorImp = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o número desejado: ");
			a[i] = entrada.nextInt();
		}
		System.out.println(">>> Números Pares inseridos: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				somaPar += a[i];
				System.out.println("\n" + a[i]);

			}

		}
		System.out.println("A soma dos números pares é: " + somaPar);

		System.out.println("\n>>> Números Ímpares inseridos: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				somaImpar += a[i];
				System.out.println("\n" + a[i]);

			}
		}
		System.out.println("\nA soma dos números Ímpares inseridos é: " + somaImpar);
	}
}