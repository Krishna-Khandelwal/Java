package com.servicesImpl;


import com.bean.User;
import com.exception.UserVerification;
import com.services.UserServices;

public class UserValidation implements UserServices
{
// Variables
	private User log;
	
	//	Login Services Login
//	SignUp-SinIn
	public boolean signUp(String username, String password, String secQn, String secAn)
	{
		log = new User(username, password, secQn, secAn);
		System.out.println("User Account Created Successfully");
		return true;
	}
	


	//	Login
	public boolean logIn(String username, String password) throws UserVerification
	{
		if (log.getUsername() == username)
		{
			if (log.getPassword() == password)
			{
				System.out.println("Loged In Successfully");
				return true;
			}
			else
			{
				throw new UserVerification("Invalid Password");
			}
		}
		else
		{
			throw new UserVerification("Invalid Username");
		}
	}
	
//	Forgot Password
	public boolean forgotPassword(String username, String secQn, String secAn, String updatePass) throws UserVerification
	{
		if(log.getUsername() == username && log.getSecQn() == secQn && log.getSecAn() == secAn){
			String updatedPassword = updatePass;
			log.setPassword(updatedPassword);
			System.out.println("Password Changed Successfully");
			return true;
		}
		else
		{
			throw new UserVerification("Wrong username or Wrong Sceurity Question or Wrong Security Answer");
		}
	}
	
//	Update Password
	public boolean updatePassword(String username, String currentPass, String confirmPass, String updatePassword) throws UserVerification
	{
		if(log.getUsername() == username && log.getPassword() == currentPass  && currentPass == confirmPass){
			String newPass = updatePassword;
			log.setPassword(newPass);
			System.out.println("Password Updated Succesfully");
			return true;
		}
		else
		{
			throw new UserVerification("Wrong Details");
		}
	}

}
