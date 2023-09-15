package arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        String[] arr = new String[]{"Ali", "Veli", "Ayse", "Fatma"};
        String[] arr2 = new String[]{"Ali", "Veli", "Ayse", "Fatma"};
        System.out.println(Arrays.toString(arr));//[Ali, Veli, Ayse, Fatma]
        System.out.println(Arrays.toString(arr));//[Ali, Veli, Ayse, Fatma]

        arr2[0] = "Can";
        arr2[2] = "Gul";

        System.out.println(Arrays.toString(arr2));//[Can, Veli, Gul, Fatma]


        System.out.println(arr2[1]);//Veli

        System.out.println(arr2[arr2.length - 1]);//Fatma //Son Eleman

        int[] arr3 = new int[]{2, 4, 5, 6, 78, 89};

        for(int i = 0; i < arr3.length; ++i) {
            System.out.print(arr3[i] + " ");//2 4 5 6 78 89
        }

        System.out.println("");

        System.out.println(Arrays.toString(arr3));//[2, 4, 5, 6, 78, 89]


    }
}
