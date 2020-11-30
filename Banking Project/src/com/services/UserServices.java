package com.services;

import com.exception.UserVerification;


public interface UserServices {
	boolean signUp(String username, String password, String secQn, String secAn);
	boolean logIn(String username, String password) throws UserVerification;
	boolean forgotPassword(String username, String secQn, String secAn, String updatePass) throws UserVerification;
	boolean updatePassword(String username, String currentPass, String confirmPass, String updatePassword) throws UserVerification;
}
