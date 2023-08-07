package ifstatement;

import java.util.Scanner;

public class ifStatement06LeapYear {
    public static void main(String[] args) {



    Scanner scan =new Scanner (System.in);
	System.out.println("please enter year");
    int yil = scan.nextInt();

    //Leap Year must be devided both 4 or 100 or 400
    //496 ,1600,500

        if (yil%4==0 || yil%100==0 || yil%400==0){
            System.out.println("leap year");
        }
        else {
            System.out.println("not");
        }

}
}