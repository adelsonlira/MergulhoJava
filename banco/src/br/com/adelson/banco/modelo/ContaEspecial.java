package br.com.adelson.banco.modelo;

import java.math.BigDecimal;

public class ContaEspecial extends Conta{

    private BigDecimal valorLimite;

    public ContaEspecial(Pessoa titular, int agencia, int numero, BigDecimal valorLimite) {
        super(titular, agencia, numero);
        this.valorLimite = valorLimite;
    }

    @Override
    public BigDecimal getSaldoDisponivel() {
        return getSaldo().add(getValorLimite());
    }

    @Override
    public void taxasBancarias() {
        sacar(new BigDecimal("10"));
    }

    public BigDecimal getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(BigDecimal valorLimite) {
        this.valorLimite = valorLimite;
    }
}
