package Introduction.day03scanner;

public class C03_Runner {
    public static void main(String[] args) {
        //Object nasil olusturulur?
        //Class Ismi + Object Ismi + Atama Operatoru + "new" + Constructor
               C01_Car myCar             =          new C01_Car();
        //"new" keyword'u sifirdan yeni bir object oluşturmak için kullanılır.
        //Constructor java'da nesneleri olusturmak icin kullanılan ozel bir methoddur.
        System.out.println(myCar.price);
        System.out.println("myCar.model = " + myCar.model);//.soutv yaparsak böyle
        System.out.println(myCar.model);//sadece .sout yaparsak böyle olur.
        myCar.hareket();
        myCar.dur();

        System.out.println("----------------------------------------------------------------------------------------------");

        C02_Student tomHanks = new C02_Student();

        System.out.println(tomHanks.address);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.name);
        tomHanks.feed();
        tomHanks.study();




    }
}
