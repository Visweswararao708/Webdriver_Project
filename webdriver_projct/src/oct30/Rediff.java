package oct30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://money.rediff.com/mutual-funds");
Thread.sleep(2000);
// store webtable in to webelement
WebElement webtable = driver.findElement(By.className("dataTable"));
List<WebElement> rows,cols;
// get rows collection
rows= webtable.findElements(By.tagName("tr"));
int row = rows.size()-1;
System.out.println("no of rows::"+rows);
Thread.sleep(2000);
// iterate all rows in a table
for (WebElement eachrow : rows)
{
	// get column collection from each row
	cols = eachrow.findElements(By.tagName("td"));
	// iterate each row cell
	for (WebElement eachcell : cols) 
	{
		Thread.sleep(2000);
		System.out.print("\t"+eachcell.getText());
		
	}
	System.out.println();
	System.out.println("==============================================================");
	
}
Thread.sleep(2000);
driver.quit();
	}

}
