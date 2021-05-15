package exerciciosHeranca;

import java.util.Scanner;

public class todosAnimais extends animais{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
int nome;
		
		todosAnimais cachorro = new todosAnimais();
		todosAnimais cavalo = new todosAnimais();
		todosAnimais preguica = new todosAnimais();
		
		System.out.println(" ... Número correspondente ao nome do animal ...");
		System.out.println("\n       cachorro = 1 / cavalo = 2 / preguiça = 3");
		System.out.println("\n   Insira o número: ");
		nome = ler.nextInt();
		
		cachorro.setNome("Teodora");
		cachorro.setAcao("Anda ");
		cachorro.setIdade(3);
		cachorro.setSom("Latido");
					
		cavalo.setNome("Chico");
		cavalo.setAcao("Andar, correr, saltar");
		cavalo.setIdade(1);
		cavalo.setSom("Relinchar");
		
		preguica.setNome("Zizi");
		preguica.setAcao("Andar e nadar");
		preguica.setIdade(10);
		preguica.setSom("ZzzzZzZZZzzz");
		
		if(nome ==1) {
		System.out.println("Nome do animal: " + cachorro.getNome());
		System.out.println("Som que o animal emite: " + cachorro.getSom());
		}
		if(nome == 2) {
		System.out.println("Nome do animal: " + cavalo.getNome());
		System.out.println("Som que o animal emite: " + cavalo.getSom());
		}
		if(nome == 3) {
		System.out.println("Nome do animal: " + preguica.getNome());
		System.out.println("Som que o animal emite: " + preguica.getSom());

	}
	
	
		
	
	}
}
