package org.priv.ingo.assertions.hamcrest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Write assertions for booleans")
class BooleanAssertionTest {

  @Nested
  @DisplayName("When boolean is true")
  class WhenBooleanIsTrue {

    @Test
    @DisplayName("Should be true")
    void shouldBeTrue() {
      assertThat(true, is(true));
    }
  }

  @Nested
  @DisplayName("When boolean is false")
  class WhenBooleanIsFalse {

    @Test
    @DisplayName("Should be false")
    void shouldBeFalse() {
      assertThat(false, is(false));
    }
  }
}