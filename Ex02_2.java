package aula2802;
//Faça um programa que apresente o total da soma dos cem primeirosnúmeros inteiros (1+2+3+.....+99+100).

public class Ex03 {
	public static void main(String[] args) {
		
		int soma = 0;
		for(int i=1; i<=100; i++) {
			soma = soma +i;
		}
		System.out.println("Soma= "+soma);
	}
}
