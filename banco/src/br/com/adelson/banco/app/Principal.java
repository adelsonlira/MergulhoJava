package br.com.adelson.banco.app;

import br.com.adelson.banco.modelo.*;
import br.com.adelson.banco.modelo.atm.CaixaEletronico;
import br.com.adelson.banco.modelo.enums.TipoPessoa;
import br.com.adelson.banco.modelo.excecao.SaldoInsuficienteException;
import br.com.adelson.banco.modelo.pagamento.Boleto;
import br.com.adelson.banco.modelo.pagamento.Holerite;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {
        Pessoa titular = new Pessoa();
        Pessoa titular2 = new Pessoa();

        titular.setNome("Juscelino da Silva");
        titular.setDocumento("12345678900");
        titular.setRendimentoAnual(new BigDecimal("15000"));
        titular.setTipo(TipoPessoa.PESSOA_JURIDICA);

        titular.getDataUltimaAtualizacao();
        System.out.println(titular.getTipo());
        System.out.println(titular.getDataUltimaAtualizacao());

        ContaInvestimento conta = new ContaInvestimento(titular, 10, 123456);

        titular2.setNome("Justina da Silva");
        titular2.setDocumento("12345678911");

        ContaEspecial conta2 = new ContaEspecial(titular2, 10, 987654, new BigDecimal("5000"));

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        try {
            conta.depositar(new BigDecimal("26000"));
            conta.creditarRendimentos(new BigDecimal("1"));
            conta2.depositar(new BigDecimal("11000"));
            conta2.sacar(new BigDecimal("10000"));
            conta.taxasBancarias();
            conta2.taxasBancarias();

            Boleto boleto = new Boleto(titular2, new BigDecimal("6000"));
            Holerite salario = new Holerite(titular, new BigDecimal("250"), 100);

            caixaEletronico.pagar(boleto, conta2);
            caixaEletronico.pagar(salario, conta);

            caixaEletronico.estornar(boleto, conta2);

        boleto.imprimirRecibo();
        System.out.println("--------------------");
        System.out.println("--------------------");
        salario.imprimirRecibo();

        }catch (SaldoInsuficienteException e){
            System.out.println("Erro ao executar operação na conta: "+e.getMessage());
            System.out.println("----------------------------");
        }

        caixaEletronico.imprimirSaldo(conta);
       // System.out.println("Salario pago: "+ salario.estaPago());

        System.out.println("--------------------");
        caixaEletronico.imprimirSaldo(conta2);
       // System.out.println("Boleto pago: "+ boleto.estaPago());

    }
}
