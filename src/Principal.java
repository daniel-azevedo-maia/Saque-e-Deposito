import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            // Solicitação dos dados iniciais da conta
            int numero = lerIntComValidacao(sc, "Informe o número da conta: ");

            System.out.print("Informe o nome do titular: ");
            sc.nextLine(); // Consumir quebra de linha
            String nome = sc.nextLine();

            char resp = lerCharComValidacao(sc, "Há algum depósito inicial? [S/N]: ", 'S', 'N');

            ContaBancaria contaBancaria;

            // Criação da conta com ou sem depósito inicial
            if (resp == 'S') {
                double depositoInicial = lerDoubleComValidacao(sc, "Informe o valor do depósito inicial: R$ ");
                contaBancaria = new ContaBancaria(numero, nome, depositoInicial);
            } else {
                contaBancaria = new ContaBancaria(numero, nome);
            }

            // Exibição dos dados da conta
            System.out.println("\nDados da conta:");
            System.out.println(contaBancaria);

            // Realizar um novo depósito
            double novoDeposito = lerDoubleComValidacao(sc, "\nInforme um valor para novo depósito: R$ ");
            contaBancaria.deposito(novoDeposito);
            System.out.println("\nSaldo atualizado:");
            System.out.println(contaBancaria);

            // Realizar um saque
            double novoSaque = lerDoubleComValidacao(sc, "\nInforme um valor para saque: R$ ");
            contaBancaria.saque(novoSaque);
            System.out.println("\nSaldo atualizado:");
            System.out.println(contaBancaria);

        } finally {
            sc.close();
        }
    }

    private static int lerIntComValidacao(Scanner sc, String mensagem) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            try {
                valor = sc.nextInt();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Insira um número inteiro.");
                sc.nextLine(); // Limpar buffer
            }
        }
    }

    // Método para ler um valor double com validação
    private static double lerDoubleComValidacao(Scanner sc, String mensagem) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            try {
                valor = sc.nextDouble();
                if (valor >= 0) {
                    return valor;
                } else {
                    System.out.println("Erro: O valor não pode ser negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Insira um número decimal válido.");
                sc.nextLine(); // Limpar buffer
            }
        }
    }

    private static char lerCharComValidacao(Scanner sc, String mensagem, char opcao1, char opcao2) {
        char valor;
        while (true) {
            System.out.print(mensagem);
            String entrada = sc.next().toUpperCase();
            if (entrada.length() == 1) {
                valor = entrada.charAt(0);
                if (valor == opcao1 || valor == opcao2) {
                    return valor;
                }
            }
            System.out.printf("Erro: Insira '%c' ou '%c'.\n", opcao1, opcao2);
        }
    }
}
