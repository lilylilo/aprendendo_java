import java.util.Scanner;

/*Uma empresa quer transmitir dados por telefone, mas está preocupada com a possibilidade de seus telefones estarem grampeados. 
  Todos seus dados são transmitidos como inteiros de quatro dígitos. Eles pedem para você escrever um programa que criptografará seus dados de modo que estes possam ser transmitidos mais seguramente. 
  Seu aplicativo deve ler um inteiro de quatro dígitos inserido pelo usuário na linha de comando e criptografá-lo como segue:substitua cada digito por (a soma deste dígito mais 1). 
  Então troque o primeiro digito pelo terceiro e troque o segundo pelo quarto. A seguir imprima o inteiro criptografado. 
  Escreva um aplicativo separado que recebe como entrada um inteiro de quatro dígitos criptografado e o descriptografa para formar o número original.*/

public class Ex04_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número (9999)");
		String numero = sc.nextLine();
		
		int a = Integer.parseInt(numero.substring(0,1)) +1;
		int b = Integer.parseInt(numero.substring(1,2)) +1;
		int c = Integer.parseInt(numero.substring(2,3)) +1;
		int d = Integer.parseInt(numero.substring(3,4)) +1;
		
		//verifica se um dos numeros é 10 e se for, atualiza para 0
		if (a==10)
			a=0;
		if(b==10)
			b=0;
		if(c==10)
			c=0;
		if(d==10)
			d=10;
		
		//criptografando Exemplo entrada >> 8793 saída >> 0498
		System.out.println("Valor criptografado >>" + c+d+a+b);
	}

}
