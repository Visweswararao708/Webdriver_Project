package oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_navigationmethods {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://google.com");
Thread.sleep(5000);
System.out.println("pagetitle[1]"+driver.getTitle());
// click to gamail link
driver.findElement(By.linkText("Gmail")).click();
System.out.println("psgetitle[2]"+driver.getTitle());
Thread.sleep(3000);
//click back button
driver.navigate().back();
System.out.println("psgetitle[3]"+driver.getTitle());
Thread.sleep(3000);
// click forward button
driver.navigate().forward();
System.out.println("psgetitle[4]"+driver.getTitle());
Thread.sleep(3000);
// reload page
driver.navigate().refresh();
Thread.sleep(3000);
driver.quit();
	}

}
