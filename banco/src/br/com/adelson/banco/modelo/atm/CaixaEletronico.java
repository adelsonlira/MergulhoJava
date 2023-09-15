package br.com.adelson.banco.modelo.atm;

import br.com.adelson.banco.modelo.Conta;
import br.com.adelson.banco.modelo.pagamento.DocumentoEstornavel;
import br.com.adelson.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta){
        System.out.println("Conta: "+conta.getAgencia()+" / "+conta.getNumero());
        System.out.println("Titular: "+conta.getTitular().getNome());
        System.out.println("Saldo: "+conta.getSaldo());
        System.out.println("Saldo Disponível: "+conta.getSaldoDisponivel());
    }

    public void pagar(DocumentoPagavel documento, Conta conta){
        if(documento.estaPago()){
            throw new IllegalArgumentException("Documento já está pago");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }

    public void estornar(DocumentoEstornavel documento, Conta conta){
        if(!documento.estaPago()){
            throw new IllegalArgumentException("Boleto não está pago");
        }
        conta.depositar(documento.getValorTotal());
        documento.EstornarPagamento();
    }
}
