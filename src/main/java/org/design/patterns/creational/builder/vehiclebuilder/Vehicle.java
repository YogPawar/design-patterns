package org.design.patterns.creational.builder.vehiclebuilder;

public class Vehicle {
  private final String colour;
  private final String fuelType;

  public Vehicle(VehicleBuilder builder) {
    this.colour = builder.colour;
    this.fuelType = builder.fuelType;
  }

  public static class VehicleBuilder {

    protected String colour;
    protected String fuelType;

    public VehicleBuilder fuelType(String fuelType) {
      this.fuelType = fuelType;
      return this;
    }

    public VehicleBuilder colour(String colour) {
      this.colour = colour;
      return this;
    }

    public Vehicle build() {
      return new Vehicle(this);
    }
  }
}
