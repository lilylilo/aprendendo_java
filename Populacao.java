
public class Populacao {
	private int estado;
	private int municipios;
	private int pop[][];
	
	public Populacao (int estado, int municipios) {
		this.estado = estado;
		this.municipios = municipios;
		pop = new int [estado] [municipios];
	}
	
	public void atualizarPopulacao(int estado, int municipios, int populacao) {
		pop[estado][municipios] = populacao;
	}
	
	public void mediaEstado(int estado) {
		int total = 0;
		for(int i=0; i<5; i++) {
			total = total + pop[estado][i];
		}
		System.out.println("O estado " + (estado+1) + 
				" tem a média " + (total/5));
	}
}
