package RXDV.Util;

import RXDV.Annotation.NotBlank;
import RXDV.Data.LoginRequest;
import RXDV.Error.BlankException;
import RXDV.Error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if (loginRequest.username() == null) {
            throw new NullPointerException("username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("password is blank");
        }
    }
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("password is blank");
        }
    }

    public static void validationReflaction(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields){
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null){
                //validate
                try{
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()){
                        throw new BlankException("Field " +field.getName()+ " is blank ");
                    }
                }catch (IllegalAccessException exception){
                    System.out.println("tidak bisa mengakses fild" +field.getName());
                }
            }
        }
    }
}
