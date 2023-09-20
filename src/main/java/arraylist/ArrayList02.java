package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList02 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 6, 3, 5, 5, 5, 5, 5, 5};
        int silinecekEleman = 5;

        ArrayList<Integer>gecici=new ArrayList<Integer>();

        for (int i=0; i<arr.length; i++){
            if (silinecekEleman!=arr[i]){

                gecici.add(arr[i]);
            }
        }

        System.out.println(gecici);


        int[] arr1 = new int[gecici.size()];

        for (int i = 0; i <arr1.length; i++){
            arr1[i] = (Integer)gecici.get(i);
        }

        System.out.println(Arrays.toString(arr1));//[3, 4, 6, 3]

    }


}
