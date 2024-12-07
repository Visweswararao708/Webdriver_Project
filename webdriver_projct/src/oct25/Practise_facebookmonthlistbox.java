package oct25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise_facebookmonthlistbox {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/r.php");
Thread.sleep(2000);
// store listbox in to select class
Select listbox = new Select(driver.findElement(By.id("month")));
// get collection
List<WebElement> all_items = listbox.getOptions();
System.out.println("no of items are:::"+all_items.size());
for (WebElement each : all_items) 
{
Thread.sleep(2000);
System.out.println(each.getText());
}
Thread.sleep(2000);
driver.quit();
	}

}
