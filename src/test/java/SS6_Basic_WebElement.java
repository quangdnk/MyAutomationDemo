import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SS6_Basic_WebElement {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://anhtester.com/login");

        WebElement elemnt = driver.findElement(By.name("email"));
        elemnt.clear();

        elemnt.sendKeys("Check");

        // Click link
//        driver.findElement(By.linkText("Forgot my password?")).click();


        //Display
        elemnt.isDisplayed();

        // Enable
        WebElement checkEnable = driver.findElement(By.id("login"));
        boolean status = checkEnable.isEnabled();

        //isSelected
//        WebElement checkSelected = driver.findElement(By.id("recaptcha-anchor"));
//        boolean selected = checkSelected.isSelected();

        // Submit
        driver.findElement(By.id("login")).submit();

        // getText
//        WebElement getText = driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div/div[2]/div/form/div/div[5]/p/text()"));
//        String linkText = getText.getText();
//        elemnt.sendKeys(linkText);

        // Getlocation
        WebElement location = driver.findElement(By.xpath("//*[@id=\"login\"]"));
        org.openqa.selenium.Point point = location.getLocation();
        System.out.println("X cordinate : " + point.x + "Y cordinate: " + point.y);
    }
}
