import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class login {

    public static WebDriver driver;
    @BeforeClass
    public void loginh3d() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\srinischal.thiparani\\IdeaProjects\\AutomationH3D\\lib\\geckodriver.exe");

        // Initialize ChromeDriver
        driver = new FirefoxDriver();
        driver.get("http://66.66.66.51/");

        // Find the username and password fields and the login button
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='formEmail']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='formPassword']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='button']"));

        // Enter your username and password
        usernameField.sendKeys("harish@atmecs.com");
        passwordField.sendKeys("Admin123");

        // Click the login button
        loginButton.click();

        // Add a delay to see the result (you might want to use WebDriverWait in a real scenario)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        @AfterClass
        // Close the browser
        public void closebrowser() {
             driver.quit();
        }
    }
