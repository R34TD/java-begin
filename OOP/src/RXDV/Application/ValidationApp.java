package RXDV.Application;

import RXDV.Data.LoginRequest;
import RXDV.Error.ValidationException;
import RXDV.Util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) throws ValidationException {

        LoginRequest loginRequest = new LoginRequest("Asdf", "Qwerty");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");

        } catch (ValidationException | NullPointerException exception) {
            System.out.println("data tidak valid :" + exception.getMessage());
        }finally {
            System.out.println("selalu di eksekusi");
        }
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("succes");
    }
}


