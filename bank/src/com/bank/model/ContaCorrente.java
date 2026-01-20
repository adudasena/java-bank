package com.bank.model;
import com.bank.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void imprimirTipoConta() {
        System.out.println("Essa é uma Conta Corrente.");
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.02;
    }
}

