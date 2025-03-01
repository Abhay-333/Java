package Module3.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exceptional {

    public static class customException extends Exception{
        public customException(String exceptionMessage){
            super(exceptionMessage);
        }
    }

    public static int division(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println(e.getMessage());   this is use to get the error message
            e.printStackTrace();  // this is use to get the error message
        }
        return 0;
    }

    public static void main(String[] args) throws IOException{      // throws is used to transfer the exception to
        // the parent

        division(5, 4);
        System.out.println("Hello world part 1");
        System.out.println("Hello world part 2"); // this will not execute because 542/0 will give an exception and
        // that will terminate the program or crash the program.We need to handle the exception using try catch block

//        try{
//        System.out.println(542/0); // throws a new Object of Arithmetic Exception
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            System.out.println(a/b);
        }catch (IOException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){   // this Exception should be written at the end because Exception e is confirmed here
            // that it will be catched
            System.out.println(e);
        }finally {
            System.out.println("Ye toh chalega hi chalega, exception aye ya na aye ye toh chalega");
        }

//        throw keyword is used to create custom exception
        try {
            throw new customException("kuch toh gadbad ho gayi");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}