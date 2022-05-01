package RXDV.Application;
import RXDV.Data.City;
import RXDV.Data.Location;

public class LocationApp {
    public static void main(String[] args){

        //var location = new Location(); // ERR

        var city = new City();
        city.name = "Japan";

        System.out.println(city.name);

    }
}
