package javaders.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class C01_DateTime {
    public static void main(String[] args) {
        //Anlik zamanı nasıl alırız ?

        LocalTime myCurrentTime =  LocalTime.now();
        System.out.println(myCurrentTime); //10:25:14.076461

        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println("hour = " + hour);//hour = 10
        
        int minute = myCurrentTime.getMinute();
        System.out.println("minute = " + minute);//minute = 26


        //Gelecek ve gecmis zamana nasil gidilir?
        LocalTime next  = myCurrentTime.plusMinutes(25).minusSeconds(11);
        System.out.println("next = " + next); //next = 10:57:17.223401
        
        
        //Zaman formatı nasıl degiştirilir ?
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh.mm ");
        //burdaki HH.mm arasındaki "." görmek istediğim formatı sağlar 10.44 oraya ":" koyarsam 10:44 yazar
        //"HH" 24'luk saat sistemini kullanılır. "hh" yapsaydım 12'lik saat dilimini kullanırdı.


        String formattedMyCurrentTime1 = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime1);//10.53


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh.mm.ss a");
        //burdaki a pm am cinsini yazdırır
        //ss second gösterir
        String formattedMyCurrentTime2 = dtf2.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime2);//10.53.05 ÖÖ


        //Date formati nasil degistirilir?

        LocalDate myCurrentDate = LocalDate.of(2023,8,25);
        System.out.println(myCurrentDate);//2023-08-25

        //Tarihi Gun/Ay/Yil sekline ceviriniz.
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedMyCurrentDate1 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate1);//  25/08/2023

        //Tarihi Gun /Ay isminin ilk 3 harfi / Yil şekline ceviriniz.  25/Aug/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String formattedMyCurrentDate2 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);//25/Ağu/2023

        //Tarihi Gun /Ay ismi/Yil şekline ceviriniz.  25/August/2022
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrrrentDate3 = dtf5.format(myCurrentDate);
        System.out.println(formattedMyCurrrrentDate3); //25/Ağustos/2023


        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //Tokyo'da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo); //2023-04-08

        //Tashkent'te ayin kaci?
        LocalDate  dateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);// 2023-03-16

        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//00:35:26.428240

        //Berlin'de saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);//17:35:26.429524






    }
}
