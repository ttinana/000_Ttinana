package com.ttinana.validators.bigUser;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
 
public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
 
    @Override
    public void initialize(IsValidHobby isValidHobby) { 
    	
    }
 
    @Override
    public boolean isValid(String bigUserHobby, ConstraintValidatorContext ctx) {
        
    	if(bigUserHobby == null) {
    		
            return false;
        }
        
    	if (bigUserHobby.matches("Music|Football|Cricket|Hockey")) {
    		
    		return true;
    	} else {
    		
    		return false;
    	}
    }
 
}