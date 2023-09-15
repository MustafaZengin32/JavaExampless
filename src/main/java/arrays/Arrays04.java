package arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

            int[] arr1 = new int[]{3, 5, 7, 10};
            int[] arr2 = new int[]{2, 4, 6};
            int[] birlesikArray = birlestir(arr1, arr2);
            Arrays.sort(birlesikArray);
            System.out.println(Arrays.toString(birlesikArray));
        }

        private static int[] birlestir(int[] arr1, int[] arr2) {
            int[] birlesikArray = new int[arr1.length + arr2.length];

            int i;
            for(i = 0; i < arr1.length; ++i) {
                birlesikArray[i] = arr1[i];
            }

            for(i = 0; i < arr2.length; ++i) {
                birlesikArray[i + arr1.length] = arr2[i];
            }

            return birlesikArray;
        }
    }

