package costructor;public class Constructor03CarARunner {
    public static void main(String[] args) {
        Constructor01Car car = new  Constructor01Car();
        System.out.println(car.yil);//2000


        Constructor03CarA car1 = new Constructor03CarA();
        System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi);
        //0 null null 2000 false

        car1.km = 75000;
        car1.model = "Corolla";
        car1.renk = "Kirmizi";
        System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi);
        //75000 Corolla Kirmizi 2000 false


        Constructor03CarA car2 = new Constructor03CarA();
        System.out.println(car2.km + " " + car2.model + " " + car2.renk + " " + car2.yil + " " + car2.satilikMi);
        //0 null null 2000 false

        Constructor03CarA car3 = new Constructor03CarA();
        car3.km = 40000;
        car3.satilikMi = true;
        System.out.println(car3.km + " " + car3.model + " " + car3.renk + " " + car3.yil + " " + car3.satilikMi);
        //40000 null null 2000 true
    }
}
