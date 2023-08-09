package ternary;

public class Ternary01 {
    public static void main(String[] args) {
        //Condition  ? Condition true  :  Condition false
        //Example 1: is number pozitif or negatif

        int a=12;
        String sonuc = a>0     ?             "Pozitif"                :             "Pozitif degil";
        System.out.println(sonuc);

        //Example 2 : which is the smaller
        int b=45;
        int c=145;
        int Sonuc1= b<c ? b : c;
        System.out.println(Sonuc1);

        //Example 3: calculate absolut value of number

        int x=145;
        int y=-23;
        int abs= x<0 ? (-1*x) : x;
        int abs1= y<0 ? (-1*y) : y ;
        System.out.println(abs);
        System.out.println(abs1);

        //Example 4 : if two numbers same sign multiply this number , otherwise write I can not this function

        int e =12;
        int f =-10;

        //if we use different type for true or false condition we must use Object , otherwise we become error
        //Object have no parant class, because it is the top of class

        Object islem=(e>0 && f>0)||(e<0 && f<0) ? e*f : "I can not this functionm";
        System.out.println(islem);



    }
}
