public class MethodVariableArgument {
    public static void main(String[] args) {
        int [] values = {93, 90, 90, 95, 92};
        sayCongrats("Uruha Nagamiya", values);
        sayCongrats("Budi Nugraha", 85, 90, 89, 86);

    }
    static void sayCongrats(String Name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total/values.length;
        if (finalValue >= 75){
            System.out.println("congrats " +Name+ ", you passed");
        }else {
            System.out.println("Sorry " +Name+ ", you didn't pass");
        }
    }
}
