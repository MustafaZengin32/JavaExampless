package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList();
        System.out.println("Bos liste : " + isimler);//Bos liste : []
        isimler.add("Ali");
        System.out.println("Bir eleman : " + isimler);//Bir eleman : [Ali]
        isimler.add("Veli");
        System.out.println("Iki eleman : " + isimler);//Iki eleman : [Ali, Veli]
        isimler.add("Can");
        System.out.println("Uc eleman : " + isimler);//Uc eleman : [Ali, Veli, Can]

        isimler.add(1, "Ayse");
        System.out.println("1.indexe ayse ekledik : " + isimler);//1.indexe ayse ekledik : [Ali, Ayse, Veli, Can]
        //Ayse 1.index e eklendi ancak veli silinmedi saga kaydi

        List<String> liste2 = new ArrayList();
        liste2.add("Gunter");
        liste2.add("Emrah");
        System.out.println("liste 2 : " + liste2);//liste 2 : [Gunter, Emrah]

        isimler.addAll(4, liste2);//toplu eklemelerde addall methodu kullanilir
        //zaten isimler [Ali, Ayse, Veli, Can] idi 4.index zaten en son elemandan sonra idi ekledik ve hepsini birlestirdi
        System.out.println("sona liste 2 yi ekledik : " + isimler);//[Ali, Ayse, Veli, Can, Gunter, Emrah]

        isimler.addAll(liste2);
        System.out.println("index olmadan liste 2 yi tekrar ekledik : " + isimler);//[Ali, Ayse, Veli, Can, Gunter, Emrah, Gunter, Emrah]
        //burada index belirtilmedigi icin sondan ekler



    }
}
