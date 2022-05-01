public class PolymorphismApp {
    public static void main(String[] args){

        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        employee = new Manager("eko");
        employee.sayHello("Budi");

        employee = new VicePresident("Eko");
        employee.sayHello("Budi");

        sayHello(new Employee("Agus"));
        sayHello(new Manager("Budi"));
        sayHello(new VicePresident("Yanto"));

    }
    static void sayHello(Employee employee){
        if  (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VicePresident " +vicePresident.name);

        }else if  (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " +manager.name);

        }else{
            System.out.println("Hello " +employee.name);

        }
    }
}
