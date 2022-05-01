package UruhaNagamiya.Classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Uruha");
        builder.append(" ");
        builder.append("Nagamiya");

        String name = builder.toString();
        System.out.println(name);

    }
}
