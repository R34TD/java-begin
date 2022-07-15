package UruhaNagamiya.Classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int [] number = {
          45,34,4,46,5,34,5,2,1,32,3,5,76,7,2,4,90,24,3,4,87,67,23,42,34,23,42,34
        };

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        System.out.println(Arrays.binarySearch(number, 76));
        System.out.println(Arrays.binarySearch(number, 90));
        System.out.println(Arrays.binarySearch(number, 45));
        System.out.println(Arrays.binarySearch(number, 123));

        int[] result = Arrays.copyOf(number,7);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(number,10,20);
        System.out.println(Arrays.toString(result2));


    }
}