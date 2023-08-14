package stringManipulations;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {

         /*
                                                String Class Methods
            1) equals():
            2) equalsIgnoreCase():
            3) toLowerCase():
            4) toUpperCase():
            5) charAt():
            6) length():
            7) contain():
            8) split():
         */

        /*
           Write the code that checks whether a password is valid or not according to the rules below.

             i) Must contain at least 8 characters
             ii) It must not contain a space character
             iii) Its first letter must be "M" or "m"
             iv) The last character is "?" must be
         */

        String pass="Mhdjfure?";

        boolean charactersayi= pass.length()>7; //

        boolean space= !(pass.contains(" ")); //

        boolean ilkharf= (pass.startsWith("M")) || (pass.startsWith("m")); //

        boolean soncharactrer= pass.charAt(pass.length()-1)=='?'; //

        System.out.println(charactersayi&&space&&ilkharf&&soncharactrer);

        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the name");

        String name=scanner.nextLine();

        char firsletter=name.charAt(0);

        String firstletter1=name.substring(0,1);

        char lastletter=name.charAt(name.length() - 1);

        System.out.println(firsletter);
        System.out.println(firstletter1);
        System.out.println(lastletter);

        //Example : Only animal name must be written
        // "Ben kedi esim tavuk oglum inek sever."
        String str="I love birds but my son love cats";

        String firstanimal=str.substring(7,12);
        String lastanimal=str.substring(29);

        System.out.println(firstanimal);
        System.out.println(lastanimal);













    }
}
