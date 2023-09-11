package br.com.adelson.banco.app;

import br.com.adelson.banco.modelo.Conta;
import br.com.adelson.banco.modelo.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa titular = new Pessoa();
        Pessoa titular2 = new Pessoa();

        titular.setNome("Juscelino da Silva");
        titular.setDocumento("12345678900");

        Conta conta = new Conta(titular, 10, 123456, 50_000);

        titular2.setNome("Justina da Silva");
        titular2.setDocumento("12345678911");

        Conta conta2 = new Conta(titular2, 10, 987654, 30000);

        conta.depositar(100);

        conta2.sacar(5000, 10);

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
