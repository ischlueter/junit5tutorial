package org.priv.ingo.assertions.hamcrest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.hasEntry;

@DisplayName("Writing assertions for maps")
class MapAssertionTest {

  private static final String KEY = "key";
  private static final String VALUE = "value";

  private Map<String, String> map;

  @BeforeEach
  void createAndInitializeMap() {
    map = new HashMap<>();
    map.put(KEY, VALUE);
  }

  @Nested
  @DisplayName("When we check if the map contains the given key")
  class WhenWeCheckIfMapContainsGivenKey {

    @Test
    @DisplayName("Should contain the correct key")
    void shouldContainCorrectKey() {
      assertThat(map, hasKey(KEY));
    }
  }
  @Nested
  @DisplayName("When we check if the map contains the given key2")
  class WhenWeCheckIfMapContainsGivenKey2 {
    private static final String INCORRECT_KEY = "incorrectKey";
    @Test
    @DisplayName("Should not contain the incorrect key")
    void shouldNotContainIncorrectKey() {
      assertThat(map, not(hasKey(INCORRECT_KEY)));
    }
  }
  @Nested
  @DisplayName("When we check if the map contains the correct value")
  class WhenWeCheckIfMapContainsCorrectValue {

    @Test
    @DisplayName("Should contain the correct value")
    void shouldContainCorrectValue() {
      assertThat(map, hasEntry(KEY, VALUE));
    }
  }
}