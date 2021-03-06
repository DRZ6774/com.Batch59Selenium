package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest_Calısma {
    public static void main(String[] args) throws InterruptedException {
         /*  1- https://www.amazon.com url'ine gidin
            2- Basligin Amazon kelimesi icerdigini test edin
            3- Url'in "https://www.amazon.com" a esit oldugunu test edin
            4- sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

         // 1- https://www.amazon.com url'ine gidin

        driver.get("https://www.amazon.com");


        // 2- Basligin Amazon kelimesi icerdigini test edin

        String actualTitle=driver.getTitle();
        String arananKelime="Amazon";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Title Test PASSED");
        }else{
            System.out.println("Title Test FAİLED");
        }

        // 3- Url'in "https://www.amazon.com" a esit oldugunu test edin

        String actualUrl=driver.getCurrentUrl();
        String arananUrl="https://www.amazon.com";
        if (actualUrl.equals(arananUrl)){
            System.out.println("Url Test PASSED");
        }else{
            System.out.println("actual Url :"+actualUrl+" Url Test FAİLED");
        }

        // 4- sayfayi kapatin

        Thread.sleep(3000);
        driver.close();


    }
}