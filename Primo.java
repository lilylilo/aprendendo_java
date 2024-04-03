package prova;

import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro maior que zero");
		int primo = sc.nextInt();
		// contador >> para verificar qtas vezes o número foi dividido
		int contador = 0;
		for(int i =1;i<=primo;i++) {
			if(primo%i==0)
				contador++;
		}
		// imprime se o número é primo
		if(contador ==2)
			System.out.println("O número "+ primo + " é primo");
		else
			System.out.println("O número "+ primo + " não é primo");
	}
}
