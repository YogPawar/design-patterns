package org.design.patterns.creational.builder;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
  private String firstName;
  private String lastName;
  private LocalDate birthDay;
  private Address address;
}
