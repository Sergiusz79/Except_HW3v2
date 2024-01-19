package org.example.Exceptions;

public class CheckPhoneNumberException extends RuntimeException{

    public CheckPhoneNumberException(String phoneNumber) {
        super("Неверный формат номера телефона: <"+ phoneNumber +">");
    }
}
