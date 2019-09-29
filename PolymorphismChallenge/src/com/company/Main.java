package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(6, "base car");
        car.startEngine();
        car.accelerate();
        car.stopCar();

        Jeep jeep = new Jeep(4, "Wrangler");
        jeep.startEngine();
        jeep.accelerate();
        jeep.stopCar();

        Chevrolet chevrolet = new Chevrolet(4, "Colorado");
        chevrolet.startEngine();
        chevrolet.accelerate();
        chevrolet.stopCar();

        Dodge dodge = new Dodge(6, "Charger");
        dodge.startEngine();
        dodge.accelerate();
        dodge.stopCar();
    }
}

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");
    }

    public void accelerate() {
        System.out.println("Car -> accelerate()");
    }

    public void stopCar() {
        System.out.println("Car -> stopCar()");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}


