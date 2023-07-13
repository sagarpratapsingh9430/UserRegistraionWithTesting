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
    public void givenTextWhen_ItNotContains_FirstCapsIn_LastName_AndMinimumThreeAlphabet_ShouldReturnTrue(){
        String actual = userRegistration.validLastName("Sa");
        String expected = "Not Valid";
        Assertions.assertSame(actual,expected);
    }
}
