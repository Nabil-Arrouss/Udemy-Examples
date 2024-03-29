public class Main {
    public static void main(String[] args) {

        // Creating a new instance of Car representing a Ferrari
        Car car = new Car("2022 Red Ferrari 296 GTS");
        runRace(car);

        // Creating a new instance of GasPowerCar representing another Ferrari
        Car ferrari = new GasPowerCar("2022 Red Ferrari 296 GTS", 15.4,6);
        runRace(ferrari);

        // Creating a new instance of ElectricCar representing a Tesla
        Car tesla = new ElectricCar("Tesla model 3", 568,75);
        runRace(tesla);

        // Creating a new instance of HybridCar representing a hybrid Ferrari
        Car ferrariHybrid = new HybridCar("Ferrari Hybrid", 16,8,8);

        // Running the race with the hybrid Ferrari
        runRace(ferrariHybrid);

    }
    // Method to simulate a race for a given car
    public static void runRace(Car car) {
        // Starting the engine of the car
        car.startEngine();

        // Driving the car
        car.drive();
    }
}