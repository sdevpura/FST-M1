package LMS_Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.findElement(By.linkText("My Account")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My Account – Alchemy LMS");
		driver.quit();
		
	}

}
