package com.lvbullock.registerlogin.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.lvbullock.registerlogin.models.User;
import com.lvbullock.registerlogin.repositories.UserRepository;

@Component
public class UserValidator {
	@Autowired
	private UserRepository userRepo;
	
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			errors.rejectValue("password", "Match", "PASSWORD DOES NOT MATCH!!");
		}
//		//if user not logged in, do not let in
//		if(user.id.equals(null)) {
//			errors.rejectValue("id", "Not Logged In", "INVALID ACTION -- MUST LOG IN");
//		}
		
		//make sure email is unique in the database
		if(this.userRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "Email not available!");
		}
	}
}
