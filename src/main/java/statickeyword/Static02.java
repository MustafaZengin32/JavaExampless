package statickeyword;

public class Static02 {
    int x = 5;
    static int y = 10;

    public Static02() {
    }

    public static void main(String[] args) {
        Static02 obje1 = new Static02();
        System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + y);// 5 10
        ++obje1.x;
        ++y;
        System.out.println("islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y : " + y); //6 //11

        Static02 obje2 = new Static02();
        System.out.println("obje2 icin x : " + obje2.x + " obje2 icin y : " + y);//5 //11
        ++obje2.x;
        ++y;
        System.out.println("islemden sonra obje2 icin x : " + obje2.x + " obje2 icin y : " + y);//6 //12
        System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in  x : " + obje1.x + " y : " + y);//6 //12

        Static02 obje3 = new Static02();
        obje3.x = 20;
        y = 40;
        System.out.println("obje3'den sonra obje1'in x :" + obje1.x);//6
        System.out.println("obje3'den sonra obje2'in x :" + obje2.x);//6
        System.out.println("obje3'den sonra obje3'in x :" + obje3.x);//20
        System.out.println("obje3'den sonra obje1'in y :" + y);//40
        System.out.println("obje3'den sonra obje2'in y :" + y);//40
        System.out.println("obje3'den sonra obje3'in y :" + y);//40
    }
}
    

