package dowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        int a = 0;

        do {
            System.out.println(a + " ");
            ++a;
        } while(a < 5);

        char krk;

        for(krk = 'm'; krk > 'c'; --krk) {
            System.out.print(krk + " ");
        }

        System.out.println(" ");

        char krk1='h';

        do {

            System.out.println(krk1);
            --krk1;

        }while (krk1>'c');

        /*
         Request from user to enter pozitif number
         When user want to quit , then must be entered 0
         After all must be written all neg , all positive number and sum of positif number
         (User dont have to enter negatif number
         */

        int negativenumber=0;
        int positivenumber=0;
        int totalpositivenumber=0;
        int number;

        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("plesa enter positivenumber");
            number=scanner.nextInt();

            if (number>0) {
                totalpositivenumber+=number;
                positivenumber++;
            }

            if (number<0) {
                System.out.println("please enter dont negatif number");
                negativenumber++;
            }

        }while(number!=0);

        System.out.println("negative number amount "+negativenumber);
        System.out.println("positive number amount "+positivenumber);
        System.out.println("total of positif number"+totalpositivenumber);

    }
}
