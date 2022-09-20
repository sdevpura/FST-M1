package LMS_Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String boxInfo=driver.findElement(By.xpath("//div[@id='uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810']/div/div/div/div[2]/h3")).getText();
		System.out.println(boxInfo);
		Assert.assertEquals(boxInfo, "Actionable Training");
		System.out.println("MAtched");
		driver.quit();
	}

}
