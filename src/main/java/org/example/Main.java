package org.example;

public class Main {
    public static void main(String[] args) {
        Car car; // reference
        car = new Car();
//        car.brand = "audi____sadas"; // BAD  CODE
        car.setBrand("audi");

        Car car2 = new Car();
        car2.setBrand("Audi"); // new object

//        Car car2 = car;
//        car2.setBrand("Mercedes");
        car2.setBrand("Maserati");

        System.out.println(car.getBrand());

        System.out.println(car);
        System.out.println(car2);

        System.out.println(Car.numberOfTires);

        Car.calculateFuelConsumption(58, 316);


        // constructors
        Car car3 = new Car("Ford");
        Car car4 = new Car("Ford");
        Car car5 = new Car("Ford");
        Car car6 = new Car("Ford");
        Car car7 = new Car("Ford");


    }
}