
public class ArrayB {

	public static void main(String[] args) {
		
		String cidades[][] = new String[2][4];
		
		cidades[0][0] = "São Paulo";
		cidades[0][1] = "Campinas";
		cidades[0][2] = "Guarulhos";
		cidades[0][3] = "Barueri";
		
		cidades[1][0] = "Rio de Janeiro";
		cidades[1][1] = "Niteroi";
		cidades[1][2] = "Cabo Frio";
		cidades[1][3] = "Paraty";
		
		//imprimir
		for(int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<4; coluna++) {
				System.out.println(cidades[linha][coluna]);
			}
			System.out.println("======");
		}

	}

}
