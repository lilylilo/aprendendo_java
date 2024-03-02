package aula2802;
//Faça um aplicativo que calcule o produto dos inteiros ímpares de 1 a 15 eexiba o resultado na tela//

public class Ex02 {
	public static void main(String[] args) {
		int produto = 1;
		for(int i=1; i<=15; i+=2) {
			produto = produto *i;
		}
		System.out.println("Produto= "+produto);
	}
}
