package org.priv.ingo.assertions.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Write assertions for booleans")
class BooleanAssertionTest {

  @Nested
  @DisplayName("When boolean is true")
  class WhenBooleanIsTrue {

    @Test
    @DisplayName("Should be true")
    void shouldBeTrue() {
      assertTrue(true);
    }
  }

  @Nested
  @DisplayName("When boolean is false")
  class WhenBooleanIsFalse {

    @Test
    @DisplayName("Should be false")
    void shouldBeFalse() {
      assertFalse(false);
    }
  }
}