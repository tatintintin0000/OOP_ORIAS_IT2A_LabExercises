public class TransportationTester {
    public static void main(String[] args) {
        //Air Transport
        Helicopter helicopter = new Helicopter();
        Airplane airplane = new Airplane();
        //Land Transport
        Car car = new Car();
        Truck truck = new Truck();
        // Water Transport
        Boat boat = new Boat();
        Yacht yacht = new Yacht();

        //Test all Transports
        Transportation[] transports = {
            helicopter, airplane,
            car, truck,
            boat, yacht
        };
        for (Transportation t: transports) {
            t.displayInfo();
            t.move();
            System.out.println();
        }
    }
}
