import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class V2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/nikus/Desktop/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        WebElement element = driver.findElement(By.xpath("//input[@id='search']"));
        element.sendKeys("computer");
        element.sendKeys(Keys.ENTER);

        if (driver.findElement(By.id("logo-icon")).isEnabled())
            System.out.println("The header is displayed!");
        else
            System.out.println("The header is NOT displayed!");
    }
}
