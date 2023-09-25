package costructor;

public class Constructor07CarUretRunner {
    public static void main(String[] args) {


    Constructor07CarUret car1 =new  Constructor07CarUret();
    car1.model="Corolla";
    car1.marka="Toyota";
    car1.yil=2010;
    car1.kazasiVarMi=true;

		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		car1.yakit("Benzin");
		car1.vites("duz");

}
}