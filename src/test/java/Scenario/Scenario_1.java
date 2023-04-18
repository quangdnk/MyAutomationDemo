package Scenario;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Scenario_1 {
    int page;

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://www.edureka.co/");

        driver.findElement(By.xpath("/html/body/section[2]/a")).click();

        boolean check = false;
        //*[@id="pills-all-course"]/div[3]/nav/ul/li[2]/a
//        driver.findElement(By.xpath("//*[@id=\"pills-all-course\"]/div[4]/nav/ul/li[2]/a")).click();
        int page = 2;
//        List<WebElement> paging = driver.findElements(By.className("page-item ga-event-click"));
//        for (var i = 0; i < paging.stream().count(); i++) {
//            paging.get(i).click();
//            List<WebElement> allTitle = driver.findElements(By.className("title"));
//            for (var j = 0; j < allTitle.stream().count(); j++) {
//                System.out.println(allTitle.get(j).getText());
//                if (allTitle.get(j).getText() == "Blockchain Developer Certification Course") {
//                    break;
//                }
//            }
//        }
//        WebElement alllink = driver.findElement(By.xpath("*[@id=\"pills-all-course\"]"));
//        System.out.println(alllink);
        while (!check) {
            WebElement link = driver.findElement(By.xpath("//*[@id=\"pills-all-course\"]/div[@class='Pagination']/nav/ul/li["+ page +"]"));

            link.click();
            List<WebElement> allTitle = driver.findElements(By.className("title"));
            for (var i = 0; i < allTitle.stream().count(); i++) {
                if (allTitle.get(i).getText().equals("Blockchain Developer Certification Course")) {
                    System.out.println("GO HERE");
                    check = true;
                    break;
                }
                System.out.println(allTitle.get(i).getText());
            }
            page++;
        }
    }

    static void check() {

    }
}
