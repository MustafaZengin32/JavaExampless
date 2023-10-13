package polymorphism;

public class Polymorphism02Personel {

    public String isim="Emre";
    public String soyisim="Mor";

    // Overriding kurallari
    // 1- access modifier method signature'a dahil olmadigindan
    //    overridden ve overriding access modifier'lar farkli olabilir
    //    child parent'i sinirlandiramaz
    //    yani overriding method'un access modifier'i
    //    ayni veya daha genis kapsamli olmalidir
    //   private -- default -- protected -- public

    // 2- private ve static method'lar override edilemez
    // ayni isimde method olusturulunca java CTE vermez
    // ancak override isareti cikmaz ve
    // @Override notasyonu kullanilmak istenirse CTE olur
    // Yani Java bunlari farkli class'lardaki farkli method'lar olarak kabul eder

    // 3- return type method signature'ina dahil olmadigindan
    //    farkli secilebilir ancak
    //    return type void veya primitive ise ayni olmak zorundadir
    //    Eger return type'lar non-primitive ise
    //    Child class'daki return type, parent class'daki return type'i
    //    ile ayni veya child'i olmalidir

    // overriding olabilmesi icin
    // hem method ismi, hem de method signature ayni olmalidir

    // super.method3();
    // Overriding varsa parent ve child class'daki
    // overridden ve overriding method'lardan sadece biri calisir
    // eger ikisini birden calistirmak isterseniz
    // super.overriddenMethodIsmi yazilir

    /*
           Overriding method @Override notasyonu ile isaretlenebilir
           @Override kullanilmayan overriding isleminde,
           parent class'daki overridden method silinirse
           hic bir sorun olmaz

           Ancak @Override kullanilan overriding isleminde,
           parent class'daki overridden method silinirse
           veya signature'i degistirilirse
           Java CTE verir, boylece overridden method'un
           silinmesi engellenir.


     */
}
