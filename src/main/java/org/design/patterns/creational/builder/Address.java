package org.design.patterns.creational.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
  private String houseNumber;

  private String street;

  private String city;

  private String zipcode;

  private String state;
}
