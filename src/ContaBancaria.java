
class ContaBancaria {
    private static final double TAXA_SAQUE = 5.0; // Taxa fixa de saque

    private int conta;
    private String titular;
    private double saldo;

    // Construtor com depósito inicial
    public ContaBancaria(int conta, String titular, double depositoInicial) {
        this.conta = conta;
        this.titular = titular;
        this.deposito(depositoInicial);
    }

    // Construtor sem depósito inicial
    public ContaBancaria(int conta, String titular) {
        this.conta = conta;
        this.titular = titular;
    }

    // Getters e Setters
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

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Depósito inválido! O valor deve ser positivo.");
        }
    }

    public void saque(double valor) {
        if (valor > 0 && valor + TAXA_SAQUE <= saldo) {
            saldo -= valor + TAXA_SAQUE;
        } else {
            System.out.println("Saque inválido! Verifique se o valor é positivo e menor que o saldo disponível.");
        }
    }

    @Override
    public String toString() {
        return String.format("Conta: %d | Titular: %s | Saldo: R$ %.2f", conta, titular, saldo);
    }
}
