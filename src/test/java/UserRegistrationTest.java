import com.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ReturnTrue() {
        UserRegistration validator=new UserRegistration();
        boolean result=validator.validateFirstName("Rajnish");
        Assert.assertEquals(true,result);
    }
}
