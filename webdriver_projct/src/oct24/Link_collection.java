package oct24;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_collection {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("http://amazone");
Thread.sleep(3000);
// get collection of all links in a webpage which are stored in html tag
List<WebElement> all_links = driver.findElements(By.tagName("a"));
System.out.println("no of links aer:::"+all_links.size());
for(WebElement each:all_links) {
	Thread.sleep(3000);
// print each link text
	System.out.println(each.getText());
// print each link url
	System.out.println(each.getAttribute("href"));
}
Thread.sleep(3000);
driver.quit();
	}
}
