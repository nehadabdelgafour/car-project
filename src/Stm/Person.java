package Stm;

public class Person {
    public String name = "ayman";
    public int age;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age =age;
    }

    public void move(){
        System.out.println("hello this" + this.name + " person move now");
    }
}
