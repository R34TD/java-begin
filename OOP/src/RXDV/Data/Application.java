package RXDV.Data;

public class Application {

    public static final int PROCESSORS;
    static {
        System.out.println("mengakses class application");

    PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
