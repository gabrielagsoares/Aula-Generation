package br.com.generation.gabriela;

import java.util.*;

// programa que receba tr�s inteiros e diga qual deles � o maior
public class javaNovoEx1 {

		public static void main(String[] args) {
			double num1, num2, num3, maior=0.0;
			Scanner ler = new Scanner (System.in);
			
			System.out.println("Digite o primeiro n�mero: ");
			num1 = ler.nextDouble();
			
			System.out.println("Digite o segundo n�mero: ");
			num2 = ler.nextDouble();
			
			System.out.println("Digite o terceiro n�mero: ");
			num3 = ler.nextDouble();
		
			if (num1 > num2 && num1 >num3){
				maior = num1;
				
			}
	        else if(num2 > num1 && num2 > num3) {
	            maior = num2;
	        }
	        else if(num3 > num1 && num3 > num2){
	            maior = num3;
	       
	        }
	        
	        System.out.println("O maior valor digitado foi: " + maior);
	    }
}

