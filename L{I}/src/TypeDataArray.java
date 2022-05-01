public class TypeDataArray {
    public static void main(String[] args) {

        String [] StringArray;
        StringArray = new String[2];
        StringArray[0] = "Eko";
        StringArray[1] = "Cahyadi";

        System.out.println(StringArray[0]);
        System.out.println(StringArray[1]);

        int[] arrayint = new int[]{
                    10,13,14,15,16
        };
        long[] arraaylong = {
          11,12,13,14,15
        };
        System.out.println(arraaylong.length);

        String [][] members ={
                {"Eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
