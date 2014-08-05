package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dashboard {
	
	WebDriver driver;
	public Dashboard(WebDriver driver) {
		this.driver =driver;		
	}

	
	Actions actions = new Actions(driver);
	
	
	public Login logout() {
		WebElement logoutHoverLink = driver.findElement(By.className("css=img.avatar.avatar-32"));		
		actions.moveToElement(logoutHoverLink);
		actions.click();
			
		WebElement LogoutLink = driver.findElement(By.xpath("//*[text()='Sign Out']"));
		actions.moveToElement(LogoutLink);
		
		actions.click();
		actions.perform();
		return new Login(driver);
		
	}
	
}
