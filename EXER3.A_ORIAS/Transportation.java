// Parent Class
class Transportation {
    String name;
    int capacity;
    public Transportation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public void move() {
        System.out.println(name + " is moving.");
    }
    public void displayInfo() {
        System.out.println("Transport: " + name + ", Capacity: " + capacity);
    }
}
// Child Class: Air Transport
class AirTransport extends Transportation {
    public AirTransport (String name, int capacity) {
        super(name, capacity);
    }
    @Override
    public void move() {
        System.out.println(name + "is flying.");
    }
}
// Air Transport Subclass: Helicopter
class Helicopter extends AirTransport {
    public Helicopter() {
        super("Helicopter", 6);
    }
}
// Air Transport Subclass: Airplane
class Airplane extends AirTransport {
    public Airplane() {
        super ("Airplane", 200);
    }
}
//Child Class: Land Transport
class LandTransport extends Transportation {
    public LandTransport(String name, int capacity) {
        super(name, capacity);
    }
    @Override
    public void move() {
        System.out.println(name + " is driving.");
    }
}
// Land Transport Subclass: Car
class Car extends LandTransport {
    public Car() {
        super("Car", 10);
    }
}
//Land Transport Subclass: Truck
class Truck extends LandTransport {
    public Truck() {
        super("Truck", 5);
    }
}


//Child Class: Water Transport
class WaterTransport extends Transportation {
    public WaterTransport(String name, int capacity) {
        super(name, capacity);
    }
    @Override
    public void move() {
        System.out.println(name + " is sailing.");
    }
}
//Water Transport Subclass: Boat
class Boat extends WaterTransport {
    public Boat() {
        super("Boat", 30);
    }
}
//Water Transport Subclass: Yacht
class Yacht extends WaterTransport {
    public Yacht() {
        super("Yacht", 20);
    }
}
