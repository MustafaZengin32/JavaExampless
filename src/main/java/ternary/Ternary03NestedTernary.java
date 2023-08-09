package ternary;

import java.util.Scanner;

public class Ternary03NestedTernary {
    public static void main(String[] args) {

        // if number is  less than 10 , you write number or negatif number ,
        // if number is less than 100 , you write on screen two digits
        // otherwise you write on screen three digits or more

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi=scan.nextInt();

        String deger=sayi<10?"number or negatif number" : sayi<100?"two digits":"three digits or more";



    }
}
