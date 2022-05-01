package UruhaNagamiya.Classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String original = "Uruha Nagamiya";

        String encode = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encode);

        byte[] bytes = Base64.getDecoder().decode(encode);
        String result = new String(bytes);

        System.out.println(result);

    }
}
