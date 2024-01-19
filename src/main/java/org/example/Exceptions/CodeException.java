package org.example.Exceptions;

public class CodeException extends Exception{

    public int codeException(String[] list) {
        if (list.length < 6) {
            return -1;
        } else if (list.length > 6) {
            return -2;
        }
        return 0;
    }

    public void textExcept(int ex) {
        switch (ex) {
            case -1:
                System.out.println("КОД ОШИБКИ -1: Количество введённых данных меньше требуемого!");
                break;
            case -2:
                System.out.println("КОД ОШИБКИ -2: Количество введённых данных больше требуемого!");
                break;
        }
    }
}
