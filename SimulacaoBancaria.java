import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Selecione uma opção: ");
            System.out.println("1. Depositar"); 
            System.out.println("2. Sacar"); 
            System.out.println("3. Consultar Saldo"); 
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor a ser depositado");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado. Saldo atual: " + saldo); 
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor a ser sacado");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado! Saldo atual " + saldo);
                    }
                    else {
                        System.out.println("Saldo insuficiente! Saldo: " + saldo);
                    }
                    
                    break;
                case 3:
                    System.out.println("Seu saldo é " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}