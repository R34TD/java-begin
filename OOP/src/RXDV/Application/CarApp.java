package RXDV.Application;

import RXDV.Data.Car;
import RXDV.Data.Innova;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Innova();

        System.out.println(car.getTire());
        car.drive();
    }
}
