// Subclass: Nurse inherits from Person
public class Nurse extends Person {
    private String department;

    public Nurse(int id, String name, int age, String department) {
        super(id, name, age);
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
