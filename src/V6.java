import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class V6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/nikus/Desktop/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.999.md/");

        WebElement element = driver.findElement(By.xpath("//input[@id='js-search-input']"));
        element.sendKeys("computer" + Keys.ENTER);

        if (driver.findElement(By.xpath("//h1[@class='header_bar_logo']")).isEnabled())
            System.out.println("The header is displayed!");
        else
            System.out.println("The header is NOT displayed!");
    }
}
