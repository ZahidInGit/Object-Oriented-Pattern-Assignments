abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void start();
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(this.brand + " car engine starts: Vroom!");
    }
}

class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(this.brand + " bike is ready to pedal.");
    }
}
