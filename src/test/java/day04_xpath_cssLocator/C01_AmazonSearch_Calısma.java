package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch_Calısma {
    public static void main(String[] args) {
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //	a. web sayfasına gidin. https://www.amazon.com/
      driver.get("https://www.amazon.com/");

        //	b. Search(ara) “city bike”
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+Keys.ENTER);


        //	c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement>istenenElementListesi=driver.findElements(By.className("sg-col-inner"));
        WebElement sonucElement=istenenElementListesi.get(0);
        System.out.println(sonucElement.getText()); //1-16 of 123 results for "city bike"



        //	d-Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement>resimElementListesi=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi=resimElementListesi.get(0);
        ilkUrunResmi.click();


    }
}
