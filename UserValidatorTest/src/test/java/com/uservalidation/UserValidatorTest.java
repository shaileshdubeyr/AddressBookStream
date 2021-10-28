package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
   private Assertions Assert;

   @Test
   public void givenFirstNameWhenPropershouldReturnTrue() {
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.firstName("Shailesh");
      Assert.assertTrue(testStatus);
   }
}