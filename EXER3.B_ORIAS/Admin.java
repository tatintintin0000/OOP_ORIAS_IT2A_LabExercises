// Subclass: Admin inherits from Person
public class Admin extends Person {
    private String role;

    public Admin(int id, String name, int age, String role) {
        super(id, name, age);
        this.role = role;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + role);
    }
}
