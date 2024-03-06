import java.util.Scanner;

/*Crie um aplicativo que mostre o efeito abaixo:
	J
	Ja
	Jav
	Java
	Jav
	Ja
	J
*/

public class Ex02_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		//for do menor para o maior
		for(int i=1; i<=palavra.length(); i++) {
			System.out.println(palavra.substring(0,i));
		}
		
		//for do maior para o menor
		for(int i=palavra.length()-1; i>=0;  i--) {
			System.out.println(palavra.substring(0,i));
		}
	}
}
