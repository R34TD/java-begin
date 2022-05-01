package RXDV.Data;

public class Innova implements Car{

    public void drive() {
        System.out.println("Innova drive");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
