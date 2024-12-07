package nov1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_webtable1 {

	public static void main(String[] args) throws Throwable {
String dol = "2024-nov-20";
String temp[]=dol.split("-");
String year = temp[0];
String month=temp[1];
String date =temp[2];
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://orangehrm.qedgetech.com/");
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.name("txtUsername")).sendKeys("Qedge123!@#");
driver.findElement(By.name("Submit")).click();
Thread.sleep(2000);
// click on leave
driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
// click picker button

	}

}
