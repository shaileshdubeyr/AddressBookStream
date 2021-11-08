package User.validation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.ParameterizedType;

public class UserValidatorTest {
    private Assertions Assert;

    @Test
    public  void givenFirstNameWhenProperShouldReturnTrue(){
       UserValidator validator =  new UserValidator();
       boolean statusOfName = validator.returnFirstNameStatus();
        Assert.assertTrue(statusOfName);
    }
}