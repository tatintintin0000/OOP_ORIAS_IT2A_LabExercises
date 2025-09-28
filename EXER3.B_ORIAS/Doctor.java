// Subclass: Doctor inherits from Person
public class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, int age, String specialization) {
        super(id, name, age); // call Person constructor
        this.specialization = specialization;
    }

    public void displayInfo() {
        super.displayInfo(); // reuse parent method
        System.out.println("Specialization: " + specialization);
    }
}
