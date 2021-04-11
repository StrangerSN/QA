import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class V5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/nikus/Desktop/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");

        WebElement element = driver.findElement(By.xpath("//input[@id='search-key']"));        
		element.sendKeys("computer" + Keys.ENTER); 
        Thread.sleep(3000);
        
        if(driver.findElement(By.id("header")).isDisplayed()) 
            System.out.println("The header is displayed!");
        else System.out.println("The header is NOT displayed!");
    }
}
