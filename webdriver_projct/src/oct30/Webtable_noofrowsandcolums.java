package oct30;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_noofrowsandcolums {

	private static int i;

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://money.rediff.com/mutual-funds");
Thread.sleep(4000);
// store webtable in to webelement
WebElement webtable = driver.findElement(By.className("dataTable"));
// get collection of rows
List<WebElement> rows = webtable.findElements(By.tagName("tr"));
System.out.println("no of rows are:::"+rows.size());
// iterate all rows
for(int i=1;i<rows.size();i++);
{
	// get column collectiom from each row
	List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
	System.out.println("Row no."+i+"   "+"column no."+cols.size());
}
driver.quit();

}

}
