package foreach;

public class Foreach01 {
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10,12};

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------------------------------");

        for (int a : arr){
            System.out.println(a);
        }

        System.out.println("--------------------------------");


        int arr1[]= {1,2,2,2,4};

        int carpim=1;

        for (int b: arr1){
            carpim*=b;
        }
        System.out.println(carpim);//32





    }
}
