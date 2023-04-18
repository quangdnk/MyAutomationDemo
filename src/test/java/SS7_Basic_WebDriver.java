import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SS7_Basic_WebDriver {
    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.navigate().to("https://anhtester.com/");

        driver.navigate().back();

        driver.navigate().refresh();

        driver.navigate().forward();

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

//        String handle = driver.getWindowHandle();
//        System.out.println(handle);


        // Lấy toàn bộ
        Set<String> allWindows = driver.getWindowHandles();
        for (String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }

        // handle tab
//        Set<String> windowHandles = driver.getWindowHandles();
//        String firstTab = (String)windowHandles.toArray()[0];
//        String lastTab = (String)windowHandles.toArray()[1];
//        driver.switchTo().window(lastTab);

        //
//        driver.switchTo().alert(); // No Alert
    }
}
