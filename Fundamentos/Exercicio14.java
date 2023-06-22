package Fundamentos;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:" );
		
		int resp = entrada.nextInt();
		
		
		if (resp == 1){
			System.out.println(resp + " é domingo!");
		}
		
		else if (resp == 2){
			System.out.println(resp + " é segunda-feira!");
		}
		
		else if (resp == 3){
			System.out.println(resp + " é terça-feira!");
		}
		else if (resp == 4){
			System.out.println(resp + " é quarta-feira!");
		}
		
		else if (resp == 5){
			System.out.println(resp + " é quinta-feira!");
		}
		
		else if (resp == 6){
			System.out.println(resp + " é sexta-feira!");
		}
		
		else if (resp == 7){
			System.out.println(resp + " é sábado!");
		}
		
		else {
			System.out.println("número inválido!");
			
		
		}
	}

}
