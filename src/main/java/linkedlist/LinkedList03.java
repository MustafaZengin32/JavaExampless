package linkedlist;

import java.util.LinkedList;

public class LinkedList03 {
    public static void main(String[] args) {
        LinkedList<Object> ll1 = new LinkedList<>();
        // Collections'da esitligin sol tarafinda <>icinde data turu yazilmasa
        // veya data turu olarak Object yazilsa collections calisir
        // Ama boyle bir kullanimda surekli casting yapildigi icin
        // zaman ve hafiza acisindan verimli degildir.

        System.out.println(System.currentTimeMillis());//1698344884449
        for (int i = 0; i <10000; i++) {
            ll1.add("A"+i); // concatanion
            ll1.add(20+i); // toplama
            ll1.add('C'+i); // ascii degerleri
        }
        System.out.println(System.currentTimeMillis());//1698344884484

        System.out.println("==============");
        LinkedList ll2 = new LinkedList<>();

        System.out.println(System.currentTimeMillis());//1698344884484
        for (int i = 0; i <10000; i++) {
            ll2.add("B"+i);
            ll2.add(25+i);
            ll2.add('K'+i);
        }
        System.out.println(System.currentTimeMillis());//1698344884495
        System.out.println("==============");




        LinkedList<Integer> ll3 = new LinkedList<>();
        System.out.println(System.currentTimeMillis());//1698344884495
        for (int i = 0; i <10000; i++) {
            ll3.add(10+i);
            ll3.add(20+i);
            ll3.add(30+i);
        }
        System.out.println(System.currentTimeMillis());//1698344884500



    }

}
