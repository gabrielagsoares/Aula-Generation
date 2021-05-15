package vetorMatriz;

// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui
import java.util.*;

public class exercicioArray3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int maiorDez = 0, y = 0, x = 0;
		int[][] numero = new int[3][3]; // 3 linhas 3 colunas

		for (int l = 0; l < numero.length; l++) {
			for (int c = 0; c < numero[l].length; c++) {
				System.out.printf("\n- Digite o valor da matriz: ");
				numero[l][c] = entrada.nextInt();
				if(numero[x][y] >10) {
					maiorDez++;
			}
			
		}

		
			}
			System.out.printf("\nA quantidade de números maiores de 10 na matriz é de: %d", maiorDez);

		}
		
				}
			
		