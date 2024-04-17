package org.design.patterns.creational.builder.vehiclebuilder.generic;

public class Vehicle {
  private String colour;
  private String fuelType;

  public Vehicle(Builder builder) {}

  public static class Builder<T extends Builder> {
    protected String colour;
    protected String fuelType;

    T self() {
      return (T) this;
    }

    public T color(String color) {
      this.colour = color;
      return self();
    }

    public T fuelType(String fuelType) {
      this.fuelType = fuelType;
      return self();
    }

    public Vehicle build() {
      return new Vehicle(this);
    }
  }
}
