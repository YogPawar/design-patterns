package org.design.patterns.creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
  UserDTOBuilder withFirstName(String firstName);

  UserDTOBuilder withLastName(String lastName);

  UserDTOBuilder withAddress(Address address);

  UserDTOBuilder withBirthday(LocalDate date);

  UserDTO build();

  UserDTO getUserDTO();
}
