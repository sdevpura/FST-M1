import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class Activity9_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        //Open browser
        driver.get("https://training-support.net/selenium/selects");

        //Chosen option from multi select list
        WebElement chosen = driver.findElement(By.id("multi-value"));

        //Find multiselect list
        Select mslist = new Select(driver.findElement(By.id("multi-select")));

        //Check if the HTML element is a multi-list. Proceed with other actions if it is.
        if(mslist.isMultiple()){
        //Select the 'JavaScript' option by visible text.
        mslist.selectByVisibleText("Javascript");
        System.out.println("This is :"+chosen.getText());


        //Select the 'NodeJS' option by value.
        mslist.selectByValue("node");
        System.out.println("This is: "+chosen.getText());

        //Select the 4th, 5th, and the 6th options by index.
            for(int i=3;i<=6;i++) {
                mslist.selectByIndex(i);
            }
                System.out.println("This is: "+chosen.getText());
        //Deselect the 'NodeJS' option by value attribute.
        mslist.deselectByValue("node");
        System.out.println("Deselected by Value: "+chosen.getText());

        //Deselect the 7th option by index.
        mslist.deselectByIndex(7);
        System.out.println("Deselect the 7th option by index: "+chosen.getText());

        //Print the first selected option.
        mslist.getFirstSelectedOption();
        System.out.println("First selected option: " + chosen.getText());

        //Print all selected options one by one and deselect all options.
        List<WebElement> options = mslist.getAllSelectedOptions();
        for (WebElement option : options) {
            System.out.println("All selected Options: " + option.getText());
        }
        mslist.deselectAll();
        System.out.println("Deselected All: "+chosen.getText());
    }
        else{
            driver.quit();
        }
        //Close browser
        driver.quit();
    }
}