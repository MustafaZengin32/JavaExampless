package interfaces;

public interface Interface02ChildofInterface extends Interface02{

    //method icin ikaz cikmadi cunku interface deki abstrakt methodu almak anlamsiz
    // ancak istersek genede override edebiliriz

    // Eger bir interface'i baska bir interface'in child'i yapmak isterseniz
    // extends keyword kullanilir

    // Bir interface concrete class'i INHERIT EDEMEZ

    void method1();
    // interface bir child parent interface'deki
    // abstract methodu override edebilir ama
    // ikisinin de body'si olmadigindan
    // bu islemin bir anlami yoktur

    int method4();
    boolean method5();
}
