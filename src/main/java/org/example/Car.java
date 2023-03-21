package org.example;

public class Car {
    private String brand; // instance variables
    public static int numberOfTires = 4;
    protected String engine; // package-private

    private static final int MAX_NUMBER_OF_OBJECTS = 5;
    private static int objectCounter;


    public void drive() {
        System.out.println("DRIVIIIN");
    }

    public Car() {
        checkObjectNumber(objectCounter);
        objectCounter++;
    }

    public Car(String brand) {
        checkObjectNumber(objectCounter);
        this.brand = brand;
        objectCounter++;
    }

    private static void checkObjectNumber(int objectCount) { // daemon
        System.out.println(objectCount);
        if (objectCount > MAX_NUMBER_OF_OBJECTS) {
            throw new RuntimeException();
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) { // signature
        brand = brand.toUpperCase(); // body
        this.brand = brand;
    }

    public static void calculateFuelConsumption(double litres, double kilometers){
        System.out.println((litres / kilometers)*100);
    }

}
