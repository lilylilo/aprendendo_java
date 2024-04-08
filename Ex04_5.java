/* Faça um aplicativo que verifique se uma palavra é 
* um palíndromo. Ex: Ana. */
import java.util.Scanner;
public class Ex04_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String entrada = sc.nextLine();
		
		String invertida = entrada;
		
		boolean palindromo = true;
		for (int i = 0; i < entrada.length(); i++) {
			if (entrada.charAt(i) != 
					invertida.charAt(entrada.length() - (i + 
							1))) {
				palindromo = false;
			}
		}
		
		if (palindromo)
			System.out.println("É palindromo!");
		else
			System.out.println("Não é palindromo");
	}
}
