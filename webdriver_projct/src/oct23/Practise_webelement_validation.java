package oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise_webelement_validation {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		// store username in to webelement
		WebElement objuser = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		// clear text from text box
		objuser.clear();
		// send username
		objuser.sendKeys("Admin");
		// capture username value
		String username = objuser.getAttribute("value");
		System.out.println(username);
		// store password in to webelement
		WebElement objpass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		// clear text from text box
		objpass.clear();
		// send username
		objpass.sendKeys("Qedge123!@#");
		// capture password value
		String password = objpass.getAttribute("value");
		System.out.println(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		String Expected ="dashboard";
		String Actual = driver.getCurrentUrl();
		if (Actual.contains(Expected)) 
		{
		System.out.println("login sucess:::"+Expected+"    "+Actual);	
		}
		else 
		{
		// capture error message
			WebElement Errormessage = driver.findElement(By.xpath("(//span[@id='spanMessage'])[1]"));
			System.out.println(Errormessage+"     "+Expected+"    "+Actual);
			
		}
		Thread.sleep(5000);
		driver.quit();


	}

}
