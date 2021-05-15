package InterfacePoliformismo;

import java.util.Scanner;

public class preguica extends animais2{
	public static void main(String[] args) {
		int nome;

		Scanner ler = new Scanner(System.in);

		animais2 preguica = new animais2();
		preguica.setNome("Zizi");
		preguica.setAcao("Anda e nada");
		preguica.setIdade(10);
		preguica.setSom("ZzzZzZZz");

		System.out.println("Nome do animal: " + preguica.getNome());
		System.out.println("Som que o animal emite: " + preguica.getSom());

	}
}



