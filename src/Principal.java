import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Conta c;

		System.out.print("Informe o número da conta: ");
		int numero = sc.nextInt();

		System.out.print("Informe o nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("Há algum depósito inicial? [s/n]: ");
		char resp =  sc.next().toUpperCase().charAt(0);

		if (resp == 'S') {
			System.out.printf("Informe o valor do depósito inicial: R$ ");
			double dep_inicial = sc.nextDouble();
			c = new Conta(numero, nome, dep_inicial);
		} else {
			c = new Conta(numero, nome); // sobrecarga
		}

		System.out.println();

		System.out.println("Dados da conta: ");

		System.out.println(c);

		System.out.println();

		System.out.print("Informe um valor para novo depósito: ");
		double novoDeposito = sc.nextDouble();
		c.deposito(novoDeposito);
		
		System.out.println();
		
		System.out.println("Saldo atualizado: ");
		System.out.println(c);
		
		System.out.println();

		System.out.print("Informe um valor para saque: ");
		double novoSaque = sc.nextDouble();
		c.saque(novoSaque);
		
		System.out.println();
		
		System.out.println("Saldo atualizado: ");
		System.out.println(c);

		sc.close();

	}

}