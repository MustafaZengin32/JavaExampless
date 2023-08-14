package stringManipulations;

public class String04 {
    public static void main(String[] args) {
        // Example 1: except space write all characters
        String str= "Ali okula gitti.";

        String str1=str.replace(" ", "");
        System.out.println(str1);
        System.out.println(str1.length());

        //// Example 2: replace a to A
        String s="Ankara'nin tasina bak gozlerinin yasina bak.";

        String yeniS=s.replace("a","A");
        System.out.println(yeniS);

        /* group of data Regex
        1) all numerals      ==> [0-9]
        2) all lower letters ==> [a-z]
        3) all upper letters ==> [A-Z]
        4) all letters       ==> [a-zA-Z]
        5) vowels     ==> [aeiouAEIOU]
        6) Space             ==> [ ]
        7) all numerals and letters ==> [0-9a-zA-Z]
        8) all punctuation    ==> \\p{Punct}


        EXCEPT
        1)         ==>[^0-9]
        2)         ==>[^a-z]
        3)         ==>[^A-Z]
        4)         ==>[^a-zA-Z]
        5)         ==> [^ ]

         */

        // Example : change all numerals to "*"
        // "AC202117004" ==>AC*********
        String stdId = "AC202117004";

        String new1=stdId.replaceAll("[0-9]" ,"*");
        System.out.println(new1);

        String z1="?.,fjenkins";
        String z2=z1.replaceAll("\\p{Punct}","9");
        System.out.println(z2);









    }
}
