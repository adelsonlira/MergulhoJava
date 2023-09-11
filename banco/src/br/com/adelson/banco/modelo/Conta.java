package br.com.adelson.banco.modelo;

import java.util.Objects;

public class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    Conta() {
    }

    public Conta(Pessoa titular, int agencia, int numero, double saldo) {
        Objects.requireNonNull(titular.getNome());
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar (double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Valor tem que ser maior que zero");
        }
        this.saldo = saldo + valor;
    }

    public void sacar (double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Valor tem que ser maior que zero");
        }
        if(saldo - valor < 0){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo = saldo - valor;
    }

    public void sacar (double valor, double taxaDeSaque){
        sacar(valor + taxaDeSaque);
    }

    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
