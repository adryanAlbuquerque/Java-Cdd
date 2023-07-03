package Fundamentos;

import java.util.Scanner;

public class Aula20 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Quantos alunos tem ?");
	int resp = entrada.nextInt();
	
	int c = 0;
	float notas = 0;
	
	
	System.out.println("Qual a media do aluno: ");
	
	while (c <= resp-1) {
		float nota = entrada.nextFloat();
		notas += nota;
		c++;
	}
	
	System.out.println( notas/resp);
	
	
	
}
}
