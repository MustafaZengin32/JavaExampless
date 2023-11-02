package iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        //Genel olarak elimizdeki List'ten Iterator olustururuz (Sıfırdan olusutrmayız)

        //Iterator'lar yuzden 90 while () dongusu ile kullanılır


        //hasNext() method'u pointer dan sonra eleman varsa "true", yoksa "false" return eder.
        //next() method'u pointer'i bir sonraki elemanin onune koyar ve ustunden atladigi elemani return eder.



        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for-each loop kullanarak her elemanin sonuna "!" ekleyiniz
        //Note: loop'lar kendi baslarina "Collection" lari update edemezler bu yuzden Java "iterator" lari olusturdu.
        //Iterator'lar Collection'lari update etmek icin kullanilir.

        for (String w : myList) {

            w = w + "!";

        }

        System.out.println(myList);          // [Z, K, A, J, M]

        ListIterator<String> itr = myList.listIterator();

        int sayac=0;
        while (itr.hasNext()) {
            String el = itr.next();
            itr.set(el + "!");
            sayac++;
        }
        System.out.println("sayac : "+sayac);
        System.out.println(myList);// [Z!, K!, A!, J!, M!]

        List<String> myList1 = new ArrayList<String>();

        myList1.add("Erk");
        myList1.add("Merk");
        myList1.add("Gerk");

        ListIterator<String> myList2=myList1.listIterator();

        while (myList2.hasNext()){
            String a=myList2.next();
            myList2.set(a+"?");

        }

        System.out.println(myList1);//[Erk?, Merk?, Gerk?]






    }

}
