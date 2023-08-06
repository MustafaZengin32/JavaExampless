package scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi yaziniz");
        String isim = scan.next();
        System.out.println("isminiz..:" + isim);


        System.out.println("Lutfen isminizi yaziniz");
        char ilkHarf = scan.next().charAt(0);
        System.out.println("isminizin ilk harfi : " + ilkHarf);
        scan.close();
    }
}
