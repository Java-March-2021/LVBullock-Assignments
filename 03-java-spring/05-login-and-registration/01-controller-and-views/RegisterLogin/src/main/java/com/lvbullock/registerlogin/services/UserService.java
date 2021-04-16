package com.lvbullock.registerlogin.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvbullock.registerlogin.models.User;
import com.lvbullock.registerlogin.repositories.UserRepository;

@Service
public class UserService {
	//Dependency Injection - Done so that services and repositories can talk to one another - gives us access to the database
		@Autowired
		private UserRepository userRepo;
		
		public User getById(Long id) {
			return this.userRepo.findById(id).orElse(null);
		}
		
		//Method to Register User
		public User registerUser(User user) {  //import should come from models file
			//Generate a Hash using bcrypt
			String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
			//Set the Hashed password on the users password field
			user.setPassword(hash);
			
			//Save new password along with the user to the database
			return this.userRepo.save(user);
		}

		//Authentication
		//Login Existing User
		public boolean authenticateUser(String email, String password){
			//Make sure the user logging in is who they say they are
			//Step 1:  try and query for user by email
			User user = this.userRepo.findByEmail(email);
			
			if(user == null) {
				System.out.println("The user is not registered");
				return false;
			}

			//Step 2:  Check entered email against email in database for user using BCrypt
			return BCrypt.checkpw(password, user.getPassword());
		}
		
		public User getByEmail(String email) {
			return this.userRepo.findByEmail(email);
		}
}
