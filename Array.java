
package aula;

public class Array {

	public static void main(String[] args) {
		
		int []valor = {10,15,29,12,1,2,4,7,8,9,13,56};
		
		int soma = 0;
		int pares = 0;
		
		//soma
		for(int i=0; i<valor.length; i++) {
			soma = soma + valor[i];
		}
		System.out.println("Soma >> "+soma);
		
		//pares
		for(int i=0; i<valor.length; i++) {
			if(valor[i]%2==0) //comparando se o numero do vetor é par
				pares = pares + valor[i];
		}
		System.out.println("Pares >> "+pares);
	}
}
