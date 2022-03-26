import java.util.Locale;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valor;
		
		System.out.print("Informe o número da conta: ");
		int numeroConta = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Informe o nome do titular: ");
		String nome = sc.nextLine();
		
		Conta conta = new Conta(numeroConta, nome);
		
		System.out.print("Há algum depósito inicial [s/n]? ");
		char dep_inicial = sc.next().charAt(0);
		if (dep_inicial == 's') {
			System.out.print("Informe o valor do depósito inicial: R$ ");
			double inicial = sc.nextDouble();
			conta.setSaldo(inicial);
		}
		
		sc.nextLine();
		
		System.out.println("\nDados da conta: ");
		System.out.printf("Conta %d, Titular: %s, Saldo: R$ %.2f", conta.numeroConta, conta.nome, conta.getSaldo());	
		
		System.out.println("\n");
		
		System.out.print("Informe um valor de depósito: R$ ");
		valor = sc.nextDouble();
		conta.setDepositoSaldo(valor);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.printf("Conta %d, Titular: %s, Saldo: R$ %.2f", conta.numeroConta, conta.nome, conta.getSaldo());

		System.out.println("\n");
		sc.nextLine();
		
		System.out.print("Informe um valor para saque: R$ ");
		valor = sc.nextDouble();
		sc.nextLine();
		conta.setSaqueSaldo(valor);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.printf("Conta %d, Titular: %s, Saldo: R$ %.2f", conta.numeroConta, conta.nome, conta.getSaldo());
		
		sc.close();
	}
}