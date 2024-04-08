/*A série de Fibonacci 0,1,1,2,3,5,8,13,21..... inicia com 0 
e 1 e tem a prioridade de que cada número de Fibonacci 
subseqüente é a soma dos dois anteriores que o procedem. 
Escreva um aplicativo que recebe a entrada do número de 
vezes que deve ocorrer a série. */
import java.util.Scanner;
public class Ex03_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva quantas vezes a serie deve ocorrer: ");
		int entrada = sc.nextInt();
		
		int fibonacci = 0;
		int ultimo = 0;
		int penultimo;
		
		for (int i = 0; i < entrada; i++) {
			System.out.println(fibonacci);
			if (i == 0) {
				fibonacci = 1;
			} else {
				penultimo = ultimo;
				ultimo = fibonacci;
				fibonacci = penultimo + ultimo;
			}
		}
	}
}