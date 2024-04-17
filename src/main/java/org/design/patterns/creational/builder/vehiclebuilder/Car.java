package org.design.patterns.creational.builder.vehiclebuilder;

import javax.swing.TransferHandler;

public class Car extends Vehicle {
  private final String make;
  private final String model;

  public Car(CarBuilder builder) {
    super(builder);
    this.make = builder.make;
    this.model = builder.model;
  }

  public static class CarBuilder extends VehicleBuilder {
    protected String make;
    protected String model;

    @Override
    public CarBuilder colour(String colour) {
      this.colour = colour;
      return this;
    }

    @Override
    public CarBuilder fuelType(String fuelType) {
      this.fuelType = fuelType;
      return this;
    }

    public CarBuilder model(String model) {
      this.model = model;
      return this;
    }

    public CarBuilder make(String make) {
      this.make = make;
      return this;
    }

    public Car build() {
      return new Car(this);
    }
  }
}
