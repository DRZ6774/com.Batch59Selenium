package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodlari_Calısma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        System.out.println("max pencere olcusu"+driver.manage().window().getPosition());
        System.out.println("max pencere konumu"+driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen pencere olcusu"+driver.manage().window().getPosition());
        System.out.println("fullscreen pencere konumu"+driver.manage().window().getSize());

    }
}
