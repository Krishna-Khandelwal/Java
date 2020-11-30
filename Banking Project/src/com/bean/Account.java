package com.bean;

public class Account {
	
//	Instance Variables
	private int accNo;
	private String accType;
	private float accBal;
	private static int seriesAccNo;
	public static String ifscCode;
	
//	Static Method
	static
	{
		ifscCode = "BAFH9989";
		seriesAccNo = 100;
	}
	
//	Constructs
//	Initialization
	public Account(String accType, float accBal)
	{
		this.accNo = seriesAccNo;
		seriesAccNo++;
		this.accType = accType;
		this.accBal = accBal;
		System.out.println("Data Contents are: "+accNo+"/"+accType+"/"+accBal+"/"+ifscCode);
	}
	
//	Updation of data Setters & Getters
	
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	public void setAccType(String accType)
	{
		this.accType = accType;
	}
	public void setAccBal(float accBal)
	{
		this.accBal = accBal;
	}
	
//	Getters
	
	public int getAccNo()
	{
		return accNo;
	}
	public String getAccType()
	{
		return accType;
	}
	public float getAccBal()
	{
		return accBal;
	}
	
	
// toString Method
	public String toString()
	{
		return "Account Contents are: "+accNo+"/"+accType+"/"+accBal+"/"+ifscCode;
	}
}
