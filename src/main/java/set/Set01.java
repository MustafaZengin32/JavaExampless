package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set01 {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 6, 4, 2, 4, 6, 8, 6, 5, 3, 1, 2, 4, 6, 7};

        Set<Integer> benzersizSet = new HashSet();

        int[] a = arr;


        for(int i = 0; i < arr.length;++i) {

            benzersizSet.add(a[i]);
        }

        System.out.println(benzersizSet);//[1, 2, 3, 4, 5, 6, 7, 8]
                                         //set oldugu icin her elemandan sadece bir tane olur, tekrarsiz olur


        Object[] tekrarsizArr = benzersizSet.toArray();//tekrar array e cevirdik

        System.out.println(Arrays.toString(tekrarsizArr));//[1, 2, 3, 4, 5, 6, 7, 8]
    }
}

