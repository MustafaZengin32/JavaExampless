package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist05 {
    public static void main(String[] args) {
        String[] arr = new String[]{"A", "b", "C", "d"};
        List<String> arraydenList = Arrays.asList(arr);
        System.out.println("List : " + arraydenList);//List : [A, b, C, d]
        System.out.println(arraydenList.get(1));//b
        arr[1] = "Z";
        System.out.println("Array'i degistirdikten sonra, array = " + Arrays.toString(arr));//Array'i degistirdikten sonra, array = [A, Z, C, d]
        System.out.println("Array'i degistirdikten sonra, list = " + arraydenList);//Array'i degistirdikten sonra, list = [A, Z, C, d]
        arraydenList.set(3, "D");
        System.out.println("List'i degistirdikten sonra, list = " + arraydenList);//List'i degistirdikten sonra, list = [A, Z, C, D]
        System.out.println("list'i degistirdikten sonra, array = " + Arrays.toString(arr));//list'i degistirdikten sonra, array = [A, Z, C, D]


        List<String> str = new ArrayList();
        str.add("Jeyhun");
        str.add("Yildiz");
        str.add("Mustafa");
        str.add("Tugba");
        str.add("Turgut");
        System.out.println(str);
        String silinecekharf = "a";
        killThemAll(str, silinecekharf);

        ArrayList aa=new ArrayList();
        aa.add(3);
        aa.add("dddf");
        System.out.println(aa);//[3, dddf]

    }

        private static List<String> killThemAll(List<String> str, String silinecekharf) {
            for(int i = 0; i < str.size(); ++i) {
                if (((String)str.get(i)).contains(silinecekharf)) {
                    str.remove(i);
                    --i;
                }
            }

            return str;
        }


    }

