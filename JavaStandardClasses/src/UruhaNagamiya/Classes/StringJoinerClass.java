package UruhaNagamiya.Classes;

import java.util.StringJoiner;

public class StringJoinerClass {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner("||", "[", "]");

        joiner.add("Uruha");
        joiner.add("Nagamiya");

        String value = joiner.toString();
        System.out.println(value);
    }
}
