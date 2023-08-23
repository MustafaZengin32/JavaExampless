package scope;

public class Scope04 {
    public static void main(String[] args) {

        System.out.println(Scope03.okulId);
        System.out.println(Scope03.okulAdi);
        System.out.println(Scope03.acikMi);

       //System.out.println(Scope03.kantingelir); gormez

        Scope03 scope1=new Scope03();
        System.out.println(scope1.kantingelir);//ancak bu sekilde obje olusturursan static olmayani gorursun

        Scope03.staticMethod();//static method direk gorundu
        scope1.method();//static olmayan method ancak objeden dolayi gorundu



    }
}
