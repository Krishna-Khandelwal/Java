package com.exception;

public class UserVerification  extends Exception
{
	private String msg;

	public UserVerification(String msg) 
	{
		this.msg = msg;
	}

	public String toString() 
	{
		return "Something has gone wrong [msg=" + msg + "]";
	}
}
