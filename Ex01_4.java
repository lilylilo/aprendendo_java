/* Uma escola precisa de um programa que controle a média das
notas dos alunos de cada classe e a média das notas de todos os
* alunos da escola. Sabendo que essa escola possui 3 classes com
5 alunos em cada classe, gerando um total de 15 notas, crie um
programa que receba as notas de cada aluno de cada classe e no
final apresente a média de cada classe e a média da escola em
geral. */

import java.util.Scanner;
public class Ex01_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int somaGeral = 0;
		int somaSala = 0;
		int nota[][] = new int[3][5];
		
		// entrando com os dados
		for (int linha = 0; linha < nota.length; linha++) {
			for (int coluna = 0; coluna < nota[0].length; coluna++) {
				System.out.println("Classe >> " + (linha + 1) + " aluno >> "+(coluna + 1)); nota[linha][coluna] = sc.nextInt();
				}
			}
		
			// somando as notas e calculando a média
			for (int linha = 0; linha < nota.length; linha++) {
				for (int coluna = 0; coluna < nota[0].length; coluna++) {
					// somando nota geral
					somaGeral = somaGeral + nota[linha][coluna];
					somaSala = somaSala + nota[linha][coluna];
				}
				System.out.println("Media da Sala "+( linha+1 ) + " >> "+ (somaSala/5)); somaSala = 0;
			}
			System.out.println("Media Geral da escola >> " +
			(somaGeral/15));
		}
}
