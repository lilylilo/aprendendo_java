/*Dado um vetor v = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9,
48, 55, 9}, criar um programa que leia um número e informe na tela
quantas vezes este número foi encontrado no vetor.
*
* Resolvido pelo aluno >> Gustavo Mota Macedo
*
*/
import java.util.Scanner;
public class Ex03_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] v = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9,
		48, 55, 9};
		
		System.out.println("Digite um numero:");
		int entrada = sc.nextInt();
		
		int contagem = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == entrada)
				contagem = contagem + 1;
		}
			System.out.println("O número foi encontrado " + contagem
			+ " vezes no vetor.");
		}

}
