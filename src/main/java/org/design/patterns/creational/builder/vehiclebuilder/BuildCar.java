package org.design.patterns.creational.builder.vehiclebuilder;

import org.design.patterns.creational.builder.vehiclebuilder.Car.CarBuilder;

public class BuildCar {
  public static void main(String[] args) {

    CarBuilder carBuilder = new CarBuilder();
    Car car = carBuilder.make("ford").model("figo").colour("red").fuelType("petrol").build();
  }
}
