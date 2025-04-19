package vn.edu.iuh.fit.Impl;

import vn.edu.iuh.fit.Car;

public class SportsCar extends CarDecorator{

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        car.assemble(); // Lay tu BasicCar
        System.out.println("Adding features of Sports Car.");
    }
}
