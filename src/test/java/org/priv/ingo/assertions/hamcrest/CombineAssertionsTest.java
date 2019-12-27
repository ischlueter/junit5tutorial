package org.priv.ingo.assertions.hamcrest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.priv.ingo.Person;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anyOf;

@DisplayName("Combine multiple assertions")
class CombineAssertionsTest {

  private static final String FIRST_NAME = "Jane";
  private static final String LAST_NAME = "Doe";

  private Person person;

  @BeforeEach
  void createPerson() {
    person = new Person();
    person.setFirstName(FIRST_NAME);
    person.setLastName(LAST_NAME);
  }

  @Test
  @DisplayName("Should have the correct name")
  void shouldHaveCorrectName() {
    assertThat(person, allOf(
            hasProperty("firstName", is(FIRST_NAME)),
            hasProperty("lastName", is(LAST_NAME))
    ));
  }
  @Test
  @DisplayName("Should have correct first name or last name")
  void shouldHaveCorrectFirstNameOrLastName() {
    assertThat(person, anyOf(
            hasProperty("firstName", is(FIRST_NAME)),
            hasProperty("lastName", is(LAST_NAME))
    ));
  }
}