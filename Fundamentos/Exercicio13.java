package Fundamentos;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:" );
		System.out.println("Digite um numero:" );
		System.out.println("Digite um numero:" );
		
		double resp1 = entrada.nextDouble();
		double resp2 = entrada.nextDouble();
		double resp3 = entrada.nextDouble();
		
		if (resp1 > resp2 && resp1 > resp3){
			System.out.println(resp1 + " é o maior número!");
		
			
		}else if (resp2 > resp1 && resp2 > resp3) {
			System.out.println(resp2 + " é o maior numero");
		}
		
		else {
			System.out.println(resp3 + " é o maior!");
		}
		
		
		
		if (resp1 < resp2 && resp1 < resp3){
			System.out.println(resp1 + " é o menor número!");
		
			
		}else if (resp2 < resp1 && resp2 < resp3) {
			System.out.println(resp2 + " é o menor numero");
		}
		
		else {
			System.out.println(resp3 + " é o menor numero!");
		}
			
			
	}

}
