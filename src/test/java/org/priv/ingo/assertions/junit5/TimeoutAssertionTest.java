package org.priv.ingo.assertions.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Writing assertions for the execution time of the system under test")
class TimeoutAssertionTest {

  @Test
  @DisplayName("Should return the correct message before timeout is exceeded")
  void shouldReturnCorrectMessageBeforeTimeoutIsExceeded() {
    final String message = assertTimeout(Duration.ofMillis(50), () -> {
      Thread.sleep(20);
      return "Hello World!";
    });
    assertEquals("Hello World!", message);
  }

  @Test
  @DisplayName("Should return the correct message before timeout is exceeded 2")
  void shouldReturnCorrectMessageBeforeTimeoutIsExceeded2() {
    final String message = assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
      Thread.sleep(20);
      return "Hello World!";
    });
    assertEquals("Hello World!", message);
  }
}