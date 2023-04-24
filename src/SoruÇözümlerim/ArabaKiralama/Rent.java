package SoruÇözümlerim.ArabaKiralama;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Rent {
    static Scanner scan = new Scanner(System.in);
    private String alinacakSehir;
    private LocalDate alinacakGun;

    private LocalTime alisSaat;
    private LocalDate teslimGunu;
    private LocalTime teslimSaati;

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {

        System.out.println("Alınacak Şehri girin : ");
        alinacakSehir = scan.next();
        this.alinacakSehir = alinacakSehir;
    }

    public LocalDate getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(LocalDate alinacakGun) {
        System.out.println("Alınacak Yılı yyyy \nAlinacak ayı mm  \nAlınacak günü dd şeklinde girin : ");
        alinacakGun = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        this.alinacakGun = alinacakGun;
        if (alinacakGun.isBefore(LocalDate.now())) {
            System.out.println("Yanlış gün girdiniz");
            System.out.println("Alınacak Yılı yyyy \nAlinacak ayı mm  \nAlınacak günü dd şeklinde girin : ");
            alinacakGun = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }

    }

    public LocalTime getAlisSaat() {
        return alisSaat;
    }

    public void setAlisSaat(LocalTime alisSaat) {
        System.out.println("Alınacak Saati saat:dakika şeklinde girin : ");
        alisSaat = LocalTime.of(scan.nextInt(), scan.nextInt());
        this.alisSaat = alisSaat;
    }

    public LocalDate getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(LocalDate teslimGunu) {
        System.out.println("Teslim Günü yyyy-mm-dd şeklinde girin : ");
        teslimGunu = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        this.teslimGunu = teslimGunu;

        if (teslimGunu.isBefore(alinacakGun)) {
            System.out.println("Teslim günü alış gününden önce olamaz");
            System.out.println("Teslim Günü yyyy-mm-dd şeklinde girin ama alış gününden önce olmamalı girdiğiniz gün : ");
            teslimGunu = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        }
    }

    public LocalTime getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(LocalTime teslimSaati) {
        System.out.println("Teslim Saati saat:dakika şeklinde girin : ");
        teslimSaati = LocalTime.of(scan.nextInt(), scan.nextInt());
        this.teslimSaati = teslimSaati;
    }

    public Rent() {

    }

    public static void ödenecekGün(LocalDate alinacakGun,LocalDate teslimGunu ) {

        long daysBetween = ChronoUnit.DAYS.between(alinacakGun,teslimGunu);
        System.out.println("Ödenecek toplam Gün sayisi : " + daysBetween);
    }

    public static void main(String[] args) {
        Rent r1 = new Rent();

    }


}








