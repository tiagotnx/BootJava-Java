package sequencial;

import java.util.Scanner;

public class Aumento2 {

	public static void main(String[] args) {

		double salarioBruto,novoSalario, percentual;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário bruto: ");
		salarioBruto = sc.nextDouble();
		System.out.println("Informe o percentual de aumento: ");
		percentual = sc.nextDouble();
		
		novoSalario = salarioBruto * (1 + percentual / 100);
		System.out.printf("O salário bruto passou de R$%.2f para R$%.2f", salarioBruto, novoSalario);
		
		sc.close();

	}

}
