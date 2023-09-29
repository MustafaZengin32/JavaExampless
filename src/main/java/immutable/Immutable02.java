package immutable;

import java.util.ArrayList;
import java.util.List;

public class Immutable02 {
    public static void main(String[] args) {
        String isim="Ali";
        isim.concat("can");
        System.out.println(isim); // Ali

        System.out.println(isim.concat("can")); // Alican
        System.out.println(isim); // Ali

        // String'lerde method ile yaptigimiz degisiklikler kalici olmaz
        // cunku Java String Class'ini immutable yapmistir


        List<String> isimList = new ArrayList<>();
        System.out.println(isimList); // []
        isimList.add("Ali");
        isimList.add("Can");
        System.out.println(isimList); // [Ali, Can]
        isimList.remove(1);
        System.out.println(isimList); // [Ali]
        // list'lerde method'la yaptigimiz degisiklikler kalici olarak list'e islenir.
        // cunku list mutable'dir.

        String isim1="";

        for (int i = 0; i < 10; i++) {
            isim1=isim1+i;
            System.out.println("forloop "+isim1);
        }

        System.out.println("================");
        System.out.println(isim1);

    }
}
