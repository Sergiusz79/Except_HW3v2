package org.example.Services;

import org.example.Data.UserData;

public class MakeUserData implements IMakeUserData{

    //TODO
    // 1. Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
    // 2. Приложение должно проверить введенные данные по количеству (Если количество не совпадает с требуемым,
    //      вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше или больше данных,
    //      чем требуется.
    // 3. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы (Исключение
    //      должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно).
    @Override
    public UserData makeUserData(String str) {
        String[] listDataUser = str.split(" ");
        String surname = listDataUser[0];
        String name = listDataUser[1];
        String patronymic = listDataUser[2];
        String dataOfBirth = listDataUser[3];
        int phoneNumber = Integer.parseInt(listDataUser[4]);
        String sex = listDataUser[5];
        return new UserData(surname, name, patronymic, dataOfBirth, phoneNumber, sex);
    }
}
