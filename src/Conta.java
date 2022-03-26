public class Conta {
	
	public final int numeroConta;
	public String nome;
	private double saldo; 
	
	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setDepositoSaldo(double valor) {
		this.saldo += valor;
	}
	
	public void setSaqueSaldo(double valor) {
		this.saldo -= valor;
		this.saldo -= 5.0;
	}
	
	
}











