package statickeyword;

public class Static03Runner {

    public static void main(String[] args) {

        Static03 h1=new Static03();
        h1.personelIsim="Ayse";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="3123425465";
        System.out.println(h1);

        Static03 h2= new Static03();
        System.out.println(h2);
        h2.personelIsim="Hatice";
        h2.personelAdresi="Sincan";
        h2.personelTelefon="3124323232";
        h2.bashekimIsmi="Yasar Kemal";

        System.out.println("h1 : " + h1);
        System.out.println("h2 : " + h2);

        Static03 h3=new Static03();
        System.out.println("h3 : "+h3);
        h3.hastaneIsmi="Java Hastanesi";

        System.out.println(h2.hastaneIsmi); // Java Hastanesi


    }
}

