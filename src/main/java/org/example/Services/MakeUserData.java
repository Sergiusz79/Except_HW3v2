package org.example.Services;

import org.example.Data.UserData;
import org.example.Exceptions.CheckPhoneNumberException;
import org.example.Exceptions.CheckStringException;
import org.example.Exceptions.CodeException;

import java.text.ParseException;

public class MakeUserData implements IMakeUserData {

    // 1. Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
    // 2. Приложение должно проверить введенные данные по количеству (Если количество не совпадает с требуемым,
    //      вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше или больше данных,
    //      чем требуется).
    // 3. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы (Исключение
    //      должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно).
    @Override
    public UserData makeUserDatas(String str) throws ParseException {
        String[] listDataUser = str.split(" ");
        new CodeException().textExcept(new CodeException().codeException(listDataUser));

        String surname = listDataUser[0];
        for (int i = 0; i < surname.length(); i++) {
            if (!Character.isLetter(surname.charAt(i))) {
                throw new CheckStringException(surname);
            }
        }
        String name = listDataUser[1];
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                throw new CheckStringException(name);
            }
        }
        String patronymic = listDataUser[2];
        for (int i = 0; i < patronymic.length(); i++) {
            if (!Character.isLetter(patronymic.charAt(i))) {
                throw new CheckStringException(patronymic);
            }
        }

        String dataOfBirth = listDataUser[3];
        if (!new CheckDataOfBirth().isData(dataOfBirth)) {
            throw new ParseException(dataOfBirth, 1);
        }

        int phoneNumber;
        if (new CheckPhoneNumber().isNumeric(listDataUser[4])) {
            throw new CheckPhoneNumberException(listDataUser[4]);
        } else {
            phoneNumber = Integer.parseInt(listDataUser[4]);
        }

        String sex = listDataUser[5];
        if (!(sex.equalsIgnoreCase("f") | sex.equalsIgnoreCase("m"))) {
            throw new CheckStringException(sex);
        }

        return new UserData(surname, name, patronymic, dataOfBirth, phoneNumber, sex);

    }
}
