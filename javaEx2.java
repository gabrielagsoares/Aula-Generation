package br.com.generation.gabriela;
import java.util.*;
public class javaEx2 {
	public static void main(String[] args) {
		// idade de dias para anos, meses e dias
		int idadeAnos, idadeDias, idadeMeses, total;
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("\nDigite quantos dias voc� viveu: ");
		idadeDias = ler.nextInt();
		
		idadeAnos = (idadeDias/365);
		idadeMeses = (idadeDias%365)/30;
		idadeDias = (idadeDias%365)%30;
					

		System.out.printf("\nVoc� tem " + idadeAnos + " anos, " + idadeMeses + " meses, e " + idadeDias + " dias.");
				
		
	}


}
