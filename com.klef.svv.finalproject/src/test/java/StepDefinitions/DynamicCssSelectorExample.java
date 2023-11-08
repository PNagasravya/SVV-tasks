package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCssSelectorExample {
    public static void main(String[] args) {
        // Set the path to ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAGA SRAVYA\\OneDrive\\mine\\OneDrive\\Desktop\\III year\\SVV\\chromedriver-win64\\chromedriver.exe");


        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a sample webpage
        driver.get("https://www.amazon.com");

        // Locate elements using dynamic CSS selectors
        WebElement elementByCss = driver.findElement(By.cssSelector("div[class='myDiv']"));
        WebElement elementByPartialCss = driver.findElement(By.cssSelector("input[id*='username']"));
        WebElement elementByStartsWithCss = driver.findElement(By.cssSelector("button[id^='submit']"));
        WebElement elementByEndsWithCss = driver.findElement(By.cssSelector("a[href$='amazon.com']"));

        // Perform actions on located elements
        elementByCss.click();
        elementByPartialCss.sendKeys("Text input");
        elementByStartsWithCss.click();
        elementByEndsWithCss.click();

        // Close the browser when done
        driver.quit();
    }
}

