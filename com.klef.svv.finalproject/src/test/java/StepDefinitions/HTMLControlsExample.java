package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTMLControlsExample {
    public static void main(String[] args) {
        // Set the path to ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAGA SRAVYA\\OneDrive\\mine\\OneDrive\\Desktop\\III year\\SVV\\chromedriver-win64\\chromedriver.exe");


        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a sample webpage
        driver.get("https://www.amazon.com");

        // Checkbox handling
        WebElement checkbox = driver.findElement(By.id("checkboxId"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        // Radio button handling
        WebElement radioButton = driver.findElement(By.id("radioButtonId"));
        if (!radioButton.isSelected()) {
            radioButton.click();
        }

        // Single dropdown handling
        WebElement singleDropdown = driver.findElement(By.id("singleDropdownId"));
        Select singleSelect = new Select(singleDropdown);
        singleSelect.selectByVisibleText("Option 2"); // Change to your desired option

        // Multiple dropdown handling
        WebElement multiDropdown = driver.findElement(By.id("multiDropdownId"));
        Select multiSelect = new Select(multiDropdown);
        multiSelect.selectByVisibleText("Option 1");
        multiSelect.selectByVisibleText("Option 3"); // Change to your desired options

        // Close the browser when done
        driver.quit();
    }
}