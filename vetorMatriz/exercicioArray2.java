package vetorMatriz;

import java.util.Scanner;

/*programa recebe 6 n�meros inteiros
            (a) mostrar n�meros pares digitados;  
			(b) soma dos n�meros pares digitados; 
			(c)n�meros �mpares digitados; 
			(d)quantidade de n�meros �mpares digitados.
		*/
public class exercicioArray2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a[] = new int[6], somaPar = 0, somaImpar = 0, valorImp = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o n�mero desejado: ");
			a[i] = entrada.nextInt();
		}
		System.out.println(">>> N�meros Pares inseridos: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				somaPar += a[i];
				System.out.println("\n" + a[i]);

			}

		}
		System.out.println("A soma dos n�meros pares �: " + somaPar);

		System.out.println("\n>>> N�meros �mpares inseridos: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				somaImpar += a[i];
				System.out.println("\n" + a[i]);

			}
		}
		System.out.println("\nA soma dos n�meros �mpares inseridos �: " + somaImpar);
	}
}