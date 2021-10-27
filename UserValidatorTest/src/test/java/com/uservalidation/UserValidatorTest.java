package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
   private Assertions Assert;

   @Test
   public void givenPasswordShouldReturnTrueWhenSpecialCharaterhaveAnyOne(){
      UserValidator userDetails = new UserValidator();
         boolean testStatus = userDetails.gmailTest("abc+100@gamil.com");
         Assert.assertTrue(testStatus);
   }
}
