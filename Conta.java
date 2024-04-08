
public class Conta {
	// ATRIBUTOS
	double saldo;
	String nrAgencia;
	String titular;
	String nrConta;
	int codBanco;
	
	//crie o construtor
	public Conta() {
		
	}
	public Conta(double saldo, String nrAgencia, String titular, String nrConta, int codBanco) {
		this.saldo = saldo;
		this.nrAgencia = nrAgencia;
		this.titular = titular;
		this.nrConta = nrConta;
		this.codBanco = codBanco;
	}
	/**
	* @param valor: valor a ser sacado da conta
	* 1. Verificar se o valor do saque e positivo.
	* 2. Verificar se ha saldo suficiente para efetuar o saque
	* 2.1. Se o saldo for suficiente, efetuar o saque
	* 2.2. Se o saldo for insuficiente imprimir na tela que o
	saldo e Insuficiente
	*/
	public void saque(double valor) {
		if(valor > 0) {
			if (saldo > valor) {
				saldo = saldo - valor;
			}else {
				System.out.println("Saldo insuficiente");
			}
		}
	}
	
	/**
	* @param valor Valor a ser depositado da conta
	* Verificar se o valor do deposito e positivo.
	*/
	void deposito(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
		}
	}
	
	/**
	* Metodo para impressao de todos os dados
	* da classe
	*/
	public void imprimeDados() {
		System.out.println("\n----------------------------");
		System.out.println("AGENCIA:\t" + nrAgencia + "\t BANCO:\t" + codBanco);
		System.out.println("Conta: \t" + nrConta);
		System.out.println("TITULAR: \t" + titular);
		System.out.println("SALDO: \t" + saldo);
		System.out.println("-----------------------------\n");
		}
	
	/**
	* @return saldo da conta
	*/
	double getSaldo() {
		return saldo;
		}
}
