package com.example.contasystem;

public class ContaInvestimento extends Conta{
    private double taxa;
    private int prazo;

    public ContaInvestimento() {
        super();
    }

    public ContaInvestimento(String numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public boolean sacar(double valor) {
        if(getSaldo() >= valor) {
            double novoSaldo = getSaldo() - (valor * this.taxa);
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }
    public boolean depositar(double valor) {
        if(valor >= 0) {
            setSaldo(getSaldo() + (valor * this.taxa));
            return true;
        } else {
            return false;
        }
    }
    public void aplicarRendimento(double taxa) {
        setSaldo(getSaldo() + (1 * taxa));
    }

}
