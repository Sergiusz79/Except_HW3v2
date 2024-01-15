package org.example.Data;

public class UserData {
    private final String surname;
    private final String name;
    private final String patronymic;
    private final String sex;
    private final int phoneNumber;
    private final String date;

    public UserData(String surname, String name, String patronymic, String date, int phoneNumber, String sex) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User: <" + surname + ">" +
                "<" + name + ">" +
                "<" + patronymic + ">" +
                "<" + date + ">" +
                "<" + phoneNumber +
                "><" + sex +
                ">";
    }

    public String getSurname() {
        return surname;
    }
}
