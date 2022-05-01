package RXDV.Data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Bus drive");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "Mercedes";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
