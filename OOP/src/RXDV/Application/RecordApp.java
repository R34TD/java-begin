package RXDV.Application;

import RXDV.Data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Uruha", "himitsu");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Uruha"));
        System.out.println(new LoginRequest("Uruha", "himitsu"));
    }
}
