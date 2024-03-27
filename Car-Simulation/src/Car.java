public class Car {         
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    //Constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {

        //GetClass().getSimpleName returns the class name
        return getClass().getSimpleName() + " Start engine";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " Accelerate";
    }

    public String brake() {
        return getClass().getSimpleName() + " brake";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

// Subclass representing Mitsubishi car
class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

// Subclass representing Mercedes car
class Mercedes extends Car {

    public Mercedes(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

// Subclass representing Ford car
class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}