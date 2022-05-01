package RXDV.Application;

import RXDV.Data.Animal;
import RXDV.Data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = " Wie";
        animal.run();
    }
}
