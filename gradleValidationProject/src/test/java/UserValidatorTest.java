import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    private Assertions Assert;
    @Test
    public void userTest(){
        UserDetails userDetails = new UserDetails();
        boolean testStatus = userDetails.password();
        Assert.assertTrue(testStatus);
     }
}
