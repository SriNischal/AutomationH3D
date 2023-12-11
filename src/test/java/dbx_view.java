import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dbx_view {

    WebElement element;
    WebDriver driver;
    public void createdbx() {
        login log = new login();
        driver.findElement(By.xpath("//span[text()='User']")).click();
        driver.findElement(By.xpath("//li[text()='DBX']")).click();

    }
}
