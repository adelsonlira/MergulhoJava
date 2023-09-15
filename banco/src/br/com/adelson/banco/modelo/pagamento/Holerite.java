package br.com.adelson.banco.modelo.pagamento;

import br.com.adelson.banco.modelo.Pessoa;

public class Holerite implements DocumentoPagavel {

    private Pessoa funcionario;
    private double salarioHora;
    private double horasTrabalhadas;
    private boolean pago;

    public Holerite(Pessoa funcionario, double salarioHora, double horasTrabalhadas) {
        this.funcionario = funcionario;
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getValorTotal() {
        return salarioHora * horasTrabalhadas;
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
