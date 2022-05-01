package RXDV.Application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Uruha";
        first = first + " " + "Nagamiya";

        System.out.println(first);

        String second = "Uruha Nagamiya";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Uruha Nagamiya";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
