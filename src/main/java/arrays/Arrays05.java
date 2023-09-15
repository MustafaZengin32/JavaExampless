package arrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 5, 6, 7, 8, 10};
        int[] B = new int[]{2, 4, 9};
        int[] birlesmis = Arrays.copyOf(A, A.length + B.length);
        System.out.println(Arrays.toString(birlesmis));//[1, 5, 6, 7, 8, 10, 0, 0, 0]

        int sayac=0;

        for (int i = A.length; i <(A.length+B.length); i++){
            birlesmis[i]=B[sayac];
            sayac++;
        }

        System.out.println("son\n"+Arrays.toString(birlesmis));

        int arr2[]= {12,15,25,14,3,12,65};
        Arrays.sort(arr2); // [3,12,12,14,15,25,65]
        String arrayString = Arrays.toString(arr2);
        System.out.println(arrayString);//[3, 12, 12, 14, 15, 25, 65]
        System.out.println(arrayString.substring(5));
        //2, 12, 14, 15, 25, 65] // [ , bosluk hepsi string oldu ve 5 inci index 2 oldu

        int arr3[]= {10,25,5,20};
        int arr4[]= {25,10,20,5};

        System.out.println(Arrays.equals(arr3, arr4));//false

        Arrays.sort(arr3);  // [5, 10, 20, 25]
        Arrays.sort(arr4);  // [5, 10, 20, 25]

        System.out.println(Arrays.equals(arr3, arr4));//true

        // Iki array'in birbirine esit olmasi icin hem uzunluklari, icindeki tum elemanlar,
        // ve esit elemanlarin indexleri esit olmalidir.

    }
}
