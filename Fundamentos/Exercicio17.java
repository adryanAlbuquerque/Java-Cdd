package Fundamentos;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
	int cont = 0;

	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Telefonou para a vítima? (s ou n): ");
	char resp1 = entrada.next().charAt(0);
	if (resp1 == 's' || resp1 == 'S') {
		cont++;
	}
	
	System.out.println("Esteve no local do crime? (s ou n): ");
	char resp2 = entrada.next().charAt(0);
	if (resp2 == 's' || resp2 == 'S') {
		cont++;
	}
	
	System.out.println("Mora perto da vitima? (s ou n): ");
	char resp3 = entrada.next().charAt(0);
	if (resp3 == 's' || resp3 == 'S') {
		cont++;
	}
	
	System.out.println("Devia para a vítima? (s ou n): ");
	char resp4 = entrada.next().charAt(0);
	if (resp4 == 's' || resp4 == 'S') {
		cont++;
	}
	
	System.out.println("Já trabalhou com a vítima? (s ou n): ");
	char resp5 = entrada.next().charAt(0);
	if (resp5 == 's' || resp5 == 'S') {
		cont++;
	}
	
	if (cont == 2) {
	System.out.println("Suspeito!");
	}
	
	else if (cont == 3 || cont == 4) {
		System.out.println("Cumplice!");
	}
	
	else if (cont == 5){
		System.out.println("Assassino!");
	}
	
	else {
		System.out.println("Inocente!");
	}
	

	
	
}
}
