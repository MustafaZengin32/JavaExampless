package wrapperclass;

public class Wrapper02 {
    public static void main(String[] args) {
        int sayi1 = 10;
        Integer sayi2 = 20;
        System.out.println(sayi1 + sayi2);//30
        String tel1 = "3578987";
        String tel2 = "3245434";
        System.out.println(tel1 + tel2);//35789873245434

        System.out.println(Integer.valueOf(tel1));//3578987
        //Java'da Integer.valueOf() change number String value to Int  //~same parceInt(this one change direct int not Int)


        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println(32767);//32767//Because it is string
        String caddeNo = "203";
        String sokakNo = "1564";
        System.out.println(Integer.valueOf(caddeNo) + Integer.valueOf(sokakNo));//1767
        System.out.println("Hello world");

        String okulNo = "858";

        int okulNoSayiOlarak = Integer.parseInt(okulNo);

        System.out.println(++okulNoSayiOlarak);

        Character basHarf = 'a';



        System.out.println(basHarf.charValue()); // a

        System.out.println(Character.toUpperCase('a'));//A

    }
    }


