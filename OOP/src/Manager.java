import javax.xml.namespace.QName;

class Manager extends Employee{

    String company;

    Manager(String name){
       super(name);

    }
    Manager(String name, String company){
        super(name);
        this.company = company;

    }
    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name Is Manager " +this.name);

    }
}
class VicePresident extends Manager{

    VicePresident(String name){
         super(name);

    }
    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name Is VicePresident " +this.name);

    }
}
