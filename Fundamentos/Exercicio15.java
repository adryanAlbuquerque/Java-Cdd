package Fundamentos;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 1º nota: ");
		System.out.println("Digite 2º nota: ");
		
		double resp1 = entrada.nextDouble();
		double resp2 = entrada.nextDouble();
		
		double media = (resp1 + resp2) /2;
		System.out.println("A media de" + resp1 + "e" + resp2 + "é: " + media);
		
		
	}
}
