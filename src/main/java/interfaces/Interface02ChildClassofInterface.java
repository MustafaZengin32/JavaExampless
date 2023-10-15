package interfaces;

public class Interface02ChildClassofInterface implements Interface02 {

    public static void main(String[] args) {

     System.out.println(MESAJ); // Hello Interface
    // sayi=40; yazili olmasa da Interface icerisinde oldugundan
    //          final'dir ve atama yapilamaz

        System.out.println(Integer.MAX_VALUE);
    // normalde variable isimleri, kucuk harfle baslar ve camelCase kullanilir
    // ancak java da ortak kabul olarak
    // static ve final olarak isaretlenen variable isimleri tamamen BUYUK HARF ile yazilir


        System.out.println(Math.PI);

}


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
