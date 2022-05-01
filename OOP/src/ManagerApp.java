public class ManagerApp {
    public static void main(String[] args){

        var manager = new Manager("AGUS");
        manager.sayHello("BUDI");

        var vp = new VicePresident("EKO");
        vp.sayHello("YANTO");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp.toString());
        System.out.println(vp);

    }
}
