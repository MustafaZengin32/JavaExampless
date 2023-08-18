package dowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
        //Print all integers from 9 to 190 that are multiples of 7.

        int number=9;

        do {

            if (number%7 == 0) {
                System.out.println(number);
            }
            number++;

        }while (number<190);

        /*
        Ask the user for the number to sum and
        continue until the total reaches 500
        make the prompt. When the total reaches or exceeds 500, the total and how many numbers
        print entered
         */

        int number1;
        int total =0;
        int countnumber=0;
        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("Please enter number to sum up");
            number1=scanner.nextInt();
            total+=number1;
            countnumber++;

        }while (total<=500);

        System.out.println("total = " + total);
        System.out.println("countnumber = " + countnumber);




    }
}
