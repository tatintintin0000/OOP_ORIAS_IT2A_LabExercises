// Subclass: Nurse
public class Nurse extends Staff {
    private String department;

    public Nurse(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    // Polymorphic behavior
    @Override
    public void performDuty() {
        System.out.println(name + " (Nurse - " + department + ") is assisting in patient care.");
    }
}
