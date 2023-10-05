package datetime;

import java.time.*;

public class DateTime01 {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2023-10-05

        System.out.println(tarih.getDayOfYear());//278

        System.out.println(tarih.getDayOfMonth());//5

        System.out.println(tarih.getDayOfWeek());//THURSDAY

        System.out.println(tarih.getMonthValue());//10

        System.out.println(tarih.getMonth());//OCTOBER

        System.out.println(tarih.plusDays(20L));
        System.out.println(tarih.plusMonths(5L));
        System.out.println(tarih.plusWeeks(15L));
        System.out.println(tarih.plusYears(4L));
        System.out.println(tarih.plusYears(10L).plusMonths(10L).plusDays(10L));
        System.out.println(tarih.minusDays(20L));
        System.out.println(tarih.minusWeeks(20L));
        System.out.println(tarih.minusYears(5L).minusMonths(5L).minusDays(5L));
        System.out.println(tarih.minusYears(21L).isLeapYear());


        LocalDate dogumTarihi1 = LocalDate.of(1998, Month.JANUARY, 12);
        LocalDate dogumTarihi2 = LocalDate.ofYearDay(2000, 136);
        LocalDate dogumTarihi3 = LocalDate.of(1985, 10, 10);

        System.out.println(dogumTarihi1 + ", " + dogumTarihi2);//1998-01-12, 2000-05-15

        System.out.println(dogumTarihi1.isAfter(dogumTarihi2));

        System.out.println(dogumTarihi3.isBefore(dogumTarihi1));

        LocalTime yerelSaat = LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(yerelSaat);

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat);
        System.out.println(tarihSaat.toString().startsWith("2021"));




    }
}
