package upload;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileuploadDialog {
	
	@Test
	public void main(){
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://qa.workshare.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("signup-content-form-email")).sendKeys("testingbasics500@gmail.com");
		driver.findElement(By.id("signup-content-form-email-btn-continue")).click();
		driver.findElement(By.id("signup-content-form-password")).sendKeys("Second@123");
		driver.findElement(By.id("signup-content-form-password-signin")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("app-sidebar-item-folders-link")).click();
		
		Actions ac =new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.id("files-header-addfiles"))).click().perform();
		
		//df
		driver.close();
		
		
		
	}

}
