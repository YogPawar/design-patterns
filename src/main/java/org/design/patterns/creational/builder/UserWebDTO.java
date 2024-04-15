package org.design.patterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class UserWebDTO implements UserDTO {

  private final String name;
  private final String address;
  private final String age;

  public UserWebDTO(String name, String address, String age) {
    this.name = name;
    this.address = address;
    this.age = age;
  }

  @Override
  public String toString() {
    return "name=" + name + "\nage=" + age + "\naddress=" + address;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getAddress() {
    return address;
  }

  @Override
  public String getAge() {
    return age;
  }
}
