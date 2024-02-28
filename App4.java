package aula2802;
 
import java.util.InputMismatchException;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite valor 1 ");
			int a = sc.nextInt();
			System.out.println("Digite valor 2 ");
			int b = sc.nextInt();
			int c = (a/b);
			System.out.println(c);
		}catch(InputMismatchException e1) {
			System.out.println("Digite somente numeros");
		}catch(ArithmeticException e1) {
			System.out.println("Ocorreu uma divisão por zero");
		}finally {
			System.out.println("Sempre passo aqui");
		}
	}
}
