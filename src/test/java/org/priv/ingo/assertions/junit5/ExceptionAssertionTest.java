package org.priv.ingo.assertions.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Writing assertions for exceptions")
class ExceptionAssertionTest {

  @Test
  @DisplayName("Should throw the correct exception")
  void shouldThrowCorrectException() {
    assertThrows(
            NullPointerException.class,
            () -> { throw new NullPointerException(); }
    );
  }

  @Test
  @DisplayName("Should throw an exception that has the correct message")
  void shouldThrowAnExceptionWithCorrectMessage() {
    final NullPointerException thrown = assertThrows(
            NullPointerException.class,
            () -> { throw new NullPointerException("Hello World!"); }
    );
    assertEquals("Hello World!", thrown.getMessage());
  }

  @Test
  @DisplayName("Should not throw an exception")
  void shouldNotThrowException() {
    assertDoesNotThrow(() -> {});
  }

  @Test
  @DisplayName("Should not throw an exception2")
  void shouldNotThrowException2() {
    String message = assertDoesNotThrow(() -> "Hello World!");
    assertEquals("Hello World!", message);
  }


}