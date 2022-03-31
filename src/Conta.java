
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

//M�TODOS
	
	public void deposito(double valor) {
		saldo += valor; //N�o precisa dizer que � THIS.SALDO, pois seria ambiguidade, j� que n�o tem o mesmo nome nos par�metros
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
	/*Com o toString, conseguimos transformar todo o objeto em uma string, formatando o texto de sa�da. 
	 Logo, basta printar o nome do objeto no sysout na classe principal.
	 */
	
}







