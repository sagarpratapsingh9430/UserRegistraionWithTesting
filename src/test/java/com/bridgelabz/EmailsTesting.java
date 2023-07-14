package com.bridgelabz;

import org.example.com.bridgelabz.EmailValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class EmailsTesting {
    private String emailTest;
    private boolean expectedResult;

    public EmailsTesting(String email, boolean expectedResult) {
        this.emailTest = email;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
   public static Collection data(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"aabc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true},

                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},

                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},
        });
    }
@Test
    public void givenEmailAsVar_ShouldReturnAsPerTheParameterizedResult(){
    EmailValidator emailValidator = new EmailValidator();
    boolean result = emailValidator.ValidateEmailAddress(this.emailTest);
    Assert.assertEquals(this.expectedResult,result);
}
}
