package vn.edu.iuh.fit;

import vn.edu.iuh.fit.Impl.BasicCar;
import vn.edu.iuh.fit.Impl.LuxuryCar;
import vn.edu.iuh.fit.Impl.SportsCar;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("-----");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}