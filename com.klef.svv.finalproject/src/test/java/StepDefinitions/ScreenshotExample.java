package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {
    public static void main(String[] args) {
        // Set the path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAGA SRAVYA\\OneDrive\\mine\\OneDrive\\Desktop\\III year\\SVV\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a sample webpage
        driver.get("https://www.flipkart.com");

        // Replace with a valid element you want to interact with on the page
        WebElement elementToClick = driver.findElement(By.id("yourElementId"));
        elementToClick.click();

        // Take a screenshot
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            // Specify the path to save the screenshot
            String screenshotPath = "C:\\Users\\NAGA SRAVYA\\OneDrive\\mine\\OneDrive\\Desktop\\III year\\SVV\\Screenshot.png";
            
            // Copy the screenshot to the specified path
            FileUtils.copyFile(screenshotFile, new File(screenshotPath));
            
            System.out.println("Screenshot saved to: " + screenshotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the browser when done
        driver.quit();
    }
}
