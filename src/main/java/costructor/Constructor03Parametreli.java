package costructor;

public class Constructor03Parametreli {
    public static void main(String[] args) {
        new Constructor03CarA(50000, "Vectra", "Beyaz", 2015, true);


        Constructor03CarA car2 = new Constructor03CarA(35000);
        System.out.println(car2.km);//3500

        Constructor03CarA car3 = new Constructor03CarA();
        System.out.println(car3.km);//0

        Constructor03CarA car4 = new Constructor03CarA(1000);
        System.out.println(car4.km);//1000

        Constructor03CarA car5 = new Constructor03CarA(2020, 5000);
        System.out.println(car5.yil + " " + car5.km + " " + car5.model);//2020 5000 null
    }
}
