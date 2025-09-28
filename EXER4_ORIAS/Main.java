// Main Class to demonstrate Polymorphism
public class Main {
    public static void main(String[] args) {
        // Polymorphism in action: base class reference, different subclass objects
        Staff s1 = new Doctor(201, "Dr. Villadolid", "Opthalmologist");
        Staff s2 = new Nurse(301, "Justhine Orias", "Emergency Ward");
        Staff s3 = new Admin(401, "Donny Dongiapon", "Hospital Manager");

        // Same method call → different results (polymorphism)
        s1.performDuty();
        s2.performDuty();
        s3.performDuty();

        // Array of Staff (showing polymorphic behavior in a loop)
        Staff[] staffList = {s1, s2, s3};
        System.out.println("\n--- Staff Duty Report ---");
        for (Staff staff : staffList) {
            staff.performDuty();
        }
    }
}
