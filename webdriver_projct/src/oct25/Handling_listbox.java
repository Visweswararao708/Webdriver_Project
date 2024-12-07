package oct25;

import java.nio.channels.SelectionKey;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import oct24.Listbox;

public class Handling_listbox {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https:amazone.com");
Thread.sleep(3000);
// store list box in to select class
Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
// get collection of items in listbox
List<WebElement> all_items = listbox.getOptions();
System.out.println("no of items are:::"+all_items.size());
for (WebElement each : all_items)
{
Thread.sleep(3000);
System.out.println(each.getText());
}
Thread.sleep(3000);	
driver.quit();


	}

}
