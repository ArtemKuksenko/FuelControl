package FuelControl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

//https://metanit.com/java/tutorial/6.8.php
//https://metanit.com/java/tutorial/6.11.php

public class FileWork {
    public File dir = new File("~/IdeaProjects/example/gs-rest-service/initial/src/main/java/FuelControl/files");
    public FileWork() {}

    public void writeFile(String name,String text) throws IOException {
        try(FileWriter writer = new FileWriter(name, false))
        {
            writer.write(text);
            writer.flush();
        }

    }

    public boolean isFile(String name) {
        File dir = new File(name);
        return dir.isFile();
    }

    public String readFile(String name){
        String result = "";
        try(FileInputStream fin=new FileInputStream(name)) {
            int i=-1;
            while((i=fin.read())!=-1){
                result +=(char)i;
//                System.out.print((char)i);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
