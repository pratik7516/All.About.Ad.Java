package com.cdac.valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.dto.User;

@Service
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName","unmKey", "user name required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPass", "passKey","password required");
		
		User user = (User)target;
		if(user.getUserPass()!=null) {
			if(user.getUserPass().length()<3) { 
				errors.rejectValue("userPass", "passKey", "password should contain more 2 chars");
			}
		}
		
		
	}
	
}
