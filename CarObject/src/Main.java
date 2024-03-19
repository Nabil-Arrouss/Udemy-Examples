public class Main {
    public static void main(String[] args) {

        // here we created an object from the car class using new keyword
        Car car = new Car();


        // setting a new value for the make, model and color variables
        car.setMake("Mercedes");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setDoors(3);
        car.setConvertible(true);

        // getting to access and retrieve data form private.
        System.out.println("make = " + car.getMake());

        System.out.println("color = " + car.getColor());
        System.out.println("doors = " + car.getDoors());
        System.out.println("model = " + car.getModel());

        car.describeCar();

        Car targa = new Car();

        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("Black");
        targa.describeCar();
    }
}
