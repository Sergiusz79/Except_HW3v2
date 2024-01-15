package org.example.Exceptions;

public class IncorrectFirstSymbolString extends Exception{
    public IncorrectFirstSymbolString() {
    }

    public IncorrectFirstSymbolString(String message) {
        super(message);
    }
}
