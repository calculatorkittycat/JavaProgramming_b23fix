package day_49_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.UnknownHostException;
import java.nio.file.FileAlreadyExistsException;

public class ExceptionHandling2 {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Test complete");




    }
}
