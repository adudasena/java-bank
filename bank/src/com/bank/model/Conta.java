package com.bank.model;

public abstract class Conta {

    //atributos privados
    private int numero;
    private String titular;
    private double saldo;

    //Atributo estático. Pertence à classe, não a cada conta
    private static int totalContas = 0;

    //método abstrato que será implementado nas contas filhas
    public abstract void imprimirTipoConta();

    //construtor
    public Conta(String titular) {
        this.titular = titular;

        //quando criar uma conta, aumenta o total de contas
        totalContas++;

        //numero da conta é o valor atual do contador
        this.numero = totalContas;

        System.out.println("Conta criada! Número: " + this.numero);
    }

    //métodos
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("O valor é negativo, não é possível depositar.");
        }
    }

    public void sacar(double valor) {
        if (saldo > valor) {
            this.saldo -= valor;
            System.out.println("Valor retirado. O saldo restante é " + saldo);
        } else {
            System.out.println("Saldo insuficiente. O máximo disponível é " + saldo);
        }
    }

    public void aplicarTaxaMensal() {
        this.saldo= saldo - 12;
        System.out.println("Foi descontado 12 reais em taxa. O saldo atual agora é: " + saldo);
    }

    //getters
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    //estático para ter acesso ao número total de contas
    public static int getTotalContas() {
        return totalContas;
       }
    }

