package InterfacePoliformismo;

import java.util.Scanner;

public class cavalo extends animais2 {
	public static void main(String[] args) {
		int nome;

		Scanner ler = new Scanner(System.in);

		animais2 cavalo = new animais2();
		cavalo.setNome("Chico");
		cavalo.setAcao("Anda, corre e salta");
		cavalo.setIdade(1);
		cavalo.setSom("Relinchar");

		System.out.println("Nome do animal: " + cavalo.getNome());
		System.out.println("Som que o animal emite: " + cavalo.getSom());

	}
}
