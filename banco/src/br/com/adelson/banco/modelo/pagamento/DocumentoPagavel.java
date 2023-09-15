package br.com.adelson.banco.modelo.pagamento;

public interface DocumentoPagavel {
    double getValorTotal();
    boolean estaPago();
    void quitarPagamento();

    default void imprimirRecibo(){
        System.out.println("*** RECIBO ***");
        System.out.println("Valor: R$"+getValorTotal());
        System.out.println("Está Pago: "+estaPago());
    }
}
