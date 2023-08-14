package stringManipulations;

public class String02 {
    public static void main(String[] args) {
        String str="Java is easy";

        //indexOf()

        int idxA1=str.indexOf("a");
        System.out.println(idxA1); //1

        // lastIndexOf()
        int idxA2=str.lastIndexOf("a");
        System.out.println(idxA2);

        String str1="Kara kara dusunme Ankara";
        int idxA3=str1.indexOf("kara");
        System.out.println(idxA3); //5

        int idxA4=str1.lastIndexOf("kara");
        System.out.println(idxA4);//20

        String str2="Missisippi";

        int idxI=str2.indexOf('i'); //indexOf() can use both String and char

        System.out.println(idxI);

        // Example 1:  control a character wheather repetitive or not
        //      "Helloooooo"   ==> H--> not repetitive     l-->repetative

        String hll="Hellooooo";

        for (int i = 0; i <hll.length(); i++) {
            if (hll.indexOf(hll.charAt(i))==hll.lastIndexOf(hll.charAt(i))){
                System.out.println(hll.charAt(i)+" is not repeated");
            }
        }

        String u="Learn Java earn money";

        int sonuc=u.indexOf("a", 6); //skip first 6 characters
        System.out.println(sonuc); //7

        int son=u.lastIndexOf("m",7);//skip last 7 characters
        System.out.println(son); //-1

        String m="Hello everyone!";
        int e=m.lastIndexOf("e",10);
        System.out.println("e "+ e);

        String v="Java is Java";

        String y="";
        String z=" ";
        boolean bosMu=y.isEmpty();
        boolean bosMudur=z.isEmpty();
        System.out.println(bosMu);//f
        System.out.println(bosMudur);//t


        //isBlank()
        boolean blankMi=y.isBlank();
        boolean blankMidir=z.isBlank();
        System.out.println(blankMi);//t
        System.out.println(blankMidir);//t






    }
}
