package ErolWork;

public class C10_Loops {
    /*

    Tekrarsız rakamları bir tam sayı olarak yazdırmak için bir kod yazınız
    örnek: 11223545667 --> 347

     */

    public static void main(String[] args) {
        int number = 11223545; //34

        String s = String.valueOf(number); //artık sayıyı String  yaptık
        String sh = "";

        for (int i = 0; i <s.length() ; i++) {
            String ch = s.substring(i,i+1);
            if (s.indexOf(ch)==s.lastIndexOf(ch)){
                if (!sh.contains(ch)){
                    sh+=ch;
                }
            }
        }
        System.out.println(sh);

    }
}
