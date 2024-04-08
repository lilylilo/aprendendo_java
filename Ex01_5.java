/*Escreva um aplicativo que lê um inteiro não negativo via linha de comando,computa e imprima seu fatorial.*/
import java.util.Scanner;
public class Ex01_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um inteiro não negativo: ");
		int entrada = sc.nextInt();
		
		int fatorial = 1;
		for (int i = 1; i <= entrada; i++) {
			fatorial *= i;
		}
		System.out.println("Fatorial do número é " + fatorial);
	}
}
