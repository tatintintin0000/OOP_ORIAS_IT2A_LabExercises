// Subclass: Doctor
public class Doctor extends Staff {
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    // Polymorphic behavior
    @Override
    public void performDuty() {
        System.out.println(name + " (Doctor - " + specialization + ") is diagnosing patients.");
    }
}
