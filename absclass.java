abstract class Vehicle {
     String vehicleType;
     String model;
     int year;

   
    public Vehicle(String model, int year) {
        this.vehicleType = "none";
        this.model = model;
        this.year = year;
    }

    public abstract void start();
}


class Car extends Vehicle {
    public String fuelType;

    
    public Car(String model, int year) {
        super(model, year);
        this.fuelType = "none";
    }

    public Car(String model, int year, String fuelType) {
        super(model, year);
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        System.out.println("Starting the car engine.");
    }
}

class Bicycle extends Vehicle {
    int gearCount;


    public Bicycle(String model, int year) {
        super(model, year);
        this.gearCount = 1; 
    }

    public Bicycle(String model, int year, int gearCount) {
        super(model, year);
        this.gearCount = gearCount;
    }
    
    @Override
    public void start() {
        System.out.println("Pedaling the bicycle.");
    }
}

public class absclass {
    public static void main(String[] args) {
        Car car1 = new Car("creta", 2022);
        Car car2 = new Car("SUV500", 2021, "Gasoline");
        Bicycle bicycle1 = new Bicycle("hondacity", 2023);
        Bicycle bicycle2 = new Bicycle("harley davidson", 2019, 30);
        Vehicle[] vehicles = {car1, car2, bicycle1, bicycle2};
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.vehicleType);
            System.out.println("Model: " + vehicle.model);
            System.out.println("Year: " + vehicle.year);
            vehicle.start();
            System.out.println();
        }
    }
}
