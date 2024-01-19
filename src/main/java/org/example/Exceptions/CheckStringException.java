package org.example.Exceptions;

public class CheckStringException extends RuntimeException {
    public CheckStringException(String string) {
        super("Строка <" + string + "> содержит недопустимые символы!");
    }
}
