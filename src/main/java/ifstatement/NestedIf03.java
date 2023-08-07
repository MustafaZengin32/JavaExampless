package ifstatement;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz\nErkek icin E, Kadin icin K giriniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi tamsayi olarak giriniz");

        int yas = scan.nextInt();

        if (cinsiyet == 'K') {

            if (yas >= 60) {
                System.out.println("emekli olabilirsin");
            } else {
                System.out.println("Emekli olamazsin \nDaha " + (60 - yas) + " yil calismalisin");
            }

        } else if (cinsiyet == 'E') {

            if (yas >= 65) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli olamazsin \nDaha " + (65 - yas) + " yil calismalisin");
            }

        } else {

            System.out.println("Erkek icin E, Kadin icin K giriniz");
        }
        scan.close();

    }
}
