package immutable;

import java.util.ArrayList;
import java.util.List;

public class Immutable01 {
    public static void main(String[] args) {
        String str = "Ali";
        str.toUpperCase();
        System.out.println(str);//Ali

        System.out.println(str.toUpperCase());//ALI

        System.out.println(str);//Ali

        List<String> isimler = new ArrayList();
        System.out.println(isimler);//[]
        isimler.add("Ali");

        System.out.println(isimler);//[Ali]
        isimler.set(0, "Veli");

        System.out.println(isimler);//[Veli]
        isimler.remove(0);

        System.out.println(isimler);//[]


            String str1 = "Ali";

            for(int i = 0; i < 100; ++i) {
                str1 = str1 + " ";
            }

        System.out.println(str1);

        String strr1 = "Mustafa";
        String str2 = "Mustafa";
        String str3 = new String("Mustafa");
        String str4 = new String("Mustafa");

        System.out.println(strr1 == str3);//false
        System.out.println(strr1.equals(str3));//true
        System.out.println(str4 == str3);//false
        System.out.println(str4.equals(str3));//true
        System.out.println(strr1 == str2);//true

        String str5= "Ali";

        for (int i = 0; i <10 ; i++) {
            str5+=".";

        }

        System.out.println(str5);


    }
}
