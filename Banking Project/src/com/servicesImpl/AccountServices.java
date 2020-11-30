//	Holding Business Logic
package com.servicesImpl;
//Importing Account class
import com.bean.Account;
import com.exception.InvalidAccountNumberException;
import com.exception.WithdrawException;
import com.services.AccountServicesInterface;

//Importing Date Class
import com.Date;

public class AccountServices implements AccountServicesInterface 
{
	
// InitialiZing Account
	private Account acc;
	private Date accOpeningDate;
	
//	ifscCode
	public String getIfscCodeAccount(int accNo) throws InvalidAccountNumberException 
	{
		String ifsc = null;
		 if(acc.getAccNo()==accNo) {
			 ifsc =Account.ifscCode;
		}
		else {
			throw new InvalidAccountNumberException("Invalid Account No");	
		}
		return ifsc ;	
	}
	
//	Business Logics
//	Open account Method
	public int openAccount(String accType, float amount,Date accOpeningDate)
	{
		this.accOpeningDate = accOpeningDate;
		acc = new Account(accType, amount);
		return acc.getAccNo();
	}

//	Deposit Method
	public float depositAmount(int accNo, float amount) throws InvalidAccountNumberException
	{
		float bal = acc.getAccBal();
		if (acc.getAccNo() == accNo){
			bal = acc.getAccBal()+amount;
			acc.setAccBal(bal);
			System.out.println("Depositing...."+amount);
		}else{
			amount = 0.0f;
			throw new InvalidAccountNumberException ("Invalid Account Number!!");
		}
		return bal;
	}
	
//	WithDrawal Method
	public float withdrawAmount(int accNo, float amount) throws InvalidAccountNumberException,WithdrawException
	{
		float bal = acc.getAccBal();
		if (acc.getAccNo() == accNo)
		{
			if(acc.getAccBal()<amount)
			{
				throw new WithdrawException("Can't Process Balance is low!!");
			}
			else
			{
				bal = acc.getAccBal()-amount;
				acc.setAccBal(bal);
				System.out.println("Withdrawing...."+amount);
			}
		}
		else
		{
			amount = 0.0f;
			throw new InvalidAccountNumberException ("Invalid Account Number");
		}
		return bal;
	}
	

//	Balance Inquiry
	public float balanceInquiry(int accNo) throws InvalidAccountNumberException
	{
		float balInfo = 0.0f;
		if (acc.getAccNo() == accNo)
		{
			balInfo = acc.getAccBal();
		}
		else
		{
			throw new InvalidAccountNumberException ("Invalid Account Number");
		}
		return balInfo;
	}
	
//	Display Account Details
	public String displayAccountDetails(int accNo) throws InvalidAccountNumberException
	{
		String details = null;
		if(acc.getAccNo() == accNo){
			details = acc.toString();
		}else{
			throw new InvalidAccountNumberException ("Invalid Account Number");
		}
		return details+"/"+"Account Opening "+accOpeningDate;
	}
}
