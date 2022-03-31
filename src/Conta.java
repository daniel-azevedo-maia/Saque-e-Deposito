
public class Conta {
	private int conta;
	private String titular;
	private double saldo;
	
//CONSTRUTORES
	public Conta(int conta, String titular, double depositoInicial) {
		this.conta = conta;
		this.titular = titular;
		deposito(depositoInicial);
	}
	
	public Conta(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}

	public int getConta() {
		return conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

//MÉTODOS
	
	public void deposito(double valor) {
		saldo += valor; //Não precisa dizer que é THIS.SALDO, pois seria ambiguidade, já que não tem o mesmo nome nos parâmetros
	}
	
	public void saque(double valor) {
		saldo -= valor + 5;
	}

	public String toString() {
		return "Conta: " 
				+ conta 
				+ " | Titular: " 
				+ titular 
				+ " | Saldo: R$ "  
				+ String.format("%.2f", saldo);
	}
	/*Com o toString, conseguimos transformar todo o objeto em uma string, formatando o texto de saída. 
	 Logo, basta printar o nome do objeto no sysout na classe principal.
	 */
	
}







