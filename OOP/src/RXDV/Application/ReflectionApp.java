package RXDV.Application;

import RXDV.Data.CreateUserRequest;
import RXDV.Util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {


        CreateUserRequest request = new CreateUserRequest();

        ValidationUtil.validationReflaction(request);
    }
}
