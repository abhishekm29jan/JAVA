package OOPs;
// Abstract class representing a Car
abstract class Car {
    public String name;
    public String color;
    public String type;

    // Constructor
    public Car(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void displayName();
    public abstract void displayColor();
    public abstract void displayType();
}

// Concrete subclass representing a SedanCar
class SedanCar extends Car {
    // Constructor calling the superclass constructor
    public SedanCar(String name, String color, String type) {
        super(name, color, type);
    }

    // Implementing abstract methods
    @Override
    public void displayName() {
        System.out.println("Car Name: " + super.name);
    }

    @Override
    public void displayColor() {
        System.out.println("Car Color: " + super.color);
    }

    @Override
    public void displayType() {
        System.out.println("Car Type: " + super.type);
    }
}

// Main class to demonstrate the abstraction concept
public class abstraction {
    public static void main(String[] args) {
        // Create an instance of SedanCar
        SedanCar myCar = new SedanCar("Toyota Camry", "Silver", "Sedan");

        // Display information about the car
        myCar.displayName();
        myCar.displayColor();
        myCar.displayType();
    }
}
