package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPathSelectorExample {
    public static void main(String[] args) {
        // Set the path to ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAGA SRAVYA\\OneDrive\\mine\\OneDrive\\Desktop\\III year\\SVV\\chromedriver-win64\\chromedriver.exe");


        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a sample webpage
        driver.get("https://www.amazon.com");

        // Locate elements using dynamic XPath selectors
        WebElement elementByXPath = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-medium']"));
        WebElement elementByContainsXPath = driver.findElement(By.xpath("//input[contains(@id, 'search')]"));
        WebElement elementByStartsWithXPath = driver.findElement(By.xpath("//button[starts-with(@id, 'start')]"));
        WebElement elementByEndsWithXPath = driver.findElement(By.xpath("//a[ends-with(@href, 'amazon.com')]"));

        // Perform actions on located elements
        elementByXPath.click();
        elementByContainsXPath.sendKeys("Text input");
        elementByStartsWithXPath.click();
        elementByEndsWithXPath.click();

        // Close the browser when done
        driver.quit();
    }
}
