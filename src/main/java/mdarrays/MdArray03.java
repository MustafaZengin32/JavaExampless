package mdarrays;

import java.util.Arrays;

public class MdArray03 {
    public static void main(String[] args) {
        int arr[][]={ {1,2,3}, {4,5}, {6,7} };



        int toplamlarArrayi[]= new int[arr.length];



        for (int i = 0; i < arr.length; i++) {

            int elementlerToplami=0;

            for (int j = 0; j < arr[i].length; j++) {

                elementlerToplami+=arr[i][j];

            }

            toplamlarArrayi[i]=elementlerToplami;

        }
        System.out.println(Arrays.toString(toplamlarArrayi));


    }
}
