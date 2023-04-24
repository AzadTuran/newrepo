package javaders.day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class C03_MultiDimensionalArrayIçindenArrayYazdırmak {
    public static void main(String[] args) {

        String names[][] = new String[3][2];

        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";

        //Bu arrayin tamamını yazdırmak istersek.
        System.out.println(Arrays.deepToString(names)); //[[A, K], [P, M], [C, Z]]

        //Bu array içindeki bir arrayı yazdırmak.
        System.out.println(Arrays.toString(names[1])); //[P, M]  zor olan buymuş :)

        //Bu array içindeki spesific bir karakteri çağırmak.
        //2.indexteki arrayin 1.indexteki karakterini yazdır
        System.out.println(names[2][1]); //Z

    }

}
