package org.example.Controller;



import org.example.Data.UserData;
import org.example.Services.MakeUserFiles;
import javax.xml.crypto.Data;
import java.text.ParseException;

public class MakeFileController implements IMakeFileController {


    @Override
    public void createFile() {

            MakeUserController makeUC = new MakeUserController();
        UserData dataUser;
        try {
            dataUser = makeUC.createUser();
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage());
        }
        new MakeUserFiles().writeUserDataInFile(dataUser);

    }
}
