    public class CarTester {
        public static void main(String[] args) {
            Car myCar = new Car("Pink", "12346", "Vios");

            Car yourCar = new Car("Red", "367874", "Honda Civic");

            Car momCar = new Car("White", "878463", "Toyota Fortuner");

            Car brotherCar = new Car("Black", "234567", "Nissan Navara");

            System.out.println("MY CAR:");
            myCar.displayInfo();
            System.out.println("YOUR CAR:");
            yourCar.displayInfo();
            System.out.println("MOM'S CAR:");
            momCar.displayInfo();
            System.out.println("BROTHER'S CAR:");
            brotherCar.displayInfo();
        }
    }