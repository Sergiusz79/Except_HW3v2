package org.example.Controller;

import org.example.Data.UserData;

import java.util.Scanner;

public class DataController implements IController {
    @Override
    public String inputData() {
        //TODO
        // проверка на первый символ строки
        // charAt(0)
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Введите данные в строку, разделяя их пробелами, в следующем порядке: \n" +
                    "Фамилия_Имя_Отчество_Дата рождения в формате (dd.mm.yyyy)_Номер телефона_Пол(f/m)");
            if (Character.isLetter(scan.nextLine().charAt(0))){
                flag = false;
            }
        }
        return scan.nextLine();
    }
}
