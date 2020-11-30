package com.services;

import com.Date;
import com.exception.InvalidAccountNumberException;
import com.exception.WithdrawException;

public interface AccountServicesInterface 
{
	public int openAccount(String accType, float amount, Date accOpeningDate);
	public String displayAccountDetails(int accNo) throws InvalidAccountNumberException;
	public float depositAmount(int accNo,float amount) throws InvalidAccountNumberException;
	public float withdrawAmount(int accNo,float amount) throws InvalidAccountNumberException, WithdrawException ;
	public float balanceInquiry(int accNo) throws InvalidAccountNumberException;
	public String getIfscCodeAccount(int accNo) throws InvalidAccountNumberException;
}
