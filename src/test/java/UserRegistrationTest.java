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

    @Test
    public void givenEmailID_WhenProper_ReturnTrue() {
        boolean result=validator.validateEmailID("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmailID_WhenNotProper_ReturnFalse() {
        boolean result=validator.validateEmailID("abc.@bl.co.in");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ReturnTrue() {
        boolean result=validator.validatePhoneNumber("91 9987939628");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ReturnFalse() {
        boolean result=validator.validatePhoneNumber("91 0987939628");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPassword_WhenProper_ReturnTrue() {
        boolean result=validator.validatePassword("rajnish432");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPassword_WhenNotProper_ReturnFalse() {
        boolean result=validator.validatePassword("rajnish");
        Assert.assertEquals(false,result);
    }
}
