package team05soruçözümü.constructor;

public class worker {

    public int num;

    public String name;

    public String surname;

    public double salary;

    public int tecrube;

    public String deparment;

    public boolean evliMi;

    public worker(){

    }

    public worker(int num,String name, String surname, double salary, int tecrube, String deparment, boolean evliMi){
        this.num = num;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.tecrube = tecrube;
        this.deparment=deparment;
        this.evliMi=evliMi;
    }

    public worker(int num){

    }

    public void zamYapma(double zamMiktarı){
        salary += zamMiktarı;
        System.out.println("Maaşınıza " + zamMiktarı + " Tl zam yapıldı.");
        System.out.println("Şuan ki güncel maaşınız " + salary + "Tl'dir.");

    }

    public void calisanBilgileri(){
        System.out.println("**************ÇALIŞAN BİGİLERİ***********************");
        System.out.println("Numara : " + num);
        System.out.println("İsmi : " + name);
        System.out.println("Soyismi : " + surname);
        System.out.println("Maaşı : " + salary);
        System.out.println("Tecrübesi : " + tecrube);
        System.out.println("Departmanı : " + deparment);
        System.out.println("Evli mi?  : " + evliMi);

    }




}
