package vetorMatriz;
/*armazenas 6 numeros inteiros
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es 
A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 */

import java.util.Scanner;
public class exercicioArray1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		   int [] A = {1, 0, 5, -2, -5, 7}; // 6 vetores e atribu� valores (a)
		   
		   int vetSomados; // soma das posi��es 0, 1 e 5 (b)
		   
		   vetSomados = (A[0] + A[1]) + A[5]; // 
		   System.out.println("\nA soma dos vetores nas posi��es 0, 1 e 5 � igual �: " + vetSomados);
		   
		   A[4] = 100;
		   
		 
		   for(int i = 0; i<A.length; i++) { //
				System.out.println("\nValor do vetor A: " + A[i]);
		   }
		   
		   
		   
		   
		
}}