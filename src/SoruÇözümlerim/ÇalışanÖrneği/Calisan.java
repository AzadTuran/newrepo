package SoruÇözümlerim.ÇalışanÖrneği;

public class Calisan {

    public int no;

    public String name;

    public String surname;

    public double salary;

    public int tecrube;

    public Calisan(){

    }
    public Calisan(int no,String name,String surname,double salary,int tecrube){
        this.no=no;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        this.tecrube=tecrube;
    }

    public void calisanBilgileriGoster(){
        System.out.println("*************ÇALIŞAN BİLGİLERİ****************");
        System.out.println("No      : "+no);
        System.out.println("Name    : "+name);
        System.out.println("Surname : "+surname);
        System.out.println("Salary  : "+salary);
        System.out.println("Tecrübe : "+tecrube);

    }

    public void zamYap(int zamMiktarı){
        salary +=zamMiktarı;
        System.out.println("Maaşınıza "+ zamMiktarı+ "Tl zam yapıldı.");
        System.out.println("Şuanki güncel maaşınız " +salary+ " tl değerindedir.");

    }
}
