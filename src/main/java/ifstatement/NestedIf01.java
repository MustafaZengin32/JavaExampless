package ifstatement;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

        //Exp find the number that can be diveded 5 and even number

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 4 digits pozitif number");
        int sayi = scan.nextInt();
        if (sayi >= 1000 && sayi <= 9999) {
            if (sayi%5==0){
                if (sayi%10==0){
                    System.out.println("it can be devided 5 and even number");
                }
                else {
                    System.out.println("it can be devided 5 and odd number");
                }
            }

            else{
                System.out.println("again");
            }

        }
        else{
            System.out.println("please enter 4 digits pozitive number");
        }

        scan.close();

    }
}
