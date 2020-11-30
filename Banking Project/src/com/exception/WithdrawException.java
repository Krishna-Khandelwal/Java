package com.exception;

public class WithdrawException extends Exception
{
	private String msg;

	public WithdrawException(String msg) 
	{
		this.msg = msg;
	}

	public String toString() 
	{
		return "Something has gone wrong [msg=" + msg + "]";
	}
	
}

