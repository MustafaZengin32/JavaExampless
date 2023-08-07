package ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {

        //If it rains I will cancel the picnic

        //Example 1: if number is pozitif write to the screen

        int s = 12;

        if (s > 0) {
            System.out.println("Positive");

        }

        //Example 2: if charter is capital must be written "capital"

        char harf = 'A';

        if ('A' <= harf && harf <= 'Z') {
            System.out.println("capital");
        }

         /*
            && islemi sadece boolean ile kullanilir.
                true && true  = true
                true && false = false
                false && true = false
                false &&false = false
                && is perfectionist
             */
        // Example 3 : if number has 3 digits must be written "three digits"

        int n = -1234;

        n = Math.abs(n);

        if (n > 99 && n < 1000) {
            System.out.println("three digits");
        }
        //Example 4: if number is even number must be written "even number"

        int p = -34;

        if (p % 2 == 0) {
            System.out.println("Çift sayi");
        }
        //Example 5:  if number smaller than 300 or greater than 1200 must be written "perfect number"

        int r = 250;
        if (r < 300 || r > 1200) {
            System.out.println("perfect number");
        }

        /*
                || is used with only boolean

                true  || true  = true
                true  || false = true
                false ||  true = true
                false || false = false
                Not "||" looks like polliyanna

         */

    }
}