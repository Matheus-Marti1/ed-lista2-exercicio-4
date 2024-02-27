package view;

import java.util.Scanner;

import controller.FatorialDuploController;

public class Principal {

	public static void main(String[] args) {
		FatorialDuploController fat = new FatorialDuploController();
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um número impar positivo para calcular seu fatorial duplo: ");
		boolean valid = false;
		int num = 0;
		while (valid == false) {
			num = input.nextInt();
			if (num % 2 != 0) {
				valid = true;
			} else {
				System.out.println("Entrada inválida. Insira novamente: ");
			}
		}
		System.out.println("Fatorial duplo de " + num + ": " + fat.fatorialDuplo(num));
		input.close();
		System.exit(0);

	}

}
