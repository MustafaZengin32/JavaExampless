package inheritance;

public class Inheritance02Toyota extends Inheritance02Araba{

    Inheritance02Toyota(){
        super();
        System.out.println("Toyota cons. calisti");
    }

    protected String marka = "Toyata";
    protected String motor= "Toyota araclar cevreci motor kullanir";
    protected String uretimYeri="Uretim yeri belirtilmemis";
    protected int hiz=140;
}
