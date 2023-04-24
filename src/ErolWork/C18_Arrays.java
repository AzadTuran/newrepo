package ErolWork;

public class C18_Arrays {
    public static void main(String[] args) {
        /*
        İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.

         */
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        int count =0;

        for (String w: arr) {
            if(w.substring(0,1).equalsIgnoreCase(w.substring(w.length()-1))){
                count++;
            }


        }
        System.out.println(count);

    }
}
