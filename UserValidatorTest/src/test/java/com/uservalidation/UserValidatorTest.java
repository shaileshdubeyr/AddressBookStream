package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
   private Assertions Assert;

   @Test
   public void givenEmailWhenShouldReturnTrue(){
      UserValidator userDetails = new UserValidator();
         boolean testStatus = userDetails.gMail("shailesh.kush@kushhfu.com.in");
         Assert.assertTrue(testStatus);
   }
}
