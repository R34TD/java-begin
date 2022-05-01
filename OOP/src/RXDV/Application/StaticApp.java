package RXDV.Application;

import static RXDV.Data.Application.PROCESSORS;
import static RXDV.Data.Constant.*;
import RXDV.Data.Country;
import RXDV.Util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,1,1,1,1));

        Country.City city = new Country.City();
        city.setName("Semarang");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
