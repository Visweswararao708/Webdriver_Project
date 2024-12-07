package oct25;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise_facebookdaylistbox {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/r.php");
Thread.sleep(4000);
// store listbox in to select class
Select listbox = new Select(driver.findElement(By.id("day")));
// get collection
List<WebElement> all_items = listbox.getOptions();
System.out.println("no of items are:::"+all_items.size());
for (WebElement each : all_items)
{
Thread.sleep(4000);
System.out.println(each.getText());
}
Thread.sleep(5000);
driver.quit();

	}

}
