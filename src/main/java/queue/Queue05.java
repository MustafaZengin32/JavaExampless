package queue;

import java.util.*;

public class Queue05 {
    public static void main(String[] args) {
        Deque<String> urunler = new LinkedList<>();
        urunler.add("Nutella");
        urunler.add("Cikolatali Gofret");
        urunler.add("Cokoprens");

        // Tum urunlerin basina "Y " ekleyelim

        String eleman="";
        Deque geciciDeque= new LinkedList();

        while(eleman!=null){

            eleman= urunler.poll();
            if (eleman!=null){
                eleman= "Y " + eleman;
                geciciDeque.add(eleman);
            }

        }

        urunler=geciciDeque;

        System.out.println(urunler);

        Queue<Integer> yenii= new PriorityQueue<>();

        yenii.offer(3);
        yenii.offer(4);
        yenii.offer(5);
        yenii.offer(6);

        Iterator iterator=yenii.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
