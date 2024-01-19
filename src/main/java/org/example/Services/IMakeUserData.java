package org.example.Services;

import org.example.Data.UserData;

import java.text.ParseException;

public interface IMakeUserData {
    UserData makeUserDatas(String str) throws ParseException;
}
