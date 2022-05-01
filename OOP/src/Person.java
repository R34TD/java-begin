class Person {
    String name;
    String adress;
    final String country = "JAPAN";

    Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }
    Person(String paramName){
        this(paramName, null);
    }
    Person(){
        this(null);
    }
   void sayHello(String name) {
       System.out.println("Hello " + name + ", my name is " + this.name);
   }
}
