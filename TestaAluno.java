
public class TestaAluno {

	public static void main(String[] args) {
		// criar 1 objetos da classe Aluno sem argumentos
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno("Gustavo", "123456789", 7.0, 6.0, 9.0, 1, 2, 3);
		
		// atribuir valores
		a1.setNome("Gabriela");
		a1.setMatricula("987654321");
		a1.setNota1(6.0);
		a1.setNota2(7.0);
		a1.setNota3(8.0);
		a1.setPeso1(1);
		a1.setPeso2(2);
		a1.setPeso3(3);
		
		// imprimir os valores dos atributos e média
		System.out.println("Nome.........: " + a1.getNome());
		System.out.println("Matrícula....: " +
		a1.getMatricula());
		System.out.printf( "Media........: %.2f\n" ,
		a1.mediaPonderada());
		System.out.println("Nome.........: " + a2.getNome());
		System.out.println("Matrícula....: " +
		a2.getMatricula());
		System.out.printf( "Media........: %.2f\n" ,
		a2.mediaPonderada());

	}

}
