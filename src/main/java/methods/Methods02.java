package methods;

import java.util.Scanner;

public class Methods02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi girin \nilk sayidan sonra enter'a basin");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("girilen sayilarin kareler toplamini istiyorsani 2 \nkupler toplamini istiyorsaniz 3'e basin");
        int secim = scan.nextInt();
        switch (secim) {
            case 2:
                kareTopla(sayi1, sayi2);
                break;
            case 3:
                kupTopla(sayi1, sayi2);
                break;
            default:
                System.out.println("Lutfen istenen tercihlerden birini yapin");
        }

        scan.close();
    }

    public static void kupTopla(double sayi1, double sayi2) {
        double kuplerToplami = sayi1 * sayi1 * sayi1 + sayi2 * sayi2 * sayi2;
        System.out.println("Girilen sayilarin kuplerinin toplami = " + kuplerToplami);
    }

    public static void kareTopla(double sayi3, double sayi4) {
        double karelerToplami = sayi3 * sayi3 + sayi4 * sayi4;
        System.out.println("Girilen sayilarin kareleri toplami = " + karelerToplami);
    }

}
