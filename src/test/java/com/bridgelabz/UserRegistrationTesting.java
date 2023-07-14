package com.bridgelabz;

import org.example.com.bridgelabz.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserRegistrationTesting {
    static UserRegistration userRegistration;
    @BeforeAll
    public static void initiate(){
        userRegistration = new UserRegistration();
    }
    @Test
    public void givenTextWhen_ItContains_FirstCapsIn_FirstName_AndMinimumThreeAlphabet_ShouldReturnTrue(){
        String actual = userRegistration.validFirstName("Sagar");
        String expected = "Valid";
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenTextWhen_ItNot_Contains_FirstCapsIn_FirstName_AndMinimumThreeAlphabet_ShouldReturnTrue(){
        String actual = userRegistration.validFirstName("sa");
        String expected = "Not Valid";
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenTextWhen_ItContains_FirstCapsIn_LastName_AndMinimumThreeAlphabet_ShouldReturnTrue(){
        String actual = userRegistration.validLastName("Singh");
        String expected = "Valid";
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenTextWhen_ItContains_FirstSmallIn_email_AndMinimumThreeAlphabet_ShouldReturnTrue(){
        String actual = userRegistration.validLastName("Sa");
        String expected = "Not Valid";
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue(){
        String actual = userRegistration.validEmail("pratap.sagar22@gmail.com");
        String expected = "Valid";
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenEmailAddress_WhenImProper_ShouldReturnTrue(){
        String actual = userRegistration.validEmail("Sagar22@gmail.com");
        String expected = "Not Valid";
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        String actual = "Valid";
        String expected = userRegistration.validMobileNumber("91 9981234683");
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenMobileNumber_WhenImProper_ShouldReturnTrue(){
        String actual = "Not Valid";
        String expected = userRegistration.validMobileNumber("998797798");
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        String actual = "Valid";
        String expected = userRegistration.validPassword("saagghdhd");
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenPassword_WhenImProper_ShouldReturnTrue(){
        String actual = "Not Valid";
        String expected = userRegistration.validPassword("asdfsg");
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenPassword_WhenItContains_AtLeastOneCaps_AndMinimum_EightCharacters_ShouldReturnTrue(){
        String actual = "Valid";
        String expected = userRegistration.validPassword("Sagar123");
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenPassword_WhenIt_NotContains_AtLeastOneCaps_AndMinimum_EightCharacters_ShouldReturnTrue(){
        String actual = "Not Valid";
        String expected = userRegistration.validPassword("Sagar");
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenPassword_WhenItContains_AtLeastOneCaps_AndOneNumeric_AndMinimum_EightCharacters_ShouldReturnTrue(){
        String actual = "Valid";
        String expected = userRegistration.validPassword("sagaR123");
        Assertions.assertSame(actual,expected);
    }
    @Test
    public void givenPassword_WhenItNotContains_AtLeastOneCaps_AndOneNumeric_AndMinimum_EightCharacters_ShouldReturnTrue(){
        String actual = "Not Valid";
        String expected = userRegistration.validPassword("Sagar13");
        Assertions.assertSame(actual,expected);
    }
}
