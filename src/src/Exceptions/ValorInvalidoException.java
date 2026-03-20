package Exceptions;

public class ValorInvalidoException extends RuntimeException{
    public ValorInvalidoException(String message) {
        super(message);
    }

    public ValorInvalidoException() {
        super("Valor invalido\n Inserir somente números.");
    }
}
