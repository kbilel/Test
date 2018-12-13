package Exceptions;
public class NegativeAmountException extends RuntimeException {

    public NegativeAmountException(String message) {
        super(message);
    }

    public NegativeAmountException(String message, Throwable throwable) {
        super(message, throwable);
    }

}