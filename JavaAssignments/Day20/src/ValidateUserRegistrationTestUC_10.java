import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ValidateUserRegistrationTestUC_10 {
	  @Test
	    public void givenFirstname_when1stLetterCap_ReturnsTrue(){
	        boolean result = UserRegistration_UC10.validateFirstName("Lakhan");
	        Assert.assertEquals(true, result);
	    }
	    @Test
	    public void givenFirstname_when1stLetterSmall_ReturnsFalse(){
	        boolean result = UserRegistration_UC10.validateFirstName("lakhan");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenFirstname_whenItContainsNumber_ReturnsFalse(){
	        boolean result = UserRegistration_UC10.validateFirstName("Lakhan10");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenFirstname_whenItContainsSpecialCharacter_ReturnsFalse(){
	        boolean result = UserRegistration_UC10.validateFirstName("L@khan");
	        Assert.assertEquals(false,result);
	    }

	//  Testing for last name
	    @Test
	    public void givenLastname_when1stLetterCap_ReturnsTrue(){
	        boolean result = UserRegistration_UC10.validateLastName("Kumar");
	        Assert.assertEquals(true, result);
	    }
	    @Test
	    public void givenLastname_when1stLetterSmall_ReturnsFalse(){
	        boolean result = UserRegistration_UC10.validateLastName("kumar");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenLastname_whenItContainsNumber_ReturnsFalse(){
	        boolean result = UserRegistration_UC10.validateLastName("Kumar10");
	        Assert.assertEquals(false, result);
	    }
//	    Testing for emails
	    @Test
	    public void givenEmail_WithMandatoryParts_ReturnsTrue(){
	        boolean result = UserRegistration_UC10.validateUserEmail("lakhan@gmail.com");
	        Assert.assertEquals(true,result);
	    }
	    @Test
	    public void givenEmail_WithOptionalParts_ReturnsTrue(){
	        boolean result = UserRegistration_UC10.validateUserEmail("lakhan.bl@gmail.com.in");
	        Assert.assertEquals(true,result);
	    }
	    @Test
	    public void givenEmail_WithOutMandatoryParts_ReturnsFalse(){
	        boolean result = UserRegistration_UC10.validateUserEmail("lakhan@.com");
	        Assert.assertEquals(false,result);
	    }

	    //Testing for phone number
	    @Test
	    public void givenPhoneNumber_WithCountryCodeAndSpace_ReturnsTrue(){
	    boolean result = UserRegistration_UC10.validatePhoneNumber("91 1234567891");
	    Assert.assertEquals(true,result);
	    }
	    @Test
	    public void givenPhoneNumber_WithoutCountryCodeAndSpace_ReturnsFalse(){
	        boolean result = UserRegistration_UC10.validatePhoneNumber("1234567891");
	        Assert.assertEquals(false,result);
	    }
	    @Test
	    public void givenPhoneNumber_WithAlphabet_ReturnsFalse(){
	        boolean result = UserRegistration_UC10.validatePhoneNumber("91 12A4567891");
	        Assert.assertEquals(false,result);
	    }
//	    Testing for password
	    @Test
	    public void giverPassword_WithMinimumLengthOf8_returnsTrue(){
	        boolean result = UserRegistration_UC10.validatePassword("L@65kha14");
	        Assert.assertEquals(true,result);
	    }
	    @Test
	    public void giverPassword_WithoutMinimumLengthOf8_returnsFalse(){
	        boolean result = UserRegistration_UC10.validatePassword("l@65kh");
	        Assert.assertEquals(false,result);
	    }
	    @Test
	    public void giverPassword_WithSpecialCharacter_returnsFalse(){
	        boolean result = UserRegistration_UC10.validatePassword("l@65kha14");
	        Assert.assertEquals(false,result);
	    }
}
