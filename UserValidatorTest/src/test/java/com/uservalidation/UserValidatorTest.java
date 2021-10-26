package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
   private Assertions Assert;

   @Test
   public void givenNumberWhenShouldReturnTrue(){
      UserValidator userDetails = new UserValidator();
         boolean testStatus = userDetails.mobileNumber("91 7046909396");
         Assert.assertTrue(testStatus);
   }
}
