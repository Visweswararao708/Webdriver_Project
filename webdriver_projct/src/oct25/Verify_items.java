package oct25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_items {

	private static final String Expected_item = null;

	public static void main(String[] args) throws Throwable {
String Expected = "books";
boolean item_exist = false;
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://amazone.com");
Thread.sleep(4000);
// store listbox in to select class
Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
// get collection
List<WebElement> all_items = listbox.getOptions();
System.out.println("no of items are:::"+all_items.size());
for (WebElement each : all_items) 
{
String Actual_items = each.getText();
System.out.println(Actual_items);
if (Actual_items.equalsIgnoreCase(Expected))
{
	item_exist = true;
}
}
if (item_exist)
{
System.out.println(Expected_item+"      "+"item exist in listbox");
}
else 
{
	System.out.println(Expected_item+"      "+"item does exist in listbox");
	
	
}
Thread.sleep(4000);
driver.quit();
}

}
