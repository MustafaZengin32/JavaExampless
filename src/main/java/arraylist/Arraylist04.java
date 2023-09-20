package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist04 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 3, 6, 2, 5, 5, 5, 5, 4, 6, 7, 3, 7, 4, 8, 5, 1, 0, 3, 50};
        List<Integer> tekrarsiz = new ArrayList();

        for(int i = 0; i < arr.length; ++i) {
            if (!tekrarsiz.contains(arr[i])) {
                tekrarsiz.add(arr[i]);
            }
        }

        System.out.println("tekrarsiz list : " + tekrarsiz);
        int[] tekrarsizArray = new int[tekrarsiz.size()];

        for(int i = 0; i < tekrarsizArray.length; ++i) {
            tekrarsizArray[i] = (Integer)tekrarsiz.get(i);
        }

        System.out.println("tekrarsiz array : " + Arrays.toString(tekrarsizArray));

        //****************************************************************************

        List<String> isimler = new ArrayList();
        isimler.add("Kerim");
        isimler.add("Emrah");
        isimler.add("Ferhat");
        System.out.println(isimler);//[Kerim, Emrah, Ferhat]

        Collections.sort(isimler);
        System.out.println(isimler);//[Emrah, Ferhat, Kerim]







    }
}
