// Base Class: Person
public class Person {
    protected int id;          // accessible by subclasses
    protected String name;
    protected int age;

    // Constructor
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Common method
    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
    }
}