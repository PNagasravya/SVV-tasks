package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAGA SRAVYA\\OneDrive\\mine\\OneDrive\\Desktop\\III year\\SVV\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://www.amazon.com";
        driver.get(url);
        // Add further actions as needed
        driver.quit();
    }
}
