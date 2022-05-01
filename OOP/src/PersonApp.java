public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("URUHA", "TOKYO");
        // person1.country = "Japan"; //ERR

        System.out.println(person1.name);
        System.out.println(person1.adress);
        System.out.println(person1.country);

        person1.sayHello("NANAMI");

        Person person2 = new Person("NANAMI");
        Person person3;
        person3 = new Person();
        person3.name = "SHIZUKU";
        person3.sayHello("SACHI");
    }
}
