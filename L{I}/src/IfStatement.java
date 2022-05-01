public class IfStatement {
    public static void main(String[] args) {
        int Value1 = 32;
        int Value2 = 99;

        if (Value1 >= 70 && Value2 >= 75) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        if (Value1 >= 90 && Value2 >= 90) {
            System.out.println("YourPredicateIs A");
        } else if (Value1 >= 80 && Value2 >= 80) {
            System.out.println("YourPredicateIs B");
        } else if (Value1 >= 70 && Value2 >= 70){
            System.out.println("YourPredicateIs C");
        } else if (Value1 >= 60 && Value2 >= 60){
            System.out.println("YourPredicateIs D");
        } else if (Value1 >= 50 && Value2 >= 50){
            System.out.println("YourPredicateIs E");
        } else {
            System.out.println("YourPredicateIs F");
        }
    }
}
