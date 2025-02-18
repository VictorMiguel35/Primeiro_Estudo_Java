package Desafio;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                *****************************************
                Dados iniciais do cliente:
                
                Nome:                Victor Miguel
                Tipo conta:          Corrente
                Saldo inicial:       R$ 5000,00
                *****************************************""");

        int opcao = 0;
        double saldo = 5000;

        while (opcao != 4) {
            System.out.println("""
                
                
                Operações
                
                1- Consultar saldo
                2- Depósito
                3- Saque
                4- Sair
                """);

            System.out.println("Digite a opção desejada: ");
            opcao = leitura.nextInt();

            switch (opcao) {

                case 1:
                    //Visualização do saldo
                    System.out.println("O saldo atual é R$ " + saldo);
                    break;

                case 2:
                    //Recebe valor
                    System.out.println("Informe o valor do depósito: ");
                    double deposito = leitura.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;

                case 3:
                    //Enviar valor
                    System.out.println("Informe o valor do saque: ");
                    double saque = leitura.nextDouble();
                    if (saldo < saque) {
                        System.out.println("Não há saldo suficiente para realizar esse saque.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
