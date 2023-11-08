package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserWithCredentials {
    public static void main(String[] args) {
        // Implement login logic with credentials
        if (isValidCredentials("username", "password")) {
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAGA SRAVYA\\OneDrive\\mine\\OneDrive\\Desktop\\III year\\SVV\\chromedriver-win64\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.coursera.in");
            // Add further actions as needed
            driver.quit();
        } else {
            System.out.println("Invalid credentials. Browser not opened.");
        }
    }
    
    private static boolean isValidCredentials(String username, String password) {
        // Add your credential validation logic here
        return username.equals("919908953639") && password.equals("Sravya@123++"
        		+ "6+");
    }
}