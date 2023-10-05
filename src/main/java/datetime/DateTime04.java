package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime04 {
    public static void main(String[] args) {
        // Java'da saat ile islem yapmak icin
        // LocalTime class'indan obje kullaniriz

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 22:38:08.280

        for (int i = 0; i < 1000000; i++) {
            i+=1;
        }

        LocalTime saat2 = LocalTime.now();
        System.out.println(saat2); // 22:38:08.280
        System.out.println(saat);

        System.out.println(saat.plusHours(15)); // 13:45:51.936

        System.out.println(saat.getSecond()); //31

        System.out.println(saat.minusSeconds(1564548745)); // 18:03:46.469


        System.out.println(saat.now(ZoneId.of("Japan"))); // 05:00:37.820
        System.out.println(saat.now(ZoneId.of("America/Chicago"))); // 15:01:53.295

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2021-03-19T23:06:09.219

        System.out.println(ldt.toString()); // 2021-03-19T23:06:09.219

        String time= ldt.toString();

        System.out.println(time.startsWith("2021")); // true

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/d");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("y$M$d");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("y-MMMM-d");
        // M :month m : minute

        LocalDate tarih=LocalDate.now();

        System.out.println(dtf.format(tarih)); //2021/Mar/19
        System.out.println(dtf2.format(tarih)); //21/03/19
        System.out.println(dtf3.format(tarih)); //2021*3*19
        System.out.println(dtf4.format(tarih)); //2021-March-19
    }
}
