package oct28;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselection1 {

	private static int i;

	public static void main(String[] args) throws Throwable {
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/HP/Downloads/MultiListboxHtmlpage_lyst1730095636716.html");
Thread.sleep(5000);
// store listbox in to select class
Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
// verify dropdown listbox is single or multiselection
boolean value = dropdown.isMultiple();
System.out.println(value);
// count no of items in listbox
List<WebElement> all_items = dropdown.getOptions();
System.out.println("no of items are::"+all_items.size());
for(int i=0;i<all_items.size();i++);
{
	// select one by one
	Thread.sleep(2000);
	dropdown.selectByIndex(i);
}
Thread.sleep(2000);
dropdown.deselectByVisibleText("Yellow");
Thread.sleep(2000);
dropdown.deselectByIndex(5);
Thread.sleep(2000);
dropdown.deselectAll();
Thread.sleep(2000);
driver.quit();

	}

}
