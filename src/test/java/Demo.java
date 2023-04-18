import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

public class Demo {

    ChromeDriver driver;
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://www.edureka.co/");

        // Get id
        WebElement getId = driver.findElement(By.id(""));

        // Get Name
        WebElement getName = driver.findElement(By.name("code"));

        // Get link
        WebElement getLinkText = driver.findElement(By.linkText(" Browse all courses "));
//        System.out.println(getLinkText);
        getLinkText.click();

        // Tag name
        driver.findElement(By.tagName(""));

        // class Name
        driver.findElement(By.className(""));
    }
}
