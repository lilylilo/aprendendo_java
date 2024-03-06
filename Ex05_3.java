import java.util.Scanner;
/*O fatorial de um número inteiro não negativo n é escrito como n!(pronuncia-se fatorial de n) e é definido como segue:
  n! = n.(n-1) . (n-2). ....1 (para valores de n maiores que ou iguais a 1)e 
  n! =1(para n=0)
  Por exemplo: 5! = 5.4.3.2.1, o que dá 120.*/

public class Ex05_3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		int fatorial = 1;
		for(int i=1; i<=numero; i++) {
			fatorial = fatorial*i;
		}
		System.out.println("Fatorial de "+ numero+ " é "+fatorial);
		
	}
}
