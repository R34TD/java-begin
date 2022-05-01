class Parent {
    String name;

    void doIt(){
     System.out.println("Do It In Parent");

    }
}
class Child extends Parent{
    String name;

    void doIt(){
        System.out.println("Do It In Child");
        System.out.println("Parent name is" +super.name);

    }
}

