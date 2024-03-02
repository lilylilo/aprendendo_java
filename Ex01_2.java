package aula2802;
// Lista 2
//Faça um aplicativo que receba três valores inteiros na linha de comando emostre o maior dentre eles

import java.util.Scanner;

public class Ex01 { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Digite valor de B: ");
		int b = sc.nextInt();
		
		System.out.println("Digite valor de C: ");
		int c = sc.nextInt();
		
		if(a>=b && a>=c)
			System.out.println("A é maior "+a);
		else if(b>=c)
			System.out.println("B é maior "+b);
		else
			System.out.println("C é maior "+c);
	}

}
