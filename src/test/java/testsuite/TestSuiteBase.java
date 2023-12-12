package testsuite;
import constants.ProjectBaseConstantPaths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Loadproperties;

public class TestSuiteBase {

        public static WebDriver driver;

        @BeforeMethod
        public void setUp() throws Exception {

            // Set the path to the ChromeDriver executable
            System.setProperty("webdriver.gecko.driver", ProjectBaseConstantPaths.FIREFOX_FILE);

            // Create a new instance of the ChromeDriver
            driver = new FirefoxDriver();

            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to the base URL or any common URL for your application
            driver.get(Loadproperties.getConfigvalue("url"));
        }

        @AfterMethod
        public void tearDown() {
            // Close the browser after each test method
            if (driver != null) {
                driver.quit();
            }
        }
    }


