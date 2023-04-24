package practices.b151practices.practices12;

public class C01 {

    String isim =  "Azad";
    int yas = 20;

    public C01(String isim,int yas){

    }

    public C01() {

    }


    public static void main(String[] args) {
        C01 obj1 = new C01("Seval",21);

        System.out.println(obj1.isim + ", " + obj1.yas);

        C01 obj2 = new C01();
        //Her Class'da default constructor vardir.
        //Fakat biz bulundugumuz Class'da kendimiz bir constructor olusturursak bu durumda "default constructor" olur(silinir)

        System.out.println(obj2.isim+", "+obj2.yas);
    }

}
