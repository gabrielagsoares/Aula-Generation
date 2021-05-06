package lacosDeRepeticao;

import java.util.*;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
public class ex3While {
	
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int idade = 0, idadeMenor = 0, idadeMaior = 0;
			
			while(idade != -99 ){
				
				System.out.print("Digite sua idade: ");
				idade = leia.nextInt();
				
			
				if(idade < 21) {
					
					idadeMenor++;
					
				} else if(idade > 50) {
					
					idadeMaior++;
				}
				
			} 
			
			leia.close();
			System.out.println("Total de pessoas menores de 21 anos: " + idadeMenor);
			System.out.println("Total de pessoas maiores de 50 anos: " + idadeMaior);
			
			
		}
	}
