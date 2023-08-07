package mathemathicalexpressions;

import java.util.Scanner;

public class Math03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter 3 digits number");

        int sayi = scan.nextInt();//254

        int rakamlarToplami = 0;

        int rakam = sayi % 10;//4

        rakamlarToplami += rakam;//4

        sayi /= 10;//25

        rakam = sayi % 10;//5

        rakamlarToplami += rakam;//9

        sayi /= 10;//2

        rakamlarToplami += sayi;//11

        System.out.println("sum digits of number : " + rakamlarToplami);

        scan.close();
    }
}
