/* Lista 1- exercício 4
   Crie um programa que receba quatro valores quaisquer e mostre a média e a soma entre eles. */

public class Ex04{
	public static void main(String args[]){
		int valor1 = Integer.parseInt(args[0]);
		int valor2 = Integer.parseInt(args[1]);
		int valor3 = Integer.parseInt(args[2]);
		int valor4 = Integer.parseInt(args[3]);

		int soma = (valor1+valor2+valor3+valor4);
		int media = soma/4;

		System.out.println("Soma : "+soma);
		System.out.println("Media : "+media);
	}
}
