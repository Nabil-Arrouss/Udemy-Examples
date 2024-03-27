public class Main {
    public static void main(String[] args) {

	// Create an instance of Car class and demonstrate its functionality
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

	// Create an instance of Mitsubishi class and demonstrate its functionality
        Mitsubishi mitsubishi = new Mitsubishi(6, "Montero 3500 V12");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

	// Create an instance of Ford class and demonstrate its functionality
        Ford ford = new Ford(8, "Mustang");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
	
	// Create an instance of Mercedes class and demonstrate its functionality
        Mercedes mercedes = new Mercedes(6, "Mercedes G-Class AMG-63");
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());

    }
}
