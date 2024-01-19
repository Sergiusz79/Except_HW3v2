package org.example.Controller;

import org.example.Viev.VievUserFile;
import java.util.Scanner;

public class RunController implements IRun {

    @Override
    public void run() throws RuntimeException {
        System.out.println("Начало работы программы: ");
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите действие: \n1-Ввод данных \n2-Чтение данных \n0-Выход");
            switch (scan.nextInt()) {
                case 1:
                    new MakeFileController().createFile();
                    break;
                case 2:
                    System.out.println("Введите фамилию: ");
                    new VievUserFile().vievUserFile(scan.next());
                    break;
                case 0:
                    flag = false;
                    System.out.println("Конец работы программы!");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + scan.nextInt());
            }
        }
        scan.close();
    }
}
