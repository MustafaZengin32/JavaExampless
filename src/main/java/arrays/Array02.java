package arrays;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 8, 90};//array elemanlarini sola kaydirma

        int kova = arr1[0];

        for(int i = 0; i < arr1.length - 1; ++i) {
            arr1[i] = arr1[i + 1];

            /*
             {2,3,4,5,6,8,90,90}
             //son elemana tekrar 1 i atadik
              {2,3,4,5,6,8,90,1} oldu

             */
        }

        arr1[arr1.length - 1] = kova;//Bunu yazmasaydik son eleman gene 90 olarak kalirdi//[2, 3, 4, 5, 6, 8, 90, 90]
        System.out.println(Arrays.toString(arr1));//{2,3,4,5,6,8,90,1}

        System.out.println("***********************************************");

        int[] arr = new int[]{3, 5, 8, 5, 2, 4};
        int toplam = 0;

        int i;
        for(i = 0; i < arr.length; ++i) {
            toplam += arr[i];
        }

        System.out.println("elementlerin toplami : " + toplam);//27
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[2, 3, 4, 5, 5, 8]

        int[] arr2 = new int[]{3, 5, 8, 5, 2, 4};

        int[] arr3=new int[arr2.length];

        for(int k=0; k<arr2.length;k++){
            arr3[k] = arr2[arr2.length-1-k];
        }

        System.out.println(Arrays.toString(arr3));


    }
}
