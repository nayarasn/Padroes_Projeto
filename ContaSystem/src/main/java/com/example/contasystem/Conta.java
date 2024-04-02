package com.example.contasystem;

public class Conta {
    private String numero;
    private double saldo;

    public Conta() {
        System.out.println("Conta vazia criada!");
    }

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if(valor >= 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }


}
