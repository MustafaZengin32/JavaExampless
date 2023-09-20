package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist03 {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("F");
        harfler.add("D");
        System.out.println(harfler);//[A, Z, F, D]
        harfler.remove(1);
        System.out.println(harfler);//[A, F, D]

        System.out.println((String)harfler.remove(2));
        System.out.println(harfler);//[A, F]

        System.out.println(harfler.remove("F"));//true
        System.out.println(harfler.remove("B"));//false
        System.out.println(harfler);//[A]

        harfler.add("A");
        harfler.add("Z");
        harfler.add("F");
        System.out.println(harfler);//[A, A, Z, F]

        System.out.println(harfler.remove("A"));//true
        System.out.println(harfler);//[A, Z, F]

        harfler.add("A");
        System.out.println(harfler);//[A, Z, F, A]
        harfler.removeAll(harfler);
        System.out.println(harfler);//[]

        harfler.add("A");
        harfler.add("Z");
        harfler.add("F");
        harfler.add("D");
        System.out.println(harfler);//[A, Z, F, D]

        List<String> silinecekHarfler = new ArrayList();
        silinecekHarfler.add("A");
        silinecekHarfler.add("C");
        silinecekHarfler.add("F");

        System.out.println(silinecekHarfler);//[A, C, F]

        System.out.println(harfler.removeAll(silinecekHarfler));//true

        System.out.println(harfler);//[Z, D]
        System.out.println(silinecekHarfler);//[A, C, F]






    }
}
