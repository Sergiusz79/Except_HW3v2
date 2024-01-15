package org.example.Services;

import org.example.Data.UserData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MakeUserFiles implements IMakeUserFiles {

    @Override
    public void writeUserDataInFile(UserData user) {
        String file = user.getSurname() + ".txt";
        try (BufferedWriter buf = new BufferedWriter(new FileWriter(file))){
            buf.write(user.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public MakeUserFiles() {
    }
}
