package oct24;

import java.text.BreakIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.debugger.model.BreakLocation;
import org.openqa.selenium.support.ui.Select;

import graphql.language.SelectionSet;

public class Listbox {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/r.php");
Thread.sleep(3000);
// store day,month and year in to selectclass
Select daylistbox = new Select(driver.findElement(By.id("day")));
Select monthlistbox= new Select(driver.findElement(By.id("month")));
Select yearlistbox = new Select(driver.findElement(By.id("year")));
// verify listbox single or multiselection
Boolean value =yearlistbox.isMultiple();
System.out.println(value);
//select item in the list box
daylistbox.selectByIndex(20);
Thread.sleep(3000);
monthlistbox.selectByVisibleText("jul");
Thread.sleep(3000);
yearlistbox.selectByVisibleText("2002");
Thread.sleep(3000);
daylistbox.selectByVisibleText("20");
Thread.sleep(3000);
monthlistbox.selectByIndex(5);
Thread.sleep(3000);
yearlistbox.selectByIndex(50);
Thread.sleep(3000);
driver.quit();



	}

}
