// Doctor Class
public class Doctor {
    private int doctorID;
    private String name;
    private String specialization;

    public Doctor(int doctorID, String name, String specialization) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialization = specialization;
    }

    // Getters and Setters
    public int getDoctorID() {
        return doctorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (!specialization.isEmpty()) {
            this.specialization = specialization;
        }
    }
}
