package vn.edu.iuh.fit.Impl;

import vn.edu.iuh.fit.Car;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        car.assemble(); // Lay tu BasicCar
        System.out.println("Adding features of Luxury Car.");
    }
}
