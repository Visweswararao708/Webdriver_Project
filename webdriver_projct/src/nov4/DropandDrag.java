package nov4;

import javax.swing.plaf.ActionMapUIResource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDrag {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/droppable/");
Thread.sleep(4000);
Actions ac = new Actions(driver);
// switch to frame
WebElement source = driver.findElement(By.id("draggable"));
WebElement target = driver.findElement(By.id("droppable"));
ac.dragAndDrop(source, target).build().perform();


	}

}
