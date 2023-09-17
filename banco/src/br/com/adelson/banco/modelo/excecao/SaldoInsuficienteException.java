package br.com.adelson.banco.modelo.excecao;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
