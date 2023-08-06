package scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String [] args){
        //Scanner is used to receive data from the user.

        //Scanner allow us to interact with user

        //Scanner is a Java Class

        //to use this class it must be imported

        //Scanner Class is in Java util library

        Scanner input = new Scanner(System.in);

        System.out.println("enter user age...");

        byte age = input.nextByte();

        System.out.println("your age is "+ age    );
    }

}
