package wrapperclass;

public class Wrapper01 {
    public static void main(String[] args) {
        /*
        Java add to  primitive data types methods . Its name "Wrapper Class"
        Primite+Method => Wrapper Class

          Primitive       Wrapper
          byte     ==>   Byte
          short    ==>   Short
          ** int   ==>   Integer
          long     ==>   Long
          float    ==>   Float
          double   ==>   Double
          boolean  ==>   Boolean
          ** char  ==>   Character

          Wrapper Class include method , because of that it is Non-Primitive
          Wrapper Class is Class , that is why start with capital


         */

        byte primitiveByte = 12; //dont have a method
        Byte wrapperByte=12; //have lots of methods


        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);



        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);


        float f1=13.99F;
        Float wrapperF1=f1; //primitive to wrapper is named Autoboxing



        Character w1='s';

        String isim="Ahmet";

        char harf='a';

        char primitiveW1 = w1; //Unboxing

        //Note: Autoboxing ve Unboxing is done Automatic by Java
    }

}
