package lacosDeRepeticao;

import java.util.*;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares
public class ex2For {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		int par = 0, impar = 0, num;
		
		for(int contador = 1; contador <= 10; contador++) {
			
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
					par++;
			} else {
				impar++;
			}
		  }
		
			leia.close();
			System.out.println("Numeros pares: " + par);
			System.out.println("Numeros impares: " + impar);
	   }
	}
