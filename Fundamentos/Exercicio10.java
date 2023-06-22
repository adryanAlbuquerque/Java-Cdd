package Fundamentos;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[]args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite umm numero:" );
	double resp = entrada.nextDouble();
	if (resp >= 0) {
		System.out.println("positivo");
		
	}else {
		System.out.println("Negativo");
	}
	
	
	}

}
