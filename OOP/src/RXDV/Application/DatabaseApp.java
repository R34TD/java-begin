package RXDV.Application;

import RXDV.Error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        coonnectDatabase("Asdf", null);
        System.out.println("sukses");
    }
    public static void coonnectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("tidak bisa konek ke database");
        }
    }
}
