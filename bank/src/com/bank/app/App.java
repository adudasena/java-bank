package com.bank.app;

import com.bank.model.Conta;

public class App {
    public static void main (String[] args) {
        Conta conta1 = new Conta("Dudinha");
        conta1.depositar(25);
        conta1.sacar(15);
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getTitular());
        System.out.println(Conta.getTotalContas());

        Conta conta2 = new Conta("João");
        conta2.depositar(43660);
        conta2.depositar(-1000);
        conta2.sacar(1005);
        System.out.println(conta2.getSaldo());
        System.out.println(Conta.getTotalContas());
    }
}
