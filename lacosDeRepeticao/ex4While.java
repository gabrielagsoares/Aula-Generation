package lacosDeRepeticao;

import java.util.Scanner;

public class ex4While {
	// sistema que lê dados de 150 pessoas INCOMPLETO
	// personalidades: calma = 1, nervosa 2, agressivo = 3
	// sexo: feminino = 1, masculino = 2, outros = 3

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int contPessoas = 0, personalidade, idade = 0, pNervosa = 0, pAgressiva = 0, sexo = 0;
		int pessoasCalm = 0, mulherNerv = 0, homemAgres = 0, nervMaior = 0, calmMenor = 0, outrosCalmo = 0,
				Nervosos40 = 0, Calma18 = 0;

		while (contPessoas < 150) {

			System.out.printf("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.printf("Digite o sexo: ");
			sexo = leia.nextInt();

			System.out.printf("Digite sua personalidade: ");
			personalidade = leia.nextInt();

			if (personalidade == 1) {
				pessoasCalm++;

				if (personalidade == 2) {
					mulherNerv++;

					if (personalidade == 3) {
						homemAgres++;

						if (personalidade == 3) {
							mulherNerv++;

							if (idade > 40) {
								nervMaior++;

								if (idade < 18) {
									calmMenor++;

								}
							}
							System.out.printf("Numero de pessoas calmas: " + pessoasCalm);
							System.out.printf("Numero de mulheres nervosas: " + mulherNerv);
							System.out.printf("Numero de homens agressivos: " + homemAgres);
							System.out.printf("Numero de outros calmo: " + outrosCalmo);
							System.out.printf("Numero de pessoas nervosas com mais de 40 anos: " + Nervosos40);
							System.out.printf("Numero de pessoas calmas com menos de 18 anos: " + Calma18);

						}

					}
				}
			}

		}
	}
}
