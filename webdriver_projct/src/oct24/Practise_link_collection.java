package oct24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise_link_collection {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://facebook.com");
Thread.sleep(2000);
// get collection of all links in a webpage which are stored in a html tag
List<WebElement> all_links = driver.findElements(By.tagName("a"));
System.out.println("no of lins are:::"+all_links.size());
for (WebElement each : all_links) 
{
Thread.sleep(2000);
// print each link text
System.out.println(each.getText());
// print each link url
System.out.println(each.getAttribute("href"));
}
Thread.sleep(2000);
driver.quit();
	}

}
