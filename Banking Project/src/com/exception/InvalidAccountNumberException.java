package com.exception;

public class InvalidAccountNumberException extends Exception
{
	private String msg;

	public InvalidAccountNumberException(String msg) 
	{
		this.msg = msg;
	}

	public String toString() 
	{
		return "Something has gone wrong [msg=" + msg + "]";
	}
}
