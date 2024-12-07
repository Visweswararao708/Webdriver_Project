package nov5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Impicitandexpicit {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
// create object for class
WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(100));
// wait untill create new account link is cickable
mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
driver.findElement(By.linkText("Create new account")).click();
// wait untill  firstname testbox is visible
mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("firstname")));
driver.findElement(By.name("firstname")).sendKeys("testing");

	}

}
