package mdarrays;

import java.util.Arrays;


public class MdArrays03 {
    public static void main(String[] args) {


        int arr[][] = {{1, 2, 3}, {4, 5}, {6, 7}};

        int arr1[] = {1, 2, 3};


        int toplamlarArrayi[] = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {

            int elementlerToplami = 0;

            for (int j = 0; j < arr[i].length; j++) {

                elementlerToplami += arr[i][j];

            }

            toplamlarArrayi[i] = elementlerToplami;

        }
        System.out.println(Arrays.toString(toplamlarArrayi));


        printArray(arr1);

        System.out.println();

        reverse(arr1);

}


        public static void printArray ( int[] arr1){
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i]+" ");
            }
        }

    public static int[] reverse(int[] arr1) {
        int[] result = new int[arr1.length];
        for (int i = 0, j = result.length - 1; i < arr1.length; i++, j--) {
            result[j] = arr1[i];
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

    }
