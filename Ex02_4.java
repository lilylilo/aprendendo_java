/* Dado um vetor v = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95,
13, 26, 49, 50}, criar um programa a que leia um número e
verifique e imprima na tela se este número existe no vetor.
* Resolvido pelo aluno >> Gustavo Mota Macedo */

import java.util.Scanner;
public class Ex02_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] v = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95,
		13, 26, 49, 50};
		
		System.out.println("Digite um numero para ser impresso na tela:");
		int numero = sc.nextInt();
		
		boolean encontrado = false;
		for (int i = 0; i < v.length; i++) {
			if (numero == v[i]) {
				encontrado = true;
				System.out.println("=====" + numero + "=====");
				break;
			}
		}
		if (!encontrado)
			System.out.println("Numero não encontrado :( ");
		}

	}

