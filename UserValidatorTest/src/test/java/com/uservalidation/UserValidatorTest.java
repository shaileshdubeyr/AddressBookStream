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
   public void givenEmailShouldReturnTrueWhenalltheConditionSatisfied() {
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.gmailTest("Shailesh@jvj123");
      Assert.assertTrue(testStatus);
   }

   @Test
   public void givenMessageShouldReturnSadWhenTestIsPassed(){
      MoodAnalyser mood =  new MoodAnalyser();
      String testStatus = mood.messageContainHappyReturnHappyElseSad("This is Sad message");
      Assert.assertEquals("Sad",testStatus);
   }
}