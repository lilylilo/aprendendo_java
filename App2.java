package aula2802;

import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu nome");
		String nome = sc.nextLine ();
		
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		
		System.out.println("Digite seu salário");
		double salario = sc.nextDouble();
		
		System.out.println("Nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("Salário: "+salario);
		
	}

}
