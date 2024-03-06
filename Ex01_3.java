import java.util.Scanner;

/*Crie um aplicativo que receba uma frase e mostre-a de forma invertida.*/

public class Ex01_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = sc.nextLine();
		
		//for do maior para o menor
		for (int i=palavra.length()-1; i>=0; i--) {
			System.out.println(palavra.charAt(i));
		}
	}
}
