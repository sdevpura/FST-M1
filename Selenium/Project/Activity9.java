package LMS_Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity9 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/lms");
	driver.findElement(By.linkText("My Account")).click();
	Thread.sleep(60);
	driver.findElement(By.xpath("//a[@href='#login']")).click();
	Thread.sleep(60);

	driver.findElement(By.id("user_login")).sendKeys("root");
	driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	driver.findElement(By.id("wp-submit")).click();
	driver.findElement(By.linkText("All Courses")).click();
	
	driver.findElement(By.cssSelector("article#post-69")).click();
	Thread.sleep(60);

	driver.findElement(By.xpath("//html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]/div[1]/a/div[2]")).click();
	Thread.sleep(60);
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Developing Strategy – Alchemy LMS");
	
	driver.quit();
	}
}
	
