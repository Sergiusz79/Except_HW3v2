package org.example.Services;

import java.util.Scanner;

public class InputStringData implements IInputStringData {

    @Override
    public String inputData() {

    Scanner scan = new Scanner(System.in);
    System.out.println("""
            Введите данные в строку, разделяя их пробелами, в следующем порядке:\s
            "Фамилия_Имя_Отчество_Дата рождения в формате (dd.mm.yyyy)_Номер телефона_Пол(f/m)""");
    String line = scan.nextLine();
        while (line.isEmpty() || !Character.isLetter(line.charAt(0))) {
        System.out.println("""
                ОШИБКА!
                Строка не может быть пустой! Строка должна начинаться с буквы!
                Пожалуйста заново введите данные в строку, разделяя их пробелами, в следующем порядке:\s
                "Фамилия_Имя_Отчество_Дата рождения в формате (dd.mm.yyyy)_Номер телефона_Пол(f/m)""");
        line = scan.nextLine();
    }
    return line;

    }
}