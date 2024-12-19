public class TestFactoryPattern {
    public static void main(String[] args) {
        // Create a Hatchback and start the car-building process
        Car hatchback = CarFactory.getCar("HATCHBACK");
        System.out.println("\nBuilding Hatchback:");
        hatchback.buildCar();

        // Create a Sedan and start the car-building process
        Car sedan = CarFactory.getCar("SEDAN");
        System.out.println("\nBuilding Sedan:");
        sedan.buildCar();

        // Create an SUV and start the car-building process
        Car suv = CarFactory.getCar("SUV");
        System.out.println("\nBuilding SUV:");
        suv.buildCar();
    }
}
