package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators_Calısma {
    /*
   Main method oluşturun ve aşağıdaki görevi tamamlayın.
   a. http://a.testaddressbook.com adresine gidiniz.
   b. Sign in butonuna basin
   c. email textbox,password textbox, and signin button elementlerini locate ediniz..
   d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
       i. Username : testtechproed@gmail.com
       ii. Password : Test1234!
   e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
   f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
   3. Sayfada kac tane link oldugunu bulun.

    */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        WebElement singLinki=driver.findElement(By.linkText("Sign in"));
        singLinki.click();
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement email=driver.findElement(By.id("session_email"));
        WebElement pasword=driver.findElement(By.id("session_password"));
        WebElement singButonu=driver.findElement(By.name("commit"));
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        email.sendKeys("testtechproed@gmail.com");
        pasword.sendKeys("Test1234!");
        Thread.sleep(2000);
        singButonu.click();
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement kullanıcıElement=driver.findElement(By.className("navbar-text"));
        System.out.println(kullanıcıElement.getText());

        String kullanıcıUser="testtechproed@gmail.com";
        if (kullanıcıUser.equals(kullanıcıElement.getText())){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
        //f.“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesElementi= driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi=driver.findElement(By.linkText("Sign out"));
        if(adressesElementi.isDisplayed()){
            System.out.println("adresses testi PASSED");
        } else {
            System.out.println("adresses testi FAILED");
        }

        if(signOutElementi.isDisplayed()){
            System.out.println("signOut testi PASSED");
        } else {
            System.out.println("signOut testi FAILED");
        }
        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement>linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println(linklerListesi.size());

        // linkleri yazdiralim
        for (WebElement each:linklerListesi
             ) {
            System.out.println(each.getText());//Home(current),Addresses,Sign out

        }

        driver.close();
    }
}