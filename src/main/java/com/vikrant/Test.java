package com.vikrant;

public class Test {

	public static void main(String[] args) {
		
//		Login login = new Login();
////		login.d = new Loginbyotp();
////		login.d = new Loginbyemail();
//		login.d = new Loginbyusernamepass();
		
//		Login login = new Login(new Loginbyemail());
		Login login = new Login();
//		login.setemail(new Loginbyemail());
		login.setotp(new Loginbyotp());
		login.setup(new Loginbyusernamepass());
		
		login.login(1212);
		
	}

}
