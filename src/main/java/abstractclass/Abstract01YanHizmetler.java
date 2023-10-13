package abstractclass;

public abstract class Abstract01YanHizmetler extends Abstract01Personel {

    // abstract bir class'in abstract child'ini olusturursak
    // abstract methodlari implement etmek zorunda olmayiz
    // Java bilir ki bu child son class degil, mutlaka bun child'in
    // concrete child clas'i olacak

    public static void main(String[] args) {

        // YanHizmetler obj1 = new YanHizmetler();
        // abstract bir class'dan obje uretilemez
        // Cannot instantiate the type YanHizmetler
    }


}
