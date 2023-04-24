package SoruÇözümlerim.ArabaKiralama;
import java.util.ArrayList;
public class Arabalar {
    static ArrayList<String> marka = new ArrayList<>();
    static ArrayList<String> model = new ArrayList<>();
    static ArrayList<String> yakit = new ArrayList<>();
    static ArrayList<String> vites = new ArrayList<>();
    static ArrayList<Integer> ucret = new ArrayList<>();

    public static void main(String[] args) {

        marka.add("BMW");
        marka.add("BMW");
        marka.add("BMW");
        marka.add("Mercedes");
        marka.add("Mercedes");
        marka.add("Mercedes");
        marka.add("Audi");
        marka.add("Audi");
        marka.add("Audi");

        model.add("320");
        model.add("520");
        model.add("530");
        model.add("A180");
        model.add("C180");
        model.add("S600");
        model.add("A3");
        model.add("A6");
        model.add("A8");

        yakit.add("dizel");
        yakit.add("dizel");
        yakit.add("benzin");
        yakit.add("benzin");
        yakit.add("dizel");
        yakit.add("benzin");
        yakit.add("benzin");
        yakit.add("dizel");
        yakit.add("dizel");

        vites.add("manuel");
        vites.add("otomatik");
        vites.add("otomatik");
        vites.add("otomatik");
        vites.add("manuel");
        vites.add("manuel");
        vites.add("manuel");
        vites.add("otomatik");
        vites.add("manuel");

        ucret.add(1000);
        ucret.add(3000);
        ucret.add(3500);
        ucret.add(1000);
        ucret.add(1000);
        ucret.add(15000);
        ucret.add(1100);
        ucret.add(1200);
        ucret.add(10000);

        arabalar();



    }

    public static void arabalar(){

        System.out.println("************************ ARAÇ LİSTESİ ***********************");
        for (int i = 0; i<ucret.size(); i++) {
            System.out.println(i + "-)  Marka " + marka.get(i) +" Model : " +model.get(i)+ " Yakıt tipi :  "+ yakit.get(i)+" Vites türü : "+vites.get(i)+" Fiyat " + " Günlük Ücret : " + ucret.get(i) + " TL");
        }


    }
}

