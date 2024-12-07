package nov1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_calendar2 {

	public static void main(String[] args) throws Throwable {
String dob = "20/2002/july";
String temp[]= dob.split("/");
String date = temp[0];
String year= temp[1];
String month= temp[2];
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/datepicker/");
Thread.sleep(3000);
// switch to frame
driver.switchTo().frame(0);
// click date textbox
driver.findElement(By.xpath("//input[@id='datepicker']"));
Thread.sleep(3000);
// capture calyear
String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
while (!calyear.equals(year)) 
{
	// click previous button
	driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
	calyear=  driver.findElement(By.className("ui-datepicker-year")).getText();
}
// capture  cal month from calendar
String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
while (!calmonth.equalsIgnoreCase(month))
{
	// click previous button
	driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
	calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();	
}
WebElement webtable =driver.findElement(By.className("ui-datepicker-calendar"));
List<WebElement> rows,cols;
rows=webtable.findElements(By.tagName("tr"));
for (WebElement eachrow : rows) 
{
    cols=eachrow.findElements(By.tagName("td"));
    for (WebElement eachcell : cols)
    {
		if (eachcell.getText().equals(date))
		{
			Thread.sleep(3000);
			eachcell.click();
		}
	}
}



	}

}
