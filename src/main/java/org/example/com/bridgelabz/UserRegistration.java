package org.example.com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static String validFirstName(String name){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()){
            return "Valid";
        }else {
            return "Not Valid";
        }
    }
    public static String validLastName(String name){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()){
            return "Valid";
        }else {
            return "Not Valid";
        }
    }
    public static String validEmail(String email){
        Pattern pattern = Pattern.compile("[a-z]+([+-._]{0,1}[a-z0-9])*@[a-z0-9]+[.][a-z]{2,3}([.]{0,1}[a-z]{2,4})*");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            return "Valid";
        }else {
            return "Not Valid";
        }
    }
    public static String validMobileNumber(String number){
        Pattern pattern = Pattern.compile( "^[91]{2}\s[1-9]{9,}[0-9]+$");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()){
            return "Valid";
        }else {
            return "Not Valid";
        }
    }
    public static String validPassword(String password){
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            return "Valid";
        }else {
            return "Not Valid";
        }
    }
}
