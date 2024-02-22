package ru.skypro.FundamentalsOfAlgorithms.exception;

public class OutsideTheArrayException extends RuntimeException{
    public OutsideTheArrayException() {
    }

    public OutsideTheArrayException(String message) {
        super(message);
    }

    public OutsideTheArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutsideTheArrayException(Throwable cause) {
        super(cause);
    }

    public OutsideTheArrayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
