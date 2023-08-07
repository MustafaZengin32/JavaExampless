package typecasting;

import java.util.Scanner;

public class TypeCasting07CharCasting {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 97 + 98 = 195

        // take a character from user
        // write as an output 3 charachter after first character
        // exp. input : a , output : bcd

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a character");

        char girilenKrk= scan.next().charAt(0);

        System.out.println(""+(girilenKrk+1) +(girilenKrk+2) +(girilenKrk+3));//alima a  ascii 97 and b 98 c 99 d 100 //9899100

        System.out.println(""+ (char) (girilenKrk+1) + (char) (girilenKrk+2) + (char) (girilenKrk+3));

    }
}
