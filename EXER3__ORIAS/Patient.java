// Patient Class
public class Patient {
    private int patientID;
    private String name;
    private int age;

    public Patient(int patientID, String name, int age) {
        this.patientID = patientID;
        this.name = name;
        setAge(age); // use setter for validation
    }

    // Getters and Setters
    public int getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}
