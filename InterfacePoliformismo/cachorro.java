package InterfacePoliformismo;

import java.util.Scanner;

public class cachorro extends animais2{
	
	public static void main(String[] args) {
		int nome;
		
		Scanner ler = new Scanner (System.in);

		animais2 cachorro = new animais2();
		cachorro.setNome("Teodora");
		cachorro.setAcao("Anda ");
		cachorro.setIdade(3);
		cachorro.setSom("Latindo >>auauaua<<");
		
		System.out.println("Nome do animal: " + cachorro.getNome());
		System.out.println("Som que o animal emite: " + cachorro.getSom());
		
		
}
}