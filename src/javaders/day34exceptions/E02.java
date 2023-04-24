package javaders.day34exceptions;

public class E02 {
    public static void main(String[] args) {
        //Bir String array'den istenilen bir elamani elaman sirasi ile alan method olusturunuz.

        String[] a = {"A","V","A","J"} ;

        System.out.println(getElement(a, 3));
        System.out.println(getElement(a, 1));
        System.out.println(getElement(a, 4));
        System.out.println(getElement(a, 2));


    }
    public static String getElement(String[] a , int numOfElement){
        String result = "";

        try{
            result = a[numOfElement-1];
        }catch (ArrayIndexOutOfBoundsException e){
            if(numOfElement-1<0){
                result=a[0];
            }else{
                result = a[a.length-1];
            }
        }
        return result;

        //ArrayIndexOutOfBoundsException array islemlerinde olmayan index kullandiginizda atilir

    }
}
