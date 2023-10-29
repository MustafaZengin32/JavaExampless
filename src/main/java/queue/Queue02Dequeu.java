package queue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue02Dequeu {

    public static void main(String[] args) {
        Deque<String> ciftBasli = new LinkedList();

        ciftBasli.add("Yildiz");
        ciftBasli.add("Ali");

        System.out.println(ciftBasli);//[Yildiz, Ali]

        ciftBasli.addLast("Emine");

        System.out.println(ciftBasli);//[Yildiz, Ali, Emine]

        System.out.println((String)ciftBasli.pop());//Yildiz
                                                    //remove and returns first

        System.out.println(ciftBasli);//[Ali, Emine]

        ciftBasli.push("Seyfullah");//add first

        System.out.println(ciftBasli);//[Seyfullah, Ali, Emine]

        ciftBasli.add(null);

        System.out.println(ciftBasli);//[Seyfullah, Ali, Emine, null]

        ciftBasli.addFirst(null);

        System.out.println(ciftBasli);//[null, Seyfullah, Ali, Emine, null]
    }
}
