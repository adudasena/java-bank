package com.bank.model;

public class Conta {

    //atributos privados
    private int numero;
    private String titular;
    private double saldo;

    //Atributo estático. Pertence à classe, não a cada conta
    private static int totalContas= 0;

    //construtor
    public Conta(String titular) {
        this.titular = titular;

        //quando criar uma conta, aumenta o total de contas
        totalContas++;

        //numero da conta é o valor atual do contador
        this.numero= totalContas;

        System.out.println("Conta criada! Número: " + this.numero);
    }
}
