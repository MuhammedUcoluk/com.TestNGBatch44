package tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.IOException;

public class C03_ScreenshotClassSonu extends TestBase {
    //amazona gidin
    //3 farklı test methodu ile java,nutella,elma aratıp
    //Sonuç sayfasının screenshotunu kaydedin.

    WebElement aramaKutusu;

    @Test
    public void test01() throws IOException {
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Java" + Keys.ENTER);
        tumSayfaScreenshot();


    }

    @Test
    public void test02() throws IOException {

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.clear();
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        tumSayfaScreenshot();


    }

    @Test
    public void test03() throws IOException {

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.clear();
        aramaKutusu.sendKeys("Elma" + Keys.ENTER);
        tumSayfaScreenshot();
    }
}