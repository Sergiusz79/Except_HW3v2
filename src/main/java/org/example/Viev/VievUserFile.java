package org.example.Viev;

import java.io.BufferedReader;
import java.io.FileReader;

public class VievUserFile implements IVievUserFile {
    @Override
    public void vievUserFile(String surname) {
        try(BufferedReader bur = new BufferedReader(new FileReader(surname + ".txt"))){
            String s;
            while((s = bur.readLine())!=null){
                System.out.println(s);
            }
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public VievUserFile() {
    }
}
