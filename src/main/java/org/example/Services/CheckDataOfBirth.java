package org.example.Services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckDataOfBirth {
    public boolean isData(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            sdf.setLenient(false);
            Date parsedDate = sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
