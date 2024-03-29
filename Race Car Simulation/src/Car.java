public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    // Method to start the engine of the car
    public void startEngine(){
        System.out.println("Car -> startEngine");
    }

    // Method to simulate driving the car
    public void drive(){
        System.out.println("Car -> driving, type is: " + getClass().getSimpleName());
        runEngine();
    }

    // Method to run the engine of the car (to be overridden by subclasses)
    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }
}
// Subclass representing a gas-powered car
class GasPowerCar extends Car {
    private double avgKmPerLitre;  // Average kilometers per litre
    private int cylinders = 6;  // Number of cylinders

    public GasPowerCar(String description) {
        super(description);
    }

    public GasPowerCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    // Method to start the engine of the gas-powered car
    @Override
    public void startEngine() {
        System.out.printf("Gas -> %d cylinders are fired up, ready!%n",cylinders);
    }

    // Method to run the gas engine of the car
    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}
// Subclass representing an electric car
class  ElectricCar extends Car {
    private double avgKmPerCharge;  // Average kilometers per charge
    private int batterySize;  // Battery size in kWh

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    // Method to start the engine of the electric car
    @Override
    public void startEngine() {
        System.out.printf("Battery -> %d battery is ready %n", batterySize);
    }
    // Method to run the electric engine of the car
    @Override
    protected void runEngine() {
        System.out.printf("battery exceeds the average: %.2f %n", avgKmPerCharge);
    }
}
// Subclass representing a hybrid car
class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;


    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    // Method to start the engine of the hybrid car
    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n",cylinders);
        System.out.printf("Hybrid -> switch %d KWh battery on, ready! %n", batterySize);
    }
    // Method to run the hybrid engine of the car
    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLitre);
    }
}