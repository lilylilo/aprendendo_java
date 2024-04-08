/* Criar um programa que leia um vetor de inteiros de 20 
posições e mostre a quantidade de números que são múltiplos 
de 2.*/
import java.util.Scanner;
public class Ex01_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v[] = new int[20];
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite um valor inteiro para a posição " + i + " do vetor:");
			v[i] = sc.nextInt();
		}
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				System.out.println(v[i] + " é múltiplo de 2.");
			}
		}
	}
}
