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
}
