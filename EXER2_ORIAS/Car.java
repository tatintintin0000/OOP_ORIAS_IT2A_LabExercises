public class Car{
    private final String color;
    private final String plateNo;
    private final String model;

    public Car(){
        this.color = "No Color Yet.";
        this.plateNo = "No Plate Number Yet.";
        this.model = "No Model.";
    }

    public Car(String color, String plateNo, String model) {
        this.color = color;
        this.plateNo = plateNo;
        this.model = model;
    }

    public void displayInfo(){
        String info = "";
        info += "Color: " + this.color + "\n";
        info += "Plate Number: " + this.plateNo + "\n";
        info += "Model: " + this.model + "\n";
        System.out.println(info);
    }
}
