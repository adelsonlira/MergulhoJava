package br.com.adelson.banco.app;

import br.com.adelson.banco.modelo.*;

public class Principal {
    public static void main(String[] args) {
        Pessoa titular = new Pessoa();
        Pessoa titular2 = new Pessoa();

        titular.setNome("Juscelino da Silva");
        titular.setDocumento("12345678900");

        ContaInvestimento conta = new ContaInvestimento(titular, 10, 123456);

        titular2.setNome("Justina da Silva");
        titular2.setDocumento("12345678911");

        ContaEspecial conta2 = new ContaEspecial(titular2, 10, 987654, 5_000);

        conta.depositar(100);
        conta.creditarRendimentos(1);
        conta2.depositar(11000);
        conta2.sacar(12000);
        conta.taxasBancarias();
        conta2.taxasBancarias();

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        caixaEletronico.imprimirSaldo(conta);
        System.out.println("--------------------");
        caixaEletronico.imprimirSaldo(conta2);

    }
}
