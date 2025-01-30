package practice.extends1.overriding;

import practice.extends1.overriding.ElectricCar;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
