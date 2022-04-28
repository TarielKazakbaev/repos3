package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.price=50000;
        car.color="red";
        car.weight=2500;
        car.placeOfCreate="italy";
        car.nameOfCar="Bugatti";
        System.out.println(car.nameOfCar+car.color+car.placeOfCreate+car.price+car.weight);
    }
}
