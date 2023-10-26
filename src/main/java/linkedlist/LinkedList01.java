package linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();
        System.out.println(ll);

        ll.add(5);
        ll.add(7);
        System.out.println(ll);//[5,7]

        ll.add(0, 10);
        System.out.println(ll);//[10, 5, 7]

        ll.addFirst(3);
        System.out.println(ll);//[3, 10, 5, 7]

        LinkedList<Integer> ll2 = new LinkedList();
        ll2.addAll(ll);
        System.out.println(ll2);//[3, 10, 5, 7]

        ll2.addAll(2, ll);
        System.out.println(ll2);//[3, 10, 3, 10, 5, 7, 5, 7]

        List<Integer> ll1 = new LinkedList();
        ll1.add(5);
        ll1.add(7);
        System.out.println(ll1);//5,7
        ll1.add(9);
        System.out.println(ll1);//[5, 7, 9]

        Queue<Integer> ll21 = new LinkedList();
        ll21.add(5);
        ll21.add(7);
        ll21.clear();
        System.out.println(ll21);//[]


        LinkedList<Integer> ll3 = new LinkedList();
        System.out.println(ll3);
        ll3.add(5);
        ll3.add(7);
        System.out.println(ll3);//[5, 7]
        System.out.println(ll3.peek());//5
        System.out.println(ll3.peekFirst());//5

        LinkedList<Integer> ll4 = new LinkedList();
        System.out.println(ll4.peekFirst());//null
        System.out.println(ll4.peek());//null

        System.out.println(ll3.element());//5
        System.out.println(ll3);//5,7
        System.out.println(ll3);//5,7
        System.out.println(ll3.poll());//7
        System.out.println(ll3);//7
        System.out.println(ll3.poll());//7

    }
}
