package UruhaNagamiya.Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {


        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("app.properties"));

            String firstName = properties.getProperty("database.firstName");
            String lastName = properties.getProperty("database.lastName");
            String userName = properties.getProperty("database.userName");
            String password = properties.getProperty("database.password");

            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(userName);
            System.out.println(password);

        }catch (FileNotFoundException exception){
            System.out.println("File Not Found");

        } catch (IOException exception) {
            System.out.println("Failed Load Data From File");

        }
        try {
            Properties properties = new Properties();
            properties.put("name.first", "Uruha");
            properties.put("name.last", "nagamiya");

            properties.store(new FileOutputStream("name.properties"), "Configuration name");

        }catch (FileNotFoundException exception){
            System.out.println("Error make file properties");

        } catch (IOException exception) {
            System.out.println("Error save file");


        }
    }
}