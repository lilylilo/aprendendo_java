/* Criar um programa que leia dois vetores de inteiros de 10
posições, efetue a soma dos valores dos elementos de mesmo índice
dos dois vetores colocando o resultado em um terceiro vetor. Exiba
na tela o vetor resultante.
*
* Resolvido pelo aluno >> Gustavo Mota Macedo
*/
import java.util.Scanner;
public class Ex05_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] v1 = new int[10];
		int[] v2 = new int[10];
		int[] vSoma = new int[10];
		
		for (int i = 0; i < v1.length; i++) {
			System.out.println("Digite um numero para a posição " + (i + 1) + " do vetor 1");
			v1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < v2.length; i++) {
			System.out.println("Digite um numero para a posição " + (i + 1) + " do vetor 2");
			v2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < v2.length; i++) {
			vSoma[i] = v1[i] + v2[i];
			System.out.println(vSoma[i]);
		}
	}

}
