package org.example.com.bridgelabz;

import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_PATTERN = "[a-z]+([+-._]{0,1}[a-z0-9])*@[a-z0-9]+[.][a-z]{2,3}([.]{0,1}[a-z]{2,4})*";
    private static final String EMAIL_ADDRESS_PATTERN2 = "^[a-z]+([+-._]?[a-z0-9])*@[a-z0-9]+[.][a-z]{2,3}([.]?[a-z]{2,3})*";

    public boolean ValidateEmailAddress(String emailTest) {


        Pattern pattern= Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(emailTest).matches();


    }
}
