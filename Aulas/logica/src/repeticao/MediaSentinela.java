package repeticao;

import java.util.Scanner;

public class MediaSentinela {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double total = 0;
		int contador = 0;

		System.out.println("Digite uma nota ou -1 para sair: ");
		double nota = sc.nextDouble();

		while (nota != -1) {
			total += nota;
			contador++;

			System.out.println("Digite uma nota ou -1 para sair: ");
			nota = sc.nextDouble();

		}

		if (contador != 0) {
			double media = total / contador;
			
			System.out.printf("\nTotal de alunos: %d.\n", contador);
			System.out.printf("Total de notas computadas: %.1f.\n", total);
			System.out.printf("Média da sala: %.1f.", media);
		} else {
			System.out.println("\nSem notas cadastradas.");
		}

		sc.close();

	}

}
