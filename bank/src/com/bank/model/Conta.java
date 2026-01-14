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
        
    }
}
