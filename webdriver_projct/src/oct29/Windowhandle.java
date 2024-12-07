package oct29;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Windowhandle {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/r.php");
Thread.sleep(3000);
// get parent window
String parent = driver.getWindowHandle();
System.out.println(parent);
// click three links to open in new tabs
driver.findElement(By.xpath("(//a[@id='terms-link'])[1]"));
driver.findElement(By.xpath("(//a[@id='privacy-link'])[1]"));
driver.findElement(By.linkText("Cookies Policy"));
// get collection of all windows
Set<String> allwins = driver.getWindowHandles();
System.out.println(allwins);
for (String each : allwins)
{
	// if parent id not equal to each id
	if (! parent.equals(each))
	{
		// switch to each child window
		driver.switchTo().window(each);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();	
	   }
	}
	// switch to parent
	driver.switchTo().window(parent);
	Thread.sleep(3000);
	Select yearlist = new Select(driver.findElement(By.id("year")));
	// get collection of items in year listbox
	List<WebElement> all_items = yearlist.getOptions();
	System.out.println("no of items are:::"+all_items.size());
	for (WebElement each : all_items) 
	{
	System.out.println(each.getText());
		
	}
	Thread.sleep(3000);
	driver.quit();


	}

}
