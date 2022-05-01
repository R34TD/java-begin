public class SwitchStatement {
    public static void main(String[] args) {
        var value = "B";

        switch (value){
            case "A":
                System.out.println("Perfect");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Pass");
                break;
            default:
                System.out.println("Wrong");

                //SwitchLambda//
                switch (value){
                    case "A" -> System.out.println("PERFECT");
                    case "B" -> System.out.println("GOOD");
                    case "C" -> System.out.println("PASS");
                    default -> {
                        System.out.println("WRONG");
                    }
                }
                //Yield//
                String speech = switch (value){
                    case "A":
                        yield "PERFECT";
                    case "B", "C":
                        yield "PASS";
                    default:
                        yield "WRONG";
                };

                System.out.println(speech);
        }
    }
}
