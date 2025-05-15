package lld1.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("File.txt");
            Scanner reader = new Scanner(file);
            return;
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        finally{//Will always run even if your program caches or exception occur.
            //Used to:
            //Clean any resources.
            //Closing a file.
            //Closing a network connection.
            System.out.println("closing resources");
        }
    }
}
