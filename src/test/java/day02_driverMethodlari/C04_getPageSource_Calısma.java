package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource_Calısma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // amazon sitesine gidip Kaynek kodlarinda "Gateway" yazdigini test edin

        driver.get("https://www.amazon.com");
        String kaynakKodlari=driver.getPageSource();
        String arananKaynakKodlari="Gateway";
        if (kaynakKodlari.contains(arananKaynakKodlari)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAİLED");
        }

        driver.close();
    }
}
