package oct28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselection2 {

	public static void main(String[] args) throws Throwable {
	String Expected = "White";
	boolean item_exist = false;
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/HP/Downloads/MultiListboxHtmlpage_lyst1730095636716.html");
	Thread.sleep(4000);
	// store listbox in to select class
	Select listbox = new Select(driver.findElement(By.name("multiSelection")));
	// count items in listbox
	List<WebElement> all_items = listbox.getOptions();
	System.out.println("no of items are::"+all_items.size());
	for (WebElement each : all_items) 
	{
	  // get each item text
		String Actual = each.getText();
		 Thread.sleep(200);
		 System.out.println(Actual);
		 if (Actual.equalsIgnoreCase(Expected))
		 {
			item_exist = true;
			break;
		}
	}
	if (item_exist)
	{
		System.out.println(Expected+"    "+"item found in list box");
	}
	else
	{
		System.out.println(Expected+"    "+"item not found in list box");
		
	}
	Thread.sleep(4000);
	driver.quit();
	}

}
