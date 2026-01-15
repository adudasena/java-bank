package com.bank.model;

public class ContaCorrente extends Conta {
    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void imprimirTipoConta() {
        System.out.println("Essa é uma Conta Corrente.");
    }
}

