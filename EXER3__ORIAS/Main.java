// Main Class to Test Encapsulation
public class Main {
    public static void main(String[] args) {
        // Create patient and doctor
        Patient p1 = new Patient(01, "Marienela Gonzales", 18);
        Doctor d1 = new Doctor(01, "Dr. Villadolid", "Opthalmologist");

        // Create appointment
        Appointment appt1 = new Appointment(301, p1, d1, "2025-09-28 10:00 AM");

        // Display details
        appt1.displayDetails();

        // Test encapsulation: update age with invalid value
        p1.setAge(-5); // should print error
        System.out.println("Patient Age: " + p1.getAge());
    }
}
