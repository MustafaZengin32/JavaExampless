package scanner;

import java.util.Scanner;

public class Scanner04Swap {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter first number");
        int sayi1 = scan.nextInt();

        System.out.println("enter second number");
        int sayi2 = scan.nextInt();

        int temp;

        temp = sayi2;

        sayi2 = sayi1;


        sayi1 = temp;

        System.out.println("sayi1 : " + sayi1);
        System.out.println("sayi2 : " + sayi2);
    }
}