//	Managing the flow of the execution of the code
package com.client;
// Importing Services Code
import java.util.Scanner;

import com.Date;
import com.exception.InvalidAccountNumberException;
import com.exception.UserVerification;
import com.exception.WithdrawException;
import com.providers.BusinessObjectProvider;
import com.services.AccountServicesInterface;
import com.services.UserServices;


public class ClientCode {

	public static void main(String[] args) {
//		Instance Creation
		UserServices logServices = BusinessObjectProvider.getUserObject();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Username");
		String.username = sc.nextLine();
		
		System.out.println("Please enter Password");
		String.password = sc.nextLine();

		System.out.println("Please enter Security Question");
		String.secQn = sc.nextLine();
		
		System.out.println("Please enter security Answer");
		String.secAn = sc.nextLine();
		
//		Login Services
		logServices.signUp(username,password,secQn,secAn);
		
		try 
		{
			logServices.logIn(username,password);
			logServices.forgotPassword(username,password,secQn,secAn);
			logServices.updatePassword();
		} 
		catch (UserVerification e1) 
		{
			e1.printStackTrace();
		}
		catch(Exception e1) 
		{
			e1.printStackTrace();
		}
		finally {
			System.out.println("Finally Block"); 
		}		
		


//		Account Services Instance Creation
		AccountServicesInterface accServices = BusinessObjectProvider.getAccountObject();
		
		// Accessing Different Services
		int accNo = 0;
		String details = null ;
		float depAmount = 0 ;
		float withAmount = 0;
		float amount = 0 ;
		String ifscCode = null;
		 
		// try - catch -finally blocks
		try 
		{
			accNo = accServices.openAccount("Savings", 20000.0f, new Date(22,12,2000));
			details = accServices.displayAccountDetails(100);
			depAmount = accServices.depositAmount(100, 2000);
			withAmount = accServices.withdrawAmount(100, 2000);
			amount = accServices.balanceInquiry(100);
			ifscCode = accServices.getIfscCodeAccount(100);	
			
		}
		catch(InvalidAccountNumberException e) {
			e.printStackTrace();
		}
		catch(WithdrawException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Block"); 
		}		
		System.out.println("Successfully Created Account With Account Number:"+accNo);
		System.out.println(details);
		System.out.println("Updated Balance:"+depAmount);
		System.out.println("Updated Balance:"+withAmount);
		System.out.println("You Account has :"+amount);
		System.out.println("The Ifsc Code is :"+ifscCode);
	}
}
