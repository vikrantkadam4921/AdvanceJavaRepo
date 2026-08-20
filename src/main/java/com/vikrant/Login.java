package com.vikrant;

public class Login {

	Demo d;
	
	void setotp(Demo d)
	{
		this.d = d;
	}
	
	void setemail(Demo d)
	{
		this.d = d;
	}
	
	void setup(Demo d)
	{
		this.d = d;
	}
	
//	Login(Demo d)
//	{
//		this.d = d;
//	}
	
	public void login(int otp)
	{
		d.getlogin(otp);
		System.out.println("Login Successfully....");
	}
}
