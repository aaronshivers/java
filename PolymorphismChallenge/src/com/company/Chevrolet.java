package com.company;

class Chevrolet extends Car {

    public Chevrolet(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " -> accelerate()");
    }

    @Override
    public void stopCar() {
        System.out.println(getClass().getSimpleName() + " -> stopCar()");
    }
}
