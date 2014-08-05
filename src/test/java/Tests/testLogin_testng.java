package Tests;

import java.awt.print.Printable;

import main.source.code.subclasses.Login;

import org.testng.annotations.Test;


public class testLogin_testng {
	Login l = new Login();

  @Test
  public void verify_valid_login() {
		
		l.validLogin("namrata", "nam");
		System.out.println("valid login: success");
		//put assert
   }
  
  @Test
  public void verify_invalid_login() {
	  l.invalidLogin("abc", "");
	  System.out.println("invalid login: failed");
		//put assert
	  
  }
  
  @Test
  public void verify_invalid_login_blank() {
	  l.invalidLogin(" ", " ");
	  System.out.println("blank login: failed");
		//put assert
  }
  
  
  
  
  
  @Test
  public void verify_forgot_password() {
	  l.Forget_password("nam@gmail.com");
		//put assert
  }
  
}
