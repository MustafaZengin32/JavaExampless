package costructor;

public class Constructor06 {
    int x = 5;
    static int y = 10;

    public  Constructor06() {
    }

    public static void main(String[] args) {
        Constructor06 obje1 = new Constructor06();
        System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + y);//obje1 icin x : 5 obje1 icin y : 10


        ++obje1.x;
        ++y;
        System.out.println("islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y : " + y);//islemden sonra obje1 icin x : 6 obje1 icin y : 11


        Constructor06 obje2 = new  Constructor06();
        System.out.println("obje2 icin x : " + obje2.x + " obje2 icin y : " + y);//obje2 icin x : 5 obje2 icin y : 11
        //y statik oldugu icin veriyi tuttu ama x ilk atama degerine dondu yeni referans/obje oldugu icin

        ++obje2.x;
        ++y;
        System.out.println("islemden sonra obje2 icin x : " + obje2.x + " obje2 icin y : " + y);//islemden sonra obje2 icin x : 6 obje2 icin y : 12

        System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in  x : " + obje1.x + " y : " + y);//obje 2 olusturulduktan ve islemden sonra obje1'in  x : 6 y : 12

        Constructor06 obje3 = new Constructor06();
        obje3.x = 20;
        y = 40;
        System.out.println("obje3'den sonra obje1'in x :" + obje1.x);//obje3'den sonra obje1'in x :6

        System.out.println("obje3'den sonra obje2'in x :" + obje2.x);//obje3'den sonra obje2'in x :6

        System.out.println("obje3'den sonra obje3'in x :" + obje3.x);//obje3'den sonra obje3'in x :20

        System.out.println("obje3'den sonra obje1'in y :" + y);//obje3'den sonra obje1'in y :40

        System.out.println("obje3'den sonra obje2'in y :" + y);//obje3'den sonra obje2'in y :40

        System.out.println("obje3'den sonra obje3'in y :" + y);//obje3'den sonra obje3'in y :40
    }
}
