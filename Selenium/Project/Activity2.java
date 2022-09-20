package LMS_Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String heading=driver.findElement(By.tagName("h1")).getText();
		System.out.println("Heading of the page: "+heading);
	}

}
