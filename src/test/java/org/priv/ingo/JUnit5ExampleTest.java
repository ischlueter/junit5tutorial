package org.priv.ingo;

import org.junit.jupiter.api.*;

@DisplayName("JUnit 5 Example")
class JUnit5ExampleTest {
  @BeforeAll
  static void beforeAll() {
    System.out.println("Before all test methods");
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("Before each test method");
  }

  @AfterEach
  void afterEach() {
    System.out.println("After each test method");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("After all test methods");
  }

  @Test
  void justAnExample() {
    System.out.println("Test 1");
  }

  @Test
  void justAnExample2() {
    System.out.println("Test 2");
  }

  @Test
  @DisplayName("First test")
  void firstTest() {
    System.out.println("First test method");
  }

  @Test
  @DisplayName("Second test")
  void secondTest() {
    System.out.println("Second test method");
  }

}

