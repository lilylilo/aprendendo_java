package aula;

public class Array {

	public static void main(String[] args) {
		
		String nome[] = new String[3];
		nome[0]="Jose";
		nome[1]="Ana";
		nome[2]="Maria Clara";
		
		int []valor = {10,15,29,12};
		
		//tamanho do vetor
		System.out.println(nome.length);
		System.out.println(valor.length);
		
		//imprimir
		System.out.println(nome[2]);
		System.out.println(valor[3]);
		
		for(int i=0; i<valor.length; i++) {
			System.out.println(valor[i]);
		}

	}
}
