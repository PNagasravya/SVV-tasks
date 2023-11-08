package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticLocatorsExample {
    public static void main(String[] args) {
        // Set the path to ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAGA SRAVYA\\OneDrive\\mine\\OneDrive\\Desktop\\III year\\SVV\\chromedriver-win64\\chromedriver.exe");


        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a sample webpage
        driver.get("https://www.amazon.com");

        // Locate elements using different static locators
        WebElement elementById = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement elementByName = driver.findElement(By.name("field-keywords"));
        WebElement elementByClass = driver.findElement(By.className("nav-a"));
        WebElement elementByTagName = driver.findElement(By.tagName("a")); // Example for anchor tag

        // Perform actions on located elements
        elementById.click();
        elementByName.sendKeys("Text input");
        elementByClass.clear();
        String tagName = elementByTagName.getTagName();

        // Print the tag name
        System.out.println("Tag Name of the element: " + tagName);

        // Close the browser when done
        driver.quit();
    }
}
