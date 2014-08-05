package testClasses;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import pageObject.Dashboard;
import pageObject.Login;

public class NewTest {
  
	WebDriver driver;
	Login loginUser;
	Dashboard dash;
	
	private static Logger log = Logger.getLogger(NewTest.class);

	@Test
  
  public void firtTest() {
		driver = new FirefoxDriver();
		
		DOMConfigurator.configure("log4j.xml");
		
		log.info("Driver has initialized successfully");
		
		driver.get("https://wordpress.com/wp-login.php");
		
		loginUser = new Login(driver);
		
		dash = loginUser.login_successful("kuleshdeshmukh@gmail.com", "wordpress@847");
		
		try {
			
		}catch(NoSuchElementException e) {
			log.error("failure", e );
		
		}
		
		
		loginUser = dash.logout();
		
		driver.quit();
	  
  }
}
