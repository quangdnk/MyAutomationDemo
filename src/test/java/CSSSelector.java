import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CSSSelector {

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://anhtester.com/login");

//        // Id
//        WebElement id = driver.findElement(By.cssSelector("input#email"));
//        System.out.println(id);

        //class
        WebElement cl = driver.findElement(By.cssSelector("input.form-control"));
//        System.out.print(cl);
//        cl.sendKeys("654656");
        //att class
        WebElement attr = driver.findElement(By.cssSelector("input[name=email]"));

        // class att
        WebElement allAtt = driver.findElement(By.cssSelector("input.form-control[name=email]"));

        //Sub
        WebElement sub = driver.findElement(By.cssSelector("input[name^='nam']"));

        /// XPATH

        driver.findElement(By.xpath("//div//input[@id='123']"));

        driver.findElement(By.xpath("//div//input[@type='submit' OR @name='btn']"));
    }
}
