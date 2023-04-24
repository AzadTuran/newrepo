package ErolWork;

import java.util.Arrays;

public class C14_Arrays {
    //verilen bi arraydeki ortadi elemanı bulunuz.

    public static void main(String[] args) {
        int a[] = {12,5,8,13};


        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        if (a.length%2==0){

            int x = a.length/2;
            int y = a.length/2-1;
            System.out.println((a[x]+a[y])/2);
        }else {
            System.out.println(a[a.length/2]);
        }

    }
}
