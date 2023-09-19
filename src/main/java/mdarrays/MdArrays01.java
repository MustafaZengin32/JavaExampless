package mdarrays;

import java.util.Arrays;

public class MdArrays01 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][2];

        System.out.println(Arrays.toString(arr1));//[[I@e9e54c2, [I@65ab7765, [I@1b28cdfa] yazmadi sadece referans gosterdi

        System.out.println(Arrays.toString(arr1[1]));//[0, 0]

        System.out.println(Arrays.deepToString(arr1));//[[0, 0], [0, 0], [0, 0]]


        arr1[0][1] = 5;
        arr1[1][0] = 2;
        arr1[2][1] = 3;


        System.out.println(Arrays.deepToString(arr1));//[[0, 5], [2, 0], [0, 3]]

        int[][] arr2 = new int[][]{new int[1], {1, 2, 3}, {6, 7, 8, 9}};
        System.out.println(Arrays.deepToString(arr2));//[[0], [1, 2, 3], [6, 7, 8, 9]]

        System.out.println(Arrays.toString(arr2[1]));//[1, 2, 3]

        System.out.println(arr2[2][1]);//7
        
        
    }
}
