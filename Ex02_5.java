/* Escreva um aplicativo que recebe entradas de texto e envia 
o texto para saída com letras em maiúsculas e em minúsculas
*/
import java.util.Scanner;
public class Ex02_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um texto: ");
		String texto = sc.nextLine();
		
		System.out.println("Maiuscula: " + texto.toUpperCase());
		System.out.println("Minuscula: " + texto.toLowerCase());
	}
}
