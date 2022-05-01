public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(11));
        System.out.println(factorialRecuesive(11));

        loop(1000);
    }
    static int factorialLoop(int value){
        var result = 1;
        for (var counter = 1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }
    static int factorialRecuesive(int value){
        if (value == 1){
            return 1;
        }else {
            return value * factorialRecuesive(value -1);
        }
    }
    static void loop(int value){
        if (value == 0){
            System.out.println("Finish");
        }else {
            System.out.println("loop" +value);
            loop(value -1);
        }
    }
}

