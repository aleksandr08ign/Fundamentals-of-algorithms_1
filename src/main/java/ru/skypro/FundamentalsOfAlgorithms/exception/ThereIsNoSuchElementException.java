package ru.skypro.FundamentalsOfAlgorithms.exception;

public class ThereIsNoSuchElementException extends RuntimeException{
    public ThereIsNoSuchElementException() {
    }

    public ThereIsNoSuchElementException(String message) {
        super(message);
    }

    public ThereIsNoSuchElementException(String message, Throwable cause) {
        super(message, cause);
    }

    public ThereIsNoSuchElementException(Throwable cause) {
        super(cause);
    }

    public ThereIsNoSuchElementException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
