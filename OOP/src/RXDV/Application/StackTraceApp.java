package RXDV.Application;

public class StackTraceApp {
    public static void main(String[] args) {

        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }


    public static void sampleError(){
        try{
            String[] names = {
                    "Budi", "Santoso", "Eko"
            };
            System.out.println(names[100]);
        }catch(Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
