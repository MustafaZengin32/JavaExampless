package scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        // first letter must be big
        // mustafa ==>M 

        Scanner scan =new Scanner(System.in);
        System.out.println("enter your name");

        char firstletter = scan.next().toUpperCase().charAt(0);

        System.out.println("first letter : " + firstletter);

        //  next() until first space
        //  nextLine() take all characters in this line

        scan.close();
    }
}
