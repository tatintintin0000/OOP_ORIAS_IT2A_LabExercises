// Base Class: Staff
public class Staff {
    protected int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to be overridden (polymorphism)
    public void performDuty() {
        System.out.println(name + " is performing general staff duties.");
    }
}
