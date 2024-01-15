package org.example.Services;


import org.example.Controller.DataController;
import org.example.Viev.VievUserFile;

import java.util.Scanner;

public class Programm implements IStart {

    @Override
    public void startProgramm() {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите действие: \n1-Ввод данных \n2-Чтение данных \n0-Выход");
            switch (scan.nextInt()) {
                case 1:
                    DataController dataController = new DataController();
                    MakeUserData userData = new MakeUserData();
                    MakeUserFiles userFiles = new MakeUserFiles();
                    userFiles.writeUserDataInFile(userData.makeUserData(dataController.toString()));
                    break;
                case 2:
                    VievUserFile viev = new VievUserFile();
                    System.out.println("Введите фамилию: ");
                    viev.vievUserFile(scan.nextLine());
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
        scan.close();
    }
}
