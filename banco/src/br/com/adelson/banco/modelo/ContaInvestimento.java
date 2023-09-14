package br.com.adelson.banco.modelo;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    @Override
    public void taxasBancarias() {
        if(getSaldo() < 20000){
            sacar(20);
        }
    }

    public void creditarRendimentos(double percentualJuros){
        double valorRendimentos = getSaldo() * percentualJuros/100;
        depositar(valorRendimentos);
    }



}
