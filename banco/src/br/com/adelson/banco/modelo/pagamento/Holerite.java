package br.com.adelson.banco.modelo.pagamento;

import br.com.adelson.banco.modelo.Pessoa;

import java.math.BigDecimal;

public class Holerite implements DocumentoPagavel {

    private Pessoa funcionario;
    private BigDecimal salarioHora;
    private double horasTrabalhadas;
    private boolean pago;

    public Holerite(Pessoa funcionario, BigDecimal salarioHora, double horasTrabalhadas) {
        this.funcionario = funcionario;
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public BigDecimal getValorTotal() {
        return salarioHora.multiply(new BigDecimal(horasTrabalhadas));
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }
}
