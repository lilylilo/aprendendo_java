/* Criar um programa que leia um vetor de inteiros de 10 posições
* e efetue a soma somente dos elementos ímpares.
*
* Resolvido pelo aluno >> Gustavo Mota Macedo */
import java.util.Scanner;
public class Ex04_4 {
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] v = new int[10];
		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite um valor para a posição" + (i + 1) + " do vetor");
			v[i] = sc.nextInt();
		}
		
		int soma = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 != 0) {
				soma = soma + v[i];
			}
		}
			System.out.println("Soma dos numeros ímpares = " +soma);
		}
}
