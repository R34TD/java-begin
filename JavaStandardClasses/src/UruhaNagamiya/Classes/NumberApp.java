package UruhaNagamiya.Classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "10.10";

        Double contohInt = Double.valueOf(contoh);
        System.out.println(contohInt);
    }
}
