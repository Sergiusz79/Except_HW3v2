package org.example.Services;

public class CheckPhoneNumber {

    public boolean isNumeric(String str) {
        try {
            if (str.length() > 10){
                throw new RuntimeException("Количество знаков номера телефона превышает допустимое!");
            }else{
                Integer.parseInt(str);
                return false;
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("Неверный формат номера телефона: <" + str + ">");

        }
    }
}
