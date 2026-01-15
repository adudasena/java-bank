package com.bank.app;
import com.bank.model.Conta;
import com.bank.model.ContaCorrente;
import com.bank.model.ContaPoupanca;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Conta contaAtual = null;
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("---MENU---");
            System.out.println("1- Criar conta");
            System.out.println("2- Consultar saldo");
            System.out.println("3- Depositar");
            System.out.println("4- Sacar");
            System.out.println("0- Sair");
            System.out.println("Digite a opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual o tipo de conta? 1- Corrente | 2- Poupança: ");
                    int tipoConta = sc.nextInt();
                    System.out.println("Qual o nome do titular? Digite: ");
                    sc.nextLine();
                    String nome= sc.nextLine();

                    if (tipoConta ==1) {
                        contaAtual= new ContaCorrente(nome);
                    } else {
                        contaAtual= new ContaPoupanca(nome);
                    }
                    break;

                case 2:
                    //verificação se a conta foi criada
                    if (contaAtual != null) {
                        System.out.println("Saldo: " + contaAtual.getSaldo());
                    } else {
                        System.out.println("Não há uma conta criada. ");
                    }
                    break;
                case 3:
                    if (contaAtual != null) {
                    System.out.println("Digite o valor a ser depositado: ");
                    contaAtual.depositar(sc.nextDouble());
                    } else {
                        System.out.println("Erro: Nenhuma conta ativa.");
                    }
                    break;
                case 4:
                    if (contaAtual != null) {
                    System.out.println("Digite o valor que deseja sacar: ");
                    contaAtual.sacar(sc.nextDouble());
                    } else {
                        System.out.println("Erro: Nenhuma conta ativa.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite de 0 a 4.");

            }
        } while (opcao != 0); //loop continua enquanto não for 0
        sc.close(); // Boa prática: fechar o scanner no fim do main
    }
}
