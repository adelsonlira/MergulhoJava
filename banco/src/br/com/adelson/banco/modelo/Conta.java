package br.com.adelson.banco.modelo;

import br.com.adelson.banco.modelo.excecao.SaldoInsuficienteException;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private BigDecimal saldo = BigDecimal.ZERO;

    Conta() {
    }

    public Conta(Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular.getNome());
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar (BigDecimal valor){
        if(valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Valor tem que ser maior que zero");
        }
        this.saldo = saldo.add(valor);
    }

    public void sacar (BigDecimal valor){
        if(valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Valor tem que ser maior que zero");
        }
        if(getSaldoDisponivel().subtract(valor).compareTo(BigDecimal.ZERO) < 0){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.saldo = saldo.subtract(valor);
    }

    public BigDecimal getSaldoDisponivel(){
        return getSaldo();
    }

    public void sacar (BigDecimal valor, BigDecimal taxaDeSaque){
        sacar(valor.add(taxaDeSaque));
    }

    public abstract void taxasBancarias();

    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }



}
