package exerciciosLogicosLacoCondicional;

	// idade expressa em dias
import java.util.*;
public class javaEx1 {
	public static void main(String[] args) {
		int idade, idadeDias, idadeMeses, idadeAnos = 0, totalDias, soma;
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Digite sua idade em anos: ");
		idade = ler.nextInt();
		
		System.out.println("\nDigite os meses: ");
		idadeMeses = ler.nextInt();
		
		System.out.printf("\nDigite os dias: ");
		idadeDias = ler.nextInt();
	
		soma = idadeAnos*365 + idadeMeses*30 + idadeDias;
		totalDias = soma;
				System.out.printf("\nSua idade em dias é de: " + totalDias);
		
		
				
	}
}
