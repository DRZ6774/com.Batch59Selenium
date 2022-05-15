package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate_Calısma {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        // amazon'a geri donelim
        driver.navigate().back();
        Thread.sleep(2000);

        // yeniden facebook'a gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        // sayfayi refresh yapalim
        driver.navigate().refresh();
        Thread.sleep(2000);

        // sayfayi kapatalim
        driver.close();


    }
}
