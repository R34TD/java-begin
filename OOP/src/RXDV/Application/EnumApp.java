package RXDV.Application;

import RXDV.Data.Customer;
import RXDV.Data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setName("Nanami");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelname = Level.VIP.name();
        System.out.println(levelname);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);


        System.out.println("print level");
        Level[] levels = Level.values();
        for (var value : Level.values()){
            System.out.println(value);

        }
    }
}
