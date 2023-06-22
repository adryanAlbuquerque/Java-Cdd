package Fundamentos;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite F ou M");
		char resp = entrada.next().charAt(0);
		
		if (resp == 'F') {
			System.out.println("Feminino");
		}
		
		if (resp == 'M') {
			System.out.println("Masculino");
		}
		
		else{
			System.out.println("Inválido!");
		}
	}

}
