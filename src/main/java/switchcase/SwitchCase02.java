package switchcase;

import java.util.Scanner;

public class SwitchCase02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ay ismini giriniz");
        String Ayİsmi = input.next().toLowerCase();//Hepsini kucuk yaptik otomatik

        switch (Ayİsmi) { //break olmadigi icin buldugu esdeger case sonrasi tum aylari yazdirir

            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayis":
                System.out.println("Mayis");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Agustos");
            case "eylul":
                System.out.println("Eylul");
            case "ekim":
                System.out.println("Ekim");
            case "kasim":
                System.out.println("Kasim");
            case "aralik":
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Lutfen gecerli bir ay ismi giriniz");
        }
    }
}
