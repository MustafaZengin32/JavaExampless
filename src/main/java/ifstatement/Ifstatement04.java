package ifstatement;

import java.util.Scanner;

public class Ifstatement04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karekter giriniz");
        char karakter = scan.next().charAt(0);
        if ((karakter < 'A' || karakter > 'Z') && (karakter < 'a' || karakter > 'z')) {
            System.out.println("girdiginiz :" + karakter + " bir harf degildir");
        } else {
            System.out.println("girdiginiz :" + karakter + " bir harftir");
        }

        scan.close();
    }
}
