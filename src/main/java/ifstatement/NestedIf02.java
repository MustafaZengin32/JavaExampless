package ifstatement;

import java.util.Scanner;

public class NestedIf02 {

    public static void main(String[] args) {
        /*
       if first letter is upper case and  A right, otherwise false
       if first letter is lower case and  z right , otherwise false
                Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin. Ilk harf z ise
		 �Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER PASSWORD");
        char password=scanner.next().charAt(0);


        if (password>='A'&& password<='Z'){
            if (password=='A'){
                System.out.println("right");
            }
            else {
                System.out.println("false");
            }
        }
        else if (password>='a'&& password<='z'){
            if (password=='z'){
                System.out.println("right");
            }
            else {
                System.out.println("false");
            }
        }
        else {
            System.out.println("unacceptable password");
        }
    }
}
