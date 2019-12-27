package org.priv.ingo.assertions.hamcrest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.is;

@DisplayName("Writing assertions for lists")
class ListAssertionTest {

  @Nested
  @DisplayName("When we write assertions for elements")
  class WhenWeWriteAssertionsForElements {

    private Object first;
    private Object second;

    private List<Object> list;

    @BeforeEach
    void createAndInitializeList() {
      first = new Object();
      second = new Object();

      list = Arrays.asList(first, second);
    }

    @Test
    @DisplayName("Should contain two elements")
    void shouldContainTwoElements() {
      assertThat(list, hasSize(2));
    }
  }
  @Nested
  @DisplayName("When we write assertions for elements2")
  class WhenWeWriteAssertionsForElements2 {

    private Object first;
    private Object second;

    private List<Object> list;

    @BeforeEach
    void createAndInitializeList() {
      first = new Object();
      second = new Object();

      list = Arrays.asList(first, second);
    }

    @Test
    @DisplayName("Should contain the correct elements in the given order")
    void shouldContainCorrectElementsInGivenOrder() {
      assertThat(list, contains(first, second));
    }
  }
  @Nested
  @DisplayName("When we write assertions for elements 3")
  class WhenWeWriteAssertionsForElements3 {

    private Object first;
    private Object second;

    private List<Object> list;

    @BeforeEach
    void createAndInitializeList() {
      first = new Object();
      second = new Object();

      list = Arrays.asList(first, second);
    }

    @Test
    @DisplayName("Should contain the correct elements in any order")
    void shouldContainCorrectElementsInAnyOrder() {
      assertThat(list, containsInAnyOrder(second, first));
    }
  }
  @Nested
  @DisplayName("When we write assertions for elements 4")
  class WhenWeWriteAssertionsForElements4 {

    private Object first;
    private Object second;

    private List<Object> list;

    @BeforeEach
    void createAndInitializeList() {
      first = new Object();
      second = new Object();

      list = Arrays.asList(first, second);
    }

    @Test
    @DisplayName("Should contain a correct element")
    void shouldContainCorrectElement() {
      assertThat(list, hasItem(first));
    }
  }
  @Nested
  @DisplayName("When we write assertions for elements 5")
  class WhenWeWriteAssertionsForElements5 {

    private Object first;
    private Object second;

    private List<Object> list;

    @BeforeEach
    void createAndInitializeList() {
      first = new Object();
      second = new Object();

      list = Arrays.asList(first, second);
    }

    @Test
    @DisplayName("Should not contain an incorrect element")
    void shouldNotContainIncorrectElement() {
      assertThat(list, not(hasItem(new Object())));
    }
  }
  @Nested
  @DisplayName("When we compare two lists")
  class WhenWeCompareTwoLists {

    private final List<Integer> ACTUAL = Arrays.asList(1, 2, 3);
    private final List<Integer> EXPECTED = Arrays.asList(1, 2, 3);

    @Test
    @DisplayName("Should contain the same elements")
    void shouldContainSameElements() {
      assertThat(ACTUAL, is(EXPECTED));
    }
  }
}