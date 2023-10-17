package exceptions;

public class Exception04 {
    public static void main(String[] args) {

        // null olarak tanimlanmis bir obje ile uygun olmayan bir islem yapmaya calistiginizda
        // Java NullPointerException verir
        // Unchecked exception'dir

        String str1=" ";
        String str2="";
        String str3=null;   // null bir deger degildir sadece str3'un hicbirseye esit olamdigini
        // soyleyen bir isaretcidir(pointer)

        System.out.println(str1.length()); // 1
        System.out.println(str2.length()); // 0
        System.out.println(str3.length()); // NullPointerException //buraya kadar geldi yazdi ve burda durdu exp firlatti

        System.out.println(str3 + "bos"); // nullbos
        System.out.println(str3.concat("bos")); // NullPointerException


    }
}
