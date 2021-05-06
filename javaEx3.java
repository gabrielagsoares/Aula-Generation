package br.com.generation.gabriela;
import java.util.*;
public class javaEx3 { // transformando segundos em: hrs, min, seg.

	public static void main(String[] args) {
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		int seg = 0;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Duração do evento em segundos: ");
		segundos = ler.nextInt();
		
		horas = (segundos/3600);
		minutos= ((segundos%3600) / 60);
		seg = ((segundos%3600)%60);
		
		System.out.println("\nO evento durou: " + horas + " horas, " + minutos + " minutos, e " + seg + " segundos.");
	}
}
