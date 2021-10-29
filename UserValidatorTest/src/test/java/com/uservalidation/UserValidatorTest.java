package com.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest{

   @Test
   public void givenFirstNameWhenPropershouldReturnTrue() {
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.firstName("Shailesh");
      Assert.assertTrue(testStatus);
   }

   @Test
   public void givenLastNameWhenPropershouldReturnTrue() {
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.lastName("Dubey");
      Assert.assertTrue(testStatus);
   }

   @Test
   public void givenPasswordShouldReturnTrueWhenSpecialCharaterhaveAnyOne() {
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.passwordTest("Shailesh@889");
      Assert.assertTrue(testStatus);
   }

   @Test
   public void givenInputMobilenumberReturnTrueWhenSpaceAfterSpace(){
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.mobileNumber("91 7046909396");
      Assert.assertTrue(testStatus);
   }

   @Test
   public void givenEmailShouldReturnTrueWhenalltheConditionSatisfied() {
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.gmailTest("Shailesh@jvj123");
      Assert.assertTrue(testStatus);
   }
}