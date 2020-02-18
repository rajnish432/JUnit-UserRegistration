import com.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration validator=new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ReturnTrue() {
        boolean result=validator.validateFirstName("Rajnish");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ReturnFalse() {
        boolean result=validator.validateFirstName("ra");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenLastName_WhenProper_ReturnTrue() {
        boolean result=validator.validateLastName("Kahar");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenLastName_WhenNotProper_ReturnFalse() {
        boolean result=validator.validateLastName("ka");
        Assert.assertEquals(false,result);
    }
}
