package org.example.Services;

import org.example.Data.UserData;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MakeUserFiles implements IMakeUserFiles {

    @Override
    public void writeUserDataInFile(UserData user) {
        if (user == null){
            throw new NullPointerException("ОШИБКА! User не был создан!");
        }
        try (BufferedWriter buf = new BufferedWriter(new FileWriter((user.getSurname() + ".txt"), true))){
            buf.append(user.toString()).append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public MakeUserFiles() {
    }
}
