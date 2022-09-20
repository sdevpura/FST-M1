package LMS_Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String title=driver.getTitle();
		System.out.println("Title of the page: "+title);
		Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
		System.out.println("Match");
		driver.quit();
	}

}
