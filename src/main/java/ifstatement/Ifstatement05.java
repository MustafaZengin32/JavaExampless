package ifstatement;

import java.util.Scanner;

public class Ifstatement05 {
    public static void main(String[] args) {
        // if user enter small case change big case
        // if user enter big case must be written
        //ascii a 97 A 65 b 98 B66 a-A 32 b-B 32 differces only 32
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='a' && krk<='z'){

            System.out.println((char)(krk-32));

        }else{

            System.out.println(krk);
        }

    }
}
