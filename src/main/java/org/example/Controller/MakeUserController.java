package org.example.Controller;

import org.example.Data.UserData;
import org.example.Services.InputStringData;
import org.example.Services.MakeUserData;

import java.text.ParseException;

public class MakeUserController implements IMakeUserController {
    @Override
    public UserData createUser() throws ParseException {

        return new MakeUserData().makeUserDatas(new InputStringData().inputData());
    }

    public MakeUserController() {
    }
}
