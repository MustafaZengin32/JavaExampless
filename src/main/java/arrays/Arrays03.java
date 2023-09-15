package arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        String[] isimler = new String[]{"Hacer", "ainagul", "Emine", "Murat", "Kutlu"};
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[Emine, Hacer, Kutlu, Murat, ainagul]

        isimler[4] = "Ainagul";
        System.out.println(Arrays.toString(isimler));//[Emine, Hacer, Kutlu, Murat, Ainagul]

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[Ainagul, Emine, Hacer, Kutlu, Murat]

        System.out.println(Arrays.binarySearch(isimler, "Murat"));//4 olan kacinci index

        System.out.println(Arrays.binarySearch(isimler, "Mehmet"));//-5 //olsaydi kacinci sirada olurdu yoksa - koy

        System.out.println(Arrays.binarySearch(isimler, "Tuba"));//-6 //olsaydi kacinci sirada olurdu yoksa - koy

        System.out.println(Arrays.binarySearch(isimler, "Kursat"));//-4 //olsaydi kacinci sirada olurdu yoksa - koy

        String cumle = "Java ogrenmek cok guzel";

        String [] str=cumle.split(" ");

        System.out.println(Arrays.toString(str));//[Java, ogrenmek, cok, guzel]

        for (int i= str.length-1; i>=0 ; i--){

            System.out.print(str[i]+" ");
        }

        System.out.println();

        int[] arr2 = new int[]{3, 4, 5, 6, 3, 5};

        int[] arr3 = new int[6];

        int silinecekEleman = 3;
        int sayac = 0;

        for (int i = 0; i <arr2.length; i++) {
            if (arr2[i] != silinecekEleman) {
                arr3[sayac]=arr2[i] ;

            }

            ++sayac;

        }

        System.out.println("arr3 "+Arrays.toString(arr3));

        String cumle1 = "Her sey, Javayla kolay degil mi?";
        String[] kelimeler1 = cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler1));
        System.out.println("Girilen cumlede " + kelimeler1.length + " adet kelime var");




    }

}
