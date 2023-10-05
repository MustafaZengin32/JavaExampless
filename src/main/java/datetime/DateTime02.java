package datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();
        System.out.println("baslangic saati " + saat);
        int sayi = 10;

        for(int i = 0; i < 10000; ++i) {
            ++sayi;
        }

        LocalTime saatBitis = LocalTime.now();
        System.out.println("bitis saati " + saatBitis);
        double nano1 = (double)saat.getNano();
        double nanobitis = (double)saatBitis.getNano();
        System.out.println("int For loop " + (nanobitis - nano1) + " nano saniyede tamamlandi");
        LocalTime saatS = LocalTime.now();
        System.out.println("baslangic saati " + saatS);
        String str = "celil";

        for(int i = 0; i < 10000; ++i) {
            str = str + " ";
        }

        LocalTime saatBitisS = LocalTime.now();
        System.out.println("bitis saati " + saatBitisS);
        double nanoS = (double)saatS.getNano();
        double nanobitisS = (double)saatBitisS.getNano();
        System.out.println("String For loop " + (nanobitisS - nanoS) + " nano saniyede tamamlandi");
        double stringSure = nanobitisS - nanoS;
        double intSure = nanobitis - nano1;
        System.out.println("int String'den " + (stringSure - intSure) + " nano saniye daha hizli bitirdi");

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat);
        DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("DDD / MM / YYYY EEEE  h : mm   a");
        System.out.println(duzenle.format(tarihSaat));


    }

}
