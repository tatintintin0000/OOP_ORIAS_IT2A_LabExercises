// Subclass: Admin
public class Admin extends Staff {
    private String role;

    public Admin(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }

    // Polymorphic behavior
    @Override
    public void performDuty() {
        System.out.println(name + " (Admin - " + role + ") is managing hospital operations.");
    }
}
