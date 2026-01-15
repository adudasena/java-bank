package com.bank.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular) {
        super(titular);
    }
    @Override
    public void imprimirTipoConta() {
        System.out.println("Essa é uma Conta Poupança.");
    }
}
