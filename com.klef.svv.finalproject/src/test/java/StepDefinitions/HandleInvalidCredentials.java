package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInvalidCredentials {
    public static void main(String[] args) {
        // Set the path to ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAGA SRAVYA\\OneDrive\\mine\\OneDrive\\Desktop\\III year\\SVV\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a URL
        driver.get("https://www.amazon.com/login");

        // Enter invalid credentials
        WebElement usernameField = driver.findElement(By.id("9908953639"));
        WebElement passwordField = driver.findElement(By.id("Sravya@123"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("invalidUsername");
        passwordField.sendKeys("invalidPassword");
        loginButton.click();

        // Check for error message
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        if (errorMessage.isDisplayed()) {
            System.out.println("Invalid credentials. Error message: " + errorMessage.getText());
        } else {
            System.out.println("Login successful.");
        }

        // Close the browser when done
        driver.quit();
    }
}
