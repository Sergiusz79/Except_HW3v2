package org.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Введите данные в строку, разделяя их пробелами, в следующем порядке:\s
                "Фамилия_Имя_Отчество_Дата рождения в формате (dd.mm.yyyy)_Номер телефона_Пол(f/m)""");
        String line = scan.nextLine();
        while (line.isEmpty()) {
            System.out.println("""
                    ОШИБКА!
                    Вы ввели пустую строку!
                    Пожалуйста заново введите данные в строку, разделяя их пробелами, в следующем порядке:\s
                    "Фамилия_Имя_Отчество_Дата рождения в формате (dd.mm.yyyy)_Номер телефона_Пол(f/m)""");
            line = scan.nextLine();
        }
        while (!Character.isLetter(line.charAt(0))) {
            System.out.println("""
                    ОШИБКА!
                    Ввод данных должен начинаться с буквы!
                    Пожалуйста заново введите данные в строку, разделяя их пробелами, в следующем порядке:\s
                    Фамилия_Имя_Отчество_Дата рождения в формате (dd.mm.yyyy)_Номер телефона_Пол(f/m)""");
            line = scan.nextLine();
        }
        System.out.println(line);
    }
}
