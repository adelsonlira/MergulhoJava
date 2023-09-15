package br.com.adelson.banco.modelo.pagamento;

import br.com.adelson.banco.modelo.Pessoa;

public class Boleto implements DocumentoPagavel, DocumentoEstornavel{

    private Pessoa beneficiario;
    private double valor;
    private boolean pago;

    public Boleto(Pessoa beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
    }

    @Override
    public double getValorTotal() {
        return valor;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void EstornarPagamento() {
        pago = false;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }
}
