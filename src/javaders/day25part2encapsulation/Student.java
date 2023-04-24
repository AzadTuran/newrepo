package javaders.day25part2encapsulation;

public class Student {


    public int age = 23 ;
    public String stdName = "Tom Hanks";

    //Encapsulation nedir ?  Data saklamaktır.(Data hiding)
    //Data'yi nasil saklarsın? Acsess Modifier'ini "private" yaparak.

    private String stdId = "AC2023102T";

    private double gpa = 3.87;

    private boolean successful = false;

    //Encapsulation yaptiğimiz datayi diğer classlardan okuyabiliriz.
    //Nasil okuruz? "get method" olusturarak Encapsule edilmis data'nin degerini okuyabiliriz.
    //i)  get method'ları hep "public" olur.
    //ii) get methodu'un "return type"i okudugu variable'in rteurn type'i ile ayni olur.
    //iii)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar.


    public String getStdId() {
        return stdId;
    }

    public double getGpa(){
        return gpa;
    }

    //Encapsulation yapilan variable'in data type'i "boolean" ise get method ismi "is" ile baslar.

    public boolean isSuccessful() {
        return successful;
    }


    //Encapsulation yaptiğimiz datayi diğer classlardan nasil degistirebiliriz.
    //Nasil degistirebiliriz ? "set method" olusturarak Encapsule edilmiş data'nin degerini degistirebiliriz.
    //i) Set methodlar hep public olur.
    //ii)Set methodlarin return type'i hep void olur.
    //iii)Set methodu parametre kullanir ve parametrenin data type'i variable ile ayni olur.
    //iv)set method kullanarak varolan object uzerinde degisiklikler yaparak o object'i sanki yeni bir object'mis gibi kullanabiliriz.
    //Note: getmethod'ların diger adi "getter", set method'ların diger adı "setter"dir.


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
