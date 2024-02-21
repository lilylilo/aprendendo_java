/* Lista 1- exercício 3
   Crie um programa que receba a largura e o comprimento de um lote de terra e mostre a área total existente. */

public class Ex03{
	public static void main(String args[]){
		int largura = Integer.parseInt(args[0]);
		int comprimento = Integer.parseInt(args[1]);

		int area = (largura * comprimento);

		System.out.println("Area : "+area);
	}
}