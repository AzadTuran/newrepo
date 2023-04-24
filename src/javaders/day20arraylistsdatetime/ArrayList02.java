package javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        /*

        Example 1: Bir Integer List'teki birbirine en yakin iki elemani bulunuz.
        [12, 23, 10, 19] ==> 12 and 10

         */

        List<Integer> nums = new ArrayList<>() ;

        nums.add(13);
        nums.add(23);
        nums.add(14);
        nums.add(10);
        System.out.println(nums);//[13, 23, 14, 10]

        //Collections.sort(nums); methodu nums listindeki elemanları "natural order" yapar.
        Collections.sort(nums);
        System.out.println(nums);//[10, 13, 14, 23]

        int minDifferents = nums.get(1)-nums.get(0);

        for (int i = 1; i <nums.size() ; i++) {
            minDifferents=Math.min(minDifferents,nums.get(i)-nums.get(i-1));
        }
        System.out.println(minDifferents);

        for (int i = 1; i < nums.size() ; i++) {
            if(nums.get(i)- nums.get(i-1)==minDifferents){
                System.out.println(nums.get(i-1)+" and " + nums.get(i));
            }
        }

    }
}
