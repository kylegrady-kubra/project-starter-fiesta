/* * * * * * * * * * * * * * * * * * * *
 * MIT License
 *
 * Copyright (c) 2020 An Anonomous Goose
 */
package project.starter.fiesta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void appHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
  }
}
