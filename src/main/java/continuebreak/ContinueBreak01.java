package continuebreak;

import java.util.Scanner;

public class ContinueBreak01 {
    public static void main(String[] args) {
        /*
         * User must enter a number , you must write on the screen , whether this number is the same with array member
         * Array={3,5,21,32,34,45,56,57,76,87,95}
         */
        int array[]={3,5,21,32,34,45,56,57,76,87,95};

        kontrol(array);

    }

    public static void kontrol(int array[]) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number to control with array");
        int sayi=scan.nextInt();
        int flag=15;

        for (int i = 0; i < array.length; i++) {

            if (sayi==array[i]) {
                System.out.println("Girdiginiz sayi arrayde var");
                flag++;
                break;
            }
        }  if (flag==15) {
            System.out.println("girdiginiz sayi arrayde yok");
        }

        scan.close();
    }
}
