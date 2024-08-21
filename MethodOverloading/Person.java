public class Person {
    private String name;
    private int age = 0;
    private String address = "None";

    Person(String name) {
        this.name = name;
    }

    Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name,int age,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public void display(){
        System.out.printf("\nName : %s\nAge : %d\nAddress : %s",name,age,address);
    }

}



