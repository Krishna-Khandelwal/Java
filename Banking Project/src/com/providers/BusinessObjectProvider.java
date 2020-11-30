package com.providers;

import java.io.FileInputStream;
import java.util.Properties;

import com.services.AccountServicesInterface;
import com.services.UserServices;
import com.servicesImpl.AccountServices;
import com.servicesImpl.UserValidation;

public class BusinessObjectProvider 
{
	public static UserServices getUserObject()
	{
		UserServices s = null;
		try
		{
			FileInputStream fis = new FileInputStream(".//Resources//info.properties");
			Properties prop = new Properties();
			prop.load(fis);
			String userClass = prop.getProperty("userBusiness");
			
//			Instance
			s = (UserServices) Class.forName(userClass).newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}
	
	public static AccountServicesInterface getAccountObject()
	{
		return new AccountServices();
	}
}
