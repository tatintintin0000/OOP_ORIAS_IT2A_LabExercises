// Appointment Class
public class Appointment {
    private int appointmentID;
    private Patient patient;
    private Doctor doctor;
    private String dateTime;

    public Appointment(int appointmentID, Patient patient, Doctor doctor, String dateTime) {
        this.appointmentID = appointmentID;
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
    }

    // Getters and Setters
    public int getAppointmentID() {
        return appointmentID;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        if (!dateTime.isEmpty()) {
            this.dateTime = dateTime;
        }
    }

    // Display method
    public void displayDetails() {
        System.out.println("Appointment #" + appointmentID +
                           " | Patient: " + patient.getName() +
                           " | Doctor: " + doctor.getName() +
                           " (" + doctor.getSpecialization() + ")" +
                           " | Date: " + dateTime);
    }
}
