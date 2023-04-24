package ErolWork;

import java.util.Arrays;

public class C16_Arrays {
    public static void main(String[] args) {
      // tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
        //        Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2.

        int arr[] = {-12, 18, -5, 23, -2,0};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-12, -5, -2, 18, 23]

        int searchElement = 0;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                found = true;
                break;
            }
        }

        if(found==false){
            int a = Arrays.binarySearch(arr,0);
            int b =  Math.abs(a);

            System.out.println("en küçük pozitif sayi = " + arr[b-1]);
            System.out.println("en büyük negatif sayi = " + arr[b-2]);


        }else{
            int c = Arrays.binarySearch(arr,0);

            System.out.println("en küçük pozitif sayi = " + arr[c+1]);
            System.out.println("en büyük negatif sayi = " + arr[c-1]);


        }




    }
}
