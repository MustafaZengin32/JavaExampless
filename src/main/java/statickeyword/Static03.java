package statickeyword;

public class Static03 {

    static String hastaneIsmi="Olgunlar Hastanesi";
    static String hastaneAdresi="Cankaya / Ankara";
    static String bashekimIsmi="Dr Mehmet Yilmaz";

    String personelIsim="Isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
    String personelTelefon="Telefon belirtilmedi";

    @Override
    public String toString() {
        return "Static03{" +
                "personelIsim='" + personelIsim + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                '}';
    }
}
