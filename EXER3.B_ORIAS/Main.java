// Main Class to test Inheritance
public class Main {
    public static void main(String[] args) {
        // Create objects from subclasses
        Doctor doc1 = new Doctor(201, "Dr. Villadolid", 45, "Opthalmologist");
        Nurse nurse1 = new Nurse(301, "Justhine Orias", 32, "Emergency Ward");
        Admin admin1 = new Admin(401, "Donny Dongiapon", 40, "Hospital Manager");

        // Display info
        System.out.println("Doctor Info:");
        doc1.displayInfo();
        System.out.println("\nNurse Info:");
        nurse1.displayInfo();
        System.out.println("\nAdmin Info:");
        admin1.displayInfo();
    }
}
