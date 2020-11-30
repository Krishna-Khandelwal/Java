package com;

public class Date {
	
//	Instance Variables
	private int dd;
	private int mm;
	private int yy;
	
//	Constructs
//	Initializing Data
	public Date(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
//	Setters & Getters
	public void setDd(int dd)
	{
		this.dd = dd;
	}
	public void setMm(int mm)
	{
		this.mm = mm;
	}
	public void setYy(int yy)
	{
		this.yy = yy;
	}
	
	public int getDd()
	{
		return dd;
	}
	public int getMm()
	{
		return mm;
	}
	public int getYy()
	{
		return yy;
	}
	
//	toString
	public String toString()
	{
		return "Date is: "+dd+"/"+mm+"/"+yy;
	}
}
