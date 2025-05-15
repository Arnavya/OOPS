package lld1.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class Doer {
    public void fetchStudentInfo(int roll_no) {   //-1
        //Code that fetches the student data.

        //There are 2 types of exceptions
        /*
        1.Checked exceptions -> Compile-time exception.
           FileNotFoundException, IOException.
        2.UnChecked exceptions
          NullPointerException, ArrayIndexOutOfBoundException.
         */

    }

    //Checked exception example
    public void readFile() throws FileNotFoundException {
        File file = new File("Hello.txt");
        Scanner reader = new Scanner(file);
    }

    //Unchecked Exception
    public void divide(int a, int b) {
        if (b == 0) {
            System.out.println("B cannot be zero");
            return;
        }
        int res = a / b;//Risk of division by zero (unchecked)
    }

    //Handling checked exceptions using try-catch block
    //Purpose?
    //-> Wrap your risky code in a try block
    //-> Use catch block/s to specify how to handle various exceptions that might occur
    //   within your try block

//    try{
//        //Code that may through an exception.
//    } catch(Exception ex){ //ex is of Exception type
//        //Handle the exception.
//    }

    public void readData(){
        try{
            File file = new File("File.txt");
            Scanner reader = new Scanner(file);

            //Some code that throws SQLException
            throw new SQLException();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found please check the file path");
        }
        catch (SQLException ex){
            System.out.println("Problem connecting to SQL Server");
        }
    }
}
/*
In checked exceptions we have to handle the exceptions.
We can handle exceptions in 2 ways.
1. By throwing the exception.
2. By handling it myself/
 */
//Difference b/w throw and throws.

//We can pass Runtime exceptions(nullPointer,ArrayIndexOutOfBound) but it is a bad practice.