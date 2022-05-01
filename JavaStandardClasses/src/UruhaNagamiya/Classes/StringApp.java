package UruhaNagamiya.Classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Uruha Nagamiya";
        String nameLowercase = name.toLowerCase();//semua huruf dalam String menjadi huruf kapital
        String nameUppercase = name.toUpperCase();//semua huruf dalam String menjadi huruf kecil

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Uruha")); //pengecekan String pertama
        System.out.println(name.endsWith("Nagamiya"));//pengecekan String kedua

        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println(value);

            System.out.println(" ".isBlank());  //digunakan untuk mengecek apakah Blank (Kosong)
            System.out.println(" ".isEmpty());  //digunakan untuk mengecek apakah Empty (Kosong) bernilai false apabila String kosong dengan isi space
            System.out.println("".isEmpty());   //digunakan untuk mengecek apakah Empty (Kosong) bernilai true apabila String kosong
            System.out.println(name.charAt(0)); //digunakan mengambil jumlah karakter

            char[] chars = name.toCharArray();

        }
    }
}
