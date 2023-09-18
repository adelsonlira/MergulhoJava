package br.com.adelson.banco.modelo.pagamento;

import java.math.BigDecimal;

public interface DocumentoPagavel {
    BigDecimal getValorTotal();
    boolean estaPago();
    void quitarPagamento();

    default void imprimirRecibo(){
        System.out.println("*** RECIBO ***");
        System.out.println("Valor: R$"+getValorTotal());
        System.out.println("Está Pago: "+estaPago());
    }
}
