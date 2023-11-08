package StepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingExample {
    public static void main(String[] args) {
        // Set the path to ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAGA SRAVYA\\OneDrive\\mine\\OneDrive\\Desktop\\III year\\SVV\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a sample webpage
        driver.get("https://www.amazon.com");

        // Locate and click the button that triggers the alerts
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Simple Alert
        System.out.println("Simple Alert Text: " + alert.getText());
        alert.accept(); // Click OK on the alert

        // Locate and click the button that triggers the confirm alert
        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        confirmButton.click();

        // Switch to the confirm alert
        Alert confirmAlert = driver.switchTo().alert();

        // Confirm Alert
        System.out.println("Confirm Alert Text: " + confirmAlert.getText());
        confirmAlert.dismiss(); // Click Cancel on the confirm alert

        // Locate and click the button that triggers the prompt alert
        WebElement promptButton = driver.findElement(By.id("promptButton"));
        promptButton.click();

        // Switch to the prompt alert
        Alert promptAlert = driver.switchTo().alert();

        // Prompt Alert
        System.out.println("Prompt Alert Text: " + promptAlert.getText());
        promptAlert.sendKeys("Test Input"); // Enter text in the prompt
        promptAlert.accept(); // Click OK on the prompt alert

        // Close the browser when done
        driver.quit();
    }
}
