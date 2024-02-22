package ru.skypro.FundamentalsOfAlgorithms.exception;

public class NotEmptyException extends RuntimeException{
    public NotEmptyException() {
    }

    public NotEmptyException(String message) {
        super(message);
    }

    public NotEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEmptyException(Throwable cause) {
        super(cause);
    }

    public NotEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
