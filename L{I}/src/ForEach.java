public class ForEach {
    public static void main(String[] args) {
        String [] v = {
                "AB", "AC", "AD",
                "AE", "AF", "AG"
        };
        for (var i = 1; i < v.length; i++){
            System.out.println(v[i]);
        }
        //ForEach//
        for (var value : v){
            System.out.println(value);
        }
    }
}
