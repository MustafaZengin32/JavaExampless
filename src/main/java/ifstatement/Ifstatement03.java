package ifstatement;

import java.util.Scanner;

public class Ifstatement03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz...");
        String gun = input.next();

        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        }

        else if (gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        }
        else {
            System.out.println("Gecerli bir gun ismi giriniz...");
                 }
    }
}
