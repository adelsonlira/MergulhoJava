package br.com.adelson.banco.app;

import br.com.adelson.banco.modelo.Conta;
import br.com.adelson.banco.modelo.ContaEspecial;
import br.com.adelson.banco.modelo.ContaInvestimento;
import br.com.adelson.banco.modelo.Pessoa;

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

        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getDocumento());
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        System.out.println(conta.getSaldo());
        System.out.println("---------------------");
        System.out.println(conta2.getTitular().getNome());
        System.out.println(conta2.getTitular().getDocumento());
        System.out.println(conta2.getAgencia());
        System.out.println(conta2.getNumero());
        System.out.println(conta2.getSaldo());
    }
}
