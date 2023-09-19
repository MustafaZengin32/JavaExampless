package mdarrays;

public class MdArrays02 {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 2}, {4, 5}, {3, 4, 5}, {0, 3, 4, 5, 6}};
        carpimYazdir(arr);

        int[][] arr1 = new int[][]{{1, 2, 3, 4}, {4, 5, 2}, {6, 3}};
        int sonuc = 1;

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1.length; j++){

                int son=arr1[i].length-1;
                sonuc*=arr1[i][son];
            }

        }
        System.out.println(sonuc);//13824
    }

        public static void carpimYazdir(int[][] arr) {
            int carpim = 1;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {

                    carpim*=arr[i][j];
                }

            }

            System.out.println(carpim);
        }


    }

