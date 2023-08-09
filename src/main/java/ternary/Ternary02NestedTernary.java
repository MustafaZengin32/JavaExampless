package ternary;

public class Ternary02NestedTernary {
    public static void main(String[] args) {
        //leap year
        //i) Yil 100 e bolunurse 400'e de bolunmelidir. ==> 1600 => +    1800 => -
        // ii) Yil 100'e bolunmez ise 4'e bolunmelidir ==> 1996 =>+    2001 => -

        int year = 1800;
        double a=43.4;
        String leap= year%100==0? (year%400==0?"leap year":"not leap year" ): (year%4==0?"leap year":"not leap year");
        System.out.println(leap);

        //i)  8 characters or more , first letter must be 'i'
        //ii) less than 8 first letter must be 'K'

        String pwd = "ai2ahyf3ed";
        char firstLetter =pwd.charAt(0);

        String control= pwd.length()<8 ? (firstLetter=='K' ? "ACCEPTABLE":"NOT") : (firstLetter=='i'? "ACCEPTABLE":"NOT");
        System.out.println(control);










    }
}
